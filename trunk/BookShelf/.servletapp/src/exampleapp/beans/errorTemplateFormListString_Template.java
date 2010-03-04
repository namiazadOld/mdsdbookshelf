package exampleapp.beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.apache.commons.lang.ArrayUtils;
import utils.*;
import org.webdsl.tools.Utils;
import org.webdsl.lang.Environment;
import org.webdsl.WebDSLEntity;
import exampleapp.domain.*;
import exampleapp.actions.*;

public class errorTemplateFormListString_Template  implements TemplateServlet
{ 
  private void storeArguments(Object[] args)
  { 
    messages0 = (java.util.List<String>)args[0];
  }

  public void storeInputs(Object[] args, Environment env, utils.TemplateCall templateArg, Map<String, utils.TemplateCall> withcallsmap, Map<String, String> attrs)
  { 
    if(!skipThisTemplate)
    { 
      if(!initialized || ThreadLocalPage.get().hibernateCacheCleared)
      { 
        initialized = true;
        this.env = env;
        this.request = ThreadLocalPage.get().getRequest();
        this.response = ThreadLocalPage.get().getResponse();
        this.session = request.getSession(true);
        this.hibSession = ThreadLocalPage.get().getHibSession();
        this.templateArg = templateArg;
        this.withcallsmap = withcallsmap;
        this.attrs = attrs;
        try
        { 
          storeArguments(args);
          this.uniqueid = Encoders.encodeTemplateId("errorTemplateFormListString_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "errorTemplateForm(messages : List<String>)" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "errorTemplateForm(messages : List<String>)" + ": " + vex.getErrorMessage());
          }
          ThreadLocalPage.get().setValidated(false);
          skipThisTemplate = true;
        }
      }
      storeInputsInternal();
    }
  }

  public void validateInputs(Object[] args, Environment env, utils.TemplateCall templateArg, Map<String, utils.TemplateCall> withcallsmap, Map<String, String> attrs)
  { 
    if(!skipThisTemplate)
    { 
      if(!initialized || ThreadLocalPage.get().hibernateCacheCleared)
      { 
        initialized = true;
        this.env = env;
        this.request = ThreadLocalPage.get().getRequest();
        this.response = ThreadLocalPage.get().getResponse();
        this.session = request.getSession(true);
        this.hibSession = ThreadLocalPage.get().getHibSession();
        this.templateArg = templateArg;
        this.withcallsmap = withcallsmap;
        this.attrs = attrs;
        try
        { 
          storeArguments(args);
          this.uniqueid = Encoders.encodeTemplateId("errorTemplateFormListString_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "errorTemplateForm(messages : List<String>)" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "errorTemplateForm(messages : List<String>)" + ": " + vex.getErrorMessage());
          }
          ThreadLocalPage.get().setValidated(false);
          skipThisTemplate = true;
        }
      }
      validateInputsInternal();
    }
  }

