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

public class createColor_body_Template  implements TemplateServlet
{ 
  private exampleapp.domain.Color temp2;

  public exampleapp.domain.Color getTemp2()
  { 
    return temp2;
  }

  public void setTemp2(exampleapp.domain.Color temp2)
  { 
    this.temp2 = temp2;
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
          this.uniqueid = Encoders.encodeTemplateId("createColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("createColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("createColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("createColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
      ident += (inForLoop ? forelementcounter : "") + ("form18" + uniqueid);
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().setInSubmittedForm(true);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input85" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input86" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
      }
      ThreadLocalPage.get().setInSubmittedForm(false);
    }
  }

  protected void initialize()
  { 
    temp2 = (exampleapp.domain.Color)env.getVariable("temp2");
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
    int sec3 = ThreadLocalPage.get().getSectionDepth();
    if(sec3 > 0)
    { 
      if(sec3 > 6)
      { 
        sec3 = 6;
      }
    }
    else
    { 
      sec3 = 1;
    }
    out.print("<h" + sec3);
    out.print(" class=\"header section" + sec3 + "\" " + "" + ">");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring131;
    try
    { 
      tmpstring131 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Create ") : utils.HTMLFilter.filter(String.valueOf("Create "));
    }
    catch(NullPointerException npe)
    { 
      tmpstring131 = "";
    }
    out.print(tmpstring131);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring132;
    try
    { 
      tmpstring132 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp2.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(temp2.setupForPropertyEvents(hibSession, out).getName()));
    }
    catch(NullPointerException npe)
    { 
      tmpstring132 = "";
    }
    out.print(tmpstring132);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</h" + sec3 + ">");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    ident += "form18" + uniqueid;
    ThreadLocalPage.get().setFormIdent(ident);
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      ThreadLocalPage.get().setInSubmittedForm(true);
    }
    ThreadLocalPage.get().formRequiresMultipartEnc = false;
    out.print("<form name=\"" + ident + "\" id=\"" + ident + "\" action=\"" + utils.HTMLFilter.filter(ThreadLocalPage.get().getPageUrlWithParams()) + "\" accept-charset=\"UTF-8\" method=\"POST\" " + "");
    out.print(" onsubmit=\"return clickFirstButton(this);\"  ");
    java.io.PrintWriter out4 = out;
    java.io.StringWriter stringwriter3 = new java.io.StringWriter();
    out = new java.io.PrintWriter(stringwriter3);
    out.print(">");
    out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
    out.print(ThreadLocalPage.get().getHiddenParams());
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<fieldset " + "" + "><legend>");
    String tmpstring137;
    try
    { 
      tmpstring137 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Details") : utils.HTMLFilter.filter(String.valueOf("Details"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring137 = "";
    }
    out.print(tmpstring137);
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
    String label144 = ident + "input85" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label144);
    java.util.List<String> messagesList59 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve62 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label144))
      { 
        ve62.add(ve);
      }
    }
    for(utils.ValidationException ve : ve62)
    { 
      messagesList59.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList59.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label144 + "\" " + "" + ">");
      String tmpstring133;
      try
      { 
        tmpstring133 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Name: ") : utils.HTMLFilter.filter(String.valueOf("Name: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring133 = "";
      }
      out.print(tmpstring133);
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
      String temp116 = ident + "input86" + uniqueid;
      java.util.List<String> messagesList58 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve61 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp116))
        { 
          ve61.add(ve);
        }
      }
      for(utils.ValidationException ve : ve61)
      { 
        messagesList58.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList58.size() > 0)
      { 
        out.print("<input name=\"" + temp116 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp116)));
        }
        else
        { 
          String tmpstring134;
          try
          { 
            tmpstring134 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp2.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(temp2.setupForPropertyEvents(hibSession, out).getName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring134 = "";
          }
          out.print(tmpstring134);
        }
        out.print("\" />");
        java.util.ArrayList<String> list95 = new java.util.ArrayList<String>(messagesList58);
        inForLoop = true;
        forLoopCounter++;
        int limit66 = 1000;
        int offset66 = 0;
        int removedcount66 = 0;
        Object[] array144 = list95.toArray();
        for(int i144 = 0; i144 < array144.length; i144++)
        { 
          String ve3 = (String)array144[i144];
          if(limit66 <= 0)
          { 
            list95.remove(i144 - removedcount66);
            removedcount66++;
          }
          limit66--;
        }
        int separatorindex66 = 0;
        Object[] array145 = list95.toArray();
        for(int i145 = 0; i145 < array145.length; i145++)
        { 
          String ve3 = (String)array145[i145];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp117 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp117.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp117.getId().toString();
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
          String tmpstring135;
          try
          { 
            tmpstring135 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring135 = "";
          }
          out.print(tmpstring135);
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
        out.print("<input name=\"" + temp116 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp116)));
        }
        else
        { 
          String tmpstring134;
          try
          { 
            tmpstring134 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp2.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(temp2.setupForPropertyEvents(hibSession, out).getName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring134 = "";
          }
          out.print(tmpstring134);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list96 = new java.util.ArrayList<String>(messagesList59);
      inForLoop = true;
      forLoopCounter++;
      int limit67 = 1000;
      int offset67 = 0;
      int removedcount67 = 0;
      Object[] array146 = list96.toArray();
      for(int i146 = 0; i146 < array146.length; i146++)
      { 
        String ve3 = (String)array146[i146];
        if(limit67 <= 0)
        { 
          list96.remove(i146 - removedcount67);
          removedcount67++;
        }
        limit67--;
      }
      int separatorindex67 = 0;
      Object[] array147 = list96.toArray();
      for(int i147 = 0; i147 < array147.length; i147++)
      { 
        String ve3 = (String)array147[i147];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp118 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp118.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp118.getId().toString();
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
        String tmpstring136;
        try
        { 
          tmpstring136 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring136 = "";
        }
        out.print(tmpstring136);
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
      out.print("<label for=\"" + label144 + "\" " + "" + ">");
      String tmpstring133;
      try
      { 
        tmpstring133 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Name: ") : utils.HTMLFilter.filter(String.valueOf("Name: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring133 = "";
      }
      out.print(tmpstring133);
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
      String temp116 = ident + "input86" + uniqueid;
      java.util.List<String> messagesList58 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve61 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp116))
        { 
          ve61.add(ve);
        }
      }
      for(utils.ValidationException ve : ve61)
      { 
        messagesList58.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList58.size() > 0)
      { 
        out.print("<input name=\"" + temp116 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp116)));
        }
        else
        { 
          String tmpstring134;
          try
          { 
            tmpstring134 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp2.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(temp2.setupForPropertyEvents(hibSession, out).getName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring134 = "";
          }
          out.print(tmpstring134);
        }
        out.print("\" />");
        java.util.ArrayList<String> list95 = new java.util.ArrayList<String>(messagesList58);
        inForLoop = true;
        forLoopCounter++;
        int limit66 = 1000;
        int offset66 = 0;
        int removedcount66 = 0;
        Object[] array144 = list95.toArray();
        for(int i144 = 0; i144 < array144.length; i144++)
        { 
          String ve3 = (String)array144[i144];
          if(limit66 <= 0)
          { 
            list95.remove(i144 - removedcount66);
            removedcount66++;
          }
          limit66--;
        }
        int separatorindex66 = 0;
        Object[] array145 = list95.toArray();
        for(int i145 = 0; i145 < array145.length; i145++)
        { 
          String ve3 = (String)array145[i145];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp117 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp117.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp117.getId().toString();
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
          String tmpstring135;
          try
          { 
            tmpstring135 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring135 = "";
          }
          out.print(tmpstring135);
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
        out.print("<input name=\"" + temp116 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp116)));
        }
        else
        { 
          String tmpstring134;
          try
          { 
            tmpstring134 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp2.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(temp2.setupForPropertyEvents(hibSession, out).getName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring134 = "";
          }
          out.print(tmpstring134);
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
    java.util.List<String> messagesList61 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve64 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(ident))
      { 
        ve64.add(ve);
      }
    }
    for(utils.ValidationException ve : ve64)
    { 
      messagesList61.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList61.size() > 0)
    { 
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
      java.util.ArrayList<String> list98 = new java.util.ArrayList<String>(messagesList61);
      inForLoop = true;
      forLoopCounter++;
      int limit69 = 1000;
      int offset69 = 0;
      int removedcount69 = 0;
      Object[] array150 = list98.toArray();
      for(int i150 = 0; i150 < array150.length; i150++)
      { 
        String ve1 = (String)array150[i150];
        if(limit69 <= 0)
        { 
          list98.remove(i150 - removedcount69);
          removedcount69++;
        }
        limit69--;
      }
      int separatorindex69 = 0;
      Object[] array151 = list98.toArray();
      for(int i151 = 0; i151 < array151.length; i151++)
      { 
        String ve1 = (String)array151[i151];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve1))
        { 
          WebDSLEntity temp120 = (WebDSLEntity)(Object)ve1;
          forelementcounter = temp120.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp120.getId().toString();
        }
        else
          forelementcounter = Integer.toString(fallbackcounter);
        ThreadLocalPage.get().enterTemplateContext(forelementcounter);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring140;
        try
        { 
          tmpstring140 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
        }
        catch(NullPointerException npe)
        { 
          tmpstring140 = "";
        }
        out.print(tmpstring140);
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
        java.util.List<String> messagesList60 = new java.util.LinkedList<String>();
        java.util.List<utils.ValidationException> ve63 = new java.util.LinkedList<utils.ValidationException>();
        for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
        { 
          if(ve.getName() != null && ve.getName().equals(ident))
          { 
            ve63.add(ve);
          }
        }
        for(utils.ValidationException ve : ve63)
        { 
          messagesList60.add(ve.getErrorMessage());
          ThreadLocalPage.get().getValidationExceptions().remove(ve);
        }
        if(messagesList60.size() > 0)
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
          java.util.ArrayList<String> list97 = new java.util.ArrayList<String>(messagesList60);
          inForLoop = true;
          forLoopCounter++;
          int limit68 = 1000;
          int offset68 = 0;
          int removedcount68 = 0;
          Object[] array148 = list97.toArray();
          for(int i148 = 0; i148 < array148.length; i148++)
          { 
            String ve1 = (String)array148[i148];
            if(limit68 <= 0)
            { 
              list97.remove(i148 - removedcount68);
              removedcount68++;
            }
            limit68--;
          }
          int separatorindex68 = 0;
          Object[] array149 = list97.toArray();
          for(int i149 = 0; i149 < array149.length; i149++)
          { 
            String ve1 = (String)array149[i149];
            fallbackcounter += 1;
            if(WebDSLEntity.class.isInstance(ve1))
            { 
              WebDSLEntity temp119 = (WebDSLEntity)(Object)ve1;
              forelementcounter = temp119.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp119.getId().toString();
            }
            else
              forelementcounter = Integer.toString(fallbackcounter);
            ThreadLocalPage.get().enterTemplateContext(forelementcounter);
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring139;
            try
            { 
              tmpstring139 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
            }
            catch(NullPointerException npe)
            { 
              tmpstring139 = "";
            }
            out.print(tmpstring139);
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
      String tmpstring138;
      try
      { 
        tmpstring138 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Save") : utils.HTMLFilter.filter(String.valueOf("Save"));
      }
      catch(NullPointerException npe)
      { 
        tmpstring138 = "";
      }
      out.print(tmpstring138);
      out.print("\" " + ("class" + "='" + "button" + "' ") + " />");
      out.print("</div>");
      ThreadLocalPage.get().commonContextsCheckLeave(out);
    }
    else
    { 
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        java.util.List<String> messagesList60 = new java.util.LinkedList<String>();
        java.util.List<utils.ValidationException> ve63 = new java.util.LinkedList<utils.ValidationException>();
        for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
        { 
          if(ve.getName() != null && ve.getName().equals(ident))
          { 
            ve63.add(ve);
          }
        }
        for(utils.ValidationException ve : ve63)
        { 
          messagesList60.add(ve.getErrorMessage());
          ThreadLocalPage.get().getValidationExceptions().remove(ve);
        }
        if(messagesList60.size() > 0)
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
          java.util.ArrayList<String> list97 = new java.util.ArrayList<String>(messagesList60);
          inForLoop = true;
          forLoopCounter++;
          int limit68 = 1000;
          int offset68 = 0;
          int removedcount68 = 0;
          Object[] array148 = list97.toArray();
          for(int i148 = 0; i148 < array148.length; i148++)
          { 
            String ve1 = (String)array148[i148];
            if(limit68 <= 0)
            { 
              list97.remove(i148 - removedcount68);
              removedcount68++;
            }
            limit68--;
          }
          int separatorindex68 = 0;
          Object[] array149 = list97.toArray();
          for(int i149 = 0; i149 < array149.length; i149++)
          { 
            String ve1 = (String)array149[i149];
            fallbackcounter += 1;
            if(WebDSLEntity.class.isInstance(ve1))
            { 
              WebDSLEntity temp119 = (WebDSLEntity)(Object)ve1;
              forelementcounter = temp119.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp119.getId().toString();
            }
            else
              forelementcounter = Integer.toString(fallbackcounter);
            ThreadLocalPage.get().enterTemplateContext(forelementcounter);
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring139;
            try
            { 
              tmpstring139 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
            }
            catch(NullPointerException npe)
            { 
              tmpstring139 = "";
            }
            out.print(tmpstring139);
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
      String tmpstring138;
      try
      { 
        tmpstring138 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Save") : utils.HTMLFilter.filter(String.valueOf("Save"));
      }
      catch(NullPointerException npe)
      { 
        tmpstring138 = "";
      }
      out.print(tmpstring138);
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
    this.out.write(stringwriter3.toString());
    out = out4;
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
    ident += "form18" + uniqueid;
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
      save5 temp = (save5)env.getAction("save5");
      temp.save5(ident);
    }
    ThreadLocalPage.get().commonContextsCheckLeave(out);
  }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { 
    env.putAction("save5", new save5()
                           { 
                             boolean isRedirected = false;

                             public void setIsRedirected(boolean b)
                             { 
                               isRedirected = b;
                             }

                             public void save5(String actionident)
                             { 
                               ThreadLocalAction.set(this);
                               if(!ThreadLocalPage.get().hasExecutedAction)
                               { 
                                 boolean actionFailed = false;
                                 ThreadLocalPage.get().hasExecutedAction = true;
                                 try
                                 { 
                                   temp2.setupForPropertyEvents(hibSession, out).validateSave();
                                   temp2.setVersion(1);
                                   hibSession.save(temp2);
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
    ident = ident + "input85" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input86" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        String temp115 = ThreadLocalPage.get().getParammap().get(ident);
        temp2.setupForPropertyEvents(hibSession, out).setName(temp115);
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