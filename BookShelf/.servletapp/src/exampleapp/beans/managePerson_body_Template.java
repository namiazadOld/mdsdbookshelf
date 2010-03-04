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

public class managePerson_body_Template  implements TemplateServlet
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
          this.uniqueid = Encoders.encodeTemplateId("managePerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("managePerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("managePerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("managePerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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

  private void validateInputsInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    java.util.List<exampleapp.domain.Person> list89 = hibSession.createCriteria(exampleapp.domain.Person.class).setCacheable(true).list();
    inForLoop = true;
    forLoopCounter++;
    int limit61 = 1000;
    int offset61 = 0;
    int removedcount61 = 0;
    Object[] array134 = list89.toArray();
    for(int i134 = 0; i134 < array134.length; i134++)
    { 
      exampleapp.domain.Person elem3 = (exampleapp.domain.Person)array134[i134];
      if(limit61 <= 0)
      { 
        list89.remove(i134 - removedcount61);
        removedcount61++;
      }
      limit61--;
    }
    int separatorindex61 = 0;
    Object[] array135 = list89.toArray();
    for(int i135 = 0; i135 < array135.length; i135++)
    { 
      exampleapp.domain.Person elem3 = (exampleapp.domain.Person)array135[i135];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(elem3))
      { 
        WebDSLEntity temp110 = (WebDSLEntity)(Object)elem3;
        forelementcounter = temp110.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp110.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      { 
        ident += (inForLoop ? forelementcounter : "") + ("form17" + uniqueid);
        if(ThreadLocalPage.get().getParammap().get(ident) != null)
        { 
          ThreadLocalPage.get().setInSubmittedForm(true);
        }
        ThreadLocalPage.get().setInSubmittedForm(false);
      }
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

  private void renderInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    java.io.PrintWriter out = this.out;
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<a href=\"");
    if(ThreadLocalEmailContext.inEmailContext())
    { 
      out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/createPerson"));
    }
    else
    { 
      out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/createPerson"));
    }
    out.print("\" " + "" + " class=\"navigate\">");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring122;
    try
    { 
      tmpstring122 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("create") : utils.HTMLFilter.filter(String.valueOf("create"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring122 = "";
    }
    out.print(tmpstring122);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</a>");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<ul " + "" + ">");
    java.util.List<exampleapp.domain.Person> list94 = hibSession.createCriteria(exampleapp.domain.Person.class).setCacheable(true).list();
    inForLoop = true;
    forLoopCounter++;
    int limit65 = 1000;
    int offset65 = 0;
    int removedcount65 = 0;
    Object[] array142 = list94.toArray();
    for(int i142 = 0; i142 < array142.length; i142++)
    { 
      exampleapp.domain.Person elem3 = (exampleapp.domain.Person)array142[i142];
      if(limit65 <= 0)
      { 
        list94.remove(i142 - removedcount65);
        removedcount65++;
      }
      limit65--;
    }
    int separatorindex65 = 0;
    Object[] array143 = list94.toArray();
    for(int i143 = 0; i143 < array143.length; i143++)
    { 
      exampleapp.domain.Person elem3 = (exampleapp.domain.Person)array143[i143];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(elem3))
      { 
        WebDSLEntity temp114 = (WebDSLEntity)(Object)elem3;
        forelementcounter = temp114.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp114.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      out.print("<li " + "" + ">");
      if(!org.webdsl.tools.Utils.equal(elem3, null))
      { 
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<a href=\"");
        if(ThreadLocalEmailContext.inEmailContext())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/person" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem3.getNaturalId())), "Person")));
        }
        else
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/person" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem3.getNaturalId())), "Person")));
        }
        out.print("\" " + "" + " class=\"navigate\">");
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring123;
        try
        { 
          tmpstring123 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(elem3.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(elem3.setupForPropertyEvents(hibSession, out).getName()));
        }
        catch(NullPointerException npe)
        { 
          tmpstring123 = "";
        }
        out.print(tmpstring123);
        ThreadLocalPage.get().commonContextsCheckLeave(out);
        out.print("</a>");
        ThreadLocalPage.get().commonContextsCheckLeave(out);
      }
      else
      { }
      if(org.webdsl.tools.Utils.equal(elem3, null))
      { 
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring124;
        try
        { 
          tmpstring124 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("null") : utils.HTMLFilter.filter(String.valueOf("null"));
        }
        catch(NullPointerException npe)
        { 
          tmpstring124 = "";
        }
        out.print(tmpstring124);
        ThreadLocalPage.get().commonContextsCheckLeave(out);
      }
      else
      { }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String tmpstring125;
      try
      { 
        tmpstring125 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(" ") : utils.HTMLFilter.filter(String.valueOf(" "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring125 = "";
      }
      out.print(tmpstring125);
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      out.print("<a href=\"");
      if(ThreadLocalEmailContext.inEmailContext())
      { 
        out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/editPerson" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem3.getNaturalId())), "Person")));
      }
      else
      { 
        out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/editPerson" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem3.getNaturalId())), "Person")));
      }
      out.print("\" " + "" + " class=\"navigate\">");
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String tmpstring126;
      try
      { 
        tmpstring126 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("edit") : utils.HTMLFilter.filter(String.valueOf("edit"));
      }
      catch(NullPointerException npe)
      { 
        tmpstring126 = "";
      }
      out.print(tmpstring126);
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      out.print("</a>");
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String tmpstring127;
      try
      { 
        tmpstring127 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(" ") : utils.HTMLFilter.filter(String.valueOf(" "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring127 = "";
      }
      out.print(tmpstring127);
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      ident += "form17" + uniqueid;
      ThreadLocalPage.get().setFormIdent(ident);
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().setInSubmittedForm(true);
      }
      ThreadLocalPage.get().formRequiresMultipartEnc = false;
      out.print("<form name=\"" + ident + "\" id=\"" + ident + "\" action=\"" + utils.HTMLFilter.filter(ThreadLocalPage.get().getPageUrlWithParams()) + "\" accept-charset=\"UTF-8\" method=\"POST\" " + "");
      out.print(" onsubmit=\"return clickFirstButton(this);\"  ");
      java.io.PrintWriter out3 = out;
      java.io.StringWriter stringwriter2 = new java.io.StringWriter();
      out = new java.io.PrintWriter(stringwriter2);
      out.print(">");
      out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
      out.print(ThreadLocalPage.get().getHiddenParams());
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      ident = (inForLoop ? forelementcounter : "") + ("action9" + uniqueid + ("" + (elem3 != null ? elem3.getVersion() == 0 ? "_" : elem3.getId().toString() : "null")));
      java.util.List<String> messagesList57 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve60 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(ident))
        { 
          ve60.add(ve);
        }
      }
      for(utils.ValidationException ve : ve60)
      { 
        messagesList57.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList57.size() > 0)
      { 
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
        java.util.ArrayList<String> list93 = new java.util.ArrayList<String>(messagesList57);
        inForLoop = true;
        forLoopCounter++;
        int limit64 = 1000;
        int offset64 = 0;
        int removedcount64 = 0;
        Object[] array140 = list93.toArray();
        for(int i140 = 0; i140 < array140.length; i140++)
        { 
          String ve1 = (String)array140[i140];
          if(limit64 <= 0)
          { 
            list93.remove(i140 - removedcount64);
            removedcount64++;
          }
          limit64--;
        }
        int separatorindex64 = 0;
        Object[] array141 = list93.toArray();
        for(int i141 = 0; i141 < array141.length; i141++)
        { 
          String ve1 = (String)array141[i141];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve1))
          { 
            WebDSLEntity temp113 = (WebDSLEntity)(Object)ve1;
            forelementcounter = temp113.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp113.getId().toString();
          }
          else
            forelementcounter = Integer.toString(fallbackcounter);
          ThreadLocalPage.get().enterTemplateContext(forelementcounter);
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          String tmpstring130;
          try
          { 
            tmpstring130 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
          }
          catch(NullPointerException npe)
          { 
            tmpstring130 = "";
          }
          out.print(tmpstring130);
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
        if(ThreadLocalPage.get().getParammap().get(ident) != null)
        { 
          java.util.List<String> messagesList56 = new java.util.LinkedList<String>();
          java.util.List<utils.ValidationException> ve59 = new java.util.LinkedList<utils.ValidationException>();
          for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
          { 
            if(ve.getName() != null && ve.getName().equals(ident))
            { 
              ve59.add(ve);
            }
          }
          for(utils.ValidationException ve : ve59)
          { 
            messagesList56.add(ve.getErrorMessage());
            ThreadLocalPage.get().getValidationExceptions().remove(ve);
          }
          if(messagesList56.size() > 0)
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
            java.util.ArrayList<String> list92 = new java.util.ArrayList<String>(messagesList56);
            inForLoop = true;
            forLoopCounter++;
            int limit63 = 1000;
            int offset63 = 0;
            int removedcount63 = 0;
            Object[] array138 = list92.toArray();
            for(int i138 = 0; i138 < array138.length; i138++)
            { 
              String ve1 = (String)array138[i138];
              if(limit63 <= 0)
              { 
                list92.remove(i138 - removedcount63);
                removedcount63++;
              }
              limit63--;
            }
            int separatorindex63 = 0;
            Object[] array139 = list92.toArray();
            for(int i139 = 0; i139 < array139.length; i139++)
            { 
              String ve1 = (String)array139[i139];
              fallbackcounter += 1;
              if(WebDSLEntity.class.isInstance(ve1))
              { 
                WebDSLEntity temp112 = (WebDSLEntity)(Object)ve1;
                forelementcounter = temp112.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp112.getId().toString();
              }
              else
                forelementcounter = Integer.toString(fallbackcounter);
              ThreadLocalPage.get().enterTemplateContext(forelementcounter);
              ThreadLocalPage.get().commonContextsCheckEnter(out);
              out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
              ThreadLocalPage.get().commonContextsCheckEnter(out);
              String tmpstring129;
              try
              { 
                tmpstring129 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
              }
              catch(NullPointerException npe)
              { 
                tmpstring129 = "";
              }
              out.print(tmpstring129);
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
          else
          { }
        }
        out.print("<input type=\"submit\" name=\"" + ident + "\" value=\"");
        String tmpstring128;
        try
        { 
          tmpstring128 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("remove") : utils.HTMLFilter.filter(String.valueOf("remove"));
        }
        catch(NullPointerException npe)
        { 
          tmpstring128 = "";
        }
        out.print(tmpstring128);
        out.print("\" " + ("class" + "='" + "button" + "' ") + " />");
        out.print("</div>");
        ThreadLocalPage.get().commonContextsCheckLeave(out);
      }
      else
      { 
        if(ThreadLocalPage.get().getParammap().get(ident) != null)
        { 
          java.util.List<String> messagesList56 = new java.util.LinkedList<String>();
          java.util.List<utils.ValidationException> ve59 = new java.util.LinkedList<utils.ValidationException>();
          for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
          { 
            if(ve.getName() != null && ve.getName().equals(ident))
            { 
              ve59.add(ve);
            }
          }
          for(utils.ValidationException ve : ve59)
          { 
            messagesList56.add(ve.getErrorMessage());
            ThreadLocalPage.get().getValidationExceptions().remove(ve);
          }
          if(messagesList56.size() > 0)
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
            java.util.ArrayList<String> list92 = new java.util.ArrayList<String>(messagesList56);
            inForLoop = true;
            forLoopCounter++;
            int limit63 = 1000;
            int offset63 = 0;
            int removedcount63 = 0;
            Object[] array138 = list92.toArray();
            for(int i138 = 0; i138 < array138.length; i138++)
            { 
              String ve1 = (String)array138[i138];
              if(limit63 <= 0)
              { 
                list92.remove(i138 - removedcount63);
                removedcount63++;
              }
              limit63--;
            }
            int separatorindex63 = 0;
            Object[] array139 = list92.toArray();
            for(int i139 = 0; i139 < array139.length; i139++)
            { 
              String ve1 = (String)array139[i139];
              fallbackcounter += 1;
              if(WebDSLEntity.class.isInstance(ve1))
              { 
                WebDSLEntity temp112 = (WebDSLEntity)(Object)ve1;
                forelementcounter = temp112.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp112.getId().toString();
              }
              else
                forelementcounter = Integer.toString(fallbackcounter);
              ThreadLocalPage.get().enterTemplateContext(forelementcounter);
              ThreadLocalPage.get().commonContextsCheckEnter(out);
              out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
              ThreadLocalPage.get().commonContextsCheckEnter(out);
              String tmpstring129;
              try
              { 
                tmpstring129 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
              }
              catch(NullPointerException npe)
              { 
                tmpstring129 = "";
              }
              out.print(tmpstring129);
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
          else
          { }
        }
        out.print("<input type=\"submit\" name=\"" + ident + "\" value=\"");
        String tmpstring128;
        try
        { 
          tmpstring128 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("remove") : utils.HTMLFilter.filter(String.valueOf("remove"));
        }
        catch(NullPointerException npe)
        { 
          tmpstring128 = "";
        }
        out.print(tmpstring128);
        out.print("\" " + ("class" + "='" + "button" + "' ") + " />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      out.print("</form>");
      if(ThreadLocalPage.get().formRequiresMultipartEnc)
      { 
        this.out.write(" enctype=\"multipart/form-data\"");
      }
      this.out.write(stringwriter2.toString());
      out = out3;
      ThreadLocalPage.get().formRequiresMultipartEnc = false;
      ThreadLocalPage.get().setInSubmittedForm(false);
      ThreadLocalPage.get().setFormIdent("");
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      out.print("</li>");
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
    out.print("</ul>");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
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
    java.util.List<exampleapp.domain.Person> list91 = hibSession.createCriteria(exampleapp.domain.Person.class).setCacheable(true).list();
    inForLoop = true;
    forLoopCounter++;
    int limit62 = 1000;
    int offset62 = 0;
    int removedcount62 = 0;
    Object[] array136 = list91.toArray();
    for(int i136 = 0; i136 < array136.length; i136++)
    { 
      exampleapp.domain.Person elem3 = (exampleapp.domain.Person)array136[i136];
      if(limit62 <= 0)
      { 
        list91.remove(i136 - removedcount62);
        removedcount62++;
      }
      limit62--;
    }
    int separatorindex62 = 0;
    Object[] array137 = list91.toArray();
    for(int i137 = 0; i137 < array137.length; i137++)
    { 
      exampleapp.domain.Person elem3 = (exampleapp.domain.Person)array137[i137];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(elem3))
      { 
        WebDSLEntity temp111 = (WebDSLEntity)(Object)elem3;
        forelementcounter = temp111.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp111.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "form17" + uniqueid;
      ThreadLocalPage.get().setFormIdent(ident);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      ident = (inForLoop ? forelementcounter : "") + ("action9" + uniqueid + ("" + (elem3 != null ? elem3.getVersion() == 0 ? "_" : elem3.getId().toString() : "null")));
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        remove3 temp = (remove3)env.getAction("remove3");
        temp.remove3(elem3, ident);
      }
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
  }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { 
    env.putAction("remove3", new remove3()
                             { 
                               boolean isRedirected = false;

                               public void setIsRedirected(boolean b)
                               { 
                                 isRedirected = b;
                               }

                               public void remove3(exampleapp.domain.Person arg12, String actionident)
                               { 
                                 ThreadLocalAction.set(this);
                                 if(!ThreadLocalPage.get().hasExecutedAction)
                                 { 
                                   boolean actionFailed = false;
                                   ThreadLocalPage.get().hasExecutedAction = true;
                                   try
                                   { 
                                     arg12.setupForPropertyEvents(hibSession, out).validateDelete();
                                     hibSession.delete(arg12);
                                   }
                                   catch(utils.ValidationException ve)
                                   { 
                                     ThreadLocalPage.get().getValidationExceptions().add(ve.setName(actionident));
                                     ThreadLocalPage.get().clearHibernateCache();
                                     actionFailed = true;
                                   }
                                   catch(utils.MultipleValidationExceptions ve)
                                   { 
                                     for(utils.ValidationException vex : ve.getValidationExceptions())
                                     { 
                                       ThreadLocalPage.get().getValidationExceptions().add(vex.setName(actionident));
                                     }
                                     ThreadLocalPage.get().clearHibernateCache();
                                     actionFailed = true;
                                   }
                                   catch(Exception excep)
                                   { 
                                     System.out.println("exception");
                                     ThreadLocalPage.get().clearHibernateCache();
                                     excep.printStackTrace();
                                     ThreadLocalPage.get().getValidationExceptions().add(new ValidationException(actionident, "An error occured while processing your request"));
                                     actionFailed = true;
                                   }
                                   finally
                                   { 
                                     if(!isRedirected && !ThreadLocalPage.get().isDownloadSet() && !actionFailed)
                                     { 
                                       try
                                       { 
                                         if(!ThreadLocalPage.get().isAjaxActionExecuted())
                                         { 
                                           ThreadLocalPage.get().setRedirectUrl(ThreadLocalPage.get().getPageUrlWithParams());
                                           if(!ThreadLocalPage.get().isActionLinkUsed())
                                           { 
                                             response.sendRedirect(ThreadLocalPage.get().getRedirectUrl());
                                           }
                                         }
                                         else
                                           if(!isRedirected)
                                           { 
                                             out.print("{ action: \"refresh\" },");
                                           }
                                       }
                                       catch(IOException ioe)
                                       { 
                                         System.out.println("redirect failed");
                                         ioe.printStackTrace();
                                       }
                                     }
                                   }
                                 }
                               }
                             });
  }

  void initActions()
  { }

  protected void initialize()
  { }

  private void storeInputsInternal()
  { }
}