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

public class body_Template  implements TemplateServlet
{ 
  private void storeArguments(Object[] args)
  { }

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
          this.uniqueid = Encoders.encodeTemplateId("body_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "body()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "body()" + ": " + vex.getErrorMessage());
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
          this.uniqueid = Encoders.encodeTemplateId("body_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "body()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "body()" + ": " + vex.getErrorMessage());
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
          this.uniqueid = Encoders.encodeTemplateId("body_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "body()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "body()" + ": " + vex.getErrorMessage());
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
          this.uniqueid = Encoders.encodeTemplateId("body_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "body()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "body()" + ": " + vex.getErrorMessage());
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
        outtemp.write("<span id=\"" + "body" + "\" class=\"scopediv " + "body" + "\">");
      outtemp.write(s.toString());
      if(ThreadLocalPage.get().templateSpans())
        outtemp.write("</span>");
      cleanup();
    }
  }

  public String getUniqueName()
  { 
    return "body";
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
    String tmpstring174;
    try
    { 
      tmpstring174 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("default body") : utils.HTMLFilter.filter(String.valueOf("default body"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring174 = "";
    }
    out.print(tmpstring174);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
  }

  private void cleanupTemplateArgAndVar()
  { }

  private void cleanupGlobalAndSession()
  { }

  private void callTemplates()
  { }

  private void handleActionsInternal()
  { }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { }

  void initActions()
  { }

  protected void initialize()
  { }

  private void validateInputsInternal()
  { }

  private void storeInputsInternal()
  { }
}