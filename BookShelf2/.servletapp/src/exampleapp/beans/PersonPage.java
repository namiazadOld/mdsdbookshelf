package exampleapp.beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.apache.commons.lang.ArrayUtils;
import utils.*;
import org.webdsl.lang.Environment;
import utils.TemplateCall;
import exampleapp.domain.*;

public class PersonPage extends PageServlet 
{ 
  public String getPageName()
  { 
    return "person";
  }

  public String getHiddenParams()
  { 
    java.lang.StringBuffer hiddens = new java.lang.StringBuffer();
    hiddenParams(hiddens);
    return hiddens.toString();
  }

  public String getHiddenPostParams()
  { 
    java.lang.StringBuffer hiddens = new java.lang.StringBuffer();
    hiddenPostParams(hiddens);
    return hiddens.toString();
  }

  person_Template templateservlet = new person_Template();

  protected void initVarsAndArgs()
  { 
    initialize();
    envGlobalAndSession = env;
    conversion();
    loadArguments();
    Object[] args = {arg0};
    this.args = args;
  }

  public void serve(HttpServletRequest request, HttpServletResponse response, Map<String, String> parammap, Map<String, List<String>> parammapvalues, Map<String, utils.File> fileUploads)
  { 
    ThreadLocalPage.set(this);
    this.request = request;
    this.response = response;
    this.parammap = parammap;
    this.parammapvalues = parammapvalues;
    this.fileUploads = fileUploads;
    session = request.getSession(true);
    if(parammap.get("__action__link__") != null)
    { 
      this.setActionLinkUsed(true);
      parammap.put("action-call-with-get-request-type", "1");
    }
    hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
    hibSession.beginTransaction();
    hibSession.setFlushMode(org.hibernate.FlushMode.MANUAL);
    try
    { 
      retrieveIncomingMessagesFromHttpSession();
      initVarsAndArgs();
      initRequestVars();
      java.io.StringWriter s = new java.io.StringWriter();
      java.io.PrintWriter out = new java.io.PrintWriter(s);
      if(ThreadLocalServlet.get().isPostRequest || parammap.get("action-call-with-get-request-type") != null)
      { 
        templateservlet.storeInputs(args, new Environment(env), TemplateCall.None, TemplateCall.NoWithCalls, null);
        ThreadLocalPage.get().clearTemplateContext();
        if(validated)
        { 
          templateservlet.validateInputs(args, new Environment(env), TemplateCall.None, TemplateCall.NoWithCalls, null);
          ThreadLocalPage.get().clearTemplateContext();
        }
        if(validated)
        { 
          templateservlet.handleActions(args, new Environment(env), TemplateCall.None, TemplateCall.NoWithCalls, null, out);
          ThreadLocalPage.get().clearTemplateContext();
        }
        else
        { 
          clearHibernateCache();
        }
      }
      if(download != null)
      { 
        download();
      }
      else
      { 
        if(!this.hasExecutedAction || hibernateCacheCleared)
        { 
          if(!hibernateCacheCleared && ThreadLocalServlet.get().isPostRequest)
          { 
            clearHibernateCache();
            System.out.println("Error: server received POST request but was unable to dispatch to a proper action");
            response.getWriter().write("404 \n Error: server received POST request but was unable to a proper action");
          }
          else
          { 
            if(this.isAjaxActionExecuted() && ThreadLocalServlet.get().isPostRequest)
            { 
              java.io.StringWriter s1 = new java.io.StringWriter();
              java.io.PrintWriter out1 = new java.io.PrintWriter(s1);
              render(request, response, out1, true);
              response.getWriter().write("[{action:\"replace\", id:\"" + this.getActionTarget() + "\", value:\"" + org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(s1.toString()) + "\"}]");
            }
            else
            { 
              if(this.isActionLinkUsed())
              { 
                java.io.StringWriter s1 = new java.io.StringWriter();
                java.io.PrintWriter out1 = new java.io.PrintWriter(s1);
                render(request, response, out1, true);
                response.getWriter().write("[{action:\"replaceall\", value:\"" + org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(s1.toString()) + "\"}]");
              }
              else
              { 
                render(request, response, response.getWriter(), false);
              }
            }
          }
        }
        else
          if(this.isAjaxActionExecuted() && this.hasExecutedAction)
          { 
            response.getWriter().write("[" + s.toString() + "{}]");
          }
          else
            if(this.hasExecutedAction && this.isActionLinkUsed())
            { 
              response.getWriter().write("[{action:\"relocate\", value:\"" + this.getRedirectUrl() + "\"}]");
            }
      }
      storeSessionEntities();
      storeOutgoingMessagesInHttpSession();
      hibSession.flush();
      hibSession.getTransaction().commit();
    }
    catch(Exception ex)
    { 
      System.out.println("exception occured: " + ex.getMessage());
      ex.printStackTrace();
      hibSession.getTransaction().rollback();
      throw new RuntimeException("serve page request failed");
    }
    finally
    { 
      cleanup();
    }
  }

  public void cleanup()
  { 
    super.cleanup();
    cleanupPageArgAndVar();
    templateservlet = null;
  }

  public void initializeBasics(PageServlet ps, Object[] args, Environment env)
  { 
    this.request = ps.getRequest();
    this.env = env;
    this.response = ps.getResponse();
    this.parammap = ps.getParammap();
    this.parammapvalues = ps.getParammapvalues();
    this.fileUploads = ps.getFileUploads();
    hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
    session = request.getSession(true);
    arg0 = (exampleapp.domain.Person)args[0];
    initialize();
  }

