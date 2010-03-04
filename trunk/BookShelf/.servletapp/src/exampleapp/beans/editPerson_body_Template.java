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

public class editPerson_body_Template  implements TemplateServlet
{ 
  private exampleapp.domain.Person arg13;

  public exampleapp.domain.Person getArg13()
  { 
    return arg13;
  }

  public void setArg13(exampleapp.domain.Person arg13)
  { 
    this.arg13 = arg13;
  }

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
          this.uniqueid = Encoders.encodeTemplateId("editPerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("editPerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("editPerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("editPerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
    { 
      ident += (inForLoop ? forelementcounter : "") + ("form16" + uniqueid);
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().setInSubmittedForm(true);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input65" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input66" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input67" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input68" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input69" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input70" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input71" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input72" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input73" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input74" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input75" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input76" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input77" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input78" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input79" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input80" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input81" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input82" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input83" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input84" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
      }
      ThreadLocalPage.get().setInSubmittedForm(false);
    }
  }

  protected void initialize()
  { 
    arg13 = (exampleapp.domain.Person)env.getVariable("arg13");
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
    int sec2 = ThreadLocalPage.get().getSectionDepth();
    if(sec2 > 0)
    { 
      if(sec2 > 6)
      { 
        sec2 = 6;
      }
    }
    else
    { 
      sec2 = 1;
    }
    out.print("<h" + sec2);
    out.print(" class=\"header section" + sec2 + "\" " + "" + ">");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring81;
    try
    { 
      tmpstring81 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Edit ") : utils.HTMLFilter.filter(String.valueOf("Edit "));
    }
    catch(NullPointerException npe)
    { 
      tmpstring81 = "";
    }
    out.print(tmpstring81);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring82;
    try
    { 
      tmpstring82 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getName()));
    }
    catch(NullPointerException npe)
    { 
      tmpstring82 = "";
    }
    out.print(tmpstring82);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</h" + sec2 + ">");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    ident += "form16" + uniqueid;
    ThreadLocalPage.get().setFormIdent(ident);
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      ThreadLocalPage.get().setInSubmittedForm(true);
    }
    ThreadLocalPage.get().formRequiresMultipartEnc = false;
    out.print("<form name=\"" + ident + "\" id=\"" + ident + "\" action=\"" + utils.HTMLFilter.filter(ThreadLocalPage.get().getPageUrlWithParams()) + "\" accept-charset=\"UTF-8\" method=\"POST\" " + "");
    out.print(" onsubmit=\"return clickFirstButton(this);\"  ");
    java.io.PrintWriter out2 = out;
    java.io.StringWriter stringwriter1 = new java.io.StringWriter();
    out = new java.io.PrintWriter(stringwriter1);
    out.print(">");
    out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
    out.print(ThreadLocalPage.get().getHiddenParams());
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<fieldset " + "" + "><legend>");
    String tmpstring118;
    try
    { 
      tmpstring118 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Details") : utils.HTMLFilter.filter(String.valueOf("Details"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring118 = "";
    }
    out.print(tmpstring118);
    out.print("</legend>");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<table " + "" + ">");
    ThreadLocalPage.get().enterTableContext();
    out.print("<tr " + "" + ">");
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().enterRowContext();
    }
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().rowContextsCheckEnter(out);
    String label134 = ident + "input65" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label134);
    java.util.List<String> messagesList35 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve38 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label134))
      { 
        ve38.add(ve);
      }
    }
    for(utils.ValidationException ve : ve38)
    { 
      messagesList35.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList35.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label134 + "\" " + "" + ">");
      String tmpstring83;
      try
      { 
        tmpstring83 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Fullname: ") : utils.HTMLFilter.filter(String.valueOf("Fullname: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring83 = "";
      }
      out.print(tmpstring83);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp78 = ident + "input66" + uniqueid;
      java.util.List<String> messagesList34 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve37 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp78))
        { 
          ve37.add(ve);
        }
      }
      for(utils.ValidationException ve : ve37)
      { 
        messagesList34.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList34.size() > 0)
      { 
        out.print("<input name=\"" + temp78 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputfullname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp78)));
        }
        else
        { 
          String tmpstring84;
          try
          { 
            tmpstring84 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getFullname()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getFullname()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring84 = "";
          }
          out.print(tmpstring84);
        }
        out.print("\" />");
        java.util.ArrayList<String> list67 = new java.util.ArrayList<String>(messagesList34);
        inForLoop = true;
        forLoopCounter++;
        int limit39 = 1000;
        int offset39 = 0;
        int removedcount39 = 0;
        Object[] array90 = list67.toArray();
        for(int i90 = 0; i90 < array90.length; i90++)
        { 
          String ve3 = (String)array90[i90];
          if(limit39 <= 0)
          { 
            list67.remove(i90 - removedcount39);
            removedcount39++;
          }
          limit39--;
        }
        int separatorindex39 = 0;
        Object[] array91 = list67.toArray();
        for(int i91 = 0; i91 < array91.length; i91++)
        { 
          String ve3 = (String)array91[i91];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp79 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp79.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp79.getId().toString();
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
          String tmpstring85;
          try
          { 
            tmpstring85 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring85 = "";
          }
          out.print(tmpstring85);
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
      else
      { 
        out.print("<input name=\"" + temp78 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputfullname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp78)));
        }
        else
        { 
          String tmpstring84;
          try
          { 
            tmpstring84 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getFullname()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getFullname()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring84 = "";
          }
          out.print(tmpstring84);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list68 = new java.util.ArrayList<String>(messagesList35);
      inForLoop = true;
      forLoopCounter++;
      int limit40 = 1000;
      int offset40 = 0;
      int removedcount40 = 0;
      Object[] array92 = list68.toArray();
      for(int i92 = 0; i92 < array92.length; i92++)
      { 
        String ve3 = (String)array92[i92];
        if(limit40 <= 0)
        { 
          list68.remove(i92 - removedcount40);
          removedcount40++;
        }
        limit40--;
      }
      int separatorindex40 = 0;
      Object[] array93 = list68.toArray();
      for(int i93 = 0; i93 < array93.length; i93++)
      { 
        String ve3 = (String)array93[i93];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp80 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp80.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp80.getId().toString();
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
        String tmpstring86;
        try
        { 
          tmpstring86 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring86 = "";
        }
        out.print(tmpstring86);
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
    else
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label134 + "\" " + "" + ">");
      String tmpstring83;
      try
      { 
        tmpstring83 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Fullname: ") : utils.HTMLFilter.filter(String.valueOf("Fullname: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring83 = "";
      }
      out.print(tmpstring83);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp78 = ident + "input66" + uniqueid;
      java.util.List<String> messagesList34 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve37 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp78))
        { 
          ve37.add(ve);
        }
      }
      for(utils.ValidationException ve : ve37)
      { 
        messagesList34.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList34.size() > 0)
      { 
        out.print("<input name=\"" + temp78 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputfullname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp78)));
        }
        else
        { 
          String tmpstring84;
          try
          { 
            tmpstring84 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getFullname()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getFullname()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring84 = "";
          }
          out.print(tmpstring84);
        }
        out.print("\" />");
        java.util.ArrayList<String> list67 = new java.util.ArrayList<String>(messagesList34);
        inForLoop = true;
        forLoopCounter++;
        int limit39 = 1000;
        int offset39 = 0;
        int removedcount39 = 0;
        Object[] array90 = list67.toArray();
        for(int i90 = 0; i90 < array90.length; i90++)
        { 
          String ve3 = (String)array90[i90];
          if(limit39 <= 0)
          { 
            list67.remove(i90 - removedcount39);
            removedcount39++;
          }
          limit39--;
        }
        int separatorindex39 = 0;
        Object[] array91 = list67.toArray();
        for(int i91 = 0; i91 < array91.length; i91++)
        { 
          String ve3 = (String)array91[i91];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp79 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp79.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp79.getId().toString();
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
          String tmpstring85;
          try
          { 
            tmpstring85 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring85 = "";
          }
          out.print(tmpstring85);
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
      else
      { 
        out.print("<input name=\"" + temp78 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputfullname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp78)));
        }
        else
        { 
          String tmpstring84;
          try
          { 
            tmpstring84 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getFullname()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getFullname()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring84 = "";
          }
          out.print(tmpstring84);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
    }
    ThreadLocalPage.get().leaveLabelContext();
    ThreadLocalPage.get().rowContextsCheckLeave(out);
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().leaveRowContext();
    }
    out.print("</tr>");
    out.print("<tr " + "" + ">");
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().enterRowContext();
    }
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().rowContextsCheckEnter(out);
    String label135 = ident + "input67" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label135);
    java.util.List<String> messagesList37 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve40 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label135))
      { 
        ve40.add(ve);
      }
    }
    for(utils.ValidationException ve : ve40)
    { 
      messagesList37.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList37.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label135 + "\" " + "" + ">");
      String tmpstring87;
      try
      { 
        tmpstring87 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Email: ") : utils.HTMLFilter.filter(String.valueOf("Email: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring87 = "";
      }
      out.print(tmpstring87);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp81 = ident + "input68" + uniqueid;
      java.util.List<String> messagesList36 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve39 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp81))
        { 
          ve39.add(ve);
        }
      }
      for(utils.ValidationException ve : ve39)
      { 
        messagesList36.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList36.size() > 0)
      { 
        out.print("<input name=\"" + temp81 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputemail") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp81)));
        }
        else
        { 
          String tmpstring88;
          try
          { 
            tmpstring88 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getEmail()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getEmail()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring88 = "";
          }
          out.print(tmpstring88);
        }
        out.print("\" />");
        java.util.ArrayList<String> list69 = new java.util.ArrayList<String>(messagesList36);
        inForLoop = true;
        forLoopCounter++;
        int limit41 = 1000;
        int offset41 = 0;
        int removedcount41 = 0;
        Object[] array94 = list69.toArray();
        for(int i94 = 0; i94 < array94.length; i94++)
        { 
          String ve3 = (String)array94[i94];
          if(limit41 <= 0)
          { 
            list69.remove(i94 - removedcount41);
            removedcount41++;
          }
          limit41--;
        }
        int separatorindex41 = 0;
        Object[] array95 = list69.toArray();
        for(int i95 = 0; i95 < array95.length; i95++)
        { 
          String ve3 = (String)array95[i95];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp82 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp82.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp82.getId().toString();
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
          String tmpstring89;
          try
          { 
            tmpstring89 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring89 = "";
          }
          out.print(tmpstring89);
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
      else
      { 
        out.print("<input name=\"" + temp81 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputemail") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp81)));
        }
        else
        { 
          String tmpstring88;
          try
          { 
            tmpstring88 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getEmail()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getEmail()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring88 = "";
          }
          out.print(tmpstring88);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list70 = new java.util.ArrayList<String>(messagesList37);
      inForLoop = true;
      forLoopCounter++;
      int limit42 = 1000;
      int offset42 = 0;
      int removedcount42 = 0;
      Object[] array96 = list70.toArray();
      for(int i96 = 0; i96 < array96.length; i96++)
      { 
        String ve3 = (String)array96[i96];
        if(limit42 <= 0)
        { 
          list70.remove(i96 - removedcount42);
          removedcount42++;
        }
        limit42--;
      }
      int separatorindex42 = 0;
      Object[] array97 = list70.toArray();
      for(int i97 = 0; i97 < array97.length; i97++)
      { 
        String ve3 = (String)array97[i97];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp83 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp83.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp83.getId().toString();
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
        String tmpstring90;
        try
        { 
          tmpstring90 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring90 = "";
        }
        out.print(tmpstring90);
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
    else
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label135 + "\" " + "" + ">");
      String tmpstring87;
      try
      { 
        tmpstring87 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Email: ") : utils.HTMLFilter.filter(String.valueOf("Email: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring87 = "";
      }
      out.print(tmpstring87);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp81 = ident + "input68" + uniqueid;
      java.util.List<String> messagesList36 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve39 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp81))
        { 
          ve39.add(ve);
        }
      }
      for(utils.ValidationException ve : ve39)
      { 
        messagesList36.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList36.size() > 0)
      { 
        out.print("<input name=\"" + temp81 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputemail") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp81)));
        }
        else
        { 
          String tmpstring88;
          try
          { 
            tmpstring88 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getEmail()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getEmail()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring88 = "";
          }
          out.print(tmpstring88);
        }
        out.print("\" />");
        java.util.ArrayList<String> list69 = new java.util.ArrayList<String>(messagesList36);
        inForLoop = true;
        forLoopCounter++;
        int limit41 = 1000;
        int offset41 = 0;
        int removedcount41 = 0;
        Object[] array94 = list69.toArray();
        for(int i94 = 0; i94 < array94.length; i94++)
        { 
          String ve3 = (String)array94[i94];
          if(limit41 <= 0)
          { 
            list69.remove(i94 - removedcount41);
            removedcount41++;
          }
          limit41--;
        }
        int separatorindex41 = 0;
        Object[] array95 = list69.toArray();
        for(int i95 = 0; i95 < array95.length; i95++)
        { 
          String ve3 = (String)array95[i95];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp82 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp82.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp82.getId().toString();
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
          String tmpstring89;
          try
          { 
            tmpstring89 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring89 = "";
          }
          out.print(tmpstring89);
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
      else
      { 
        out.print("<input name=\"" + temp81 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputemail") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp81)));
        }
        else
        { 
          String tmpstring88;
          try
          { 
            tmpstring88 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getEmail()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getEmail()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring88 = "";
          }
          out.print(tmpstring88);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
    }
    ThreadLocalPage.get().leaveLabelContext();
    ThreadLocalPage.get().rowContextsCheckLeave(out);
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().leaveRowContext();
    }
    out.print("</tr>");
    out.print("<tr " + "" + ">");
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().enterRowContext();
    }
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().rowContextsCheckEnter(out);
    String label136 = ident + "input69" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label136);
    java.util.List<String> messagesList39 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve42 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label136))
      { 
        ve42.add(ve);
      }
    }
    for(utils.ValidationException ve : ve42)
    { 
      messagesList39.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList39.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label136 + "\" " + "" + ">");
      String tmpstring91;
      try
      { 
        tmpstring91 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Username: ") : utils.HTMLFilter.filter(String.valueOf("Username: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring91 = "";
      }
      out.print(tmpstring91);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp84 = ident + "input70" + uniqueid;
      java.util.List<String> messagesList38 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve41 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp84))
        { 
          ve41.add(ve);
        }
      }
      for(utils.ValidationException ve : ve41)
      { 
        messagesList38.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList38.size() > 0)
      { 
        out.print("<input name=\"" + temp84 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputusername") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp84)));
        }
        else
        { 
          String tmpstring92;
          try
          { 
            tmpstring92 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getUsername()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getUsername()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring92 = "";
          }
          out.print(tmpstring92);
        }
        out.print("\" />");
        java.util.ArrayList<String> list71 = new java.util.ArrayList<String>(messagesList38);
        inForLoop = true;
        forLoopCounter++;
        int limit43 = 1000;
        int offset43 = 0;
        int removedcount43 = 0;
        Object[] array98 = list71.toArray();
        for(int i98 = 0; i98 < array98.length; i98++)
        { 
          String ve3 = (String)array98[i98];
          if(limit43 <= 0)
          { 
            list71.remove(i98 - removedcount43);
            removedcount43++;
          }
          limit43--;
        }
        int separatorindex43 = 0;
        Object[] array99 = list71.toArray();
        for(int i99 = 0; i99 < array99.length; i99++)
        { 
          String ve3 = (String)array99[i99];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp85 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp85.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp85.getId().toString();
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
          String tmpstring93;
          try
          { 
            tmpstring93 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring93 = "";
          }
          out.print(tmpstring93);
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
      else
      { 
        out.print("<input name=\"" + temp84 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputusername") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp84)));
        }
        else
        { 
          String tmpstring92;
          try
          { 
            tmpstring92 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getUsername()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getUsername()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring92 = "";
          }
          out.print(tmpstring92);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list72 = new java.util.ArrayList<String>(messagesList39);
      inForLoop = true;
      forLoopCounter++;
      int limit44 = 1000;
      int offset44 = 0;
      int removedcount44 = 0;
      Object[] array100 = list72.toArray();
      for(int i100 = 0; i100 < array100.length; i100++)
      { 
        String ve3 = (String)array100[i100];
        if(limit44 <= 0)
        { 
          list72.remove(i100 - removedcount44);
          removedcount44++;
        }
        limit44--;
      }
      int separatorindex44 = 0;
      Object[] array101 = list72.toArray();
      for(int i101 = 0; i101 < array101.length; i101++)
      { 
        String ve3 = (String)array101[i101];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp86 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp86.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp86.getId().toString();
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
        String tmpstring94;
        try
        { 
          tmpstring94 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring94 = "";
        }
        out.print(tmpstring94);
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
    else
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label136 + "\" " + "" + ">");
      String tmpstring91;
      try
      { 
        tmpstring91 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Username: ") : utils.HTMLFilter.filter(String.valueOf("Username: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring91 = "";
      }
      out.print(tmpstring91);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp84 = ident + "input70" + uniqueid;
      java.util.List<String> messagesList38 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve41 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp84))
        { 
          ve41.add(ve);
        }
      }
      for(utils.ValidationException ve : ve41)
      { 
        messagesList38.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList38.size() > 0)
      { 
        out.print("<input name=\"" + temp84 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputusername") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp84)));
        }
        else
        { 
          String tmpstring92;
          try
          { 
            tmpstring92 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getUsername()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getUsername()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring92 = "";
          }
          out.print(tmpstring92);
        }
        out.print("\" />");
        java.util.ArrayList<String> list71 = new java.util.ArrayList<String>(messagesList38);
        inForLoop = true;
        forLoopCounter++;
        int limit43 = 1000;
        int offset43 = 0;
        int removedcount43 = 0;
        Object[] array98 = list71.toArray();
        for(int i98 = 0; i98 < array98.length; i98++)
        { 
          String ve3 = (String)array98[i98];
          if(limit43 <= 0)
          { 
            list71.remove(i98 - removedcount43);
            removedcount43++;
          }
          limit43--;
        }
        int separatorindex43 = 0;
        Object[] array99 = list71.toArray();
        for(int i99 = 0; i99 < array99.length; i99++)
        { 
          String ve3 = (String)array99[i99];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp85 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp85.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp85.getId().toString();
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
          String tmpstring93;
          try
          { 
            tmpstring93 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring93 = "";
          }
          out.print(tmpstring93);
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
      else
      { 
        out.print("<input name=\"" + temp84 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputusername") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp84)));
        }
        else
        { 
          String tmpstring92;
          try
          { 
            tmpstring92 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getUsername()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getUsername()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring92 = "";
          }
          out.print(tmpstring92);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
    }
    ThreadLocalPage.get().leaveLabelContext();
    ThreadLocalPage.get().rowContextsCheckLeave(out);
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().leaveRowContext();
    }
    out.print("</tr>");
    out.print("<tr " + "" + ">");
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().enterRowContext();
    }
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().rowContextsCheckEnter(out);
    String label137 = ident + "input71" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label137);
    java.util.List<String> messagesList41 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve44 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label137))
      { 
        ve44.add(ve);
      }
    }
    for(utils.ValidationException ve : ve44)
    { 
      messagesList41.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList41.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label137 + "\" " + "" + ">");
      String tmpstring95;
      try
      { 
        tmpstring95 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Bio: ") : utils.HTMLFilter.filter(String.valueOf("Bio: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring95 = "";
      }
      out.print(tmpstring95);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp87 = ident + "input72" + uniqueid;
      java.util.List<String> messagesList40 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve43 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp87))
        { 
          ve43.add(ve);
        }
      }
      for(utils.ValidationException ve : ve43)
      { 
        messagesList40.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList40.size() > 0)
      { 
        out.print("<textarea name=\"" + temp87 + "\"" + (" class=\"" + "inputTextarea inputWikiText" + (" " + "inputbio") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp87)));
        }
        else
        { 
          String tmpstring96;
          try
          { 
            tmpstring96 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getBio()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getBio()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring96 = "";
          }
          out.print(tmpstring96);
        }
        out.print("</textarea>");
        java.util.ArrayList<String> list73 = new java.util.ArrayList<String>(messagesList40);
        inForLoop = true;
        forLoopCounter++;
        int limit45 = 1000;
        int offset45 = 0;
        int removedcount45 = 0;
        Object[] array102 = list73.toArray();
        for(int i102 = 0; i102 < array102.length; i102++)
        { 
          String ve3 = (String)array102[i102];
          if(limit45 <= 0)
          { 
            list73.remove(i102 - removedcount45);
            removedcount45++;
          }
          limit45--;
        }
        int separatorindex45 = 0;
        Object[] array103 = list73.toArray();
        for(int i103 = 0; i103 < array103.length; i103++)
        { 
          String ve3 = (String)array103[i103];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp88 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp88.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp88.getId().toString();
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
          String tmpstring97;
          try
          { 
            tmpstring97 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring97 = "";
          }
          out.print(tmpstring97);
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
      else
      { 
        out.print("<textarea name=\"" + temp87 + "\"" + (" class=\"" + "inputTextarea inputWikiText" + (" " + "inputbio") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp87)));
        }
        else
        { 
          String tmpstring96;
          try
          { 
            tmpstring96 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getBio()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getBio()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring96 = "";
          }
          out.print(tmpstring96);
        }
        out.print("</textarea>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list74 = new java.util.ArrayList<String>(messagesList41);
      inForLoop = true;
      forLoopCounter++;
      int limit46 = 1000;
      int offset46 = 0;
      int removedcount46 = 0;
      Object[] array104 = list74.toArray();
      for(int i104 = 0; i104 < array104.length; i104++)
      { 
        String ve3 = (String)array104[i104];
        if(limit46 <= 0)
        { 
          list74.remove(i104 - removedcount46);
          removedcount46++;
        }
        limit46--;
      }
      int separatorindex46 = 0;
      Object[] array105 = list74.toArray();
      for(int i105 = 0; i105 < array105.length; i105++)
      { 
        String ve3 = (String)array105[i105];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp89 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp89.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp89.getId().toString();
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
        String tmpstring98;
        try
        { 
          tmpstring98 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring98 = "";
        }
        out.print(tmpstring98);
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
    else
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label137 + "\" " + "" + ">");
      String tmpstring95;
      try
      { 
        tmpstring95 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Bio: ") : utils.HTMLFilter.filter(String.valueOf("Bio: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring95 = "";
      }
      out.print(tmpstring95);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp87 = ident + "input72" + uniqueid;
      java.util.List<String> messagesList40 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve43 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp87))
        { 
          ve43.add(ve);
        }
      }
      for(utils.ValidationException ve : ve43)
      { 
        messagesList40.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList40.size() > 0)
      { 
        out.print("<textarea name=\"" + temp87 + "\"" + (" class=\"" + "inputTextarea inputWikiText" + (" " + "inputbio") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp87)));
        }
        else
        { 
          String tmpstring96;
          try
          { 
            tmpstring96 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getBio()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getBio()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring96 = "";
          }
          out.print(tmpstring96);
        }
        out.print("</textarea>");
        java.util.ArrayList<String> list73 = new java.util.ArrayList<String>(messagesList40);
        inForLoop = true;
        forLoopCounter++;
        int limit45 = 1000;
        int offset45 = 0;
        int removedcount45 = 0;
        Object[] array102 = list73.toArray();
        for(int i102 = 0; i102 < array102.length; i102++)
        { 
          String ve3 = (String)array102[i102];
          if(limit45 <= 0)
          { 
            list73.remove(i102 - removedcount45);
            removedcount45++;
          }
          limit45--;
        }
        int separatorindex45 = 0;
        Object[] array103 = list73.toArray();
        for(int i103 = 0; i103 < array103.length; i103++)
        { 
          String ve3 = (String)array103[i103];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp88 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp88.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp88.getId().toString();
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
          String tmpstring97;
          try
          { 
            tmpstring97 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring97 = "";
          }
          out.print(tmpstring97);
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
      else
      { 
        out.print("<textarea name=\"" + temp87 + "\"" + (" class=\"" + "inputTextarea inputWikiText" + (" " + "inputbio") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp87)));
        }
        else
        { 
          String tmpstring96;
          try
          { 
            tmpstring96 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getBio()) : utils.HTMLFilter.filter(String.valueOf(arg13.setupForPropertyEvents(hibSession, out).getBio()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring96 = "";
          }
          out.print(tmpstring96);
        }
        out.print("</textarea>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
    }
    ThreadLocalPage.get().leaveLabelContext();
    ThreadLocalPage.get().rowContextsCheckLeave(out);
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().leaveRowContext();
    }
    out.print("</tr>");
    out.print("<tr " + "" + ">");
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().enterRowContext();
    }
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().rowContextsCheckEnter(out);
    String label138 = ident + "input73" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label138);
    java.util.List<String> messagesList43 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve46 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label138))
      { 
        ve46.add(ve);
      }
    }
    for(utils.ValidationException ve : ve46)
    { 
      messagesList43.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList43.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label138 + "\" " + "" + ">");
      String tmpstring99;
      try
      { 
        tmpstring99 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Date of birth: ") : utils.HTMLFilter.filter(String.valueOf("Date of birth: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring99 = "";
      }
      out.print(tmpstring99);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp90 = ident + "input74" + uniqueid;
      java.util.List<String> messagesList42 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve45 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp90))
        { 
          ve45.add(ve);
        }
      }
      for(utils.ValidationException ve : ve45)
      { 
        messagesList42.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList42.size() > 0)
      { 
        out.print("<input name=\"" + temp90 + "\" " + (" class=\"" + "inputDate" + (" " + "inputdateOfBirth") + "\" " + "" + " ") + " type=\"text\" dojoType=\"dijit.form.DateTextBox\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp90)));
        }
        else
        { 
          String tmpstring100;
          try
          { 
            java.text.SimpleDateFormat formatter2 = new java.text.SimpleDateFormat("yyyy-MM-dd");
            StringBuffer buffer2 = new StringBuffer();
            formatter2.format(arg13.setupForPropertyEvents(hibSession, out).getDateOfBirth(), buffer2, new java.text.FieldPosition(0));
            tmpstring100 = buffer2.toString();
          }
          catch(NullPointerException npe)
          { 
            tmpstring100 = "";
          }
          out.print(tmpstring100);
        }
        out.print("\" constraints=\"{datePattern:'" + "dd/MM/yyyy" + "'}\" />");
        ThreadLocalPage.get().useDojo = true;
        ThreadLocalPage.get().addCustomHead("DATEPICKER", "<script type=\"text/javascript\">dojo.require('dijit.form.DateTextBox');</script>");
        java.util.ArrayList<String> list75 = new java.util.ArrayList<String>(messagesList42);
        inForLoop = true;
        forLoopCounter++;
        int limit47 = 1000;
        int offset47 = 0;
        int removedcount47 = 0;
        Object[] array106 = list75.toArray();
        for(int i106 = 0; i106 < array106.length; i106++)
        { 
          String ve3 = (String)array106[i106];
          if(limit47 <= 0)
          { 
            list75.remove(i106 - removedcount47);
            removedcount47++;
          }
          limit47--;
        }
        int separatorindex47 = 0;
        Object[] array107 = list75.toArray();
        for(int i107 = 0; i107 < array107.length; i107++)
        { 
          String ve3 = (String)array107[i107];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp91 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp91.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp91.getId().toString();
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
          String tmpstring101;
          try
          { 
            tmpstring101 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring101 = "";
          }
          out.print(tmpstring101);
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
      else
      { 
        out.print("<input name=\"" + temp90 + "\" " + (" class=\"" + "inputDate" + (" " + "inputdateOfBirth") + "\" " + "" + " ") + " type=\"text\" dojoType=\"dijit.form.DateTextBox\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp90)));
        }
        else
        { 
          String tmpstring100;
          try
          { 
            java.text.SimpleDateFormat formatter2 = new java.text.SimpleDateFormat("yyyy-MM-dd");
            StringBuffer buffer2 = new StringBuffer();
            formatter2.format(arg13.setupForPropertyEvents(hibSession, out).getDateOfBirth(), buffer2, new java.text.FieldPosition(0));
            tmpstring100 = buffer2.toString();
          }
          catch(NullPointerException npe)
          { 
            tmpstring100 = "";
          }
          out.print(tmpstring100);
        }
        out.print("\" constraints=\"{datePattern:'" + "dd/MM/yyyy" + "'}\" />");
        ThreadLocalPage.get().useDojo = true;
        ThreadLocalPage.get().addCustomHead("DATEPICKER", "<script type=\"text/javascript\">dojo.require('dijit.form.DateTextBox');</script>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list76 = new java.util.ArrayList<String>(messagesList43);
      inForLoop = true;
      forLoopCounter++;
      int limit48 = 1000;
      int offset48 = 0;
      int removedcount48 = 0;
      Object[] array108 = list76.toArray();
      for(int i108 = 0; i108 < array108.length; i108++)
      { 
        String ve3 = (String)array108[i108];
        if(limit48 <= 0)
        { 
          list76.remove(i108 - removedcount48);
          removedcount48++;
        }
        limit48--;
      }
      int separatorindex48 = 0;
      Object[] array109 = list76.toArray();
      for(int i109 = 0; i109 < array109.length; i109++)
      { 
        String ve3 = (String)array109[i109];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp92 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp92.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp92.getId().toString();
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
        String tmpstring102;
        try
        { 
          tmpstring102 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring102 = "";
        }
        out.print(tmpstring102);
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
    else
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label138 + "\" " + "" + ">");
      String tmpstring99;
      try
      { 
        tmpstring99 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Date of birth: ") : utils.HTMLFilter.filter(String.valueOf("Date of birth: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring99 = "";
      }
      out.print(tmpstring99);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp90 = ident + "input74" + uniqueid;
      java.util.List<String> messagesList42 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve45 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp90))
        { 
          ve45.add(ve);
        }
      }
      for(utils.ValidationException ve : ve45)
      { 
        messagesList42.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList42.size() > 0)
      { 
        out.print("<input name=\"" + temp90 + "\" " + (" class=\"" + "inputDate" + (" " + "inputdateOfBirth") + "\" " + "" + " ") + " type=\"text\" dojoType=\"dijit.form.DateTextBox\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp90)));
        }
        else
        { 
          String tmpstring100;
          try
          { 
            java.text.SimpleDateFormat formatter2 = new java.text.SimpleDateFormat("yyyy-MM-dd");
            StringBuffer buffer2 = new StringBuffer();
            formatter2.format(arg13.setupForPropertyEvents(hibSession, out).getDateOfBirth(), buffer2, new java.text.FieldPosition(0));
            tmpstring100 = buffer2.toString();
          }
          catch(NullPointerException npe)
          { 
            tmpstring100 = "";
          }
          out.print(tmpstring100);
        }
        out.print("\" constraints=\"{datePattern:'" + "dd/MM/yyyy" + "'}\" />");
        ThreadLocalPage.get().useDojo = true;
        ThreadLocalPage.get().addCustomHead("DATEPICKER", "<script type=\"text/javascript\">dojo.require('dijit.form.DateTextBox');</script>");
        java.util.ArrayList<String> list75 = new java.util.ArrayList<String>(messagesList42);
        inForLoop = true;
        forLoopCounter++;
        int limit47 = 1000;
        int offset47 = 0;
        int removedcount47 = 0;
        Object[] array106 = list75.toArray();
        for(int i106 = 0; i106 < array106.length; i106++)
        { 
          String ve3 = (String)array106[i106];
          if(limit47 <= 0)
          { 
            list75.remove(i106 - removedcount47);
            removedcount47++;
          }
          limit47--;
        }
        int separatorindex47 = 0;
        Object[] array107 = list75.toArray();
        for(int i107 = 0; i107 < array107.length; i107++)
        { 
          String ve3 = (String)array107[i107];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp91 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp91.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp91.getId().toString();
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
          String tmpstring101;
          try
          { 
            tmpstring101 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring101 = "";
          }
          out.print(tmpstring101);
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
      else
      { 
        out.print("<input name=\"" + temp90 + "\" " + (" class=\"" + "inputDate" + (" " + "inputdateOfBirth") + "\" " + "" + " ") + " type=\"text\" dojoType=\"dijit.form.DateTextBox\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp90)));
        }
        else
        { 
          String tmpstring100;
          try
          { 
            java.text.SimpleDateFormat formatter2 = new java.text.SimpleDateFormat("yyyy-MM-dd");
            StringBuffer buffer2 = new StringBuffer();
            formatter2.format(arg13.setupForPropertyEvents(hibSession, out).getDateOfBirth(), buffer2, new java.text.FieldPosition(0));
            tmpstring100 = buffer2.toString();
          }
          catch(NullPointerException npe)
          { 
            tmpstring100 = "";
          }
          out.print(tmpstring100);
        }
        out.print("\" constraints=\"{datePattern:'" + "dd/MM/yyyy" + "'}\" />");
        ThreadLocalPage.get().useDojo = true;
        ThreadLocalPage.get().addCustomHead("DATEPICKER", "<script type=\"text/javascript\">dojo.require('dijit.form.DateTextBox');</script>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
    }
    ThreadLocalPage.get().leaveLabelContext();
    ThreadLocalPage.get().rowContextsCheckLeave(out);
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().leaveRowContext();
    }
    out.print("</tr>");
    out.print("<tr " + "" + ">");
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().enterRowContext();
    }
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().rowContextsCheckEnter(out);
    String label139 = ident + "input75" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label139);
    java.util.List<String> messagesList45 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve48 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label139))
      { 
        ve48.add(ve);
      }
    }
    for(utils.ValidationException ve : ve48)
    { 
      messagesList45.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList45.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label139 + "\" " + "" + ">");
      String tmpstring103;
      try
      { 
        tmpstring103 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Parents: ") : utils.HTMLFilter.filter(String.valueOf("Parents: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring103 = "";
      }
      out.print(tmpstring103);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp93 = ident + "input76" + uniqueid;
      java.util.List<String> messagesList44 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve47 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp93))
        { 
          ve47.add(ve);
        }
      }
      for(utils.ValidationException ve : ve47)
      { 
        messagesList44.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList44.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp93 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp93 + "\"" + (" class=\"" + "select" + (" " + "inputparents") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter3 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter3.hasNext())
        { 
          exampleapp.domain.Person person01 = (exampleapp.domain.Person)iter3.next();
          out.print("<option value=\"" + person01.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp93) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp93))
              { 
                if(elem.equals(String.valueOf(person01.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getParents() != null && arg13.setupForPropertyEvents(hibSession, out).getParents().contains(person01))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person01.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list77 = new java.util.ArrayList<String>(messagesList44);
        inForLoop = true;
        forLoopCounter++;
        int limit49 = 1000;
        int offset49 = 0;
        int removedcount49 = 0;
        Object[] array110 = list77.toArray();
        for(int i110 = 0; i110 < array110.length; i110++)
        { 
          String ve3 = (String)array110[i110];
          if(limit49 <= 0)
          { 
            list77.remove(i110 - removedcount49);
            removedcount49++;
          }
          limit49--;
        }
        int separatorindex49 = 0;
        Object[] array111 = list77.toArray();
        for(int i111 = 0; i111 < array111.length; i111++)
        { 
          String ve3 = (String)array111[i111];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp94 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp94.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp94.getId().toString();
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
          String tmpstring104;
          try
          { 
            tmpstring104 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring104 = "";
          }
          out.print(tmpstring104);
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
      else
      { 
        out.print("<input type=\"hidden\" name=\"" + temp93 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp93 + "\"" + (" class=\"" + "select" + (" " + "inputparents") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter3 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter3.hasNext())
        { 
          exampleapp.domain.Person person01 = (exampleapp.domain.Person)iter3.next();
          out.print("<option value=\"" + person01.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp93) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp93))
              { 
                if(elem.equals(String.valueOf(person01.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getParents() != null && arg13.setupForPropertyEvents(hibSession, out).getParents().contains(person01))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person01.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list78 = new java.util.ArrayList<String>(messagesList45);
      inForLoop = true;
      forLoopCounter++;
      int limit50 = 1000;
      int offset50 = 0;
      int removedcount50 = 0;
      Object[] array112 = list78.toArray();
      for(int i112 = 0; i112 < array112.length; i112++)
      { 
        String ve3 = (String)array112[i112];
        if(limit50 <= 0)
        { 
          list78.remove(i112 - removedcount50);
          removedcount50++;
        }
        limit50--;
      }
      int separatorindex50 = 0;
      Object[] array113 = list78.toArray();
      for(int i113 = 0; i113 < array113.length; i113++)
      { 
        String ve3 = (String)array113[i113];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp95 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp95.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp95.getId().toString();
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
        String tmpstring105;
        try
        { 
          tmpstring105 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring105 = "";
        }
        out.print(tmpstring105);
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
    else
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label139 + "\" " + "" + ">");
      String tmpstring103;
      try
      { 
        tmpstring103 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Parents: ") : utils.HTMLFilter.filter(String.valueOf("Parents: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring103 = "";
      }
      out.print(tmpstring103);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp93 = ident + "input76" + uniqueid;
      java.util.List<String> messagesList44 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve47 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp93))
        { 
          ve47.add(ve);
        }
      }
      for(utils.ValidationException ve : ve47)
      { 
        messagesList44.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList44.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp93 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp93 + "\"" + (" class=\"" + "select" + (" " + "inputparents") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter3 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter3.hasNext())
        { 
          exampleapp.domain.Person person01 = (exampleapp.domain.Person)iter3.next();
          out.print("<option value=\"" + person01.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp93) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp93))
              { 
                if(elem.equals(String.valueOf(person01.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getParents() != null && arg13.setupForPropertyEvents(hibSession, out).getParents().contains(person01))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person01.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list77 = new java.util.ArrayList<String>(messagesList44);
        inForLoop = true;
        forLoopCounter++;
        int limit49 = 1000;
        int offset49 = 0;
        int removedcount49 = 0;
        Object[] array110 = list77.toArray();
        for(int i110 = 0; i110 < array110.length; i110++)
        { 
          String ve3 = (String)array110[i110];
          if(limit49 <= 0)
          { 
            list77.remove(i110 - removedcount49);
            removedcount49++;
          }
          limit49--;
        }
        int separatorindex49 = 0;
        Object[] array111 = list77.toArray();
        for(int i111 = 0; i111 < array111.length; i111++)
        { 
          String ve3 = (String)array111[i111];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp94 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp94.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp94.getId().toString();
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
          String tmpstring104;
          try
          { 
            tmpstring104 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring104 = "";
          }
          out.print(tmpstring104);
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
      else
      { 
        out.print("<input type=\"hidden\" name=\"" + temp93 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp93 + "\"" + (" class=\"" + "select" + (" " + "inputparents") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter3 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter3.hasNext())
        { 
          exampleapp.domain.Person person01 = (exampleapp.domain.Person)iter3.next();
          out.print("<option value=\"" + person01.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp93) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp93))
              { 
                if(elem.equals(String.valueOf(person01.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getParents() != null && arg13.setupForPropertyEvents(hibSession, out).getParents().contains(person01))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person01.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
    }
    ThreadLocalPage.get().leaveLabelContext();
    ThreadLocalPage.get().rowContextsCheckLeave(out);
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().leaveRowContext();
    }
    out.print("</tr>");
    out.print("<tr " + "" + ">");
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().enterRowContext();
    }
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().rowContextsCheckEnter(out);
    String label140 = ident + "input77" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label140);
    java.util.List<String> messagesList47 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve50 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label140))
      { 
        ve50.add(ve);
      }
    }
    for(utils.ValidationException ve : ve50)
    { 
      messagesList47.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList47.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label140 + "\" " + "" + ">");
      String tmpstring106;
      try
      { 
        tmpstring106 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Children: ") : utils.HTMLFilter.filter(String.valueOf("Children: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring106 = "";
      }
      out.print(tmpstring106);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp96 = ident + "input78" + uniqueid;
      java.util.List<String> messagesList46 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve49 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp96))
        { 
          ve49.add(ve);
        }
      }
      for(utils.ValidationException ve : ve49)
      { 
        messagesList46.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList46.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp96 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp96 + "\"" + (" class=\"" + "select" + (" " + "inputchildren") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter4 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter4.hasNext())
        { 
          exampleapp.domain.Person person11 = (exampleapp.domain.Person)iter4.next();
          out.print("<option value=\"" + person11.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp96) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp96))
              { 
                if(elem.equals(String.valueOf(person11.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getChildren() != null && arg13.setupForPropertyEvents(hibSession, out).getChildren().contains(person11))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person11.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list79 = new java.util.ArrayList<String>(messagesList46);
        inForLoop = true;
        forLoopCounter++;
        int limit51 = 1000;
        int offset51 = 0;
        int removedcount51 = 0;
        Object[] array114 = list79.toArray();
        for(int i114 = 0; i114 < array114.length; i114++)
        { 
          String ve3 = (String)array114[i114];
          if(limit51 <= 0)
          { 
            list79.remove(i114 - removedcount51);
            removedcount51++;
          }
          limit51--;
        }
        int separatorindex51 = 0;
        Object[] array115 = list79.toArray();
        for(int i115 = 0; i115 < array115.length; i115++)
        { 
          String ve3 = (String)array115[i115];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp97 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp97.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp97.getId().toString();
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
          String tmpstring107;
          try
          { 
            tmpstring107 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring107 = "";
          }
          out.print(tmpstring107);
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
      else
      { 
        out.print("<input type=\"hidden\" name=\"" + temp96 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp96 + "\"" + (" class=\"" + "select" + (" " + "inputchildren") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter4 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter4.hasNext())
        { 
          exampleapp.domain.Person person11 = (exampleapp.domain.Person)iter4.next();
          out.print("<option value=\"" + person11.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp96) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp96))
              { 
                if(elem.equals(String.valueOf(person11.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getChildren() != null && arg13.setupForPropertyEvents(hibSession, out).getChildren().contains(person11))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person11.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list80 = new java.util.ArrayList<String>(messagesList47);
      inForLoop = true;
      forLoopCounter++;
      int limit52 = 1000;
      int offset52 = 0;
      int removedcount52 = 0;
      Object[] array116 = list80.toArray();
      for(int i116 = 0; i116 < array116.length; i116++)
      { 
        String ve3 = (String)array116[i116];
        if(limit52 <= 0)
        { 
          list80.remove(i116 - removedcount52);
          removedcount52++;
        }
        limit52--;
      }
      int separatorindex52 = 0;
      Object[] array117 = list80.toArray();
      for(int i117 = 0; i117 < array117.length; i117++)
      { 
        String ve3 = (String)array117[i117];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp98 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp98.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp98.getId().toString();
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
        String tmpstring108;
        try
        { 
          tmpstring108 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring108 = "";
        }
        out.print(tmpstring108);
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
    else
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label140 + "\" " + "" + ">");
      String tmpstring106;
      try
      { 
        tmpstring106 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Children: ") : utils.HTMLFilter.filter(String.valueOf("Children: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring106 = "";
      }
      out.print(tmpstring106);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp96 = ident + "input78" + uniqueid;
      java.util.List<String> messagesList46 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve49 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp96))
        { 
          ve49.add(ve);
        }
      }
      for(utils.ValidationException ve : ve49)
      { 
        messagesList46.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList46.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp96 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp96 + "\"" + (" class=\"" + "select" + (" " + "inputchildren") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter4 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter4.hasNext())
        { 
          exampleapp.domain.Person person11 = (exampleapp.domain.Person)iter4.next();
          out.print("<option value=\"" + person11.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp96) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp96))
              { 
                if(elem.equals(String.valueOf(person11.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getChildren() != null && arg13.setupForPropertyEvents(hibSession, out).getChildren().contains(person11))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person11.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list79 = new java.util.ArrayList<String>(messagesList46);
        inForLoop = true;
        forLoopCounter++;
        int limit51 = 1000;
        int offset51 = 0;
        int removedcount51 = 0;
        Object[] array114 = list79.toArray();
        for(int i114 = 0; i114 < array114.length; i114++)
        { 
          String ve3 = (String)array114[i114];
          if(limit51 <= 0)
          { 
            list79.remove(i114 - removedcount51);
            removedcount51++;
          }
          limit51--;
        }
        int separatorindex51 = 0;
        Object[] array115 = list79.toArray();
        for(int i115 = 0; i115 < array115.length; i115++)
        { 
          String ve3 = (String)array115[i115];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp97 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp97.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp97.getId().toString();
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
          String tmpstring107;
          try
          { 
            tmpstring107 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring107 = "";
          }
          out.print(tmpstring107);
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
      else
      { 
        out.print("<input type=\"hidden\" name=\"" + temp96 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp96 + "\"" + (" class=\"" + "select" + (" " + "inputchildren") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter4 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter4.hasNext())
        { 
          exampleapp.domain.Person person11 = (exampleapp.domain.Person)iter4.next();
          out.print("<option value=\"" + person11.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp96) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp96))
              { 
                if(elem.equals(String.valueOf(person11.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getChildren() != null && arg13.setupForPropertyEvents(hibSession, out).getChildren().contains(person11))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person11.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
    }
    ThreadLocalPage.get().leaveLabelContext();
    ThreadLocalPage.get().rowContextsCheckLeave(out);
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().leaveRowContext();
    }
    out.print("</tr>");
    out.print("<tr " + "" + ">");
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().enterRowContext();
    }
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().rowContextsCheckEnter(out);
    String label141 = ident + "input79" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label141);
    java.util.List<String> messagesList49 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve52 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label141))
      { 
        ve52.add(ve);
      }
    }
    for(utils.ValidationException ve : ve52)
    { 
      messagesList49.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList49.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label141 + "\" " + "" + ">");
      String tmpstring109;
      try
      { 
        tmpstring109 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Photo: ") : utils.HTMLFilter.filter(String.valueOf("Photo: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring109 = "";
      }
      out.print(tmpstring109);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      ThreadLocalPage.get().formRequiresMultipartEnc = true;
      String temp99 = ident + "input80" + uniqueid;
      java.util.List<String> messagesList48 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve51 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp99))
        { 
          ve51.add(ve);
        }
      }
      for(utils.ValidationException ve : ve51)
      { 
        messagesList48.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList48.size() > 0)
      { 
        out.print("<input name=\"" + temp99 + "\" type=\"file\"" + (" class=\"" + "inputFile" + (" " + "inputphoto") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("/>");
        java.util.ArrayList<String> list81 = new java.util.ArrayList<String>(messagesList48);
        inForLoop = true;
        forLoopCounter++;
        int limit53 = 1000;
        int offset53 = 0;
        int removedcount53 = 0;
        Object[] array118 = list81.toArray();
        for(int i118 = 0; i118 < array118.length; i118++)
        { 
          String ve3 = (String)array118[i118];
          if(limit53 <= 0)
          { 
            list81.remove(i118 - removedcount53);
            removedcount53++;
          }
          limit53--;
        }
        int separatorindex53 = 0;
        Object[] array119 = list81.toArray();
        for(int i119 = 0; i119 < array119.length; i119++)
        { 
          String ve3 = (String)array119[i119];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp100 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp100.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp100.getId().toString();
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
          String tmpstring110;
          try
          { 
            tmpstring110 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring110 = "";
          }
          out.print(tmpstring110);
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
      else
      { 
        out.print("<input name=\"" + temp99 + "\" type=\"file\"" + (" class=\"" + "inputFile" + (" " + "inputphoto") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("/>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list82 = new java.util.ArrayList<String>(messagesList49);
      inForLoop = true;
      forLoopCounter++;
      int limit54 = 1000;
      int offset54 = 0;
      int removedcount54 = 0;
      Object[] array120 = list82.toArray();
      for(int i120 = 0; i120 < array120.length; i120++)
      { 
        String ve3 = (String)array120[i120];
        if(limit54 <= 0)
        { 
          list82.remove(i120 - removedcount54);
          removedcount54++;
        }
        limit54--;
      }
      int separatorindex54 = 0;
      Object[] array121 = list82.toArray();
      for(int i121 = 0; i121 < array121.length; i121++)
      { 
        String ve3 = (String)array121[i121];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp101 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp101.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp101.getId().toString();
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
        String tmpstring111;
        try
        { 
          tmpstring111 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring111 = "";
        }
        out.print(tmpstring111);
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
    else
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label141 + "\" " + "" + ">");
      String tmpstring109;
      try
      { 
        tmpstring109 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Photo: ") : utils.HTMLFilter.filter(String.valueOf("Photo: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring109 = "";
      }
      out.print(tmpstring109);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      ThreadLocalPage.get().formRequiresMultipartEnc = true;
      String temp99 = ident + "input80" + uniqueid;
      java.util.List<String> messagesList48 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve51 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp99))
        { 
          ve51.add(ve);
        }
      }
      for(utils.ValidationException ve : ve51)
      { 
        messagesList48.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList48.size() > 0)
      { 
        out.print("<input name=\"" + temp99 + "\" type=\"file\"" + (" class=\"" + "inputFile" + (" " + "inputphoto") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("/>");
        java.util.ArrayList<String> list81 = new java.util.ArrayList<String>(messagesList48);
        inForLoop = true;
        forLoopCounter++;
        int limit53 = 1000;
        int offset53 = 0;
        int removedcount53 = 0;
        Object[] array118 = list81.toArray();
        for(int i118 = 0; i118 < array118.length; i118++)
        { 
          String ve3 = (String)array118[i118];
          if(limit53 <= 0)
          { 
            list81.remove(i118 - removedcount53);
            removedcount53++;
          }
          limit53--;
        }
        int separatorindex53 = 0;
        Object[] array119 = list81.toArray();
        for(int i119 = 0; i119 < array119.length; i119++)
        { 
          String ve3 = (String)array119[i119];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp100 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp100.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp100.getId().toString();
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
          String tmpstring110;
          try
          { 
            tmpstring110 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring110 = "";
          }
          out.print(tmpstring110);
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
      else
      { 
        out.print("<input name=\"" + temp99 + "\" type=\"file\"" + (" class=\"" + "inputFile" + (" " + "inputphoto") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("/>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
    }
    ThreadLocalPage.get().leaveLabelContext();
    ThreadLocalPage.get().rowContextsCheckLeave(out);
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().leaveRowContext();
    }
    out.print("</tr>");
    out.print("<tr " + "" + ">");
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().enterRowContext();
    }
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().rowContextsCheckEnter(out);
    String label142 = ident + "input81" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label142);
    java.util.List<String> messagesList51 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve54 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label142))
      { 
        ve54.add(ve);
      }
    }
    for(utils.ValidationException ve : ve54)
    { 
      messagesList51.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList51.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label142 + "\" " + "" + ">");
      String tmpstring112;
      try
      { 
        tmpstring112 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Admin: ") : utils.HTMLFilter.filter(String.valueOf("Admin: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring112 = "";
      }
      out.print(tmpstring112);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp102 = ident + "input82" + uniqueid;
      java.util.List<String> messagesList50 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve53 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp102))
        { 
          ve53.add(ve);
        }
      }
      for(utils.ValidationException ve : ve53)
      { 
        messagesList50.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList50.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp102 + "_isinput" + "\" />");
        out.print("<input type=\"checkbox\"");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("name=\"" + temp102 + "\"" + (" class=\"" + "inputBool" + (" " + "inputadmin") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          if(ThreadLocalPage.get().getParammap().get(temp102) != null)
          { 
            out.print(" checked=\"true\" ");
          }
        }
        else
        { 
          if(arg13.setupForPropertyEvents(hibSession, out).getAdmin())
          { 
            out.print(" checked=\"true\" ");
          }
        }
        out.print(" />");
        java.util.ArrayList<String> list83 = new java.util.ArrayList<String>(messagesList50);
        inForLoop = true;
        forLoopCounter++;
        int limit55 = 1000;
        int offset55 = 0;
        int removedcount55 = 0;
        Object[] array122 = list83.toArray();
        for(int i122 = 0; i122 < array122.length; i122++)
        { 
          String ve3 = (String)array122[i122];
          if(limit55 <= 0)
          { 
            list83.remove(i122 - removedcount55);
            removedcount55++;
          }
          limit55--;
        }
        int separatorindex55 = 0;
        Object[] array123 = list83.toArray();
        for(int i123 = 0; i123 < array123.length; i123++)
        { 
          String ve3 = (String)array123[i123];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp103 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp103.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp103.getId().toString();
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
          String tmpstring113;
          try
          { 
            tmpstring113 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring113 = "";
          }
          out.print(tmpstring113);
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
      else
      { 
        out.print("<input type=\"hidden\" name=\"" + temp102 + "_isinput" + "\" />");
        out.print("<input type=\"checkbox\"");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("name=\"" + temp102 + "\"" + (" class=\"" + "inputBool" + (" " + "inputadmin") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          if(ThreadLocalPage.get().getParammap().get(temp102) != null)
          { 
            out.print(" checked=\"true\" ");
          }
        }
        else
        { 
          if(arg13.setupForPropertyEvents(hibSession, out).getAdmin())
          { 
            out.print(" checked=\"true\" ");
          }
        }
        out.print(" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list84 = new java.util.ArrayList<String>(messagesList51);
      inForLoop = true;
      forLoopCounter++;
      int limit56 = 1000;
      int offset56 = 0;
      int removedcount56 = 0;
      Object[] array124 = list84.toArray();
      for(int i124 = 0; i124 < array124.length; i124++)
      { 
        String ve3 = (String)array124[i124];
        if(limit56 <= 0)
        { 
          list84.remove(i124 - removedcount56);
          removedcount56++;
        }
        limit56--;
      }
      int separatorindex56 = 0;
      Object[] array125 = list84.toArray();
      for(int i125 = 0; i125 < array125.length; i125++)
      { 
        String ve3 = (String)array125[i125];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp104 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp104.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp104.getId().toString();
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
        String tmpstring114;
        try
        { 
          tmpstring114 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring114 = "";
        }
        out.print(tmpstring114);
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
    else
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label142 + "\" " + "" + ">");
      String tmpstring112;
      try
      { 
        tmpstring112 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Admin: ") : utils.HTMLFilter.filter(String.valueOf("Admin: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring112 = "";
      }
      out.print(tmpstring112);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp102 = ident + "input82" + uniqueid;
      java.util.List<String> messagesList50 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve53 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp102))
        { 
          ve53.add(ve);
        }
      }
      for(utils.ValidationException ve : ve53)
      { 
        messagesList50.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList50.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp102 + "_isinput" + "\" />");
        out.print("<input type=\"checkbox\"");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("name=\"" + temp102 + "\"" + (" class=\"" + "inputBool" + (" " + "inputadmin") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          if(ThreadLocalPage.get().getParammap().get(temp102) != null)
          { 
            out.print(" checked=\"true\" ");
          }
        }
        else
        { 
          if(arg13.setupForPropertyEvents(hibSession, out).getAdmin())
          { 
            out.print(" checked=\"true\" ");
          }
        }
        out.print(" />");
        java.util.ArrayList<String> list83 = new java.util.ArrayList<String>(messagesList50);
        inForLoop = true;
        forLoopCounter++;
        int limit55 = 1000;
        int offset55 = 0;
        int removedcount55 = 0;
        Object[] array122 = list83.toArray();
        for(int i122 = 0; i122 < array122.length; i122++)
        { 
          String ve3 = (String)array122[i122];
          if(limit55 <= 0)
          { 
            list83.remove(i122 - removedcount55);
            removedcount55++;
          }
          limit55--;
        }
        int separatorindex55 = 0;
        Object[] array123 = list83.toArray();
        for(int i123 = 0; i123 < array123.length; i123++)
        { 
          String ve3 = (String)array123[i123];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp103 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp103.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp103.getId().toString();
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
          String tmpstring113;
          try
          { 
            tmpstring113 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring113 = "";
          }
          out.print(tmpstring113);
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
      else
      { 
        out.print("<input type=\"hidden\" name=\"" + temp102 + "_isinput" + "\" />");
        out.print("<input type=\"checkbox\"");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("name=\"" + temp102 + "\"" + (" class=\"" + "inputBool" + (" " + "inputadmin") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          if(ThreadLocalPage.get().getParammap().get(temp102) != null)
          { 
            out.print(" checked=\"true\" ");
          }
        }
        else
        { 
          if(arg13.setupForPropertyEvents(hibSession, out).getAdmin())
          { 
            out.print(" checked=\"true\" ");
          }
        }
        out.print(" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
    }
    ThreadLocalPage.get().leaveLabelContext();
    ThreadLocalPage.get().rowContextsCheckLeave(out);
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().leaveRowContext();
    }
    out.print("</tr>");
    out.print("<tr " + "" + ">");
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().enterRowContext();
    }
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().rowContextsCheckEnter(out);
    String label143 = ident + "input83" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label143);
    java.util.List<String> messagesList53 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve56 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label143))
      { 
        ve56.add(ve);
      }
    }
    for(utils.ValidationException ve : ve56)
    { 
      messagesList53.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList53.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label143 + "\" " + "" + ">");
      String tmpstring115;
      try
      { 
        tmpstring115 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Favorite color: ") : utils.HTMLFilter.filter(String.valueOf("Favorite color: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring115 = "";
      }
      out.print(tmpstring115);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp105 = ident + "input84" + uniqueid;
      java.util.List<String> messagesList52 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve55 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp105))
        { 
          ve55.add(ve);
        }
      }
      for(utils.ValidationException ve : ve55)
      { 
        messagesList52.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList52.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp105 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp105 + "\"" + (" class=\"" + "select" + (" " + "inputfavoriteColor") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        out.print("<option value=\"none\"></option>");
        java.util.Iterator iter5 = hibSession.createQuery("from " + "exampleapp.domain.Color").list().iterator();
        while(iter5.hasNext())
        { 
          exampleapp.domain.Color color11 = (exampleapp.domain.Color)iter5.next();
          out.print("<option value=\"" + color11.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammap().get(temp105) != null && ThreadLocalPage.get().getParammap().get(temp105).equals(String.valueOf(color11.getId())))
            { 
              out.print("selected=\"selected\"");
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getFavoriteColor() != null && arg13.setupForPropertyEvents(hibSession, out).getFavoriteColor().getId().equals(color11.getId()))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + color11.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list85 = new java.util.ArrayList<String>(messagesList52);
        inForLoop = true;
        forLoopCounter++;
        int limit57 = 1000;
        int offset57 = 0;
        int removedcount57 = 0;
        Object[] array126 = list85.toArray();
        for(int i126 = 0; i126 < array126.length; i126++)
        { 
          String ve3 = (String)array126[i126];
          if(limit57 <= 0)
          { 
            list85.remove(i126 - removedcount57);
            removedcount57++;
          }
          limit57--;
        }
        int separatorindex57 = 0;
        Object[] array127 = list85.toArray();
        for(int i127 = 0; i127 < array127.length; i127++)
        { 
          String ve3 = (String)array127[i127];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp106 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp106.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp106.getId().toString();
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
          String tmpstring116;
          try
          { 
            tmpstring116 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring116 = "";
          }
          out.print(tmpstring116);
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
      else
      { 
        out.print("<input type=\"hidden\" name=\"" + temp105 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp105 + "\"" + (" class=\"" + "select" + (" " + "inputfavoriteColor") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        out.print("<option value=\"none\"></option>");
        java.util.Iterator iter5 = hibSession.createQuery("from " + "exampleapp.domain.Color").list().iterator();
        while(iter5.hasNext())
        { 
          exampleapp.domain.Color color11 = (exampleapp.domain.Color)iter5.next();
          out.print("<option value=\"" + color11.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammap().get(temp105) != null && ThreadLocalPage.get().getParammap().get(temp105).equals(String.valueOf(color11.getId())))
            { 
              out.print("selected=\"selected\"");
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getFavoriteColor() != null && arg13.setupForPropertyEvents(hibSession, out).getFavoriteColor().getId().equals(color11.getId()))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + color11.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list86 = new java.util.ArrayList<String>(messagesList53);
      inForLoop = true;
      forLoopCounter++;
      int limit58 = 1000;
      int offset58 = 0;
      int removedcount58 = 0;
      Object[] array128 = list86.toArray();
      for(int i128 = 0; i128 < array128.length; i128++)
      { 
        String ve3 = (String)array128[i128];
        if(limit58 <= 0)
        { 
          list86.remove(i128 - removedcount58);
          removedcount58++;
        }
        limit58--;
      }
      int separatorindex58 = 0;
      Object[] array129 = list86.toArray();
      for(int i129 = 0; i129 < array129.length; i129++)
      { 
        String ve3 = (String)array129[i129];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp107 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp107.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp107.getId().toString();
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
        String tmpstring117;
        try
        { 
          tmpstring117 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring117 = "";
        }
        out.print(tmpstring117);
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
    else
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label143 + "\" " + "" + ">");
      String tmpstring115;
      try
      { 
        tmpstring115 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Favorite color: ") : utils.HTMLFilter.filter(String.valueOf("Favorite color: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring115 = "";
      }
      out.print(tmpstring115);
      out.print("</label>");
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String temp105 = ident + "input84" + uniqueid;
      java.util.List<String> messagesList52 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve55 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp105))
        { 
          ve55.add(ve);
        }
      }
      for(utils.ValidationException ve : ve55)
      { 
        messagesList52.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList52.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp105 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp105 + "\"" + (" class=\"" + "select" + (" " + "inputfavoriteColor") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        out.print("<option value=\"none\"></option>");
        java.util.Iterator iter5 = hibSession.createQuery("from " + "exampleapp.domain.Color").list().iterator();
        while(iter5.hasNext())
        { 
          exampleapp.domain.Color color11 = (exampleapp.domain.Color)iter5.next();
          out.print("<option value=\"" + color11.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammap().get(temp105) != null && ThreadLocalPage.get().getParammap().get(temp105).equals(String.valueOf(color11.getId())))
            { 
              out.print("selected=\"selected\"");
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getFavoriteColor() != null && arg13.setupForPropertyEvents(hibSession, out).getFavoriteColor().getId().equals(color11.getId()))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + color11.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list85 = new java.util.ArrayList<String>(messagesList52);
        inForLoop = true;
        forLoopCounter++;
        int limit57 = 1000;
        int offset57 = 0;
        int removedcount57 = 0;
        Object[] array126 = list85.toArray();
        for(int i126 = 0; i126 < array126.length; i126++)
        { 
          String ve3 = (String)array126[i126];
          if(limit57 <= 0)
          { 
            list85.remove(i126 - removedcount57);
            removedcount57++;
          }
          limit57--;
        }
        int separatorindex57 = 0;
        Object[] array127 = list85.toArray();
        for(int i127 = 0; i127 < array127.length; i127++)
        { 
          String ve3 = (String)array127[i127];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp106 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp106.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp106.getId().toString();
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
          String tmpstring116;
          try
          { 
            tmpstring116 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring116 = "";
          }
          out.print(tmpstring116);
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
      else
      { 
        out.print("<input type=\"hidden\" name=\"" + temp105 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp105 + "\"" + (" class=\"" + "select" + (" " + "inputfavoriteColor") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        out.print("<option value=\"none\"></option>");
        java.util.Iterator iter5 = hibSession.createQuery("from " + "exampleapp.domain.Color").list().iterator();
        while(iter5.hasNext())
        { 
          exampleapp.domain.Color color11 = (exampleapp.domain.Color)iter5.next();
          out.print("<option value=\"" + color11.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammap().get(temp105) != null && ThreadLocalPage.get().getParammap().get(temp105).equals(String.valueOf(color11.getId())))
            { 
              out.print("selected=\"selected\"");
            }
          }
          else
          { 
            if(arg13.setupForPropertyEvents(hibSession, out).getFavoriteColor() != null && arg13.setupForPropertyEvents(hibSession, out).getFavoriteColor().getId().equals(color11.getId()))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + color11.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
    }
    ThreadLocalPage.get().leaveLabelContext();
    ThreadLocalPage.get().rowContextsCheckLeave(out);
    if(ThreadLocalPage.get().inTableContext())
    { 
      ThreadLocalPage.get().getTableContext().leaveRowContext();
    }
    out.print("</tr>");
    ThreadLocalPage.get().leaveTableContext();
    out.print("</table>");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</fieldset>");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<fieldset class=\"fieldset_no_legend_\" " + "" + ">");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<table " + "" + ">");
    ThreadLocalPage.get().enterTableContext();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    ident = (inForLoop ? forelementcounter : "") + ("action8" + uniqueid + "");
    java.util.List<String> messagesList55 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve58 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(ident))
      { 
        ve58.add(ve);
      }
    }
    for(utils.ValidationException ve : ve58)
    { 
      messagesList55.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList55.size() > 0)
    { 
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
      java.util.ArrayList<String> list88 = new java.util.ArrayList<String>(messagesList55);
      inForLoop = true;
      forLoopCounter++;
      int limit60 = 1000;
      int offset60 = 0;
      int removedcount60 = 0;
      Object[] array132 = list88.toArray();
      for(int i132 = 0; i132 < array132.length; i132++)
      { 
        String ve1 = (String)array132[i132];
        if(limit60 <= 0)
        { 
          list88.remove(i132 - removedcount60);
          removedcount60++;
        }
        limit60--;
      }
      int separatorindex60 = 0;
      Object[] array133 = list88.toArray();
      for(int i133 = 0; i133 < array133.length; i133++)
      { 
        String ve1 = (String)array133[i133];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve1))
        { 
          WebDSLEntity temp109 = (WebDSLEntity)(Object)ve1;
          forelementcounter = temp109.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp109.getId().toString();
        }
        else
          forelementcounter = Integer.toString(fallbackcounter);
        ThreadLocalPage.get().enterTemplateContext(forelementcounter);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring121;
        try
        { 
          tmpstring121 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
        }
        catch(NullPointerException npe)
        { 
          tmpstring121 = "";
        }
        out.print(tmpstring121);
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
        java.util.List<String> messagesList54 = new java.util.LinkedList<String>();
        java.util.List<utils.ValidationException> ve57 = new java.util.LinkedList<utils.ValidationException>();
        for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
        { 
          if(ve.getName() != null && ve.getName().equals(ident))
          { 
            ve57.add(ve);
          }
        }
        for(utils.ValidationException ve : ve57)
        { 
          messagesList54.add(ve.getErrorMessage());
          ThreadLocalPage.get().getValidationExceptions().remove(ve);
        }
        if(messagesList54.size() > 0)
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
          java.util.ArrayList<String> list87 = new java.util.ArrayList<String>(messagesList54);
          inForLoop = true;
          forLoopCounter++;
          int limit59 = 1000;
          int offset59 = 0;
          int removedcount59 = 0;
          Object[] array130 = list87.toArray();
          for(int i130 = 0; i130 < array130.length; i130++)
          { 
            String ve1 = (String)array130[i130];
            if(limit59 <= 0)
            { 
              list87.remove(i130 - removedcount59);
              removedcount59++;
            }
            limit59--;
          }
          int separatorindex59 = 0;
          Object[] array131 = list87.toArray();
          for(int i131 = 0; i131 < array131.length; i131++)
          { 
            String ve1 = (String)array131[i131];
            fallbackcounter += 1;
            if(WebDSLEntity.class.isInstance(ve1))
            { 
              WebDSLEntity temp108 = (WebDSLEntity)(Object)ve1;
              forelementcounter = temp108.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp108.getId().toString();
            }
            else
              forelementcounter = Integer.toString(fallbackcounter);
            ThreadLocalPage.get().enterTemplateContext(forelementcounter);
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring120;
            try
            { 
              tmpstring120 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
            }
            catch(NullPointerException npe)
            { 
              tmpstring120 = "";
            }
            out.print(tmpstring120);
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
      String tmpstring119;
      try
      { 
        tmpstring119 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Save") : utils.HTMLFilter.filter(String.valueOf("Save"));
      }
      catch(NullPointerException npe)
      { 
        tmpstring119 = "";
      }
      out.print(tmpstring119);
      out.print("\" " + ("class" + "='" + "button" + "' ") + " />");
      out.print("</div>");
      ThreadLocalPage.get().commonContextsCheckLeave(out);
    }
    else
    { 
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        java.util.List<String> messagesList54 = new java.util.LinkedList<String>();
        java.util.List<utils.ValidationException> ve57 = new java.util.LinkedList<utils.ValidationException>();
        for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
        { 
          if(ve.getName() != null && ve.getName().equals(ident))
          { 
            ve57.add(ve);
          }
        }
        for(utils.ValidationException ve : ve57)
        { 
          messagesList54.add(ve.getErrorMessage());
          ThreadLocalPage.get().getValidationExceptions().remove(ve);
        }
        if(messagesList54.size() > 0)
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
          java.util.ArrayList<String> list87 = new java.util.ArrayList<String>(messagesList54);
          inForLoop = true;
          forLoopCounter++;
          int limit59 = 1000;
          int offset59 = 0;
          int removedcount59 = 0;
          Object[] array130 = list87.toArray();
          for(int i130 = 0; i130 < array130.length; i130++)
          { 
            String ve1 = (String)array130[i130];
            if(limit59 <= 0)
            { 
              list87.remove(i130 - removedcount59);
              removedcount59++;
            }
            limit59--;
          }
          int separatorindex59 = 0;
          Object[] array131 = list87.toArray();
          for(int i131 = 0; i131 < array131.length; i131++)
          { 
            String ve1 = (String)array131[i131];
            fallbackcounter += 1;
            if(WebDSLEntity.class.isInstance(ve1))
            { 
              WebDSLEntity temp108 = (WebDSLEntity)(Object)ve1;
              forelementcounter = temp108.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp108.getId().toString();
            }
            else
              forelementcounter = Integer.toString(fallbackcounter);
            ThreadLocalPage.get().enterTemplateContext(forelementcounter);
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring120;
            try
            { 
              tmpstring120 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
            }
            catch(NullPointerException npe)
            { 
              tmpstring120 = "";
            }
            out.print(tmpstring120);
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
      String tmpstring119;
      try
      { 
        tmpstring119 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Save") : utils.HTMLFilter.filter(String.valueOf("Save"));
      }
      catch(NullPointerException npe)
      { 
        tmpstring119 = "";
      }
      out.print(tmpstring119);
      out.print("\" " + ("class" + "='" + "button" + "' ") + " />");
    }
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ThreadLocalPage.get().leaveTableContext();
    out.print("</table>");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</fieldset>");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</form>");
    if(ThreadLocalPage.get().formRequiresMultipartEnc)
    { 
      this.out.write(" enctype=\"multipart/form-data\"");
    }
    this.out.write(stringwriter1.toString());
    out = out2;
    ThreadLocalPage.get().formRequiresMultipartEnc = false;
    ThreadLocalPage.get().setInSubmittedForm(false);
    ThreadLocalPage.get().setFormIdent("");
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
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident += "form16" + uniqueid;
    ThreadLocalPage.get().setFormIdent(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    ident = (inForLoop ? forelementcounter : "") + ("action8" + uniqueid + "");
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      save6 temp = (save6)env.getAction("save6");
      temp.save6(ident);
    }
    ThreadLocalPage.get().commonContextsCheckLeave(out);
  }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { 
    env.putAction("save6", new save6()
                           { 
                             boolean isRedirected = false;

                             public void setIsRedirected(boolean b)
                             { 
                               isRedirected = b;
                             }

                             public void save6(String actionident)
                             { 
                               ThreadLocalAction.set(this);
                               if(!ThreadLocalPage.get().hasExecutedAction)
                               { 
                                 boolean actionFailed = false;
                                 ThreadLocalPage.get().hasExecutedAction = true;
                                 try
                                 { 
                                   arg13.setupForPropertyEvents(hibSession, out).validateSave();
                                   arg13.setVersion(1);
                                   hibSession.save(arg13);
                                   if(ThreadLocalPage.get().isAjaxActionExecuted())
                                   { 
                                     if(!ThreadLocalServlet.get().isPostRequest)
                                     { 
                                       try
                                       { 
                                         ThreadLocalPage.get().setRedirectUrl(utils.HTMLFilter.unfilter(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/managePerson")));
                                         if(!ThreadLocalPage.get().isActionLinkUsed())
                                         { 
                                           response.sendRedirect(ThreadLocalPage.get().getRedirectUrl());
                                         }
                                       }
                                       catch(IOException ioe)
                                       { 
                                         System.out.println("redirect failed");
                                         ioe.printStackTrace();
                                       }
                                     }
                                     else
                                     { 
                                       out.println("{ action: \"relocate\", value: \"" + utils.HTMLFilter.unfilter(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/managePerson")) + "\" },\n");
                                     }
                                   }
                                   else
                                   { 
                                     try
                                     { 
                                       ThreadLocalPage.get().setRedirectUrl(utils.HTMLFilter.unfilter(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/managePerson")));
                                       if(!ThreadLocalPage.get().isActionLinkUsed())
                                       { 
                                         response.sendRedirect(ThreadLocalPage.get().getRedirectUrl());
                                       }
                                     }
                                     catch(IOException ioe)
                                     { 
                                       System.out.println("redirect failed");
                                       ioe.printStackTrace();
                                     }
                                   }
                                   isRedirected = true;
                                   return;
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
    ident = ident + "input65" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input66" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        String temp77 = ThreadLocalPage.get().getParammap().get(ident);
        arg13.setupForPropertyEvents(hibSession, out).setFullname(temp77);
        ThreadLocalPage.get().leaveValidationContext();
      }
    }
    catch(utils.ValidationException ve)
    { 
      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    catch(utils.MultipleValidationExceptions ve)
    { 
      for(utils.ValidationException vex : ve.getValidationExceptions())
      { 
        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
      }
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    ThreadLocalPage.get().leaveValidationContext();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident = ident + "input67" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input68" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        String temp76 = ThreadLocalPage.get().getParammap().get(ident);
        if(temp76.equals("") && !true)
        { 
          throw new ValidationException(null, "Email address is required");
        }
        if(!(temp76.equals("") && true) && !temp76.matches("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)"))
        { 
          throw new ValidationException(null, "Not a valid email address");
        }
        arg13.setupForPropertyEvents(hibSession, out).setEmail(temp76);
        ThreadLocalPage.get().leaveValidationContext();
      }
    }
    catch(utils.ValidationException ve)
    { 
      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    catch(utils.MultipleValidationExceptions ve)
    { 
      for(utils.ValidationException vex : ve.getValidationExceptions())
      { 
        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
      }
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    ThreadLocalPage.get().leaveValidationContext();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident = ident + "input69" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input70" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        String temp75 = ThreadLocalPage.get().getParammap().get(ident);
        arg13.setupForPropertyEvents(hibSession, out).setUsername(temp75);
        ThreadLocalPage.get().leaveValidationContext();
      }
    }
    catch(utils.ValidationException ve)
    { 
      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    catch(utils.MultipleValidationExceptions ve)
    { 
      for(utils.ValidationException vex : ve.getValidationExceptions())
      { 
        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
      }
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    ThreadLocalPage.get().leaveValidationContext();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident = ident + "input71" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input72" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        String temp74 = ThreadLocalPage.get().getParammap().get(ident);
        arg13.setupForPropertyEvents(hibSession, out).setBio(temp74);
        ThreadLocalPage.get().leaveValidationContext();
      }
    }
    catch(utils.ValidationException ve)
    { 
      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    catch(utils.MultipleValidationExceptions ve)
    { 
      for(utils.ValidationException vex : ve.getValidationExceptions())
      { 
        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
      }
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    ThreadLocalPage.get().leaveValidationContext();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident = ident + "input73" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input74" + uniqueid;
      String dateval1 = ThreadLocalPage.get().getParammap().get(ident);
      java.util.Date temp73 = null;
      if(true && dateval1 != null && dateval1.equals(""))
      { 
        arg13.setupForPropertyEvents(hibSession, out).setDateOfBirth(temp73);
      }
      else
      { 
        if(dateval1 != null)
        { 
          ThreadLocalPage.get().enterValidationContext(ident);
          java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
          temp73 = sdf.parse(dateval1, new java.text.ParsePosition(0));
          if(temp73 == null)
          { 
            throw new ValidationException(null, "Required format is " + "dd/mm/yyyy");
          }
          arg13.setupForPropertyEvents(hibSession, out).setDateOfBirth(temp73);
          ThreadLocalPage.get().leaveValidationContext();
        }
      }
    }
    catch(utils.ValidationException ve)
    { 
      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    catch(utils.MultipleValidationExceptions ve)
    { 
      for(utils.ValidationException vex : ve.getValidationExceptions())
      { 
        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
      }
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    ThreadLocalPage.get().leaveValidationContext();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident = ident + "input75" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input76" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident + "_isinput") != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        java.util.Set<exampleapp.domain.Person> temp72 = new java.util.HashSet<exampleapp.domain.Person>();
        if(ThreadLocalPage.get().getParammapvalues().get(ident) == null)
        { 
          Object[] array87 = arg13.setupForPropertyEvents(hibSession, out).getParents().toArray();
          for(int i87 = 0; i87 < array87.length; i87++)
          { 
            exampleapp.domain.Person temp71 = (exampleapp.domain.Person)array87[i87];
            arg13.setupForPropertyEvents(hibSession, out).removeFromParents(temp71);
          }
        }
        if(ThreadLocalPage.get().getParammapvalues().get(ident) != null)
        { 
          for(String elem : ThreadLocalPage.get().getParammapvalues().get(ident))
          { 
            exampleapp.domain.Person temp71 = (exampleapp.domain.Person)hibSession.load(exampleapp.domain.Person.class, java.util.UUID.fromString(elem));
            temp72.add(temp71);
          }
          Object[] array88 = arg13.setupForPropertyEvents(hibSession, out).getParents().toArray();
          for(int i88 = 0; i88 < array88.length; i88++)
          { 
            exampleapp.domain.Person temp71 = (exampleapp.domain.Person)array88[i88];
            if(!temp72.contains(temp71))
            { 
              arg13.setupForPropertyEvents(hibSession, out).removeFromParents(temp71);
            }
          }
          Object[] array89 = temp72.toArray();
          for(int i89 = 0; i89 < array89.length; i89++)
          { 
            exampleapp.domain.Person temp71 = (exampleapp.domain.Person)array89[i89];
            if(!arg13.setupForPropertyEvents(hibSession, out).getParents().contains(temp71))
            { 
              arg13.setupForPropertyEvents(hibSession, out).addToParents(temp71);
            }
          }
        }
        ThreadLocalPage.get().leaveValidationContext();
      }
    }
    catch(utils.ValidationException ve)
    { 
      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    catch(utils.MultipleValidationExceptions ve)
    { 
      for(utils.ValidationException vex : ve.getValidationExceptions())
      { 
        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
      }
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    ThreadLocalPage.get().leaveValidationContext();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident = ident + "input77" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input78" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident + "_isinput") != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        java.util.Set<exampleapp.domain.Person> temp70 = new java.util.HashSet<exampleapp.domain.Person>();
        if(ThreadLocalPage.get().getParammapvalues().get(ident) == null)
        { 
          Object[] array84 = arg13.setupForPropertyEvents(hibSession, out).getChildren().toArray();
          for(int i84 = 0; i84 < array84.length; i84++)
          { 
            exampleapp.domain.Person temp69 = (exampleapp.domain.Person)array84[i84];
            arg13.setupForPropertyEvents(hibSession, out).removeFromChildren(temp69);
          }
        }
        if(ThreadLocalPage.get().getParammapvalues().get(ident) != null)
        { 
          for(String elem : ThreadLocalPage.get().getParammapvalues().get(ident))
          { 
            exampleapp.domain.Person temp69 = (exampleapp.domain.Person)hibSession.load(exampleapp.domain.Person.class, java.util.UUID.fromString(elem));
            temp70.add(temp69);
          }
          Object[] array85 = arg13.setupForPropertyEvents(hibSession, out).getChildren().toArray();
          for(int i85 = 0; i85 < array85.length; i85++)
          { 
            exampleapp.domain.Person temp69 = (exampleapp.domain.Person)array85[i85];
            if(!temp70.contains(temp69))
            { 
              arg13.setupForPropertyEvents(hibSession, out).removeFromChildren(temp69);
            }
          }
          Object[] array86 = temp70.toArray();
          for(int i86 = 0; i86 < array86.length; i86++)
          { 
            exampleapp.domain.Person temp69 = (exampleapp.domain.Person)array86[i86];
            if(!arg13.setupForPropertyEvents(hibSession, out).getChildren().contains(temp69))
            { 
              arg13.setupForPropertyEvents(hibSession, out).addToChildren(temp69);
            }
          }
        }
        ThreadLocalPage.get().leaveValidationContext();
      }
    }
    catch(utils.ValidationException ve)
    { 
      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    catch(utils.MultipleValidationExceptions ve)
    { 
      for(utils.ValidationException vex : ve.getValidationExceptions())
      { 
        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
      }
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    ThreadLocalPage.get().leaveValidationContext();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident = ident + "input79" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input80" + uniqueid;
      if(ThreadLocalPage.get().getFileUploads().get(ident) != null && !ThreadLocalPage.get().getFileUploads().get(ident).getFileName().equals(""))
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        utils.File temp68 = ThreadLocalPage.get().getFileUploads().get(ident);
        arg13.setupForPropertyEvents(hibSession, out).setPhoto(temp68);
        ThreadLocalPage.get().leaveValidationContext();
      }
    }
    catch(utils.ValidationException ve)
    { 
      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    catch(utils.MultipleValidationExceptions ve)
    { 
      for(utils.ValidationException vex : ve.getValidationExceptions())
      { 
        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
      }
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    ThreadLocalPage.get().leaveValidationContext();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident = ident + "input81" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input82" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident + "_isinput") != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        if(ThreadLocalPage.get().getParammap().get(ident) != null)
        { 
          boolean temp67 = true;
          arg13.setupForPropertyEvents(hibSession, out).setAdmin(temp67);
        }
        else
        { 
          boolean temp67 = false;
          arg13.setupForPropertyEvents(hibSession, out).setAdmin(temp67);
        }
        ThreadLocalPage.get().leaveValidationContext();
      }
    }
    catch(utils.ValidationException ve)
    { 
      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    catch(utils.MultipleValidationExceptions ve)
    { 
      for(utils.ValidationException vex : ve.getValidationExceptions())
      { 
        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
      }
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    ThreadLocalPage.get().leaveValidationContext();
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ident = ident + "input83" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input84" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident + "_isinput") != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        if(ThreadLocalPage.get().getParammap().get(ident) != null)
        { 
          if(ThreadLocalPage.get().getParammap().get(ident).equals("none"))
          { 
            exampleapp.domain.Color temp66 = null;
            arg13.setupForPropertyEvents(hibSession, out).setFavoriteColor(temp66);
          }
          else
          { 
            exampleapp.domain.Color temp66 = (exampleapp.domain.Color)hibSession.load(exampleapp.domain.Color.class, java.util.UUID.fromString(ThreadLocalPage.get().getParammap().get(ident)));
            arg13.setupForPropertyEvents(hibSession, out).setFavoriteColor(temp66);
          }
        }
        ThreadLocalPage.get().leaveValidationContext();
      }
    }
    catch(utils.ValidationException ve)
    { 
      ThreadLocalPage.get().getValidationExceptions().add(ve.setName(ThreadLocalPage.get().getValidationContext()));
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    catch(utils.MultipleValidationExceptions ve)
    { 
      for(utils.ValidationException vex : ve.getValidationExceptions())
      { 
        ThreadLocalPage.get().getValidationExceptions().add(vex.setName(ThreadLocalPage.get().getValidationContext()));
      }
      ThreadLocalPage.get().setValidated(false);
      ThreadLocalPage.get().leaveValidationContext();
    }
    ThreadLocalPage.get().leaveValidationContext();
  }
}