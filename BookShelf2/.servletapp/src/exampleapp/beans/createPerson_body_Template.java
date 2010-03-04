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

public class createPerson_body_Template  implements TemplateServlet
{ 
  private exampleapp.domain.Person temp3;

  public exampleapp.domain.Person getTemp3()
  { 
    return temp3;
  }

  public void setTemp3(exampleapp.domain.Person temp3)
  { 
    this.temp3 = temp3;
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
          this.uniqueid = Encoders.encodeTemplateId("createPerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("createPerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("createPerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("createPerson_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
      ident += (inForLoop ? forelementcounter : "") + ("form12" + uniqueid);
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().setInSubmittedForm(true);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input22" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input23" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input24" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input25" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input26" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input27" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input28" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input29" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input30" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input31" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input32" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input33" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input34" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input35" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input36" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input37" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input38" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input39" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input40" + uniqueid;
        ThreadLocalPage.get().enterValidationContext(ident);
        ident = "";
        if(inForLoop)
        { 
          ident += forelementcounter;
        }
        ident = ident + "input41" + uniqueid;
        ThreadLocalPage.get().leaveValidationContext();
      }
      ThreadLocalPage.get().setInSubmittedForm(false);
    }
  }

  protected void initialize()
  { 
    temp3 = (exampleapp.domain.Person)env.getVariable("temp3");
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
    int sec0 = ThreadLocalPage.get().getSectionDepth();
    if(sec0 > 0)
    { 
      if(sec0 > 6)
      { 
        sec0 = 6;
      }
    }
    else
    { 
      sec0 = 1;
    }
    out.print("<h" + sec0);
    out.print(" class=\"header section" + sec0 + "\" " + "" + ">");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring5;
    try
    { 
      tmpstring5 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Create ") : utils.HTMLFilter.filter(String.valueOf("Create "));
    }
    catch(NullPointerException npe)
    { 
      tmpstring5 = "";
    }
    out.print(tmpstring5);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring6;
    try
    { 
      tmpstring6 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getName()));
    }
    catch(NullPointerException npe)
    { 
      tmpstring6 = "";
    }
    out.print(tmpstring6);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</h" + sec0 + ">");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    ident += "form12" + uniqueid;
    ThreadLocalPage.get().setFormIdent(ident);
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      ThreadLocalPage.get().setInSubmittedForm(true);
    }
    ThreadLocalPage.get().formRequiresMultipartEnc = false;
    out.print("<form name=\"" + ident + "\" id=\"" + ident + "\" action=\"" + utils.HTMLFilter.filter(ThreadLocalPage.get().getPageUrlWithParams()) + "\" accept-charset=\"UTF-8\" method=\"POST\" " + "");
    out.print(" onsubmit=\"return clickFirstButton(this);\"  ");
    java.io.PrintWriter out0 = out;
    java.io.StringWriter stringwriter0 = new java.io.StringWriter();
    out = new java.io.PrintWriter(stringwriter0);
    out.print(">");
    out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
    out.print(ThreadLocalPage.get().getHiddenParams());
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<fieldset " + "" + "><legend>");
    String tmpstring42;
    try
    { 
      tmpstring42 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Details") : utils.HTMLFilter.filter(String.valueOf("Details"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring42 = "";
    }
    out.print(tmpstring42);
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
    String label75 = ident + "input22" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label75);
    java.util.List<String> messagesList2 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve5 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label75))
      { 
        ve5.add(ve);
      }
    }
    for(utils.ValidationException ve : ve5)
    { 
      messagesList2.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList2.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label75 + "\" " + "" + ">");
      String tmpstring7;
      try
      { 
        tmpstring7 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Fullname: ") : utils.HTMLFilter.filter(String.valueOf("Fullname: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring7 = "";
      }
      out.print(tmpstring7);
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
      String temp21 = ident + "input23" + uniqueid;
      java.util.List<String> messagesList1 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve4 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp21))
        { 
          ve4.add(ve);
        }
      }
      for(utils.ValidationException ve : ve4)
      { 
        messagesList1.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList1.size() > 0)
      { 
        out.print("<input name=\"" + temp21 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputfullname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp21)));
        }
        else
        { 
          String tmpstring8;
          try
          { 
            tmpstring8 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getFullname()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getFullname()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring8 = "";
          }
          out.print(tmpstring8);
        }
        out.print("\" />");
        java.util.ArrayList<String> list25 = new java.util.ArrayList<String>(messagesList1);
        inForLoop = true;
        forLoopCounter++;
        int limit4 = 1000;
        int offset4 = 0;
        int removedcount4 = 0;
        Object[] array14 = list25.toArray();
        for(int i14 = 0; i14 < array14.length; i14++)
        { 
          String ve3 = (String)array14[i14];
          if(limit4 <= 0)
          { 
            list25.remove(i14 - removedcount4);
            removedcount4++;
          }
          limit4--;
        }
        int separatorindex4 = 0;
        Object[] array15 = list25.toArray();
        for(int i15 = 0; i15 < array15.length; i15++)
        { 
          String ve3 = (String)array15[i15];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp22 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp22.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp22.getId().toString();
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
          String tmpstring9;
          try
          { 
            tmpstring9 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring9 = "";
          }
          out.print(tmpstring9);
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
        out.print("<input name=\"" + temp21 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputfullname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp21)));
        }
        else
        { 
          String tmpstring8;
          try
          { 
            tmpstring8 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getFullname()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getFullname()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring8 = "";
          }
          out.print(tmpstring8);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list26 = new java.util.ArrayList<String>(messagesList2);
      inForLoop = true;
      forLoopCounter++;
      int limit5 = 1000;
      int offset5 = 0;
      int removedcount5 = 0;
      Object[] array16 = list26.toArray();
      for(int i16 = 0; i16 < array16.length; i16++)
      { 
        String ve3 = (String)array16[i16];
        if(limit5 <= 0)
        { 
          list26.remove(i16 - removedcount5);
          removedcount5++;
        }
        limit5--;
      }
      int separatorindex5 = 0;
      Object[] array17 = list26.toArray();
      for(int i17 = 0; i17 < array17.length; i17++)
      { 
        String ve3 = (String)array17[i17];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp23 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp23.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp23.getId().toString();
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
        String tmpstring10;
        try
        { 
          tmpstring10 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring10 = "";
        }
        out.print(tmpstring10);
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
      out.print("<label for=\"" + label75 + "\" " + "" + ">");
      String tmpstring7;
      try
      { 
        tmpstring7 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Fullname: ") : utils.HTMLFilter.filter(String.valueOf("Fullname: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring7 = "";
      }
      out.print(tmpstring7);
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
      String temp21 = ident + "input23" + uniqueid;
      java.util.List<String> messagesList1 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve4 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp21))
        { 
          ve4.add(ve);
        }
      }
      for(utils.ValidationException ve : ve4)
      { 
        messagesList1.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList1.size() > 0)
      { 
        out.print("<input name=\"" + temp21 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputfullname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp21)));
        }
        else
        { 
          String tmpstring8;
          try
          { 
            tmpstring8 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getFullname()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getFullname()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring8 = "";
          }
          out.print(tmpstring8);
        }
        out.print("\" />");
        java.util.ArrayList<String> list25 = new java.util.ArrayList<String>(messagesList1);
        inForLoop = true;
        forLoopCounter++;
        int limit4 = 1000;
        int offset4 = 0;
        int removedcount4 = 0;
        Object[] array14 = list25.toArray();
        for(int i14 = 0; i14 < array14.length; i14++)
        { 
          String ve3 = (String)array14[i14];
          if(limit4 <= 0)
          { 
            list25.remove(i14 - removedcount4);
            removedcount4++;
          }
          limit4--;
        }
        int separatorindex4 = 0;
        Object[] array15 = list25.toArray();
        for(int i15 = 0; i15 < array15.length; i15++)
        { 
          String ve3 = (String)array15[i15];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp22 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp22.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp22.getId().toString();
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
          String tmpstring9;
          try
          { 
            tmpstring9 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring9 = "";
          }
          out.print(tmpstring9);
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
        out.print("<input name=\"" + temp21 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputfullname") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp21)));
        }
        else
        { 
          String tmpstring8;
          try
          { 
            tmpstring8 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getFullname()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getFullname()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring8 = "";
          }
          out.print(tmpstring8);
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
    String label76 = ident + "input24" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label76);
    java.util.List<String> messagesList4 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve7 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label76))
      { 
        ve7.add(ve);
      }
    }
    for(utils.ValidationException ve : ve7)
    { 
      messagesList4.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList4.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label76 + "\" " + "" + ">");
      String tmpstring11;
      try
      { 
        tmpstring11 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Email: ") : utils.HTMLFilter.filter(String.valueOf("Email: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring11 = "";
      }
      out.print(tmpstring11);
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
      String temp24 = ident + "input25" + uniqueid;
      java.util.List<String> messagesList3 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve6 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp24))
        { 
          ve6.add(ve);
        }
      }
      for(utils.ValidationException ve : ve6)
      { 
        messagesList3.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList3.size() > 0)
      { 
        out.print("<input name=\"" + temp24 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputemail") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp24)));
        }
        else
        { 
          String tmpstring12;
          try
          { 
            tmpstring12 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getEmail()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getEmail()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring12 = "";
          }
          out.print(tmpstring12);
        }
        out.print("\" />");
        java.util.ArrayList<String> list27 = new java.util.ArrayList<String>(messagesList3);
        inForLoop = true;
        forLoopCounter++;
        int limit6 = 1000;
        int offset6 = 0;
        int removedcount6 = 0;
        Object[] array18 = list27.toArray();
        for(int i18 = 0; i18 < array18.length; i18++)
        { 
          String ve3 = (String)array18[i18];
          if(limit6 <= 0)
          { 
            list27.remove(i18 - removedcount6);
            removedcount6++;
          }
          limit6--;
        }
        int separatorindex6 = 0;
        Object[] array19 = list27.toArray();
        for(int i19 = 0; i19 < array19.length; i19++)
        { 
          String ve3 = (String)array19[i19];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp25 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp25.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp25.getId().toString();
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
          String tmpstring13;
          try
          { 
            tmpstring13 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring13 = "";
          }
          out.print(tmpstring13);
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
        out.print("<input name=\"" + temp24 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputemail") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp24)));
        }
        else
        { 
          String tmpstring12;
          try
          { 
            tmpstring12 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getEmail()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getEmail()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring12 = "";
          }
          out.print(tmpstring12);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list28 = new java.util.ArrayList<String>(messagesList4);
      inForLoop = true;
      forLoopCounter++;
      int limit7 = 1000;
      int offset7 = 0;
      int removedcount7 = 0;
      Object[] array20 = list28.toArray();
      for(int i20 = 0; i20 < array20.length; i20++)
      { 
        String ve3 = (String)array20[i20];
        if(limit7 <= 0)
        { 
          list28.remove(i20 - removedcount7);
          removedcount7++;
        }
        limit7--;
      }
      int separatorindex7 = 0;
      Object[] array21 = list28.toArray();
      for(int i21 = 0; i21 < array21.length; i21++)
      { 
        String ve3 = (String)array21[i21];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp26 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp26.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp26.getId().toString();
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
        String tmpstring14;
        try
        { 
          tmpstring14 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring14 = "";
        }
        out.print(tmpstring14);
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
      out.print("<label for=\"" + label76 + "\" " + "" + ">");
      String tmpstring11;
      try
      { 
        tmpstring11 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Email: ") : utils.HTMLFilter.filter(String.valueOf("Email: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring11 = "";
      }
      out.print(tmpstring11);
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
      String temp24 = ident + "input25" + uniqueid;
      java.util.List<String> messagesList3 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve6 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp24))
        { 
          ve6.add(ve);
        }
      }
      for(utils.ValidationException ve : ve6)
      { 
        messagesList3.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList3.size() > 0)
      { 
        out.print("<input name=\"" + temp24 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputemail") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp24)));
        }
        else
        { 
          String tmpstring12;
          try
          { 
            tmpstring12 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getEmail()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getEmail()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring12 = "";
          }
          out.print(tmpstring12);
        }
        out.print("\" />");
        java.util.ArrayList<String> list27 = new java.util.ArrayList<String>(messagesList3);
        inForLoop = true;
        forLoopCounter++;
        int limit6 = 1000;
        int offset6 = 0;
        int removedcount6 = 0;
        Object[] array18 = list27.toArray();
        for(int i18 = 0; i18 < array18.length; i18++)
        { 
          String ve3 = (String)array18[i18];
          if(limit6 <= 0)
          { 
            list27.remove(i18 - removedcount6);
            removedcount6++;
          }
          limit6--;
        }
        int separatorindex6 = 0;
        Object[] array19 = list27.toArray();
        for(int i19 = 0; i19 < array19.length; i19++)
        { 
          String ve3 = (String)array19[i19];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp25 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp25.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp25.getId().toString();
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
          String tmpstring13;
          try
          { 
            tmpstring13 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring13 = "";
          }
          out.print(tmpstring13);
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
        out.print("<input name=\"" + temp24 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputemail") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp24)));
        }
        else
        { 
          String tmpstring12;
          try
          { 
            tmpstring12 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getEmail()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getEmail()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring12 = "";
          }
          out.print(tmpstring12);
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
    String label77 = ident + "input26" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label77);
    java.util.List<String> messagesList6 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve9 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label77))
      { 
        ve9.add(ve);
      }
    }
    for(utils.ValidationException ve : ve9)
    { 
      messagesList6.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList6.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label77 + "\" " + "" + ">");
      String tmpstring15;
      try
      { 
        tmpstring15 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Username: ") : utils.HTMLFilter.filter(String.valueOf("Username: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring15 = "";
      }
      out.print(tmpstring15);
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
      String temp27 = ident + "input27" + uniqueid;
      java.util.List<String> messagesList5 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve8 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp27))
        { 
          ve8.add(ve);
        }
      }
      for(utils.ValidationException ve : ve8)
      { 
        messagesList5.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList5.size() > 0)
      { 
        out.print("<input name=\"" + temp27 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputusername") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp27)));
        }
        else
        { 
          String tmpstring16;
          try
          { 
            tmpstring16 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getUsername()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getUsername()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring16 = "";
          }
          out.print(tmpstring16);
        }
        out.print("\" />");
        java.util.ArrayList<String> list29 = new java.util.ArrayList<String>(messagesList5);
        inForLoop = true;
        forLoopCounter++;
        int limit8 = 1000;
        int offset8 = 0;
        int removedcount8 = 0;
        Object[] array22 = list29.toArray();
        for(int i22 = 0; i22 < array22.length; i22++)
        { 
          String ve3 = (String)array22[i22];
          if(limit8 <= 0)
          { 
            list29.remove(i22 - removedcount8);
            removedcount8++;
          }
          limit8--;
        }
        int separatorindex8 = 0;
        Object[] array23 = list29.toArray();
        for(int i23 = 0; i23 < array23.length; i23++)
        { 
          String ve3 = (String)array23[i23];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp28 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp28.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp28.getId().toString();
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
          String tmpstring17;
          try
          { 
            tmpstring17 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring17 = "";
          }
          out.print(tmpstring17);
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
        out.print("<input name=\"" + temp27 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputusername") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp27)));
        }
        else
        { 
          String tmpstring16;
          try
          { 
            tmpstring16 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getUsername()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getUsername()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring16 = "";
          }
          out.print(tmpstring16);
        }
        out.print("\" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list30 = new java.util.ArrayList<String>(messagesList6);
      inForLoop = true;
      forLoopCounter++;
      int limit9 = 1000;
      int offset9 = 0;
      int removedcount9 = 0;
      Object[] array24 = list30.toArray();
      for(int i24 = 0; i24 < array24.length; i24++)
      { 
        String ve3 = (String)array24[i24];
        if(limit9 <= 0)
        { 
          list30.remove(i24 - removedcount9);
          removedcount9++;
        }
        limit9--;
      }
      int separatorindex9 = 0;
      Object[] array25 = list30.toArray();
      for(int i25 = 0; i25 < array25.length; i25++)
      { 
        String ve3 = (String)array25[i25];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp29 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp29.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp29.getId().toString();
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
        String tmpstring18;
        try
        { 
          tmpstring18 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring18 = "";
        }
        out.print(tmpstring18);
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
      out.print("<label for=\"" + label77 + "\" " + "" + ">");
      String tmpstring15;
      try
      { 
        tmpstring15 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Username: ") : utils.HTMLFilter.filter(String.valueOf("Username: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring15 = "";
      }
      out.print(tmpstring15);
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
      String temp27 = ident + "input27" + uniqueid;
      java.util.List<String> messagesList5 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve8 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp27))
        { 
          ve8.add(ve);
        }
      }
      for(utils.ValidationException ve : ve8)
      { 
        messagesList5.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList5.size() > 0)
      { 
        out.print("<input name=\"" + temp27 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputusername") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp27)));
        }
        else
        { 
          String tmpstring16;
          try
          { 
            tmpstring16 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getUsername()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getUsername()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring16 = "";
          }
          out.print(tmpstring16);
        }
        out.print("\" />");
        java.util.ArrayList<String> list29 = new java.util.ArrayList<String>(messagesList5);
        inForLoop = true;
        forLoopCounter++;
        int limit8 = 1000;
        int offset8 = 0;
        int removedcount8 = 0;
        Object[] array22 = list29.toArray();
        for(int i22 = 0; i22 < array22.length; i22++)
        { 
          String ve3 = (String)array22[i22];
          if(limit8 <= 0)
          { 
            list29.remove(i22 - removedcount8);
            removedcount8++;
          }
          limit8--;
        }
        int separatorindex8 = 0;
        Object[] array23 = list29.toArray();
        for(int i23 = 0; i23 < array23.length; i23++)
        { 
          String ve3 = (String)array23[i23];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp28 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp28.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp28.getId().toString();
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
          String tmpstring17;
          try
          { 
            tmpstring17 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring17 = "";
          }
          out.print(tmpstring17);
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
        out.print("<input name=\"" + temp27 + "\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(" class=\"" + "inputString" + (" " + "inputusername") + "\" " + "" + " " + " type=\"text\" value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp27)));
        }
        else
        { 
          String tmpstring16;
          try
          { 
            tmpstring16 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getUsername()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getUsername()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring16 = "";
          }
          out.print(tmpstring16);
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
    String label78 = ident + "input28" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label78);
    java.util.List<String> messagesList8 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve11 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label78))
      { 
        ve11.add(ve);
      }
    }
    for(utils.ValidationException ve : ve11)
    { 
      messagesList8.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList8.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label78 + "\" " + "" + ">");
      String tmpstring19;
      try
      { 
        tmpstring19 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Bio: ") : utils.HTMLFilter.filter(String.valueOf("Bio: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring19 = "";
      }
      out.print(tmpstring19);
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
      String temp30 = ident + "input29" + uniqueid;
      java.util.List<String> messagesList7 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve10 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp30))
        { 
          ve10.add(ve);
        }
      }
      for(utils.ValidationException ve : ve10)
      { 
        messagesList7.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList7.size() > 0)
      { 
        out.print("<textarea name=\"" + temp30 + "\"" + (" class=\"" + "inputTextarea inputWikiText" + (" " + "inputbio") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp30)));
        }
        else
        { 
          String tmpstring20;
          try
          { 
            tmpstring20 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getBio()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getBio()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring20 = "";
          }
          out.print(tmpstring20);
        }
        out.print("</textarea>");
        java.util.ArrayList<String> list31 = new java.util.ArrayList<String>(messagesList7);
        inForLoop = true;
        forLoopCounter++;
        int limit10 = 1000;
        int offset10 = 0;
        int removedcount10 = 0;
        Object[] array26 = list31.toArray();
        for(int i26 = 0; i26 < array26.length; i26++)
        { 
          String ve3 = (String)array26[i26];
          if(limit10 <= 0)
          { 
            list31.remove(i26 - removedcount10);
            removedcount10++;
          }
          limit10--;
        }
        int separatorindex10 = 0;
        Object[] array27 = list31.toArray();
        for(int i27 = 0; i27 < array27.length; i27++)
        { 
          String ve3 = (String)array27[i27];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp31 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp31.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp31.getId().toString();
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
          String tmpstring21;
          try
          { 
            tmpstring21 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring21 = "";
          }
          out.print(tmpstring21);
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
        out.print("<textarea name=\"" + temp30 + "\"" + (" class=\"" + "inputTextarea inputWikiText" + (" " + "inputbio") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp30)));
        }
        else
        { 
          String tmpstring20;
          try
          { 
            tmpstring20 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getBio()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getBio()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring20 = "";
          }
          out.print(tmpstring20);
        }
        out.print("</textarea>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list32 = new java.util.ArrayList<String>(messagesList8);
      inForLoop = true;
      forLoopCounter++;
      int limit11 = 1000;
      int offset11 = 0;
      int removedcount11 = 0;
      Object[] array28 = list32.toArray();
      for(int i28 = 0; i28 < array28.length; i28++)
      { 
        String ve3 = (String)array28[i28];
        if(limit11 <= 0)
        { 
          list32.remove(i28 - removedcount11);
          removedcount11++;
        }
        limit11--;
      }
      int separatorindex11 = 0;
      Object[] array29 = list32.toArray();
      for(int i29 = 0; i29 < array29.length; i29++)
      { 
        String ve3 = (String)array29[i29];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp32 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp32.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp32.getId().toString();
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
        String tmpstring22;
        try
        { 
          tmpstring22 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring22 = "";
        }
        out.print(tmpstring22);
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
      out.print("<label for=\"" + label78 + "\" " + "" + ">");
      String tmpstring19;
      try
      { 
        tmpstring19 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Bio: ") : utils.HTMLFilter.filter(String.valueOf("Bio: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring19 = "";
      }
      out.print(tmpstring19);
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
      String temp30 = ident + "input29" + uniqueid;
      java.util.List<String> messagesList7 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve10 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp30))
        { 
          ve10.add(ve);
        }
      }
      for(utils.ValidationException ve : ve10)
      { 
        messagesList7.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList7.size() > 0)
      { 
        out.print("<textarea name=\"" + temp30 + "\"" + (" class=\"" + "inputTextarea inputWikiText" + (" " + "inputbio") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp30)));
        }
        else
        { 
          String tmpstring20;
          try
          { 
            tmpstring20 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getBio()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getBio()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring20 = "";
          }
          out.print(tmpstring20);
        }
        out.print("</textarea>");
        java.util.ArrayList<String> list31 = new java.util.ArrayList<String>(messagesList7);
        inForLoop = true;
        forLoopCounter++;
        int limit10 = 1000;
        int offset10 = 0;
        int removedcount10 = 0;
        Object[] array26 = list31.toArray();
        for(int i26 = 0; i26 < array26.length; i26++)
        { 
          String ve3 = (String)array26[i26];
          if(limit10 <= 0)
          { 
            list31.remove(i26 - removedcount10);
            removedcount10++;
          }
          limit10--;
        }
        int separatorindex10 = 0;
        Object[] array27 = list31.toArray();
        for(int i27 = 0; i27 < array27.length; i27++)
        { 
          String ve3 = (String)array27[i27];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp31 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp31.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp31.getId().toString();
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
          String tmpstring21;
          try
          { 
            tmpstring21 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring21 = "";
          }
          out.print(tmpstring21);
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
        out.print("<textarea name=\"" + temp30 + "\"" + (" class=\"" + "inputTextarea inputWikiText" + (" " + "inputbio") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp30)));
        }
        else
        { 
          String tmpstring20;
          try
          { 
            tmpstring20 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getBio()) : utils.HTMLFilter.filter(String.valueOf(temp3.setupForPropertyEvents(hibSession, out).getBio()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring20 = "";
          }
          out.print(tmpstring20);
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
    String label79 = ident + "input30" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label79);
    java.util.List<String> messagesList10 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve13 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label79))
      { 
        ve13.add(ve);
      }
    }
    for(utils.ValidationException ve : ve13)
    { 
      messagesList10.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList10.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label79 + "\" " + "" + ">");
      String tmpstring23;
      try
      { 
        tmpstring23 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Date of birth: ") : utils.HTMLFilter.filter(String.valueOf("Date of birth: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring23 = "";
      }
      out.print(tmpstring23);
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
      String temp33 = ident + "input31" + uniqueid;
      java.util.List<String> messagesList9 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve12 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp33))
        { 
          ve12.add(ve);
        }
      }
      for(utils.ValidationException ve : ve12)
      { 
        messagesList9.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList9.size() > 0)
      { 
        out.print("<input name=\"" + temp33 + "\" " + (" class=\"" + "inputDate" + (" " + "inputdateOfBirth") + "\" " + "" + " ") + " type=\"text\" dojoType=\"dijit.form.DateTextBox\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp33)));
        }
        else
        { 
          String tmpstring24;
          try
          { 
            java.text.SimpleDateFormat formatter0 = new java.text.SimpleDateFormat("yyyy-MM-dd");
            StringBuffer buffer0 = new StringBuffer();
            formatter0.format(temp3.setupForPropertyEvents(hibSession, out).getDateOfBirth(), buffer0, new java.text.FieldPosition(0));
            tmpstring24 = buffer0.toString();
          }
          catch(NullPointerException npe)
          { 
            tmpstring24 = "";
          }
          out.print(tmpstring24);
        }
        out.print("\" constraints=\"{datePattern:'" + "dd/MM/yyyy" + "'}\" />");
        ThreadLocalPage.get().useDojo = true;
        ThreadLocalPage.get().addCustomHead("DATEPICKER", "<script type=\"text/javascript\">dojo.require('dijit.form.DateTextBox');</script>");
        java.util.ArrayList<String> list33 = new java.util.ArrayList<String>(messagesList9);
        inForLoop = true;
        forLoopCounter++;
        int limit12 = 1000;
        int offset12 = 0;
        int removedcount12 = 0;
        Object[] array30 = list33.toArray();
        for(int i30 = 0; i30 < array30.length; i30++)
        { 
          String ve3 = (String)array30[i30];
          if(limit12 <= 0)
          { 
            list33.remove(i30 - removedcount12);
            removedcount12++;
          }
          limit12--;
        }
        int separatorindex12 = 0;
        Object[] array31 = list33.toArray();
        for(int i31 = 0; i31 < array31.length; i31++)
        { 
          String ve3 = (String)array31[i31];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp34 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp34.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp34.getId().toString();
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
          String tmpstring25;
          try
          { 
            tmpstring25 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring25 = "";
          }
          out.print(tmpstring25);
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
        out.print("<input name=\"" + temp33 + "\" " + (" class=\"" + "inputDate" + (" " + "inputdateOfBirth") + "\" " + "" + " ") + " type=\"text\" dojoType=\"dijit.form.DateTextBox\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp33)));
        }
        else
        { 
          String tmpstring24;
          try
          { 
            java.text.SimpleDateFormat formatter0 = new java.text.SimpleDateFormat("yyyy-MM-dd");
            StringBuffer buffer0 = new StringBuffer();
            formatter0.format(temp3.setupForPropertyEvents(hibSession, out).getDateOfBirth(), buffer0, new java.text.FieldPosition(0));
            tmpstring24 = buffer0.toString();
          }
          catch(NullPointerException npe)
          { 
            tmpstring24 = "";
          }
          out.print(tmpstring24);
        }
        out.print("\" constraints=\"{datePattern:'" + "dd/MM/yyyy" + "'}\" />");
        ThreadLocalPage.get().useDojo = true;
        ThreadLocalPage.get().addCustomHead("DATEPICKER", "<script type=\"text/javascript\">dojo.require('dijit.form.DateTextBox');</script>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list34 = new java.util.ArrayList<String>(messagesList10);
      inForLoop = true;
      forLoopCounter++;
      int limit13 = 1000;
      int offset13 = 0;
      int removedcount13 = 0;
      Object[] array32 = list34.toArray();
      for(int i32 = 0; i32 < array32.length; i32++)
      { 
        String ve3 = (String)array32[i32];
        if(limit13 <= 0)
        { 
          list34.remove(i32 - removedcount13);
          removedcount13++;
        }
        limit13--;
      }
      int separatorindex13 = 0;
      Object[] array33 = list34.toArray();
      for(int i33 = 0; i33 < array33.length; i33++)
      { 
        String ve3 = (String)array33[i33];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp35 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp35.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp35.getId().toString();
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
        String tmpstring26;
        try
        { 
          tmpstring26 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring26 = "";
        }
        out.print(tmpstring26);
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
      out.print("<label for=\"" + label79 + "\" " + "" + ">");
      String tmpstring23;
      try
      { 
        tmpstring23 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Date of birth: ") : utils.HTMLFilter.filter(String.valueOf("Date of birth: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring23 = "";
      }
      out.print(tmpstring23);
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
      String temp33 = ident + "input31" + uniqueid;
      java.util.List<String> messagesList9 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve12 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp33))
        { 
          ve12.add(ve);
        }
      }
      for(utils.ValidationException ve : ve12)
      { 
        messagesList9.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList9.size() > 0)
      { 
        out.print("<input name=\"" + temp33 + "\" " + (" class=\"" + "inputDate" + (" " + "inputdateOfBirth") + "\" " + "" + " ") + " type=\"text\" dojoType=\"dijit.form.DateTextBox\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp33)));
        }
        else
        { 
          String tmpstring24;
          try
          { 
            java.text.SimpleDateFormat formatter0 = new java.text.SimpleDateFormat("yyyy-MM-dd");
            StringBuffer buffer0 = new StringBuffer();
            formatter0.format(temp3.setupForPropertyEvents(hibSession, out).getDateOfBirth(), buffer0, new java.text.FieldPosition(0));
            tmpstring24 = buffer0.toString();
          }
          catch(NullPointerException npe)
          { 
            tmpstring24 = "";
          }
          out.print(tmpstring24);
        }
        out.print("\" constraints=\"{datePattern:'" + "dd/MM/yyyy" + "'}\" />");
        ThreadLocalPage.get().useDojo = true;
        ThreadLocalPage.get().addCustomHead("DATEPICKER", "<script type=\"text/javascript\">dojo.require('dijit.form.DateTextBox');</script>");
        java.util.ArrayList<String> list33 = new java.util.ArrayList<String>(messagesList9);
        inForLoop = true;
        forLoopCounter++;
        int limit12 = 1000;
        int offset12 = 0;
        int removedcount12 = 0;
        Object[] array30 = list33.toArray();
        for(int i30 = 0; i30 < array30.length; i30++)
        { 
          String ve3 = (String)array30[i30];
          if(limit12 <= 0)
          { 
            list33.remove(i30 - removedcount12);
            removedcount12++;
          }
          limit12--;
        }
        int separatorindex12 = 0;
        Object[] array31 = list33.toArray();
        for(int i31 = 0; i31 < array31.length; i31++)
        { 
          String ve3 = (String)array31[i31];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp34 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp34.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp34.getId().toString();
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
          String tmpstring25;
          try
          { 
            tmpstring25 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring25 = "";
          }
          out.print(tmpstring25);
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
        out.print("<input name=\"" + temp33 + "\" " + (" class=\"" + "inputDate" + (" " + "inputdateOfBirth") + "\" " + "" + " ") + " type=\"text\" dojoType=\"dijit.form.DateTextBox\" ");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("value=\"");
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getParammap().get(temp33)));
        }
        else
        { 
          String tmpstring24;
          try
          { 
            java.text.SimpleDateFormat formatter0 = new java.text.SimpleDateFormat("yyyy-MM-dd");
            StringBuffer buffer0 = new StringBuffer();
            formatter0.format(temp3.setupForPropertyEvents(hibSession, out).getDateOfBirth(), buffer0, new java.text.FieldPosition(0));
            tmpstring24 = buffer0.toString();
          }
          catch(NullPointerException npe)
          { 
            tmpstring24 = "";
          }
          out.print(tmpstring24);
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
    String label80 = ident + "input32" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label80);
    java.util.List<String> messagesList12 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve15 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label80))
      { 
        ve15.add(ve);
      }
    }
    for(utils.ValidationException ve : ve15)
    { 
      messagesList12.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList12.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label80 + "\" " + "" + ">");
      String tmpstring27;
      try
      { 
        tmpstring27 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Parents: ") : utils.HTMLFilter.filter(String.valueOf("Parents: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring27 = "";
      }
      out.print(tmpstring27);
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
      String temp36 = ident + "input33" + uniqueid;
      java.util.List<String> messagesList11 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve14 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp36))
        { 
          ve14.add(ve);
        }
      }
      for(utils.ValidationException ve : ve14)
      { 
        messagesList11.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList11.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp36 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp36 + "\"" + (" class=\"" + "select" + (" " + "inputparents") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter0 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter0.hasNext())
        { 
          exampleapp.domain.Person person21 = (exampleapp.domain.Person)iter0.next();
          out.print("<option value=\"" + person21.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp36) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp36))
              { 
                if(elem.equals(String.valueOf(person21.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getParents() != null && temp3.setupForPropertyEvents(hibSession, out).getParents().contains(person21))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person21.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list35 = new java.util.ArrayList<String>(messagesList11);
        inForLoop = true;
        forLoopCounter++;
        int limit14 = 1000;
        int offset14 = 0;
        int removedcount14 = 0;
        Object[] array34 = list35.toArray();
        for(int i34 = 0; i34 < array34.length; i34++)
        { 
          String ve3 = (String)array34[i34];
          if(limit14 <= 0)
          { 
            list35.remove(i34 - removedcount14);
            removedcount14++;
          }
          limit14--;
        }
        int separatorindex14 = 0;
        Object[] array35 = list35.toArray();
        for(int i35 = 0; i35 < array35.length; i35++)
        { 
          String ve3 = (String)array35[i35];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp37 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp37.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp37.getId().toString();
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
          String tmpstring28;
          try
          { 
            tmpstring28 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring28 = "";
          }
          out.print(tmpstring28);
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
        out.print("<input type=\"hidden\" name=\"" + temp36 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp36 + "\"" + (" class=\"" + "select" + (" " + "inputparents") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter0 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter0.hasNext())
        { 
          exampleapp.domain.Person person21 = (exampleapp.domain.Person)iter0.next();
          out.print("<option value=\"" + person21.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp36) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp36))
              { 
                if(elem.equals(String.valueOf(person21.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getParents() != null && temp3.setupForPropertyEvents(hibSession, out).getParents().contains(person21))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person21.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list36 = new java.util.ArrayList<String>(messagesList12);
      inForLoop = true;
      forLoopCounter++;
      int limit15 = 1000;
      int offset15 = 0;
      int removedcount15 = 0;
      Object[] array36 = list36.toArray();
      for(int i36 = 0; i36 < array36.length; i36++)
      { 
        String ve3 = (String)array36[i36];
        if(limit15 <= 0)
        { 
          list36.remove(i36 - removedcount15);
          removedcount15++;
        }
        limit15--;
      }
      int separatorindex15 = 0;
      Object[] array37 = list36.toArray();
      for(int i37 = 0; i37 < array37.length; i37++)
      { 
        String ve3 = (String)array37[i37];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp38 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp38.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp38.getId().toString();
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
        String tmpstring29;
        try
        { 
          tmpstring29 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring29 = "";
        }
        out.print(tmpstring29);
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
      out.print("<label for=\"" + label80 + "\" " + "" + ">");
      String tmpstring27;
      try
      { 
        tmpstring27 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Parents: ") : utils.HTMLFilter.filter(String.valueOf("Parents: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring27 = "";
      }
      out.print(tmpstring27);
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
      String temp36 = ident + "input33" + uniqueid;
      java.util.List<String> messagesList11 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve14 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp36))
        { 
          ve14.add(ve);
        }
      }
      for(utils.ValidationException ve : ve14)
      { 
        messagesList11.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList11.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp36 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp36 + "\"" + (" class=\"" + "select" + (" " + "inputparents") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter0 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter0.hasNext())
        { 
          exampleapp.domain.Person person21 = (exampleapp.domain.Person)iter0.next();
          out.print("<option value=\"" + person21.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp36) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp36))
              { 
                if(elem.equals(String.valueOf(person21.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getParents() != null && temp3.setupForPropertyEvents(hibSession, out).getParents().contains(person21))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person21.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list35 = new java.util.ArrayList<String>(messagesList11);
        inForLoop = true;
        forLoopCounter++;
        int limit14 = 1000;
        int offset14 = 0;
        int removedcount14 = 0;
        Object[] array34 = list35.toArray();
        for(int i34 = 0; i34 < array34.length; i34++)
        { 
          String ve3 = (String)array34[i34];
          if(limit14 <= 0)
          { 
            list35.remove(i34 - removedcount14);
            removedcount14++;
          }
          limit14--;
        }
        int separatorindex14 = 0;
        Object[] array35 = list35.toArray();
        for(int i35 = 0; i35 < array35.length; i35++)
        { 
          String ve3 = (String)array35[i35];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp37 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp37.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp37.getId().toString();
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
          String tmpstring28;
          try
          { 
            tmpstring28 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring28 = "";
          }
          out.print(tmpstring28);
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
        out.print("<input type=\"hidden\" name=\"" + temp36 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp36 + "\"" + (" class=\"" + "select" + (" " + "inputparents") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter0 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter0.hasNext())
        { 
          exampleapp.domain.Person person21 = (exampleapp.domain.Person)iter0.next();
          out.print("<option value=\"" + person21.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp36) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp36))
              { 
                if(elem.equals(String.valueOf(person21.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getParents() != null && temp3.setupForPropertyEvents(hibSession, out).getParents().contains(person21))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person21.setupForPropertyEvents(hibSession, out).getName() + "</option>");
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
    String label81 = ident + "input34" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label81);
    java.util.List<String> messagesList14 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve17 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label81))
      { 
        ve17.add(ve);
      }
    }
    for(utils.ValidationException ve : ve17)
    { 
      messagesList14.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList14.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label81 + "\" " + "" + ">");
      String tmpstring30;
      try
      { 
        tmpstring30 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Children: ") : utils.HTMLFilter.filter(String.valueOf("Children: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring30 = "";
      }
      out.print(tmpstring30);
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
      String temp39 = ident + "input35" + uniqueid;
      java.util.List<String> messagesList13 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve16 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp39))
        { 
          ve16.add(ve);
        }
      }
      for(utils.ValidationException ve : ve16)
      { 
        messagesList13.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList13.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp39 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp39 + "\"" + (" class=\"" + "select" + (" " + "inputchildren") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter1 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter1.hasNext())
        { 
          exampleapp.domain.Person person31 = (exampleapp.domain.Person)iter1.next();
          out.print("<option value=\"" + person31.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp39) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp39))
              { 
                if(elem.equals(String.valueOf(person31.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getChildren() != null && temp3.setupForPropertyEvents(hibSession, out).getChildren().contains(person31))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person31.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list37 = new java.util.ArrayList<String>(messagesList13);
        inForLoop = true;
        forLoopCounter++;
        int limit16 = 1000;
        int offset16 = 0;
        int removedcount16 = 0;
        Object[] array38 = list37.toArray();
        for(int i38 = 0; i38 < array38.length; i38++)
        { 
          String ve3 = (String)array38[i38];
          if(limit16 <= 0)
          { 
            list37.remove(i38 - removedcount16);
            removedcount16++;
          }
          limit16--;
        }
        int separatorindex16 = 0;
        Object[] array39 = list37.toArray();
        for(int i39 = 0; i39 < array39.length; i39++)
        { 
          String ve3 = (String)array39[i39];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp40 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp40.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp40.getId().toString();
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
          String tmpstring31;
          try
          { 
            tmpstring31 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring31 = "";
          }
          out.print(tmpstring31);
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
        out.print("<input type=\"hidden\" name=\"" + temp39 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp39 + "\"" + (" class=\"" + "select" + (" " + "inputchildren") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter1 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter1.hasNext())
        { 
          exampleapp.domain.Person person31 = (exampleapp.domain.Person)iter1.next();
          out.print("<option value=\"" + person31.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp39) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp39))
              { 
                if(elem.equals(String.valueOf(person31.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getChildren() != null && temp3.setupForPropertyEvents(hibSession, out).getChildren().contains(person31))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person31.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list38 = new java.util.ArrayList<String>(messagesList14);
      inForLoop = true;
      forLoopCounter++;
      int limit17 = 1000;
      int offset17 = 0;
      int removedcount17 = 0;
      Object[] array40 = list38.toArray();
      for(int i40 = 0; i40 < array40.length; i40++)
      { 
        String ve3 = (String)array40[i40];
        if(limit17 <= 0)
        { 
          list38.remove(i40 - removedcount17);
          removedcount17++;
        }
        limit17--;
      }
      int separatorindex17 = 0;
      Object[] array41 = list38.toArray();
      for(int i41 = 0; i41 < array41.length; i41++)
      { 
        String ve3 = (String)array41[i41];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp41 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp41.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp41.getId().toString();
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
        String tmpstring32;
        try
        { 
          tmpstring32 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring32 = "";
        }
        out.print(tmpstring32);
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
      out.print("<label for=\"" + label81 + "\" " + "" + ">");
      String tmpstring30;
      try
      { 
        tmpstring30 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Children: ") : utils.HTMLFilter.filter(String.valueOf("Children: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring30 = "";
      }
      out.print(tmpstring30);
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
      String temp39 = ident + "input35" + uniqueid;
      java.util.List<String> messagesList13 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve16 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp39))
        { 
          ve16.add(ve);
        }
      }
      for(utils.ValidationException ve : ve16)
      { 
        messagesList13.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList13.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp39 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp39 + "\"" + (" class=\"" + "select" + (" " + "inputchildren") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter1 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter1.hasNext())
        { 
          exampleapp.domain.Person person31 = (exampleapp.domain.Person)iter1.next();
          out.print("<option value=\"" + person31.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp39) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp39))
              { 
                if(elem.equals(String.valueOf(person31.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getChildren() != null && temp3.setupForPropertyEvents(hibSession, out).getChildren().contains(person31))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person31.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list37 = new java.util.ArrayList<String>(messagesList13);
        inForLoop = true;
        forLoopCounter++;
        int limit16 = 1000;
        int offset16 = 0;
        int removedcount16 = 0;
        Object[] array38 = list37.toArray();
        for(int i38 = 0; i38 < array38.length; i38++)
        { 
          String ve3 = (String)array38[i38];
          if(limit16 <= 0)
          { 
            list37.remove(i38 - removedcount16);
            removedcount16++;
          }
          limit16--;
        }
        int separatorindex16 = 0;
        Object[] array39 = list37.toArray();
        for(int i39 = 0; i39 < array39.length; i39++)
        { 
          String ve3 = (String)array39[i39];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp40 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp40.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp40.getId().toString();
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
          String tmpstring31;
          try
          { 
            tmpstring31 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring31 = "";
          }
          out.print(tmpstring31);
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
        out.print("<input type=\"hidden\" name=\"" + temp39 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp39 + "\"" + (" class=\"" + "select" + (" " + "inputchildren") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("multiple=\"multiple\">");
        java.util.Iterator iter1 = hibSession.createQuery("from " + "exampleapp.domain.Person").list().iterator();
        while(iter1.hasNext())
        { 
          exampleapp.domain.Person person31 = (exampleapp.domain.Person)iter1.next();
          out.print("<option value=\"" + person31.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammapvalues().get(temp39) != null)
            { 
              for(String elem : ThreadLocalPage.get().getParammapvalues().get(temp39))
              { 
                if(elem.equals(String.valueOf(person31.getId())))
                { 
                  out.print("selected=\"selected\"");
                }
              }
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getChildren() != null && temp3.setupForPropertyEvents(hibSession, out).getChildren().contains(person31))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + person31.setupForPropertyEvents(hibSession, out).getName() + "</option>");
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
    String label82 = ident + "input36" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label82);
    java.util.List<String> messagesList16 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve19 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label82))
      { 
        ve19.add(ve);
      }
    }
    for(utils.ValidationException ve : ve19)
    { 
      messagesList16.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList16.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label82 + "\" " + "" + ">");
      String tmpstring33;
      try
      { 
        tmpstring33 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Photo: ") : utils.HTMLFilter.filter(String.valueOf("Photo: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring33 = "";
      }
      out.print(tmpstring33);
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
      String temp42 = ident + "input37" + uniqueid;
      java.util.List<String> messagesList15 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve18 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp42))
        { 
          ve18.add(ve);
        }
      }
      for(utils.ValidationException ve : ve18)
      { 
        messagesList15.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList15.size() > 0)
      { 
        out.print("<input name=\"" + temp42 + "\" type=\"file\"" + (" class=\"" + "inputFile" + (" " + "inputphoto") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("/>");
        java.util.ArrayList<String> list39 = new java.util.ArrayList<String>(messagesList15);
        inForLoop = true;
        forLoopCounter++;
        int limit18 = 1000;
        int offset18 = 0;
        int removedcount18 = 0;
        Object[] array42 = list39.toArray();
        for(int i42 = 0; i42 < array42.length; i42++)
        { 
          String ve3 = (String)array42[i42];
          if(limit18 <= 0)
          { 
            list39.remove(i42 - removedcount18);
            removedcount18++;
          }
          limit18--;
        }
        int separatorindex18 = 0;
        Object[] array43 = list39.toArray();
        for(int i43 = 0; i43 < array43.length; i43++)
        { 
          String ve3 = (String)array43[i43];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp43 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp43.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp43.getId().toString();
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
          String tmpstring34;
          try
          { 
            tmpstring34 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring34 = "";
          }
          out.print(tmpstring34);
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
        out.print("<input name=\"" + temp42 + "\" type=\"file\"" + (" class=\"" + "inputFile" + (" " + "inputphoto") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("/>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list40 = new java.util.ArrayList<String>(messagesList16);
      inForLoop = true;
      forLoopCounter++;
      int limit19 = 1000;
      int offset19 = 0;
      int removedcount19 = 0;
      Object[] array44 = list40.toArray();
      for(int i44 = 0; i44 < array44.length; i44++)
      { 
        String ve3 = (String)array44[i44];
        if(limit19 <= 0)
        { 
          list40.remove(i44 - removedcount19);
          removedcount19++;
        }
        limit19--;
      }
      int separatorindex19 = 0;
      Object[] array45 = list40.toArray();
      for(int i45 = 0; i45 < array45.length; i45++)
      { 
        String ve3 = (String)array45[i45];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp44 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp44.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp44.getId().toString();
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
        String tmpstring35;
        try
        { 
          tmpstring35 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring35 = "";
        }
        out.print(tmpstring35);
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
      out.print("<label for=\"" + label82 + "\" " + "" + ">");
      String tmpstring33;
      try
      { 
        tmpstring33 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Photo: ") : utils.HTMLFilter.filter(String.valueOf("Photo: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring33 = "";
      }
      out.print(tmpstring33);
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
      String temp42 = ident + "input37" + uniqueid;
      java.util.List<String> messagesList15 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve18 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp42))
        { 
          ve18.add(ve);
        }
      }
      for(utils.ValidationException ve : ve18)
      { 
        messagesList15.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList15.size() > 0)
      { 
        out.print("<input name=\"" + temp42 + "\" type=\"file\"" + (" class=\"" + "inputFile" + (" " + "inputphoto") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("/>");
        java.util.ArrayList<String> list39 = new java.util.ArrayList<String>(messagesList15);
        inForLoop = true;
        forLoopCounter++;
        int limit18 = 1000;
        int offset18 = 0;
        int removedcount18 = 0;
        Object[] array42 = list39.toArray();
        for(int i42 = 0; i42 < array42.length; i42++)
        { 
          String ve3 = (String)array42[i42];
          if(limit18 <= 0)
          { 
            list39.remove(i42 - removedcount18);
            removedcount18++;
          }
          limit18--;
        }
        int separatorindex18 = 0;
        Object[] array43 = list39.toArray();
        for(int i43 = 0; i43 < array43.length; i43++)
        { 
          String ve3 = (String)array43[i43];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp43 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp43.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp43.getId().toString();
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
          String tmpstring34;
          try
          { 
            tmpstring34 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring34 = "";
          }
          out.print(tmpstring34);
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
        out.print("<input name=\"" + temp42 + "\" type=\"file\"" + (" class=\"" + "inputFile" + (" " + "inputphoto") + "\" " + "" + " "));
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
    String label83 = ident + "input38" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label83);
    java.util.List<String> messagesList18 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve21 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label83))
      { 
        ve21.add(ve);
      }
    }
    for(utils.ValidationException ve : ve21)
    { 
      messagesList18.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList18.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label83 + "\" " + "" + ">");
      String tmpstring36;
      try
      { 
        tmpstring36 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Admin: ") : utils.HTMLFilter.filter(String.valueOf("Admin: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring36 = "";
      }
      out.print(tmpstring36);
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
      String temp45 = ident + "input39" + uniqueid;
      java.util.List<String> messagesList17 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve20 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp45))
        { 
          ve20.add(ve);
        }
      }
      for(utils.ValidationException ve : ve20)
      { 
        messagesList17.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList17.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp45 + "_isinput" + "\" />");
        out.print("<input type=\"checkbox\"");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("name=\"" + temp45 + "\"" + (" class=\"" + "inputBool" + (" " + "inputadmin") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          if(ThreadLocalPage.get().getParammap().get(temp45) != null)
          { 
            out.print(" checked=\"true\" ");
          }
        }
        else
        { 
          if(temp3.setupForPropertyEvents(hibSession, out).getAdmin())
          { 
            out.print(" checked=\"true\" ");
          }
        }
        out.print(" />");
        java.util.ArrayList<String> list41 = new java.util.ArrayList<String>(messagesList17);
        inForLoop = true;
        forLoopCounter++;
        int limit20 = 1000;
        int offset20 = 0;
        int removedcount20 = 0;
        Object[] array46 = list41.toArray();
        for(int i46 = 0; i46 < array46.length; i46++)
        { 
          String ve3 = (String)array46[i46];
          if(limit20 <= 0)
          { 
            list41.remove(i46 - removedcount20);
            removedcount20++;
          }
          limit20--;
        }
        int separatorindex20 = 0;
        Object[] array47 = list41.toArray();
        for(int i47 = 0; i47 < array47.length; i47++)
        { 
          String ve3 = (String)array47[i47];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp46 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp46.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp46.getId().toString();
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
          String tmpstring37;
          try
          { 
            tmpstring37 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring37 = "";
          }
          out.print(tmpstring37);
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
        out.print("<input type=\"hidden\" name=\"" + temp45 + "_isinput" + "\" />");
        out.print("<input type=\"checkbox\"");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("name=\"" + temp45 + "\"" + (" class=\"" + "inputBool" + (" " + "inputadmin") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          if(ThreadLocalPage.get().getParammap().get(temp45) != null)
          { 
            out.print(" checked=\"true\" ");
          }
        }
        else
        { 
          if(temp3.setupForPropertyEvents(hibSession, out).getAdmin())
          { 
            out.print(" checked=\"true\" ");
          }
        }
        out.print(" />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list42 = new java.util.ArrayList<String>(messagesList18);
      inForLoop = true;
      forLoopCounter++;
      int limit21 = 1000;
      int offset21 = 0;
      int removedcount21 = 0;
      Object[] array48 = list42.toArray();
      for(int i48 = 0; i48 < array48.length; i48++)
      { 
        String ve3 = (String)array48[i48];
        if(limit21 <= 0)
        { 
          list42.remove(i48 - removedcount21);
          removedcount21++;
        }
        limit21--;
      }
      int separatorindex21 = 0;
      Object[] array49 = list42.toArray();
      for(int i49 = 0; i49 < array49.length; i49++)
      { 
        String ve3 = (String)array49[i49];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp47 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp47.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp47.getId().toString();
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
        String tmpstring38;
        try
        { 
          tmpstring38 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring38 = "";
        }
        out.print(tmpstring38);
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
      out.print("<label for=\"" + label83 + "\" " + "" + ">");
      String tmpstring36;
      try
      { 
        tmpstring36 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Admin: ") : utils.HTMLFilter.filter(String.valueOf("Admin: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring36 = "";
      }
      out.print(tmpstring36);
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
      String temp45 = ident + "input39" + uniqueid;
      java.util.List<String> messagesList17 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve20 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp45))
        { 
          ve20.add(ve);
        }
      }
      for(utils.ValidationException ve : ve20)
      { 
        messagesList17.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList17.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp45 + "_isinput" + "\" />");
        out.print("<input type=\"checkbox\"");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("name=\"" + temp45 + "\"" + (" class=\"" + "inputBool" + (" " + "inputadmin") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          if(ThreadLocalPage.get().getParammap().get(temp45) != null)
          { 
            out.print(" checked=\"true\" ");
          }
        }
        else
        { 
          if(temp3.setupForPropertyEvents(hibSession, out).getAdmin())
          { 
            out.print(" checked=\"true\" ");
          }
        }
        out.print(" />");
        java.util.ArrayList<String> list41 = new java.util.ArrayList<String>(messagesList17);
        inForLoop = true;
        forLoopCounter++;
        int limit20 = 1000;
        int offset20 = 0;
        int removedcount20 = 0;
        Object[] array46 = list41.toArray();
        for(int i46 = 0; i46 < array46.length; i46++)
        { 
          String ve3 = (String)array46[i46];
          if(limit20 <= 0)
          { 
            list41.remove(i46 - removedcount20);
            removedcount20++;
          }
          limit20--;
        }
        int separatorindex20 = 0;
        Object[] array47 = list41.toArray();
        for(int i47 = 0; i47 < array47.length; i47++)
        { 
          String ve3 = (String)array47[i47];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp46 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp46.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp46.getId().toString();
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
          String tmpstring37;
          try
          { 
            tmpstring37 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring37 = "";
          }
          out.print(tmpstring37);
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
        out.print("<input type=\"hidden\" name=\"" + temp45 + "_isinput" + "\" />");
        out.print("<input type=\"checkbox\"");
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print("name=\"" + temp45 + "\"" + (" class=\"" + "inputBool" + (" " + "inputadmin") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inSubmittedForm())
        { 
          if(ThreadLocalPage.get().getParammap().get(temp45) != null)
          { 
            out.print(" checked=\"true\" ");
          }
        }
        else
        { 
          if(temp3.setupForPropertyEvents(hibSession, out).getAdmin())
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
    String label84 = ident + "input40" + uniqueid;
    ThreadLocalPage.get().enterLabelContext(label84);
    java.util.List<String> messagesList20 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve23 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(label84))
      { 
        ve23.add(ve);
      }
    }
    for(utils.ValidationException ve : ve23)
    { 
      messagesList20.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList20.size() > 0)
    { 
      ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
      ThreadLocalPage.get().columnContextsCheckEnter(out);
      out.print("<label for=\"" + label84 + "\" " + "" + ">");
      String tmpstring39;
      try
      { 
        tmpstring39 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Favorite color: ") : utils.HTMLFilter.filter(String.valueOf("Favorite color: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring39 = "";
      }
      out.print(tmpstring39);
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
      String temp48 = ident + "input41" + uniqueid;
      java.util.List<String> messagesList19 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve22 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp48))
        { 
          ve22.add(ve);
        }
      }
      for(utils.ValidationException ve : ve22)
      { 
        messagesList19.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList19.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp48 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp48 + "\"" + (" class=\"" + "select" + (" " + "inputfavoriteColor") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        out.print("<option value=\"none\"></option>");
        java.util.Iterator iter2 = hibSession.createQuery("from " + "exampleapp.domain.Color").list().iterator();
        while(iter2.hasNext())
        { 
          exampleapp.domain.Color color21 = (exampleapp.domain.Color)iter2.next();
          out.print("<option value=\"" + color21.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammap().get(temp48) != null && ThreadLocalPage.get().getParammap().get(temp48).equals(String.valueOf(color21.getId())))
            { 
              out.print("selected=\"selected\"");
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getFavoriteColor() != null && temp3.setupForPropertyEvents(hibSession, out).getFavoriteColor().getId().equals(color21.getId()))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + color21.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list43 = new java.util.ArrayList<String>(messagesList19);
        inForLoop = true;
        forLoopCounter++;
        int limit22 = 1000;
        int offset22 = 0;
        int removedcount22 = 0;
        Object[] array50 = list43.toArray();
        for(int i50 = 0; i50 < array50.length; i50++)
        { 
          String ve3 = (String)array50[i50];
          if(limit22 <= 0)
          { 
            list43.remove(i50 - removedcount22);
            removedcount22++;
          }
          limit22--;
        }
        int separatorindex22 = 0;
        Object[] array51 = list43.toArray();
        for(int i51 = 0; i51 < array51.length; i51++)
        { 
          String ve3 = (String)array51[i51];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp49 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp49.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp49.getId().toString();
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
          String tmpstring40;
          try
          { 
            tmpstring40 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring40 = "";
          }
          out.print(tmpstring40);
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
        out.print("<input type=\"hidden\" name=\"" + temp48 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp48 + "\"" + (" class=\"" + "select" + (" " + "inputfavoriteColor") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        out.print("<option value=\"none\"></option>");
        java.util.Iterator iter2 = hibSession.createQuery("from " + "exampleapp.domain.Color").list().iterator();
        while(iter2.hasNext())
        { 
          exampleapp.domain.Color color21 = (exampleapp.domain.Color)iter2.next();
          out.print("<option value=\"" + color21.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammap().get(temp48) != null && ThreadLocalPage.get().getParammap().get(temp48).equals(String.valueOf(color21.getId())))
            { 
              out.print("selected=\"selected\"");
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getFavoriteColor() != null && temp3.setupForPropertyEvents(hibSession, out).getFavoriteColor().getId().equals(color21.getId()))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + color21.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().columnContextsCheckLeave(out);
      ThreadLocalPage.get().formGroupContextsCheckLeave(out);
      java.util.ArrayList<String> list44 = new java.util.ArrayList<String>(messagesList20);
      inForLoop = true;
      forLoopCounter++;
      int limit23 = 1000;
      int offset23 = 0;
      int removedcount23 = 0;
      Object[] array52 = list44.toArray();
      for(int i52 = 0; i52 < array52.length; i52++)
      { 
        String ve3 = (String)array52[i52];
        if(limit23 <= 0)
        { 
          list44.remove(i52 - removedcount23);
          removedcount23++;
        }
        limit23--;
      }
      int separatorindex23 = 0;
      Object[] array53 = list44.toArray();
      for(int i53 = 0; i53 < array53.length; i53++)
      { 
        String ve3 = (String)array53[i53];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve3))
        { 
          WebDSLEntity temp50 = (WebDSLEntity)(Object)ve3;
          forelementcounter = temp50.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp50.getId().toString();
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
        String tmpstring41;
        try
        { 
          tmpstring41 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
        }
        catch(NullPointerException npe)
        { 
          tmpstring41 = "";
        }
        out.print(tmpstring41);
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
      out.print("<label for=\"" + label84 + "\" " + "" + ">");
      String tmpstring39;
      try
      { 
        tmpstring39 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Favorite color: ") : utils.HTMLFilter.filter(String.valueOf("Favorite color: "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring39 = "";
      }
      out.print(tmpstring39);
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
      String temp48 = ident + "input41" + uniqueid;
      java.util.List<String> messagesList19 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve22 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(temp48))
        { 
          ve22.add(ve);
        }
      }
      for(utils.ValidationException ve : ve22)
      { 
        messagesList19.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList19.size() > 0)
      { 
        out.print("<input type=\"hidden\" name=\"" + temp48 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp48 + "\"" + (" class=\"" + "select" + (" " + "inputfavoriteColor") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        out.print("<option value=\"none\"></option>");
        java.util.Iterator iter2 = hibSession.createQuery("from " + "exampleapp.domain.Color").list().iterator();
        while(iter2.hasNext())
        { 
          exampleapp.domain.Color color21 = (exampleapp.domain.Color)iter2.next();
          out.print("<option value=\"" + color21.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammap().get(temp48) != null && ThreadLocalPage.get().getParammap().get(temp48).equals(String.valueOf(color21.getId())))
            { 
              out.print("selected=\"selected\"");
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getFavoriteColor() != null && temp3.setupForPropertyEvents(hibSession, out).getFavoriteColor().getId().equals(color21.getId()))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + color21.setupForPropertyEvents(hibSession, out).getName() + "</option>");
        }
        out.print("</select>");
        java.util.ArrayList<String> list43 = new java.util.ArrayList<String>(messagesList19);
        inForLoop = true;
        forLoopCounter++;
        int limit22 = 1000;
        int offset22 = 0;
        int removedcount22 = 0;
        Object[] array50 = list43.toArray();
        for(int i50 = 0; i50 < array50.length; i50++)
        { 
          String ve3 = (String)array50[i50];
          if(limit22 <= 0)
          { 
            list43.remove(i50 - removedcount22);
            removedcount22++;
          }
          limit22--;
        }
        int separatorindex22 = 0;
        Object[] array51 = list43.toArray();
        for(int i51 = 0; i51 < array51.length; i51++)
        { 
          String ve3 = (String)array51[i51];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp49 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp49.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp49.getId().toString();
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
          String tmpstring40;
          try
          { 
            tmpstring40 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring40 = "";
          }
          out.print(tmpstring40);
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
        out.print("<input type=\"hidden\" name=\"" + temp48 + "_isinput" + "\" />");
        out.print("<select name=\"" + temp48 + "\"" + (" class=\"" + "select" + (" " + "inputfavoriteColor") + "\" " + "" + " "));
        if(ThreadLocalPage.get().inLabelContext())
        { 
          out.print(" id=\"" + ThreadLocalPage.get().getLabelString() + "\" ");
        }
        out.print(">");
        out.print("<option value=\"none\"></option>");
        java.util.Iterator iter2 = hibSession.createQuery("from " + "exampleapp.domain.Color").list().iterator();
        while(iter2.hasNext())
        { 
          exampleapp.domain.Color color21 = (exampleapp.domain.Color)iter2.next();
          out.print("<option value=\"" + color21.getId() + "\"");
          if(ThreadLocalPage.get().inSubmittedForm())
          { 
            if(ThreadLocalPage.get().getParammap().get(temp48) != null && ThreadLocalPage.get().getParammap().get(temp48).equals(String.valueOf(color21.getId())))
            { 
              out.print("selected=\"selected\"");
            }
          }
          else
          { 
            if(temp3.setupForPropertyEvents(hibSession, out).getFavoriteColor() != null && temp3.setupForPropertyEvents(hibSession, out).getFavoriteColor().getId().equals(color21.getId()))
            { 
              out.print("selected=\"selected\"");
            }
          }
          out.print(">" + color21.setupForPropertyEvents(hibSession, out).getName() + "</option>");
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
    ident = (inForLoop ? forelementcounter : "") + ("action6" + uniqueid + "");
    java.util.List<String> messagesList22 = new java.util.LinkedList<String>();
    java.util.List<utils.ValidationException> ve25 = new java.util.LinkedList<utils.ValidationException>();
    for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
    { 
      if(ve.getName() != null && ve.getName().equals(ident))
      { 
        ve25.add(ve);
      }
    }
    for(utils.ValidationException ve : ve25)
    { 
      messagesList22.add(ve.getErrorMessage());
      ThreadLocalPage.get().getValidationExceptions().remove(ve);
    }
    if(messagesList22.size() > 0)
    { 
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
      java.util.ArrayList<String> list46 = new java.util.ArrayList<String>(messagesList22);
      inForLoop = true;
      forLoopCounter++;
      int limit25 = 1000;
      int offset25 = 0;
      int removedcount25 = 0;
      Object[] array56 = list46.toArray();
      for(int i56 = 0; i56 < array56.length; i56++)
      { 
        String ve1 = (String)array56[i56];
        if(limit25 <= 0)
        { 
          list46.remove(i56 - removedcount25);
          removedcount25++;
        }
        limit25--;
      }
      int separatorindex25 = 0;
      Object[] array57 = list46.toArray();
      for(int i57 = 0; i57 < array57.length; i57++)
      { 
        String ve1 = (String)array57[i57];
        fallbackcounter += 1;
        if(WebDSLEntity.class.isInstance(ve1))
        { 
          WebDSLEntity temp52 = (WebDSLEntity)(Object)ve1;
          forelementcounter = temp52.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp52.getId().toString();
        }
        else
          forelementcounter = Integer.toString(fallbackcounter);
        ThreadLocalPage.get().enterTemplateContext(forelementcounter);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring45;
        try
        { 
          tmpstring45 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
        }
        catch(NullPointerException npe)
        { 
          tmpstring45 = "";
        }
        out.print(tmpstring45);
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
        java.util.List<String> messagesList21 = new java.util.LinkedList<String>();
        java.util.List<utils.ValidationException> ve24 = new java.util.LinkedList<utils.ValidationException>();
        for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
        { 
          if(ve.getName() != null && ve.getName().equals(ident))
          { 
            ve24.add(ve);
          }
        }
        for(utils.ValidationException ve : ve24)
        { 
          messagesList21.add(ve.getErrorMessage());
          ThreadLocalPage.get().getValidationExceptions().remove(ve);
        }
        if(messagesList21.size() > 0)
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
          java.util.ArrayList<String> list45 = new java.util.ArrayList<String>(messagesList21);
          inForLoop = true;
          forLoopCounter++;
          int limit24 = 1000;
          int offset24 = 0;
          int removedcount24 = 0;
          Object[] array54 = list45.toArray();
          for(int i54 = 0; i54 < array54.length; i54++)
          { 
            String ve1 = (String)array54[i54];
            if(limit24 <= 0)
            { 
              list45.remove(i54 - removedcount24);
              removedcount24++;
            }
            limit24--;
          }
          int separatorindex24 = 0;
          Object[] array55 = list45.toArray();
          for(int i55 = 0; i55 < array55.length; i55++)
          { 
            String ve1 = (String)array55[i55];
            fallbackcounter += 1;
            if(WebDSLEntity.class.isInstance(ve1))
            { 
              WebDSLEntity temp51 = (WebDSLEntity)(Object)ve1;
              forelementcounter = temp51.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp51.getId().toString();
            }
            else
              forelementcounter = Integer.toString(fallbackcounter);
            ThreadLocalPage.get().enterTemplateContext(forelementcounter);
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring44;
            try
            { 
              tmpstring44 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
            }
            catch(NullPointerException npe)
            { 
              tmpstring44 = "";
            }
            out.print(tmpstring44);
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
      String tmpstring43;
      try
      { 
        tmpstring43 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Save") : utils.HTMLFilter.filter(String.valueOf("Save"));
      }
      catch(NullPointerException npe)
      { 
        tmpstring43 = "";
      }
      out.print(tmpstring43);
      out.print("\" " + ("class" + "='" + "button" + "' ") + " />");
      out.print("</div>");
      ThreadLocalPage.get().commonContextsCheckLeave(out);
    }
    else
    { 
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        java.util.List<String> messagesList21 = new java.util.LinkedList<String>();
        java.util.List<utils.ValidationException> ve24 = new java.util.LinkedList<utils.ValidationException>();
        for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
        { 
          if(ve.getName() != null && ve.getName().equals(ident))
          { 
            ve24.add(ve);
          }
        }
        for(utils.ValidationException ve : ve24)
        { 
          messagesList21.add(ve.getErrorMessage());
          ThreadLocalPage.get().getValidationExceptions().remove(ve);
        }
        if(messagesList21.size() > 0)
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
          java.util.ArrayList<String> list45 = new java.util.ArrayList<String>(messagesList21);
          inForLoop = true;
          forLoopCounter++;
          int limit24 = 1000;
          int offset24 = 0;
          int removedcount24 = 0;
          Object[] array54 = list45.toArray();
          for(int i54 = 0; i54 < array54.length; i54++)
          { 
            String ve1 = (String)array54[i54];
            if(limit24 <= 0)
            { 
              list45.remove(i54 - removedcount24);
              removedcount24++;
            }
            limit24--;
          }
          int separatorindex24 = 0;
          Object[] array55 = list45.toArray();
          for(int i55 = 0; i55 < array55.length; i55++)
          { 
            String ve1 = (String)array55[i55];
            fallbackcounter += 1;
            if(WebDSLEntity.class.isInstance(ve1))
            { 
              WebDSLEntity temp51 = (WebDSLEntity)(Object)ve1;
              forelementcounter = temp51.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp51.getId().toString();
            }
            else
              forelementcounter = Integer.toString(fallbackcounter);
            ThreadLocalPage.get().enterTemplateContext(forelementcounter);
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring44;
            try
            { 
              tmpstring44 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
            }
            catch(NullPointerException npe)
            { 
              tmpstring44 = "";
            }
            out.print(tmpstring44);
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
      String tmpstring43;
      try
      { 
        tmpstring43 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Save") : utils.HTMLFilter.filter(String.valueOf("Save"));
      }
      catch(NullPointerException npe)
      { 
        tmpstring43 = "";
      }
      out.print(tmpstring43);
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
    this.out.write(stringwriter0.toString());
    out = out0;
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
    ident += "form12" + uniqueid;
    ThreadLocalPage.get().setFormIdent(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    ident = (inForLoop ? forelementcounter : "") + ("action6" + uniqueid + "");
    if(ThreadLocalPage.get().getParammap().get(ident) != null)
    { 
      save7 temp = (save7)env.getAction("save7");
      temp.save7(ident);
    }
    ThreadLocalPage.get().commonContextsCheckLeave(out);
  }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { 
    env.putAction("save7", new save7()
                           { 
                             boolean isRedirected = false;

                             public void setIsRedirected(boolean b)
                             { 
                               isRedirected = b;
                             }

                             public void save7(String actionident)
                             { 
                               ThreadLocalAction.set(this);
                               if(!ThreadLocalPage.get().hasExecutedAction)
                               { 
                                 boolean actionFailed = false;
                                 ThreadLocalPage.get().hasExecutedAction = true;
                                 try
                                 { 
                                   temp3.setupForPropertyEvents(hibSession, out).validateSave();
                                   temp3.setVersion(1);
                                   hibSession.save(temp3);
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
    ident = ident + "input22" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input23" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        String temp20 = ThreadLocalPage.get().getParammap().get(ident);
        temp3.setupForPropertyEvents(hibSession, out).setFullname(temp20);
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
    ident = ident + "input24" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input25" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        String temp19 = ThreadLocalPage.get().getParammap().get(ident);
        if(temp19.equals("") && !true)
        { 
          throw new ValidationException(null, "Email address is required");
        }
        if(!(temp19.equals("") && true) && !temp19.matches("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)"))
        { 
          throw new ValidationException(null, "Not a valid email address");
        }
        temp3.setupForPropertyEvents(hibSession, out).setEmail(temp19);
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
    ident = ident + "input26" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input27" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        String temp18 = ThreadLocalPage.get().getParammap().get(ident);
        temp3.setupForPropertyEvents(hibSession, out).setUsername(temp18);
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
    ident = ident + "input28" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input29" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        String temp17 = ThreadLocalPage.get().getParammap().get(ident);
        temp3.setupForPropertyEvents(hibSession, out).setBio(temp17);
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
    ident = ident + "input30" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input31" + uniqueid;
      String dateval0 = ThreadLocalPage.get().getParammap().get(ident);
      java.util.Date temp16 = null;
      if(true && dateval0 != null && dateval0.equals(""))
      { 
        temp3.setupForPropertyEvents(hibSession, out).setDateOfBirth(temp16);
      }
      else
      { 
        if(dateval0 != null)
        { 
          ThreadLocalPage.get().enterValidationContext(ident);
          java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
          temp16 = sdf.parse(dateval0, new java.text.ParsePosition(0));
          if(temp16 == null)
          { 
            throw new ValidationException(null, "Required format is " + "dd/mm/yyyy");
          }
          temp3.setupForPropertyEvents(hibSession, out).setDateOfBirth(temp16);
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
    ident = ident + "input32" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input33" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident + "_isinput") != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        java.util.Set<exampleapp.domain.Person> temp15 = new java.util.HashSet<exampleapp.domain.Person>();
        if(ThreadLocalPage.get().getParammapvalues().get(ident) == null)
        { 
          Object[] array11 = temp3.setupForPropertyEvents(hibSession, out).getParents().toArray();
          for(int i11 = 0; i11 < array11.length; i11++)
          { 
            exampleapp.domain.Person temp14 = (exampleapp.domain.Person)array11[i11];
            temp3.setupForPropertyEvents(hibSession, out).removeFromParents(temp14);
          }
        }
        if(ThreadLocalPage.get().getParammapvalues().get(ident) != null)
        { 
          for(String elem : ThreadLocalPage.get().getParammapvalues().get(ident))
          { 
            exampleapp.domain.Person temp14 = (exampleapp.domain.Person)hibSession.load(exampleapp.domain.Person.class, java.util.UUID.fromString(elem));
            temp15.add(temp14);
          }
          Object[] array12 = temp3.setupForPropertyEvents(hibSession, out).getParents().toArray();
          for(int i12 = 0; i12 < array12.length; i12++)
          { 
            exampleapp.domain.Person temp14 = (exampleapp.domain.Person)array12[i12];
            if(!temp15.contains(temp14))
            { 
              temp3.setupForPropertyEvents(hibSession, out).removeFromParents(temp14);
            }
          }
          Object[] array13 = temp15.toArray();
          for(int i13 = 0; i13 < array13.length; i13++)
          { 
            exampleapp.domain.Person temp14 = (exampleapp.domain.Person)array13[i13];
            if(!temp3.setupForPropertyEvents(hibSession, out).getParents().contains(temp14))
            { 
              temp3.setupForPropertyEvents(hibSession, out).addToParents(temp14);
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
    ident = ident + "input34" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input35" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident + "_isinput") != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        java.util.Set<exampleapp.domain.Person> temp13 = new java.util.HashSet<exampleapp.domain.Person>();
        if(ThreadLocalPage.get().getParammapvalues().get(ident) == null)
        { 
          Object[] array8 = temp3.setupForPropertyEvents(hibSession, out).getChildren().toArray();
          for(int i8 = 0; i8 < array8.length; i8++)
          { 
            exampleapp.domain.Person temp12 = (exampleapp.domain.Person)array8[i8];
            temp3.setupForPropertyEvents(hibSession, out).removeFromChildren(temp12);
          }
        }
        if(ThreadLocalPage.get().getParammapvalues().get(ident) != null)
        { 
          for(String elem : ThreadLocalPage.get().getParammapvalues().get(ident))
          { 
            exampleapp.domain.Person temp12 = (exampleapp.domain.Person)hibSession.load(exampleapp.domain.Person.class, java.util.UUID.fromString(elem));
            temp13.add(temp12);
          }
          Object[] array9 = temp3.setupForPropertyEvents(hibSession, out).getChildren().toArray();
          for(int i9 = 0; i9 < array9.length; i9++)
          { 
            exampleapp.domain.Person temp12 = (exampleapp.domain.Person)array9[i9];
            if(!temp13.contains(temp12))
            { 
              temp3.setupForPropertyEvents(hibSession, out).removeFromChildren(temp12);
            }
          }
          Object[] array10 = temp13.toArray();
          for(int i10 = 0; i10 < array10.length; i10++)
          { 
            exampleapp.domain.Person temp12 = (exampleapp.domain.Person)array10[i10];
            if(!temp3.setupForPropertyEvents(hibSession, out).getChildren().contains(temp12))
            { 
              temp3.setupForPropertyEvents(hibSession, out).addToChildren(temp12);
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
    ident = ident + "input36" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input37" + uniqueid;
      if(ThreadLocalPage.get().getFileUploads().get(ident) != null && !ThreadLocalPage.get().getFileUploads().get(ident).getFileName().equals(""))
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        utils.File temp11 = ThreadLocalPage.get().getFileUploads().get(ident);
        temp3.setupForPropertyEvents(hibSession, out).setPhoto(temp11);
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
    ident = ident + "input38" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input39" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident + "_isinput") != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        if(ThreadLocalPage.get().getParammap().get(ident) != null)
        { 
          boolean temp10 = true;
          temp3.setupForPropertyEvents(hibSession, out).setAdmin(temp10);
        }
        else
        { 
          boolean temp10 = false;
          temp3.setupForPropertyEvents(hibSession, out).setAdmin(temp10);
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
    ident = ident + "input40" + uniqueid;
    ThreadLocalPage.get().enterValidationContext(ident);
    ident = "";
    if(inForLoop)
    { 
      ident += forelementcounter;
    }
    try
    { 
      ident += "input41" + uniqueid;
      if(ThreadLocalPage.get().getParammap().get(ident + "_isinput") != null)
      { 
        ThreadLocalPage.get().enterValidationContext(ident);
        if(ThreadLocalPage.get().getParammap().get(ident) != null)
        { 
          if(ThreadLocalPage.get().getParammap().get(ident).equals("none"))
          { 
            exampleapp.domain.Color temp9 = null;
            temp3.setupForPropertyEvents(hibSession, out).setFavoriteColor(temp9);
          }
          else
          { 
            exampleapp.domain.Color temp9 = (exampleapp.domain.Color)hibSession.load(exampleapp.domain.Color.class, java.util.UUID.fromString(ThreadLocalPage.get().getParammap().get(ident)));
            temp3.setupForPropertyEvents(hibSession, out).setFavoriteColor(temp9);
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