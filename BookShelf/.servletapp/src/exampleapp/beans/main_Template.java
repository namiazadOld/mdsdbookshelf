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

public class main_Template  implements TemplateServlet
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
          this.uniqueid = Encoders.encodeTemplateId("main_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "main()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "main()" + ": " + vex.getErrorMessage());
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
          this.uniqueid = Encoders.encodeTemplateId("main_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "main()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "main()" + ": " + vex.getErrorMessage());
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
          this.uniqueid = Encoders.encodeTemplateId("main_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "main()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "main()" + ": " + vex.getErrorMessage());
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
          this.uniqueid = Encoders.encodeTemplateId("main_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "main()" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "main()" + ": " + vex.getErrorMessage());
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
        outtemp.write("<span id=\"" + "main" + "\" class=\"scopediv " + "main" + "\">");
      outtemp.write(s.toString());
      if(ThreadLocalPage.get().templateSpans())
        outtemp.write("</span>");
      cleanup();
    }
  }

  public String getUniqueName()
  { 
    return "main";
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
    ident += "tcall10";
    ThreadLocalPage.get().enterTemplateContext("tcall10");
    try
    { 
      Object[] args83 = {};
      Object[] args82 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("mainheader").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs(args83, new Environment(env), new utils.TemplateCall("none", args82), withcallsmapout, attrsmapout);
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
      System.out.println("Problem in template lookup for " + "mainheader" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall10");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall11";
    ThreadLocalPage.get().enterTemplateContext("tcall11");
    try
    { 
      Object[] args81 = {};
      Object[] args80 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("applicationmenu").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs(args81, new Environment(env), new utils.TemplateCall("none", args80), withcallsmapout, attrsmapout);
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
      System.out.println("Problem in template lookup for " + "applicationmenu" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall11");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall12";
    ThreadLocalPage.get().enterTemplateContext("tcall12");
    try
    { 
      Object[] args79 = {};
      Object[] args78 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs(args79, new Environment(env), new utils.TemplateCall("none", args78), withcallsmapout, attrsmapout);
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
      System.out.println("Problem in template lookup for " + "body" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall12");
  }

  private void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    java.io.PrintWriter out = this.out;
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring166;
    try
    { 
      tmpstring166 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("pagewrapper") : utils.HTMLFilter.filter(String.valueOf("pagewrapper"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring166 = "";
    }
    out.print(tmpstring166);
    out.print("\"");
    out.print(">");
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring167;
    try
    { 
      tmpstring167 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("header") : utils.HTMLFilter.filter(String.valueOf("header"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring167 = "";
    }
    out.print(tmpstring167);
    out.print("\"");
    out.print(">");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall10";
    ThreadLocalPage.get().enterTemplateContext("tcall10");
    try
    { 
      Object[] args97 = {};
      Object[] args96 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("mainheader").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render(args97, new Environment(env), new utils.TemplateCall("none", args96), withcallsmapout, attrsmapout, out);
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
      System.out.println("Problem in template lookup for " + "mainheader" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall10");
    out.print("</" + "div");
    out.print(">");
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring168;
    try
    { 
      tmpstring168 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("navbar") : utils.HTMLFilter.filter(String.valueOf("navbar"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring168 = "";
    }
    out.print(tmpstring168);
    out.print("\"");
    out.print(">");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall11";
    ThreadLocalPage.get().enterTemplateContext("tcall11");
    try
    { 
      Object[] args99 = {};
      Object[] args98 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("applicationmenu").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render(args99, new Environment(env), new utils.TemplateCall("none", args98), withcallsmapout, attrsmapout, out);
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
      System.out.println("Problem in template lookup for " + "applicationmenu" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall11");
    out.print("</" + "div");
    out.print(">");
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring169;
    try
    { 
      tmpstring169 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("content") : utils.HTMLFilter.filter(String.valueOf("content"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring169 = "";
    }
    out.print(tmpstring169);
    out.print("\"");
    out.print(">");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall12";
    ThreadLocalPage.get().enterTemplateContext("tcall12");
    try
    { 
      Object[] args101 = {};
      Object[] args100 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).render(args101, new Environment(env), new utils.TemplateCall("none", args100), withcallsmapout, attrsmapout, out);
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
      System.out.println("Problem in template lookup for " + "body" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall12");
    out.print("</" + "div");
    out.print(">");
    out.print("<" + "div");
    out.print(" " + "id" + "=\"");
    String tmpstring170;
    try
    { 
      tmpstring170 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("footer") : utils.HTMLFilter.filter(String.valueOf("footer"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring170 = "";
    }
    out.print(tmpstring170);
    out.print("\"");
    out.print(">");
    out.print("<" + "p");
    out.print("/>");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring171;
    try
    { 
      tmpstring171 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("powered by ") : utils.HTMLFilter.filter(String.valueOf("powered by "));
    }
    catch(NullPointerException npe)
    { 
      tmpstring171 = "";
    }
    out.print(tmpstring171);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("<" + "a");
    out.print(" " + "href" + "=\"");
    String tmpstring172;
    try
    { 
      tmpstring172 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("http://webdsl.org") : utils.HTMLFilter.filter(String.valueOf("http://webdsl.org"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring172 = "";
    }
    out.print(tmpstring172);
    out.print("\"");
    out.print(">");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring173;
    try
    { 
      tmpstring173 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("WebDSL") : utils.HTMLFilter.filter(String.valueOf("WebDSL"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring173 = "";
    }
    out.print(tmpstring173);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</" + "a");
    out.print(">");
    out.print("<" + "p");
    out.print("/>");
    out.print("</" + "div");
    out.print(">");
    out.print("</" + "div");
    out.print(">");
  }

  private void cleanupTemplateArgAndVar()
  { }

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
    ident += "tcall10";
    ThreadLocalPage.get().enterTemplateContext("tcall10");
    try
    { 
      Object[] args95 = {};
      Object[] args94 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("mainheader").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions(args95, new Environment(env), new utils.TemplateCall("none", args94), withcallsmapout, attrsmapout, out);
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
      System.out.println("Problem in template lookup for " + "mainheader" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall10");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall11";
    ThreadLocalPage.get().enterTemplateContext("tcall11");
    try
    { 
      Object[] args93 = {};
      Object[] args92 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("applicationmenu").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions(args93, new Environment(env), new utils.TemplateCall("none", args92), withcallsmapout, attrsmapout, out);
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
      System.out.println("Problem in template lookup for " + "applicationmenu" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall11");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall12";
    ThreadLocalPage.get().enterTemplateContext("tcall12");
    try
    { 
      Object[] args91 = {};
      Object[] args90 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions(args91, new Environment(env), new utils.TemplateCall("none", args90), withcallsmapout, attrsmapout, out);
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
      System.out.println("Problem in template lookup for " + "body" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall12");
  }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { }

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
    ident += "tcall10";
    ThreadLocalPage.get().enterTemplateContext("tcall10");
    try
    { 
      Object[] args89 = {};
      Object[] args88 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("mainheader").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs(args89, new Environment(env), new utils.TemplateCall("none", args88), withcallsmapout, attrsmapout);
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
      System.out.println("Problem in template lookup for " + "mainheader" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall10");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall11";
    ThreadLocalPage.get().enterTemplateContext("tcall11");
    try
    { 
      Object[] args87 = {};
      Object[] args86 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("applicationmenu").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs(args87, new Environment(env), new utils.TemplateCall("none", args86), withcallsmapout, attrsmapout);
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
      System.out.println("Problem in template lookup for " + "applicationmenu" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall11");
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "tcall12";
    ThreadLocalPage.get().enterTemplateContext("tcall12");
    try
    { 
      Object[] args85 = {};
      Object[] args84 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("body").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs(args85, new Environment(env), new utils.TemplateCall("none", args84), withcallsmapout, attrsmapout);
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
      System.out.println("Problem in template lookup for " + "body" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall12");
  }
}