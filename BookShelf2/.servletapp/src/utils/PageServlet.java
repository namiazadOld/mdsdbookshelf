package utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import exampleapp.beans.*;
import org.webdsl.WebDSLEntity;
import org.webdsl.lang.Environment;
import org.hibernate.Session;

public abstract class PageServlet  
{ 
  private List<String> incomingSuccessMessages = new java.util.LinkedList<String>();

  public List<String> getIncomingSuccessMessages()
  { 
    return incomingSuccessMessages;
  }

  private List<String> outgoingSuccessMessages = new java.util.LinkedList<String>();

  public List<String> getOutgoingSuccessMessages()
  { 
    return outgoingSuccessMessages;
  }

  protected void renderIncomingSuccessMessages(java.io.PrintWriter out)
  { 
    if(!this.getIncomingSuccessMessages().isEmpty())
    { 
      String ident = "";
      String forelementcounter = "0";
      int fallbackcounter = 0;
      boolean inForLoop = false;
      int forLoopCounter = 0;
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      java.util.List<String> messagesList0;
      messagesList0 = ThreadLocalPage.get().getIncomingSuccessMessages();
      if(messagesList0.size() > 0)
      { 
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<div " + ("style" + "='" + "border: 1px solid #BB8800; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
        java.util.ArrayList<String> list12 = new java.util.ArrayList<String>(messagesList0);
        inForLoop = true;
        forLoopCounter++;
        int limit0 = 1000;
        int offset0 = 0;
        int removedcount0 = 0;
        Object[] array0 = list12.toArray();
        for(int i0 = 0; i0 < array0.length; i0++)
        { 
          String ve2 = (String)array0[i0];
          if(limit0 <= 0)
          { 
            list12.remove(i0 - removedcount0);
            removedcount0++;
          }
          limit0--;
        }
        int separatorindex0 = 0;
        Object[] array1 = list12.toArray();
        for(int i1 = 0; i1 < array1.length; i1++)
        { 
          String ve2 = (String)array1[i1];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve2))
          { 
            WebDSLEntity temp4 = (WebDSLEntity)(Object)ve2;
            forelementcounter = temp4.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp4.getId().toString();
          }
          else
            forelementcounter = Integer.toString(fallbackcounter);
          ThreadLocalPage.get().enterTemplateContext(forelementcounter);
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "width:100%; color: #BB8800; margin-top: 5px;" + "' ") + " class=\"block\" >");
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          String tmpstring0;
          try
          { 
            tmpstring0 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve2) : utils.HTMLFilter.filter(String.valueOf(ve2));
          }
          catch(NullPointerException npe)
          { 
            tmpstring0 = "";
          }
          out.print(tmpstring0);
          ThreadLocalPage.get().commonContextsCheckLeave(out);
          out.print("</div>");
          ThreadLocalPage.get().commonContextsCheckLeave(out);
          ThreadLocalPage.get().leaveTemplateContextChecked(forelementcounter);
        }
        forLoopCounter--;
        if(forLoopCounter == 0)
        { 
          inForLoop = false;
          forelementcounter = "0";
          fallbackcounter = 0;
        }
        out.print("</div>");
        ThreadLocalPage.get().commonContextsCheckLeave(out);
      }
      ThreadLocalPage.get().getIncomingSuccessMessages().clear();
      ThreadLocalPage.get().commonContextsCheckLeave(out);
    }
  }

  protected void storeOutgoingMessagesInHttpSession()
  { 
    if(outgoingSuccessMessages.size() > 0)
    { 
      session.setAttribute("___messages___", outgoingSuccessMessages);
    }
  }

  protected void retrieveIncomingMessagesFromHttpSession()
  { 
    List<String> temp = (List<String>)session.getAttribute("___messages___");
    if(temp != null)
    { 
      incomingSuccessMessages = temp;
    }
  }

  public java.util.LinkedList<String> validationContext = new java.util.LinkedList<String>();

  public String getValidationContext()
  { 
    return validationContext.peek();
  }

  public void enterValidationContext(String ident)
  { 
    validationContext.add(ident);
  }

  public void leaveValidationContext()
  { 
    String s = validationContext.removeLast();
  }

  public boolean inValidationContext()
  { 
    return validationContext.size() != 0;
  }

  public boolean formRequiresMultipartEnc = false;

  public String formGroupLeftSize = "150";

  public utils.FormGroupContext getFormGroupContext()
  { 
    return (utils.FormGroupContext)tableContexts.peek();
  }

  public void enterFormGroupContext()
  { 
    tableContexts.push(new utils.FormGroupContext());
  }

  public void leaveFormGroupContext()
  { 
    tableContexts.pop();
  }

  public boolean inFormGroupContext()
  { 
    return !tableContexts.empty() && tableContexts.peek() instanceof utils.FormGroupContext;
  }

  public java.util.Stack<String> formGroupContextClosingTags = new java.util.Stack<String>();

  public void formGroupContextsCheckEnter(PrintWriter out)
  { 
    if(inFormGroupContext())
    { 
      utils.FormGroupContext temp = getFormGroupContext();
      if(!temp.isInDoubleColumnContext())
      { 
        if(!temp.isInColumnContext())
        { 
          temp.enterColumnContext();
          if(temp.isInLeftContext())
          { 
            out.print("<div style=\"clear:left; float:left; width: " + formGroupLeftSize + "px\">");
            formGroupContextClosingTags.push("left");
            temp.toRightContext();
          }
          else
          { 
            out.print("<div style=\"float: left;\">");
            formGroupContextClosingTags.push("right");
            temp.toLeftContext();
          }
        }
        else
        { 
          formGroupContextClosingTags.push("none");
        }
      }
    }
  }

  public void formGroupContextsCheckLeave(PrintWriter out)
  { 
    if(inFormGroupContext())
    { 
      utils.FormGroupContext temp = getFormGroupContext();
      if(!temp.isInDoubleColumnContext())
      { 
        String tags = formGroupContextClosingTags.pop();
        if(tags.equals("left"))
        { 
          temp.leaveColumnContext();
          out.print("</div>");
        }
        else
          if(tags.equals("right"))
          { 
            temp.leaveColumnContext();
            out.print("</div>");
          }
      }
    }
  }

  public void formGroupContextsDisplayLeftEnter(PrintWriter out)
  { 
    if(inFormGroupContext())
    { 
      utils.FormGroupContext temp = getFormGroupContext();
      if(!temp.isInColumnContext())
      { 
        temp.enterColumnContext();
        out.print("<div style=\"clear:left; float:left; width: " + formGroupLeftSize + "px\">");
        formGroupContextClosingTags.push("left");
        temp.toRightContext();
      }
      else
      { 
        formGroupContextClosingTags.push("none");
      }
    }
  }

  public void formGroupContextsDisplayRightEnter(PrintWriter out)
  { 
    if(inFormGroupContext())
    { 
      utils.FormGroupContext temp = getFormGroupContext();
      if(!temp.isInColumnContext())
      { 
        temp.enterColumnContext();
        out.print("<div style=\"float: left;\">");
        formGroupContextClosingTags.push("right");
        temp.toLeftContext();
      }
      else
      { 
        formGroupContextClosingTags.push("none");
      }
    }
  }

  public java.util.Stack<String> labelStrings = new java.util.Stack<String>();

  public java.util.Set<String> usedPageElementIds = new java.util.HashSet<String>();

  public static java.util.Random rand = new java.util.Random();

  public String getLabelString()
  { 
    String s = labelStrings.peek();
    if(usedPageElementIds.contains(s))
    { 
      do
      { 
        s += rand.nextInt();
      }
      while(usedPageElementIds.contains(s));
    }
    usedPageElementIds.add(s);
    return s;
  }

  public void enterLabelContext(String ident)
  { 
    labelStrings.push(ident);
  }

  public void leaveLabelContext()
  { 
    labelStrings.pop();
  }

  public boolean inLabelContext()
  { 
    return !labelStrings.empty();
  }

  public int sectionDepth = 0;

  public int getSectionDepth()
  { 
    return sectionDepth;
  }

  public void enterSectionContext()
  { 
    sectionDepth++;
  }

  public void leaveSectionContext()
  { 
    sectionDepth--;
  }

  public boolean inSectionContext()
  { 
    return sectionDepth > 0;
  }

  public java.util.Stack<Object> tableContexts = new java.util.Stack<Object>();

  public utils.TableContext getTableContext()
  { 
    return (utils.TableContext)tableContexts.peek();
  }

  public void enterTableContext()
  { 
    tableContexts.push(new utils.TableContext());
  }

  public void leaveTableContext()
  { 
    tableContexts.pop();
  }

  public boolean inTableContext()
  { 
    return !tableContexts.empty() && tableContexts.peek() instanceof utils.TableContext;
  }

  public java.util.Stack<String> tableContextClosingTags = new java.util.Stack<String>();

  public void rowContextsCheckEnter(PrintWriter out)
  { 
    if(inTableContext())
    { 
      utils.TableContext temp5 = getTableContext();
      if(!temp5.isInRowContext())
      { 
        out.print("<tr>");
        temp5.enterRowContext();
        tableContextClosingTags.push("</tr>");
      }
      else
      { 
        tableContextClosingTags.push("");
      }
    }
  }

  public void rowContextsCheckLeave(PrintWriter out)
  { 
    if(inTableContext())
    { 
      utils.TableContext temp5 = getTableContext();
      String tags = tableContextClosingTags.pop();
      if(tags.equals("</tr>"))
      { 
        temp5.leaveRowContext();
        out.print(tags);
      }
    }
  }

  public void columnContextsCheckEnter(PrintWriter out)
  { 
    if(inTableContext())
    { 
      utils.TableContext temp5 = getTableContext();
      if(temp5.isInRowContext() && !temp5.isInColumnContext())
      { 
        out.print("<td>");
        temp5.enterColumnContext();
        tableContextClosingTags.push("</td>");
      }
      else
      { 
        tableContextClosingTags.push("");
      }
    }
  }

  public void columnContextsCheckLeave(PrintWriter out)
  { 
    if(inTableContext())
    { 
      utils.TableContext temp5 = getTableContext();
      String tags = tableContextClosingTags.pop();
      if(tags.equals("</td>"))
      { 
        temp5.leaveColumnContext();
        out.print(tags);
      }
    }
  }

  public abstract void serve(HttpServletRequest request, HttpServletResponse response, Map<String, String> parammap, Map<String, List<String>> parammapvalues, Map<String, utils.File> fileUploads);

  public abstract void serveAsAjaxResponse(PageServlet ps, PrintWriter theoutStream, Object[] ajaxarguments, Environment env, TemplateCall templateArg);

  public abstract void initializeBasics(PageServlet ps, Object[] args, Environment env);

  public boolean IsTemplate()
  { 
    return false;
  }

  public boolean isServingStandAloneTemplate = false;

  public String standAloneTemplate = null;

  public abstract String getPageName();

  public String getActionTarget()
  { 
    if(isServingStandAloneTemplate)
      return standAloneTemplate;
    return getPageName();
  }

  public abstract String getHiddenParams();

  public abstract String getHiddenPostParams();

  public javax.servlet.http.HttpSession session;

  public Environment envGlobalAndSession;

  public String getPageUrlWithParams()
  { 
    return request.getRequestURL().toString();
  }

  public static Environment staticEnv = new Environment();

  static
  { 
    try
    { 
      staticEnv.putTemplate("errorTemplateInputListString", errorTemplateInputListString_Template.class);
      staticEnv.putTemplate("applicationmenu", applicationmenu_Template.class);
      staticEnv.putTemplate("mainheader", mainheader_Template.class);
      staticEnv.putTemplate("body", body_Template.class);
      staticEnv.putTemplate("main", main_Template.class);
      staticEnv.putTemplate("templateSuccessListString", templateSuccessListString_Template.class);
      staticEnv.putTemplate("errorTemplateActionListString", errorTemplateActionListString_Template.class);
      staticEnv.putTemplate("errorTemplateFormListString", errorTemplateFormListString_Template.class);
      staticEnv.putTemplate("validatedInput", validatedInput_Template.class);
      staticEnv.putTemplate("root", root_Template.class);
      staticEnv.putTemplate("manageColor", manageColor_Template.class);
      staticEnv.putTemplate("editColor", editColor_Template.class);
      staticEnv.putTemplate("color", color_Template.class);
      staticEnv.putTemplate("createColor", createColor_Template.class);
      staticEnv.putTemplate("managePerson", managePerson_Template.class);
      staticEnv.putTemplate("editPerson", editPerson_Template.class);
      staticEnv.putTemplate("person", person_Template.class);
      staticEnv.putTemplate("createPerson", createPerson_Template.class);
      staticEnv.putTemplate("pagenotfound", pagenotfound_Template.class);
    }
    catch(Exception se)
    { 
      System.out.println("Exception occured while instantiating base page class template and page definitions.");
      se.printStackTrace();
    }
  }

  public Environment env = new Environment(PageServlet.staticEnv);

  private static HashMap<String, Class> emails = new HashMap<String, Class>();

  static
  { 
    try
    { }
    catch(Exception se)
    { 
      System.out.println("Exception occured while instantiating base page class email definitions.");
      se.printStackTrace();
    }
  }

  public static HashMap<String, Class> getEmails()
  { 
    return emails;
  }

  public String getAbsoluteLocation()
  { 
    if(ThreadLocalServlet.getContextPath().equals(""))
    { 
      String[] req = request.getRequestURL().toString().split("/");
      StringBuffer sb = new StringBuffer();
      sb.append(req[0]);
      sb.append("/");
      sb.append(req[1]);
      sb.append("/");
      sb.append(req[2]);
      return sb.toString();
    }
    else
    { 
      String[] req = request.getRequestURL().toString().split(ThreadLocalServlet.getContextPath() + "/");
      return req[0];
    }
  }

  private java.util.Deque<String> templateContext = new java.util.ArrayDeque<String>();

  public String getTemplateContextString()
  { 
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for(String s : templateContext)
    { 
      sb.append(s);
    }
    return sb.toString();
  }

  public void enterTemplateContext(String s)
  { 
    templateContext.push(s);
  }

  public void leaveTemplateContext()
  { 
    templateContext.pop();
  }

  public void leaveTemplateContextChecked(String s)
  { 
    String s1 = templateContext.pop();
  }

  public void clearTemplateContext()
  { 
    templateContext.clear();
  }

  private List<utils.ValidationException> validationExceptions = new java.util.LinkedList<utils.ValidationException>();

  public List<utils.ValidationException> getValidationExceptions()
  { 
    return validationExceptions;
  }

  public boolean hasExecutedAction = false;

  public java.util.List<String> ignoreset = new java.util.ArrayList<String>();

  public boolean hibernateCacheCleared = false;

  protected java.util.List<String> javascripts = new java.util.ArrayList<String>();

  protected java.util.List<String> stylesheets = new java.util.ArrayList<String>();

  protected java.util.Map<String, String> customHead = new java.util.HashMap<String, String>();

  public boolean useDojo = false;

  public void addJavascriptInclude(String filename)
  { 
    if(!javascripts.contains(filename))
      javascripts.add(filename);
  }

  public void addStylesheetInclude(String filename)
  { 
    if(!stylesheets.contains(filename))
      stylesheets.add(filename);
  }

  public void addCustomHead(String key, String header)
  { 
    customHead.put(key, header);
  }

  protected abstract void initialize();

  protected abstract void conversion();

  protected abstract void loadArguments();

  protected abstract void initVarsAndArgs();

  public void clearHibernateCache()
  { 
    hibSession.clear();
    initVarsAndArgs();
    hibernateCacheCleared = true;
  }

  static
  { 
    try
    { 
      GlobalInit.load();
    }
    catch(Exception se)
    { 
      System.out.println("Exception occured in application init block.");
      se.printStackTrace();
    }
  }

  protected boolean validated = true;

  protected Session hibSession;

  protected HttpServletRequest request;

  protected HttpServletResponse response;

  protected Object[] args;

  public Session getHibSession()
  { 
    return hibSession;
  }

  public HttpServletRequest getRequest()
  { 
    return request;
  }

  public HttpServletResponse getResponse()
  { 
    return response;
  }

  public boolean isValidated()
  { 
    return validated;
  }

  public void setValidated(boolean validated)
  { 
    this.validated = validated;
  }

  private boolean inSubmittedForm = false;

  public boolean inSubmittedForm()
  { 
    return inSubmittedForm;
  }

  public void setInSubmittedForm(boolean b)
  { 
    this.inSubmittedForm = b;
  }

  protected java.util.Map<String, String> parammap;

  public java.util.Map<String, String> getParammap()
  { 
    return parammap;
  }

  protected Map<String, utils.File> fileUploads;

  public Map<String, utils.File> getFileUploads()
  { 
    return fileUploads;
  }

  protected Map<String, List<String>> parammapvalues;

  public Map<String, List<String>> getParammapvalues()
  { 
    return parammapvalues;
  }

  protected String pageTitle = "";

  public String getPageTitle()
  { 
    return pageTitle;
  }

  public void setPageTitle(String pageTitle)
  { 
    this.pageTitle = pageTitle;
  }

  protected String formIdent = "";

  public String getFormIdent()
  { 
    return formIdent;
  }

  public void setFormIdent(String fi)
  { 
    this.formIdent = fi;
  }

  protected boolean actionLinkUsed = false;

  public boolean isActionLinkUsed()
  { 
    return actionLinkUsed;
  }

  public void setActionLinkUsed(boolean a)
  { 
    this.actionLinkUsed = a;
  }

  protected String redirectUrl = "";

  public String getRedirectUrl()
  { 
    return redirectUrl;
  }

  public void setRedirectUrl(String a)
  { 
    this.redirectUrl = a;
  }

  protected String mimetype = "text/html; charset=UTF-8";

  protected boolean mimetypeChanged = false;

  public String getMimetype()
  { 
    return mimetype;
  }

  public void setMimetype(String mimetype)
  { 
    this.mimetype = mimetype;
    mimetypeChanged = true;
    enableRawoutput();
    disableTemplateSpans();
  }

  protected boolean ajaxActionExecuted = false;

  public boolean isAjaxActionExecuted()
  { 
    return ajaxActionExecuted;
  }

  public void enableAjaxActionExecuted()
  { 
    ajaxActionExecuted = true;
  }

  protected boolean rawoutput = false;

  public boolean isRawoutput()
  { 
    return rawoutput;
  }

  public void enableRawoutput()
  { 
    rawoutput = true;
  }

  public void disableRawoutput()
  { 
    rawoutput = false;
  }

  protected String[] pageArguments = null;

  public void setPageArguments(String[] pa)
  { 
    pageArguments = pa;
  }

  public String[] getPageArguments()
  { 
    return pageArguments;
  }

  protected boolean templateSpans = true;

  public boolean templateSpans()
  { 
    return templateSpans;
  }

  public void disableTemplateSpans()
  { 
    templateSpans = false;
  }

  protected utils.File download = null;

  public void setDownload(utils.File file)
  { 
    this.download = file;
  }

  public boolean isDownloadSet()
  { 
    return this.download != null;
  }

  public void cleanup()
  { 
    args = null;
    download = null;
    fileUploads = null;
    formGroupContextClosingTags = null;
    formGroupLeftSize = null;
    hibSession = null;
    ignoreset = null;
    incomingSuccessMessages = null;
    labelStrings = null;
    outgoingSuccessMessages = null;
    pageTitle = null;
    parammap = null;
    parammapvalues = null;
    request = null;
    response = null;
    session = null;
    tableContextClosingTags = null;
    tableContexts = null;
    validationContext = null;
    validationExceptions = null;
    envGlobalAndSession = null;
  }

  protected void download()
  { 
    try
    { 
      javax.servlet.ServletOutputStream outstream;
      outstream = response.getOutputStream();
      java.sql.Blob blob = download.getContent();
      java.io.InputStream in;
      in = blob.getBinaryStream();
      response.setContentType(download.getContentType());
      response.setHeader("Content-Disposition", "attachment; filename=" + download.getFileName());
      java.io.BufferedOutputStream bufout = new java.io.BufferedOutputStream(outstream);
      byte bytes[] = new byte[32768];
      int index = in.read(bytes, 0, 32768);
      while(index != -1)
      { 
        bufout.write(bytes, 0, index);
        index = in.read(bytes, 0, 32768);
      }
      bufout.flush();
    }
    catch(java.sql.SQLException ex)
    { 
      System.out.println("exception in download serve");
      ex.printStackTrace();
    }
    catch(IOException ex)
    { 
      System.out.println("exception in download serve");
      ex.printStackTrace();
    }
  }

  public HashMap<String, Object> requestScopedVariables = new HashMap<String, Object>();

  public void initRequestVars()
  { 
    initRequestVars(null);
  }

  public void commonContextsCheckLeave(PrintWriter out)
  { 
    formGroupContextsCheckLeave(out);
    if(inTableContext())
    { 
      utils.TableContext temp5 = getTableContext();
      String tags = tableContextClosingTags.pop();
      if(tags.equals("</td>"))
      { 
        temp5.leaveColumnContext();
        out.print(tags);
      }
      else
        if(tags.equals("</td></tr>"))
        { 
          temp5.leaveColumnContext();
          temp5.leaveRowContext();
          out.print(tags);
        }
    }
  }

  public void commonContextsCheckEnter(PrintWriter out)
  { 
    formGroupContextsCheckEnter(out);
    if(inTableContext())
    { 
      utils.TableContext temp5 = getTableContext();
      if(temp5.isInRowContext())
      { 
        if(temp5.isInColumnContext())
        { 
          tableContextClosingTags.push("");
        }
        else
        { 
          out.print("<td>");
          temp5.enterColumnContext();
          tableContextClosingTags.push("</td>");
        }
      }
      else
      { 
        out.print("<tr><td>");
        temp5.enterRowContext();
        temp5.enterColumnContext();
        tableContextClosingTags.push("</td></tr>");
      }
    }
  }

  public void initRequestVars(PrintWriter out)
  { }
}