  public void handleActions(Object[] args, Environment env, utils.TemplateCall templateArg, Map<String, utils.TemplateCall> withcallsmap, Map<String, String> attrs, PrintWriter out)
  { 
    if(!skipThisTemplate)
    { 
      if(!initialized || ThreadLocalPage.get().hibernateCacheCleared)
      { 
        initialized = true;
        this.env = env;
        this.request = ThreadLocalPage.get().getRequest();
        this.response = ThreadLocalPage.get().getResponse();
        this.session = request.getSession(true);
        this.hibSession = ThreadLocalPage.get().getHibSession();
        this.templateArg = templateArg;
        this.withcallsmap = withcallsmap;
        this.attrs = attrs;
        try
        { 
          storeArguments(args);
          this.uniqueid = Encoders.encodeTemplateId("errorTemplateFormListString_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "errorTemplateForm(messages : List<String>)" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "errorTemplateForm(messages : List<String>)" + ": " + vex.getErrorMessage());
          }
          ThreadLocalPage.get().setValidated(false);
          skipThisTemplate = true;
        }
      }
      this.out = out;
      handleActionsInternal();
    }
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

  boolean validated = true;

  String uniqueid;

  Environment env;

  boolean skipThisTemplate = false;

  private java.util.Map<String, Object> templatecalls = new java.util.HashMap<String, Object>();

  PrintWriter out;

  private org.hibernate.Session hibSession;

  private HttpServletRequest request;

  private HttpServletResponse response;

  private boolean initialized = false;

  private utils.TemplateCall templateArg;

  public Map<String, utils.TemplateCall> withcallsmap = null;

  Map<String, String> attrs = null;

  public Map<String, utils.TemplateCall> withcallsmapout = null;

  HttpSession session;

  public void cleanup()
  { 
    templateArg = null;
    hibSession = null;
    out = null;
    request = null;
    response = null;
    session = null;
    templatecalls.clear();
    templatecalls = null;
    env = null;
    uniqueid = null;
    cleanupGlobalAndSession();
    cleanupTemplateArgAndVar();
  }

  public void render(Object[] args, Environment env, utils.TemplateCall templateArg, Map<String, utils.TemplateCall> withcallsmap, Map<String, String> attrs, PrintWriter out)
  { 
    if(!skipThisTemplate)
    { 
      if(!initialized || ThreadLocalPage.get().hibernateCacheCleared)
      { 
        initialized = true;
        this.env = env;
        this.request = ThreadLocalPage.get().getRequest();
        this.response = ThreadLocalPage.get().getResponse();
        this.session = request.getSession(true);
        this.hibSession = ThreadLocalPage.get().getHibSession();
        this.templateArg = templateArg;
        this.withcallsmap = withcallsmap;
        this.attrs = attrs;
        try
        { 
          storeArguments(args);
          this.uniqueid = Encoders.encodeTemplateId("errorTemplateFormListString_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "errorTemplateForm(messages : List<String>)" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "errorTemplateForm(messages : List<String>)" + ": " + vex.getErrorMessage());
          }
          ThreadLocalPage.get().setValidated(false);
          skipThisTemplate = true;
        }
      }
      java.io.PrintWriter outtemp = out;
      java.io.StringWriter s = new java.io.StringWriter();
      this.out = new java.io.PrintWriter(s);
      renderInternal();
      if(ThreadLocalPage.get().templateSpans())
        outtemp.write("<span id=\"" + "errorTemplateForm" + "\" class=\"scopediv " + "errorTemplateForm" + "\">");
      outtemp.write(s.toString());
      if(ThreadLocalPage.get().templateSpans())
        outtemp.write("</span>");
      cleanup();
    }
  }

  public String getUniqueName()
  { 
    return "errorTemplateFormListString";
  }

  private java.util.List<String> messages0 = new java.util.ArrayList<String>();

  public void setMessages0(java.util.List<String> messages0)
  { 
    this.messages0 = messages0;
  }

  public java.util.List<String> getMessages0()
  { 
    return messages0;
  }

  private void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    java.io.PrintWriter out = this.out;
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
    java.util.ArrayList<String> list17 = new java.util.ArrayList<String>(messages0);
    inForLoop = true;
    forLoopCounter++;
    int limit1 = 1000;
    int offset1 = 0;
    int removedcount1 = 0;
    Object[] array2 = list17.toArray();
    for(int i2 = 0; i2 < array2.length; i2++)
    { 
      String ve0 = (String)array2[i2];
      if(limit1 <= 0)
      { 
        list17.remove(i2 - removedcount1);
        removedcount1++;
      }
      limit1--;
    }
    int separatorindex1 = 0;
    Object[] array3 = list17.toArray();
    for(int i3 = 0; i3 < array3.length; i3++)
    { 
      String ve0 = (String)array3[i3];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(ve0))
      { 
        WebDSLEntity temp6 = (WebDSLEntity)(Object)ve0;
        forelementcounter = temp6.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp6.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String tmpstring2;
      try
      { 
        tmpstring2 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve0) : utils.HTMLFilter.filter(String.valueOf(ve0));
      }
      catch(NullPointerException npe)
      { 
        tmpstring2 = "";
      }
      out.print(tmpstring2);
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

  private void cleanupTemplateArgAndVar()
  { 
    messages0 = null;
  }

  private void cleanupGlobalAndSession()
  { }

  private void callTemplates()
  { }

  private void handleActionsInternal()
  { }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { 
    env.putVariable("messages0", messages0);
  }

  void initActions()
  { }

  protected void initialize()
  { }

  private void validateInputsInternal()
  { }

  private void storeInputsInternal()
  { }
}