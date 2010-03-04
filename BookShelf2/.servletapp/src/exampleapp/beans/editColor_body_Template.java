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

public class editColor_body_Template  implements TemplateServlet
{ 
  private exampleapp.domain.Color arg10;

  public exampleapp.domain.Color getArg10()
  { 
    return arg10;
  }

  public void setArg10(exampleapp.domain.Color arg10)
  { 
    this.arg10 = arg10;
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
          this.uniqueid = Encoders.encodeTemplateId("editColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("editColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("editColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("editColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
        ident = ident + "input76" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input77" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
      }
      ThreadLocalPage.get().setInSubmittedForm(false);
    }
  }

  protected void initialize()
  { 
    arg10 = (exampleapp.domain.Color)env.getVariable("arg10");
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
    int sec5 = ThreadLocalPage.get().getSectionDepth();
    if(sec5 > 0)
    { 
      if(sec5 > 6)
      { 
        sec5 = 6;
      }
    }
    else
    { 
      sec5 = 1;
    }
    out.print("<h" + sec5);
    out.print(" class=\"header section" + sec5 + "\" " + "" + ">");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring146;
    try
    { 
      tmpstring146 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Edit ") : utils.HTMLFilter.filter(String.valueOf("Edit "));
    }
    catch(NullPointerException npe)
    { 
      tmpstring146 = "";
    }
    out.print(tmpstring146);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring147;
    try
    { 
      tmpstring147 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg10.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg10.setupForPropertyEvents(hibSession, out).getName()));
    }
    catch(NullPointerException npe)
    { 
      tmpstring147 = "";
    }
    out.print(tmpstring147);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</h" + sec5 + ">");
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
    java.io.PrintWriter out5 = out;
    java.io.StringWriter stringwriter4 = new java.io.StringWriter();
    out = new java.io.PrintWriter(stringwriter4);
    out.print(">");
    out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
    out.print(ThreadLocalPage.get().getHiddenParams());
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<fieldset " + "" + "><legend>");
    String tmpstring152;
    try
    { 
      tmpstring152 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Details") : utils.HTMLFilter.filter(String.valueOf("Details"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring152 = "";
    }
    out.print(tmpstring152);
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
    String label107 = ident + "input76" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label107);
    java.util.List<String> messagesList64 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve67 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label107))
      { 
        ve67.add(ve);
      }
    }
    for(utils.ValidationException ve : ve67)
    { 
      messagesList64.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList64.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label107 + "\" " + "" + ">");
      String tmpstring148;
      try
      { 
        tmpstring148 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Name: ") : utils.HTMLFilter.filter(String.valueOf("Name: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring148 = "";
      }
      out.print(tmpstring148);
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
      String temp123 = ident + "input77" + uniqueid;
      java.util.List<String> messagesList63 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve66 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp123))
        { 
          ve66.add(ve);
        }
      }
      for(utils.ValidationException ve : ve66)
      { 
        messagesList63.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList63.size() > 0)
      { 
        out.print("<input name=\"" + temp123 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp123)));
        }
        else
        { 
          String tmpstring149;
          try
          { 
            tmpstring149 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg10.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg10.setupForPropertyEvents(hibSession, out).getName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring149 = "";
          }
          out.print(tmpstring149);
        }
        out.print("\" />");
        java.util.ArrayList<String> list99 = new java.util.ArrayList<String>(messagesList63);
        inForLoop = true;
        forLoopCounter++;
        int limit71 = 1000;
        int offset71 = 0;
        int removedcount71 = 0;
        Object[] array154 = list99.toArray();
        for(int i154 = 0; i154 < array154.length; i154++)
        { 
          String ve3 = (String)array154[i154];
          if(limit71 <= 0)
          { 
            list99.remove(i154 - removedcount71);
            removedcount71++;
          }
          limit71--;
        }
        int separatorindex71 = 0;
        Object[] array155 = list99.toArray();
        for(int i155 = 0; i155 < array155.length; i155++)
        { 
          String ve3 = (String)array155[i155];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp124 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp124.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp124.getId().toString();
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
          String tmpstring150;
          try
          { 
            tmpstring150 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring150 = "";
          }
          out.print(tmpstring150);
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
        out.print("<input name=\"" + temp123 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp123)));
        }
        else
        { 
          String tmpstring149;
          try
          { 
            tmpstring149 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg10.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg10.setupForPropertyEvents(hibSession, out).getName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring149 = "";
          }
          out.print(tmpstring149);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list100 = new java.util.ArrayList<String>(messagesList64);
      inForLoop = true;
      forLoopCounter++;
      int limit72 = 1000;
      int offset72 = 0;
      int removedcount72 = 0;
      Object[] array156 = list100.toArray();
      for(int i156 = 0; i156 < array156.length; i156++)
      { 
        String ve3 = (String)array156[i156];
        if(limit72 <= 0)
        { 
          list100.remove(i156 - removedcount72);
          removedcount72++;
        }
        limit72--;
      }
      int separatorindex72 = 0;
      Object[] array157 = list100.toArray();
      for(int i157 = 0; i157 < array157.length; i157++)
      { 
        String ve3 = (String)array157[i157];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp125 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp125.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp125.getId().toString();
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
        String tmpstring151;
        try
        { 
          tmpstring151 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring151 = "";
        }
        out.print(tmpstring151);
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
      out.print("<label for=\"" + label107 + "\" " + "" + ">");
      String tmpstring148;
      try
      { 
        tmpstring148 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Name: ") : utils.HTMLFilter.filter(String.valueOf("Name: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring148 = "";
      }
      out.print(tmpstring148);
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
      String temp123 = ident + "input77" + uniqueid;
      java.util.List<String> messagesList63 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve66 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp123))
        { 
          ve66.add(ve);
        }
      }
      for(utils.ValidationException ve : ve66)
      { 
        messagesList63.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList63.size() > 0)
      { 
        out.print("<input name=\"" + temp123 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp123)));
        }
        else
        { 
          String tmpstring149;
          try
          { 
            tmpstring149 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg10.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg10.setupForPropertyEvents(hibSession, out).getName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring149 = "";
          }
          out.print(tmpstring149);
        }
        out.print("\" />");
        java.util.ArrayList<String> list99 = new java.util.ArrayList<String>(messagesList63);
        inForLoop = true;
        forLoopCounter++;
        int limit71 = 1000;
        int offset71 = 0;
        int removedcount71 = 0;
        Object[] array154 = list99.toArray();
        for(int i154 = 0; i154 < array154.length; i154++)
        { 
          String ve3 = (String)array154[i154];
          if(limit71 <= 0)
          { 
            list99.remove(i154 - removedcount71);
            removedcount71++;
          }
          limit71--;
        }
        int separatorindex71 = 0;
        Object[] array155 = list99.toArray();
        for(int i155 = 0; i155 < array155.length; i155++)
        { 
          String ve3 = (String)array155[i155];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp124 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp124.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp124.getId().toString();
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
          String tmpstring150;
          try
          { 
            tmpstring150 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring150 = "";
          }
          out.print(tmpstring150);
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
        out.print("<input name=\"" + temp123 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp123)));
        }
        else
        { 
          String tmpstring149;
          try
          { 
            tmpstring149 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg10.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg10.setupForPropertyEvents(hibSession, out).getName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring149 = "";
          }
          out.print(tmpstring149);
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
    ident = (inForLoop ? forelementcounter : "") + ("action10" + uniqueid + "");
    java.util.List<String> messagesList66 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve69 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(ident))
      { 
        ve69.add(ve);
      }
    }
    for(utils.ValidationException ve : ve69)
    { 
      messagesList66.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList66.size() > 0)
    { 
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
      java.util.ArrayList<String> list102 = new java.util.ArrayList<String>(messagesList66);
      inForLoop = true;
      forLoopCounter++;
      int limit74 = 1000;
      int offset74 = 0;
      int removedcount74 = 0;
      Object[] array160 = list102.toArray();
      for(int i160 = 0; i160 < array160.length; i160++)
      { 
        String ve1 = (String)array160[i160];
        if(limit74 <= 0)
        { 
          list102.remove(i160 - removedcount74);
          removedcount74++;
        }
        limit74--;
      }
      int separatorindex74 = 0;
      Object[] array161 = list102.toArray();
      for(int i161 = 0; i161 < array161.length; i161++)
      { 
        String ve1 = (String)array161[i161];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve1))
        { 
          WebDSLEntity temp127 = (WebDSLEntity)(Object)ve1;
          forelementcounter = temp127.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp127.getId().toString();
        }
        else
          forelementcounter = Integer.toString(fallbackcounter);
        ThreadLocalPage.get().enterTemplateContext(forelementcounter);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring155;
        try
        { 
          tmpstring155 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
        }
        catch(NullPointerException npe)
        { 
          tmpstring155 = "";
        }
        out.print(tmpstring155);
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
        java.util.List<String> messagesList65 = new java.util.LinkedList<String>();
        java.util.List<utils.ValidationException> ve68 = new java.util.LinkedList<utils.ValidationException>();
        for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
        { 
          if(ve.getName() != null && ve.getName().equals(ident))
          { 
            ve68.add(ve);
          }
        }
        for(utils.ValidationException ve : ve68)
        { 
          messagesList65.add(ve.getErrorMessage());
          ThreadLocalPage.get().getValidationExceptions().remove(ve);
        }
        if(messagesList65.size() > 0)
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
          java.util.ArrayList<String> list101 = new java.util.ArrayList<String>(messagesList65);
          inForLoop = true;
          forLoopCounter++;
          int limit73 = 1000;
          int offset73 = 0;
          int removedcount73 = 0;
          Object[] array158 = list101.toArray();
          for(int i158 = 0; i158 < array158.length; i158++)
          { 
            String ve1 = (String)array158[i158];
            if(limit73 <= 0)
            { 
              list101.remove(i158 - removedcount73);
              removedcount73++;
            }
            limit73--;
          }
          int separatorindex73 = 0;
          Object[] array159 = list101.toArray();
          for(int i159 = 0; i159 < array159.length; i159++)
          { 
            String ve1 = (String)array159[i159];
            fallbackcounter += 1;
            if(WebDSLEntity.class.isInstance(ve1))
            { 
              WebDSLEntity temp126 = (WebDSLEntity)(Object)ve1;
              forelementcounter = temp126.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp126.getId().toString();
            }
            else
              forelementcounter = Integer.toString(fallbackcounter);
            ThreadLocalPage.get().enterTemplateContext(forelementcounter);
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring154;
            try
            { 
              tmpstring154 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
            }
            catch(NullPointerException npe)
            { 
              tmpstring154 = "";
            }
            out.print(tmpstring154);
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
      String tmpstring153;
      try
      { 
        tmpstring153 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Save") : utils.HTMLFilter.filter(String.valueOf("Save"));
      }
      catch(NullPointerException npe)
      { 
        tmpstring153 = "";
      }
      out.print(tmpstring153);
      out.print("\" " + ("class" + "='" + "button" + "' ") + " />");
      out.print("</div>");
      ThreadLocalPage.get().commonContextsCheckLeave(out);
    }
    else
    { 
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        java.util.List<String> messagesList65 = new java.util.LinkedList<String>();
        java.util.List<utils.ValidationException> ve68 = new java.util.LinkedList<utils.ValidationException>();
        for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
        { 
          if(ve.getName() != null && ve.getName().equals(ident))
          { 
            ve68.add(ve);
          }
        }
        for(utils.ValidationException ve : ve68)
        { 
          messagesList65.add(ve.getErrorMessage());
          ThreadLocalPage.get().getValidationExceptions().remove(ve);
        }
        if(messagesList65.size() > 0)
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
          java.util.ArrayList<String> list101 = new java.util.ArrayList<String>(messagesList65);
          inForLoop = true;
          forLoopCounter++;
          int limit73 = 1000;
          int offset73 = 0;
          int removedcount73 = 0;
          Object[] array158 = list101.toArray();
          for(int i158 = 0; i158 < array158.length; i158++)
          { 
            String ve1 = (String)array158[i158];
            if(limit73 <= 0)
            { 
              list101.remove(i158 - removedcount73);
              removedcount73++;
            }
            limit73--;
          }
          int separatorindex73 = 0;
          Object[] array159 = list101.toArray();
          for(int i159 = 0; i159 < array159.length; i159++)
          { 
            String ve1 = (String)array159[i159];
            fallbackcounter += 1;
            if(WebDSLEntity.class.isInstance(ve1))
            { 
              WebDSLEntity temp126 = (WebDSLEntity)(Object)ve1;
              forelementcounter = temp126.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp126.getId().toString();
            }
            else
              forelementcounter = Integer.toString(fallbackcounter);
            ThreadLocalPage.get().enterTemplateContext(forelementcounter);
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring154;
            try
            { 
              tmpstring154 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
            }
            catch(NullPointerException npe)
            { 
              tmpstring154 = "";
            }
            out.print(tmpstring154);
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
      String tmpstring153;
      try
      { 
        tmpstring153 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Save") : utils.HTMLFilter.filter(String.valueOf("Save"));
      }
      catch(NullPointerException npe)
      { 
        tmpstring153 = "";
      }
      out.print(tmpstring153);
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
    this.out.write(stringwriter4.toString());
    out = out5;
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
    ident = (inForLoop ? forelementcounter : "") + ("action10" + uniqueid + "");
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      save4 temp = (save4)env.getAction("save4");
      temp.save4(ident);
    }
    ThreadLocalPage.get().commonContextsCheckLeave(out);
  }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { 
    env.putAction("save4", new save4()
                           { 
                             boolean isRedirected = false;

                             public void setIsRedirected(boolean b)
                             { 
                               isRedirected = b;
                             }

                             public void save4(String actionident)
                             { 
                               ThreadLocalAction.set(this);
                               if(!ThreadLocalPage.get().hasExecutedAction)
                               { 
                                 boolean actionFailed = false;
                                 ThreadLocalPage.get().hasExecutedAction = true;
                                 try
                                 { 
                                   arg10.setupForPropertyEvents(hibSession, out).validateSave();
                                   arg10.setVersion(1);
                                   hibSession.save(arg10);
                                   if(ThreadLocalPage.get().isAjaxActionExecuted())
                                   { 
                                     if(!ThreadLocalServlet.get().isPostRequest)
                                     { 
                                       try
                                       { 
                                         ThreadLocalPage.get().setRedirectUrl(utils.HTMLFilter.unfilter(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/manageColor")));
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
                                       out.println("{ action: \"relocate\", value: \"" + utils.HTMLFilter.unfilter(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/manageColor")) + "\" },\n");
                                     }
                                   }
                                   else
                                   { 
                                     try
                                     { 
                                       ThreadLocalPage.get().setRedirectUrl(utils.HTMLFilter.unfilter(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/manageColor")));
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
    ident = ident + "input76" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input77" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        String temp122 = ThreadLocalPage.get().getParammap().get(ident);
        arg10.setupForPropertyEvents(hibSession, out).setName(temp122);
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