  public void render(HttpServletRequest request, HttpServletResponse response, java.io.PrintWriter sout, boolean onlyContent) throws ServletException, IOException
  { 
    this.request = request;
    this.response = response;
    java.io.StringWriter s = new java.io.StringWriter();
    java.io.PrintWriter out = new java.io.PrintWriter(s);
    templateservlet.render(args, new Environment(env), TemplateCall.None, TemplateCall.NoWithCalls, null, out);
    response.setContentType(getMimetype());
    addJavascriptInclude("ajax.js");
    if(!mimetypeChanged && !onlyContent)
    { 
      sout.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
      sout.println("<html>");
      sout.println("<head>");
      sout.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
      sout.println("<title>" + getPageTitle().replaceAll("<[^>]*>", "") + "</title>");
      sout.println("<link href=\"" + ThreadLocalServlet.getContextPath() + "/favicon.ico\" rel=\"shortcut icon\" type=\"image/x-icon\" />");
      sout.println("<link href=\"" + ThreadLocalServlet.getContextPath() + "/stylesheets/common_.css\" rel=\"stylesheet\" type=\"text/css\" />");
      if(this.useDojo)
      { 
        sout.println("<script type='text/javascript' src='" + ThreadLocalServlet.getContextPath() + "/javascript/dojo/dojo.js' djConfig=\"parseOnLoad: true\"></script>");
        sout.println("<link rel='stylesheet' href='" + ThreadLocalServlet.getContextPath() + "/stylesheets/dijit/themes/tundra/tundra.css' type='text/css' />");
      }
      sout.println("<script type=\"text/javascript\">var show_webdsl_debug=false;</script>");
      sout.println("<script type=\"text/javascript\">var contextpath=\"" + ThreadLocalServlet.getContextPath() + "\";</script>");
      for(String script : this.javascripts)
      { 
        sout.println("<script type=\"text/javascript\" src=\"" + ThreadLocalServlet.getContextPath() + "/javascript/" + script + "\"></script>");
      }
      for(String sheet : this.stylesheets)
      { 
        sout.println("<link rel=\"stylesheet\" href=\"" + ThreadLocalServlet.getContextPath() + "/stylesheets/" + sheet + "\" type=\"text/css\" />");
      }
      for(Map.Entry<String, String> headEntry : customHead.entrySet())
      { 
        sout.println("<!-- " + headEntry.getKey() + " -->");
        sout.println(headEntry.getValue());
      }
      sout.println("</head>");
      sout.print("<body id=\"" + this.getPageName() + "\" class='tundra'>");
      renderIncomingSuccessMessages(sout);
      s.flush();
    }
    sout.write(s.toString());
    if(!mimetypeChanged && !onlyContent)
    { 
      sout.print("</body>");
      sout.println("</html>");
    }
  }

  public void serveAsAjaxResponse(PageServlet ps, PrintWriter theoutStream, Object[] args, Environment env, TemplateCall templateArg)
  { 
    initializeBasics(ps, args, env);
    ThreadLocalPage.set(this);
    this.isServingStandAloneTemplate = true;
    this.standAloneTemplate = this.getUniqueName();
    templateservlet.render(args, new Environment(env), templateArg, TemplateCall.NoWithCalls, null, theoutStream);
    ThreadLocalPage.set(ps);
  }

  public boolean IsTemplate()
  { 
    return false;
  }

  public String getUniqueName()
  { 
    return "person";
  }

  private String arg0_id;

  public void setArg0_id(String v)
  { 
    this.arg0_id = v;
  }

  public String getArg0_id()
  { 
    return this.arg0_id;
  }

  private exampleapp.domain.Person arg0;

  public void setArg0(exampleapp.domain.Person arg0)
  { 
    this.arg0 = arg0;
  }

  public exampleapp.domain.Person getArg0()
  { 
    return arg0;
  }

  private void storeSessionEntities()
  { }

  private void cleanupPageArgAndVar()
  { 
    arg0_id = null;
    arg0 = null;
  }

  public void hiddenPostParams(java.lang.StringBuffer combinedparams)
  { 
    combinedparams.append("arg" + "=" + utils.HTMLFilter.filter(arg0.getNaturalId().toString()) + "&");
  }

  public void hiddenParams(java.lang.StringBuffer combinedparams)
  { 
    combinedparams.append("<input type=\"hidden\" name=\"" + "arg" + "\" value=\"" + utils.HTMLFilter.filter(arg0.getNaturalId().toString()) + "\" />");
  }

  protected void loadArguments()
  { 
    if(arg0_id != null)
    { 
      arg0_id = utils.URLFilter.unfilter(arg0_id.toString());
      List<exampleapp.domain.Person> results = hibSession.createCriteria(exampleapp.domain.Person.class).add(org.hibernate.criterion.Restrictions.naturalId().set("_username", arg0_id)).list();
      if(results.size() == 0)
      { 
        System.out.println("No entity with this identity found: " + arg0_id);
        throw new RuntimeException("No entity with this identity found: " + arg0_id);
      }
      else
        if(results.size() > 1)
        { 
          System.out.println("Multiple entities with this identity found: " + arg0_id);
          throw new RuntimeException("Multiple entities with this identity found: " + arg0_id);
        }
        else
        { 
          arg0 = results.get(0);
        }
    }
  }

  protected void conversion()
  { 
    if(parammap.get("arg") != null)
    { 
      arg0_id = parammap.get("arg");
    }
  }

  protected void initialize()
  { }
}