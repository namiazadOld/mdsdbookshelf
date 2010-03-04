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

public class errorTemplateInputListString_Template  implements TemplateServlet
{ 
  private void storeArguments(Object[] args)
  { 
    messages3 = (java.util.List<String>)args[0];
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
          this.uniqueid = Encoders.encodeTemplateId("errorTemplateInputListString_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "errorTemplateInput(messages : List<String>)" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "errorTemplateInput(messages : List<String>)" + ": " + vex.getErrorMessage());
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
          this.uniqueid = Encoders.encodeTemplateId("errorTemplateInputListString_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "errorTemplateInput(messages : List<String>)" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "errorTemplateInput(messages : List<String>)" + ": " + vex.getErrorMessage());
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
          this.uniqueid = Encoders.encodeTemplateId("errorTemplateInputListString_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "errorTemplateInput(messages : List<String>)" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "errorTemplateInput(messages : List<String>)" + ": " + vex.getErrorMessage());
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
          this.uniqueid = Encoders.encodeTemplateId("errorTemplateInputListString_Template", "", ThreadLocalPage.get().getTemplateContextString());
          initialize();
          initializeLocalVars();
          initializePassOn();
          initActions();
        }
        catch(utils.ValidationException ve)
        { 
          ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
          ThreadLocalPage.get().setValidated(false);
          utils.Warning.warn("Validation failed in initialization of " + "errorTemplateInput(messages : List<String>)" + ": " + ve.getErrorMessage());
          skipThisTemplate = true;
        }
        catch(utils.MultipleValidationExceptions ve)
        { 
          for(utils.ValidationException vex : ve.getValidationExceptions())
          { 
            ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
            utils.Warning.warn("Validation failed in initialization of " + "errorTemplateInput(messages : List<String>)" + ": " + vex.getErrorMessage());
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
        outtemp.write("<span id=\"" + "errorTemplateInput" + "\" class=\"scopediv " + "errorTemplateInput" + "\">");
      outtemp.write(s.toString());
      if(ThreadLocalPage.get().templateSpans())
        outtemp.write("</span>");
      cleanup();
    }
  }

  public String getUniqueName()
  { 
    return "errorTemplateInputListString";
  }

  private java.util.List<String> messages3 = new java.util.ArrayList<String>();

  public void setMessages3(java.util.List<String> messages3)
  { 
    this.messages3 = messages3;
  }

  public java.util.List<String> getMessages3()
  { 
    return messages3;
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
    ident += "tcall13";
    ThreadLocalPage.get().enterTemplateContext("tcall13");
    try
    { 
      Object[] args103 = {};
      Object[] args102 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("validatedInput").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).validateInputs(args103, new Environment(env), new utils.TemplateCall("none", args102), withcallsmapout, attrsmapout);
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
      System.out.println("Problem in template lookup for " + "validatedInput" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall13");
  }

  private void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    java.io.PrintWriter out = this.out;
    java.util.ArrayList<String> list114 = new java.util.ArrayList<String>(messages3);
    inForLoop = true;
    forLoopCounter++;
    int limit80 = 1000;
    int offset80 = 0;
    int removedcount80 = 0;
    Object[] array172 = list114.toArray();
    for(int i172 = 0; i172 < array172.length; i172++)
    { 
      String ve3 = (String)array172[i172];
      if(limit80 <= 0)
      { 
        list114.remove(i172 - removedcount80);
        removedcount80++;
      }
      limit80--;
    }
    int separatorindex80 = 0;
    Object[] array173 = list114.toArray();
    for(int i173 = 0; i173 < array173.length; i173++)
    { 
      String ve3 = (String)array173[i173];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(ve3))
      { 
        WebDSLEntity temp133 = (WebDSLEntity)(Object)ve3;
        forelementcounter = temp133.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp133.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      out.print("<tr " + ("style" + "='" + "color: #FF0000;border: 1px solid #FF0000;" + "' ") + ">");
      if(ThreadLocalPage.get().inTableContext())
      { 
        ThreadLocalPage.get().getTableContext().enterRowContext();
      }
      out.print("<td " + "" + ">");
      if(ThreadLocalPage.get().inTableContext())
      { 
        ThreadLocalPage.get().getTableContext().enterColumnContext();
      }
      if(ThreadLocalPage.get().inTableContext())
      { 
        ThreadLocalPage.get().getTableContext().leaveColumnContext();
      }
      out.print("</td>");
      out.print("<td " + "" + ">");
      if(ThreadLocalPage.get().inTableContext())
      { 
        ThreadLocalPage.get().getTableContext().enterColumnContext();
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String tmpstring178;
      try
      { 
        tmpstring178 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
      }
      catch(NullPointerException npe)
      { 
        tmpstring178 = "";
      }
      out.print(tmpstring178);
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      if(ThreadLocalPage.get().inTableContext())
      { 
        ThreadLocalPage.get().getTableContext().leaveColumnContext();
      }
      out.print("</td>");
      if(ThreadLocalPage.get().inTableContext())
      { 
        ThreadLocalPage.get().getTableContext().leaveRowContext();
      }
      out.print("</tr>");
      ThreadLocalPage.get().leaveTemplateContextChecked(forelementcounter);
    }
    forLoopCounter--;
    if(forLoopCounter == 0)
    { 
      inForLoop = false;
      forelementcounter = "0";
      fallbackcounter = 0;
    }
  }

  private void cleanupTemplateArgAndVar()
  { 
    messages3 = null;
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
    ident += "tcall13";
    ThreadLocalPage.get().enterTemplateContext("tcall13");
    try
    { 
      Object[] args107 = {};
      Object[] args106 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("validatedInput").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).handleActions(args107, new Environment(env), new utils.TemplateCall("none", args106), withcallsmapout, attrsmapout, out);
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
      System.out.println("Problem in template lookup for " + "validatedInput" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall13");
  }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { 
    env.putVariable("messages3", messages3);
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
    ident += "tcall13";
    ThreadLocalPage.get().enterTemplateContext("tcall13");
    try
    { 
      Object[] args105 = {};
      Object[] args104 = {};
      if(templatecalls.get(ident) == null)
      { 
        templatecalls.put(ident, (TemplateServlet)env.getTemplate("validatedInput").newInstance());
      }
      try
      { 
        withcallsmapout = withcallsmap;
        Map<String, String> attrsmapout = TemplateCall.EmptyAttrs;
        ((TemplateServlet)templatecalls.get(ident)).storeInputs(args105, new Environment(env), new utils.TemplateCall("none", args104), withcallsmapout, attrsmapout);
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
      System.out.println("Problem in template lookup for " + "validatedInput" + ": " + npe.getMessage());
      npe.printStackTrace();
    }
    ident = "";
    ThreadLocalPage.get().leaveTemplateContextChecked("tcall13");
  }
}