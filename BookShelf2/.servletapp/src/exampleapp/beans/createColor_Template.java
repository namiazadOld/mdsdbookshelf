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

public class createColor_Template  implements TemplateServlet
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
        env.putTemplate("body", createColor_body_Template.class);
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
          this.uniqueid = Encoders.encodeTemplateId("createColor_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "createColor()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "createColor()" + ": " + vex.getErrorMessage());
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
        env.putTemplate("body", createColor_body_Template.class);
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
          this.uniqueid = Encoders.encodeTemplateId("createColor_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "createColor()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "createColor()" + ": " + vex.getErrorMessage());
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
        env.putTemplate("body", createColor_body_Template.class);
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
          this.uniqueid = Encoders.encodeTemplateId("createColor_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "createColor()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "createColor()" + ": " + vex.getErrorMessage());
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
        env.putTemplate("body", createColor_body_Template.class);
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
          this.uniqueid = Encoders.encodeTemplateId("createColor_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "createColor()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "createColor()" + ": " + vex.getErrorMessage());
          }
          ThreadLocalPage.get().setValidated(false);
          skipThisTemplate = true;
        }
      }
      java.io.PrintWriter outtemp = out;
      java.io.StringWriter s = new java.io.StringWriter();
      this.out = new java.io.PrintWriter(s);
      renderInternal();
      outtemp.write(s.toString());
      cleanup();
    }
  }

  public String getUniqueName()
  { 
    return "createColor";
  }

  private exampleapp.domain.Color temp2;

  public exampleapp.domain.Color getTemp2()
  { 
    return temp2;
  }

  public void setTemp2(exampleapp.domain.Color temp2)
  { 
    this.temp2 = temp2;
  }

  private void validateInputsInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall5";
    ThreadLocalPage.get().enterTemplateContext("tcall5");
    try
    { 
      Object[] args39 = {};
      Object[] args38 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("main").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs(args39, new Environment(env), new utils.TemplateCall("none", args38), withcallsmapout, attrsmapout);
      }
      catch(NullPointerException npe)
      { }
    }
    catch(IllegalAccessException iae)
    { 
      System.out.println("Problem in template servlet template lookup: " + iae.getMessage());
    }
    catch(InstantiationException ie)
    { 
      System.out.println("Problem in template servlet template lookup: " + ie.getMessage());
    }
    catch(NullPointerException npe)
    { 
      System.out.println("Problem in template lookup for " + "main" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall5");
  }

  private void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    java.io.PrintWriter out = this.out;
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall5";
    ThreadLocalPage.get().enterTemplateContext("tcall5");
    try
    { 
      Object[] args45 = {};
      Object[] args44 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("main").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render(args45, new Environment(env), new utils.TemplateCall("none", args44), withcallsmapout, attrsmapout, out);
      }
      catch(NullPointerException npe)
      { }
    }
    catch(IllegalAccessException iae)
    { 
      System.out.println("Problem in template servlet template lookup: " + iae.getMessage());
    }
    catch(InstantiationException ie)
    { 
      System.out.println("Problem in template servlet template lookup: " + ie.getMessage());
    }
    catch(NullPointerException npe)
    { 
      System.out.println("Problem in template lookup for " + "main" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall5");
  }

  private void cleanupTemplateArgAndVar()
  { 
    temp2 = null;
  }

  private void cleanupGlobalAndSession()
  { }

  private void callTemplates()
  { }

  private void handleActionsInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall5";
    ThreadLocalPage.get().enterTemplateContext("tcall5");
    try
    { 
      Object[] args43 = {};
      Object[] args42 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("main").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions(args43, new Environment(env), new utils.TemplateCall("none", args42), withcallsmapout, attrsmapout, out);
        if(ThreadLocalPage.get().hasExecutedAction)
          return;
      }
      catch(NullPointerException npe)
      { }
    }
    catch(IllegalAccessException iae)
    { 
      System.out.println("Problem in template servlet template lookup: " + iae.getMessage());
    }
    catch(InstantiationException ie)
    { 
      System.out.println("Problem in template servlet template lookup: " + ie.getMessage());
    }
    catch(NullPointerException npe)
    { 
      System.out.println("Problem in template lookup for " + "main" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall5");
  }

  private void initializeLocalVars()
  { 
    exampleapp.domain.Color objCr3 = new exampleapp.domain.Color().setupForPropertyEvents(hibSession, out);
    objCr3.Color_(hibSession, env, out);
    temp2 = objCr3;
  }

  private void initializePassOn()
  { 
    env.putVariable("temp2", temp2);
  }

  void initActions()
  { }

  protected void initialize()
  { }

  private void storeInputsInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall5";
    ThreadLocalPage.get().enterTemplateContext("tcall5");
    try
    { 
      Object[] args41 = {};
      Object[] args40 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("main").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs(args41, new Environment(env), new utils.TemplateCall("none", args40), withcallsmapout, attrsmapout);
      }
      catch(NullPointerException npe)
      { }
    }
    catch(IllegalAccessException iae)
    { 
      System.out.println("Problem in template servlet template lookup: " + iae.getMessage());
    }
    catch(InstantiationException ie)
    { 
      System.out.println("Problem in template servlet template lookup: " + ie.getMessage());
    }
    catch(NullPointerException npe)
    { 
      System.out.println("Problem in template lookup for " + "main" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall5");
  }
}