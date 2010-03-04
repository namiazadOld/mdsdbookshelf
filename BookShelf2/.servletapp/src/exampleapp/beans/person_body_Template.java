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

public class person_body_Template  implements TemplateServlet
{ 
  private exampleapp.domain.Person arg0;

  public exampleapp.domain.Person getArg0()
  { 
    return arg0;
  }

  public void setArg0(exampleapp.domain.Person arg0)
  { 
    this.arg0 = arg0;
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
          this.uniqueid = Encoders.encodeTemplateId("person_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("person_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("person_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("person_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getFullname(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input42" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getEmail(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input43" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getUsername(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input44" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getBio(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input45" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getDateOfBirth(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input46" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getParents(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input47" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getChildren(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input48" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getPhoto(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input49" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getAdmin(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input51" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input52" + uniqueid;
    }
    else
    { }
  }

  protected void initialize()
  { 
    arg0 = (exampleapp.domain.Person)env.getVariable("arg0");
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
    int sec1 = ThreadLocalPage.get().getSectionDepth();
    if(sec1 > 0)
    { 
      if(sec1 > 6)
      { 
        sec1 = 6;
      }
    }
    else
    { 
      sec1 = 1;
    }
    out.print("<h" + sec1);
    out.print(" class=\"header section" + sec1 + "\" " + "" + ">");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring46;
    try
    { 
      tmpstring46 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getName()));
    }
    catch(NullPointerException npe)
    { 
      tmpstring46 = "";
    }
    out.print(tmpstring46);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</h" + sec1 + ">");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<fieldset " + "" + "><legend>");
    String tmpstring80;
    try
    { 
      tmpstring80 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Details") : utils.HTMLFilter.filter(String.valueOf("Details"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring80 = "";
    }
    out.print(tmpstring80);
    out.print("</legend>");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<table " + "" + ">");
    ThreadLocalPage.get().enterTableContext();
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getFullname(), null))
    { 
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
      String label85 = ident + "input42" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label85);
      java.util.List<String> messagesList23 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve26 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label85))
        { 
          ve26.add(ve);
        }
      }
      for(utils.ValidationException ve : ve26)
      { 
        messagesList23.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList23.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label85 + "\" " + "" + ">");
        String tmpstring47;
        try
        { 
          tmpstring47 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Fullname: ") : utils.HTMLFilter.filter(String.valueOf("Fullname: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring47 = "";
        }
        out.print(tmpstring47);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring48;
        try
        { 
          tmpstring48 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getFullname()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getFullname()));
        }
        catch(NullPointerException npe)
        { 
          tmpstring48 = "";
        }
        out.print(tmpstring48);
        ThreadLocalPage.get().commonContextsCheckLeave(out);
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list53 = new java.util.ArrayList<String>(messagesList23);
        inForLoop = true;
        forLoopCounter++;
        int limit26 = 1000;
        int offset26 = 0;
        int removedcount26 = 0;
        Object[] array58 = list53.toArray();
        for(int i58 = 0; i58 < array58.length; i58++)
        { 
          String ve3 = (String)array58[i58];
          if(limit26 <= 0)
          { 
            list53.remove(i58 - removedcount26);
            removedcount26++;
          }
          limit26--;
        }
        int separatorindex26 = 0;
        Object[] array59 = list53.toArray();
        for(int i59 = 0; i59 < array59.length; i59++)
        { 
          String ve3 = (String)array59[i59];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp53 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp53.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp53.getId().toString();
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
          String tmpstring49;
          try
          { 
            tmpstring49 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring49 = "";
          }
          out.print(tmpstring49);
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
        out.print("<label for=\"" + label85 + "\" " + "" + ">");
        String tmpstring47;
        try
        { 
          tmpstring47 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Fullname: ") : utils.HTMLFilter.filter(String.valueOf("Fullname: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring47 = "";
        }
        out.print(tmpstring47);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring48;
        try
        { 
          tmpstring48 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getFullname()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getFullname()));
        }
        catch(NullPointerException npe)
        { 
          tmpstring48 = "";
        }
        out.print(tmpstring48);
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
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getEmail(), null))
    { 
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
      String label86 = ident + "input43" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label86);
      java.util.List<String> messagesList24 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve27 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label86))
        { 
          ve27.add(ve);
        }
      }
      for(utils.ValidationException ve : ve27)
      { 
        messagesList24.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList24.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label86 + "\" " + "" + ">");
        String tmpstring50;
        try
        { 
          tmpstring50 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Email: ") : utils.HTMLFilter.filter(String.valueOf("Email: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring50 = "";
        }
        out.print(tmpstring50);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring51;
        try
        { 
          tmpstring51 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getEmail()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getEmail()));
        }
        catch(NullPointerException npe)
        { 
          tmpstring51 = "";
        }
        out.print(tmpstring51);
        ThreadLocalPage.get().commonContextsCheckLeave(out);
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list54 = new java.util.ArrayList<String>(messagesList24);
        inForLoop = true;
        forLoopCounter++;
        int limit27 = 1000;
        int offset27 = 0;
        int removedcount27 = 0;
        Object[] array60 = list54.toArray();
        for(int i60 = 0; i60 < array60.length; i60++)
        { 
          String ve3 = (String)array60[i60];
          if(limit27 <= 0)
          { 
            list54.remove(i60 - removedcount27);
            removedcount27++;
          }
          limit27--;
        }
        int separatorindex27 = 0;
        Object[] array61 = list54.toArray();
        for(int i61 = 0; i61 < array61.length; i61++)
        { 
          String ve3 = (String)array61[i61];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp54 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp54.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp54.getId().toString();
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
          String tmpstring52;
          try
          { 
            tmpstring52 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring52 = "";
          }
          out.print(tmpstring52);
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
        out.print("<label for=\"" + label86 + "\" " + "" + ">");
        String tmpstring50;
        try
        { 
          tmpstring50 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Email: ") : utils.HTMLFilter.filter(String.valueOf("Email: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring50 = "";
        }
        out.print(tmpstring50);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring51;
        try
        { 
          tmpstring51 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getEmail()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getEmail()));
        }
        catch(NullPointerException npe)
        { 
          tmpstring51 = "";
        }
        out.print(tmpstring51);
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
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getUsername(), null))
    { 
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
      String label87 = ident + "input44" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label87);
      java.util.List<String> messagesList25 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve28 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label87))
        { 
          ve28.add(ve);
        }
      }
      for(utils.ValidationException ve : ve28)
      { 
        messagesList25.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList25.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label87 + "\" " + "" + ">");
        String tmpstring53;
        try
        { 
          tmpstring53 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Username: ") : utils.HTMLFilter.filter(String.valueOf("Username: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring53 = "";
        }
        out.print(tmpstring53);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring54;
        try
        { 
          tmpstring54 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getUsername()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getUsername()));
        }
        catch(NullPointerException npe)
        { 
          tmpstring54 = "";
        }
        out.print(tmpstring54);
        ThreadLocalPage.get().commonContextsCheckLeave(out);
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list55 = new java.util.ArrayList<String>(messagesList25);
        inForLoop = true;
        forLoopCounter++;
        int limit28 = 1000;
        int offset28 = 0;
        int removedcount28 = 0;
        Object[] array62 = list55.toArray();
        for(int i62 = 0; i62 < array62.length; i62++)
        { 
          String ve3 = (String)array62[i62];
          if(limit28 <= 0)
          { 
            list55.remove(i62 - removedcount28);
            removedcount28++;
          }
          limit28--;
        }
        int separatorindex28 = 0;
        Object[] array63 = list55.toArray();
        for(int i63 = 0; i63 < array63.length; i63++)
        { 
          String ve3 = (String)array63[i63];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp55 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp55.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp55.getId().toString();
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
          String tmpstring55;
          try
          { 
            tmpstring55 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring55 = "";
          }
          out.print(tmpstring55);
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
        out.print("<label for=\"" + label87 + "\" " + "" + ">");
        String tmpstring53;
        try
        { 
          tmpstring53 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Username: ") : utils.HTMLFilter.filter(String.valueOf("Username: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring53 = "";
        }
        out.print(tmpstring53);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring54;
        try
        { 
          tmpstring54 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getUsername()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getUsername()));
        }
        catch(NullPointerException npe)
        { 
          tmpstring54 = "";
        }
        out.print(tmpstring54);
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
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getBio(), null))
    { 
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
      String label88 = ident + "input45" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label88);
      java.util.List<String> messagesList26 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve29 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label88))
        { 
          ve29.add(ve);
        }
      }
      for(utils.ValidationException ve : ve29)
      { 
        messagesList26.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList26.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label88 + "\" " + "" + ">");
        String tmpstring56;
        try
        { 
          tmpstring56 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Bio: ") : utils.HTMLFilter.filter(String.valueOf("Bio: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring56 = "";
        }
        out.print(tmpstring56);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring57;
        try
        { 
          tmpstring57 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getBio()) : org.webdsl.tools.WikiFormatter.wikiFormat(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getBio()), ThreadLocalServlet.getContextPath());
        }
        catch(NullPointerException npe)
        { 
          tmpstring57 = "";
        }
        out.print(tmpstring57);
        ThreadLocalPage.get().commonContextsCheckLeave(out);
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list56 = new java.util.ArrayList<String>(messagesList26);
        inForLoop = true;
        forLoopCounter++;
        int limit29 = 1000;
        int offset29 = 0;
        int removedcount29 = 0;
        Object[] array64 = list56.toArray();
        for(int i64 = 0; i64 < array64.length; i64++)
        { 
          String ve3 = (String)array64[i64];
          if(limit29 <= 0)
          { 
            list56.remove(i64 - removedcount29);
            removedcount29++;
          }
          limit29--;
        }
        int separatorindex29 = 0;
        Object[] array65 = list56.toArray();
        for(int i65 = 0; i65 < array65.length; i65++)
        { 
          String ve3 = (String)array65[i65];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp56 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp56.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp56.getId().toString();
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
          String tmpstring58;
          try
          { 
            tmpstring58 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring58 = "";
          }
          out.print(tmpstring58);
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
        out.print("<label for=\"" + label88 + "\" " + "" + ">");
        String tmpstring56;
        try
        { 
          tmpstring56 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Bio: ") : utils.HTMLFilter.filter(String.valueOf("Bio: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring56 = "";
        }
        out.print(tmpstring56);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring57;
        try
        { 
          tmpstring57 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getBio()) : org.webdsl.tools.WikiFormatter.wikiFormat(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getBio()), ThreadLocalServlet.getContextPath());
        }
        catch(NullPointerException npe)
        { 
          tmpstring57 = "";
        }
        out.print(tmpstring57);
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
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getDateOfBirth(), null))
    { 
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
      String label89 = ident + "input46" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label89);
      java.util.List<String> messagesList27 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve30 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label89))
        { 
          ve30.add(ve);
        }
      }
      for(utils.ValidationException ve : ve30)
      { 
        messagesList27.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList27.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label89 + "\" " + "" + ">");
        String tmpstring59;
        try
        { 
          tmpstring59 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Date of birth: ") : utils.HTMLFilter.filter(String.valueOf("Date of birth: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring59 = "";
        }
        out.print(tmpstring59);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring60;
        try
        { 
          java.text.SimpleDateFormat formatter1 = new java.text.SimpleDateFormat("dd/MM/yyyy");
          StringBuffer buffer1 = new StringBuffer();
          formatter1.format(arg0.setupForPropertyEvents(hibSession, out).getDateOfBirth(), buffer1, new java.text.FieldPosition(0));
          tmpstring60 = buffer1.toString();
        }
        catch(NullPointerException npe)
        { 
          tmpstring60 = "";
        }
        out.print(tmpstring60);
        ThreadLocalPage.get().commonContextsCheckLeave(out);
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list57 = new java.util.ArrayList<String>(messagesList27);
        inForLoop = true;
        forLoopCounter++;
        int limit30 = 1000;
        int offset30 = 0;
        int removedcount30 = 0;
        Object[] array66 = list57.toArray();
        for(int i66 = 0; i66 < array66.length; i66++)
        { 
          String ve3 = (String)array66[i66];
          if(limit30 <= 0)
          { 
            list57.remove(i66 - removedcount30);
            removedcount30++;
          }
          limit30--;
        }
        int separatorindex30 = 0;
        Object[] array67 = list57.toArray();
        for(int i67 = 0; i67 < array67.length; i67++)
        { 
          String ve3 = (String)array67[i67];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp57 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp57.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp57.getId().toString();
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
          String tmpstring61;
          try
          { 
            tmpstring61 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring61 = "";
          }
          out.print(tmpstring61);
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
        out.print("<label for=\"" + label89 + "\" " + "" + ">");
        String tmpstring59;
        try
        { 
          tmpstring59 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Date of birth: ") : utils.HTMLFilter.filter(String.valueOf("Date of birth: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring59 = "";
        }
        out.print(tmpstring59);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring60;
        try
        { 
          java.text.SimpleDateFormat formatter1 = new java.text.SimpleDateFormat("dd/MM/yyyy");
          StringBuffer buffer1 = new StringBuffer();
          formatter1.format(arg0.setupForPropertyEvents(hibSession, out).getDateOfBirth(), buffer1, new java.text.FieldPosition(0));
          tmpstring60 = buffer1.toString();
        }
        catch(NullPointerException npe)
        { 
          tmpstring60 = "";
        }
        out.print(tmpstring60);
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
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getParents(), null))
    { 
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
      String label90 = ident + "input47" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label90);
      java.util.List<String> messagesList28 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve31 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label90))
        { 
          ve31.add(ve);
        }
      }
      for(utils.ValidationException ve : ve31)
      { 
        messagesList28.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList28.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label90 + "\" " + "" + ">");
        String tmpstring62;
        try
        { 
          tmpstring62 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Parents: ") : utils.HTMLFilter.filter(String.valueOf("Parents: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring62 = "";
        }
        out.print(tmpstring62);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<ul " + "" + ">");
        java.util.ArrayList<exampleapp.domain.Person> list58 = new java.util.ArrayList<exampleapp.domain.Person>(arg0.setupForPropertyEvents(hibSession, out).getParents());
        inForLoop = true;
        forLoopCounter++;
        int limit31 = 1000;
        int offset31 = 0;
        int removedcount31 = 0;
        Object[] array68 = list58.toArray();
        for(int i68 = 0; i68 < array68.length; i68++)
        { 
          exampleapp.domain.Person outputset02 = (exampleapp.domain.Person)array68[i68];
          if(limit31 <= 0)
          { 
            list58.remove(i68 - removedcount31);
            removedcount31++;
          }
          limit31--;
        }
        int separatorindex31 = 0;
        Object[] array69 = list58.toArray();
        for(int i69 = 0; i69 < array69.length; i69++)
        { 
          exampleapp.domain.Person outputset02 = (exampleapp.domain.Person)array69[i69];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(outputset02))
          { 
            WebDSLEntity temp58 = (WebDSLEntity)(Object)outputset02;
            forelementcounter = temp58.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp58.getId().toString();
          }
          else
            forelementcounter = Integer.toString(fallbackcounter);
          ThreadLocalPage.get().enterTemplateContext(forelementcounter);
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<li " + "" + ">");
          if(!org.webdsl.tools.Utils.equal(outputset02, null))
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<a href=\"");
            if(ThreadLocalEmailContext.inEmailContext())
            { 
              out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/person" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(outputset02.getNaturalId())), "Person")));
            }
            else
            { 
              out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/person" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(outputset02.getNaturalId())), "Person")));
            }
            out.print("\" " + ("class" + "='" + "outputparents" + "' ") + " class=\"navigate\">");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring63;
            try
            { 
              tmpstring63 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(outputset02.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(outputset02.setupForPropertyEvents(hibSession, out).getName()));
            }
            catch(NullPointerException npe)
            { 
              tmpstring63 = "";
            }
            out.print(tmpstring63);
            ThreadLocalPage.get().commonContextsCheckLeave(out);
            out.print("</a>");
            ThreadLocalPage.get().commonContextsCheckLeave(out);
          }
          else
          { }
          if(org.webdsl.tools.Utils.equal(outputset02, null))
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring64;
            try
            { 
              tmpstring64 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("null") : utils.HTMLFilter.filter(String.valueOf("null"));
            }
            catch(NullPointerException npe)
            { 
              tmpstring64 = "";
            }
            out.print(tmpstring64);
            ThreadLocalPage.get().commonContextsCheckLeave(out);
          }
          else
          { }
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
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list59 = new java.util.ArrayList<String>(messagesList28);
        inForLoop = true;
        forLoopCounter++;
        int limit32 = 1000;
        int offset32 = 0;
        int removedcount32 = 0;
        Object[] array70 = list59.toArray();
        for(int i70 = 0; i70 < array70.length; i70++)
        { 
          String ve3 = (String)array70[i70];
          if(limit32 <= 0)
          { 
            list59.remove(i70 - removedcount32);
            removedcount32++;
          }
          limit32--;
        }
        int separatorindex32 = 0;
        Object[] array71 = list59.toArray();
        for(int i71 = 0; i71 < array71.length; i71++)
        { 
          String ve3 = (String)array71[i71];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp59 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp59.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp59.getId().toString();
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
          String tmpstring65;
          try
          { 
            tmpstring65 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring65 = "";
          }
          out.print(tmpstring65);
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
        out.print("<label for=\"" + label90 + "\" " + "" + ">");
        String tmpstring62;
        try
        { 
          tmpstring62 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Parents: ") : utils.HTMLFilter.filter(String.valueOf("Parents: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring62 = "";
        }
        out.print(tmpstring62);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<ul " + "" + ">");
        java.util.ArrayList<exampleapp.domain.Person> list58 = new java.util.ArrayList<exampleapp.domain.Person>(arg0.setupForPropertyEvents(hibSession, out).getParents());
        inForLoop = true;
        forLoopCounter++;
        int limit31 = 1000;
        int offset31 = 0;
        int removedcount31 = 0;
        Object[] array68 = list58.toArray();
        for(int i68 = 0; i68 < array68.length; i68++)
        { 
          exampleapp.domain.Person outputset02 = (exampleapp.domain.Person)array68[i68];
          if(limit31 <= 0)
          { 
            list58.remove(i68 - removedcount31);
            removedcount31++;
          }
          limit31--;
        }
        int separatorindex31 = 0;
        Object[] array69 = list58.toArray();
        for(int i69 = 0; i69 < array69.length; i69++)
        { 
          exampleapp.domain.Person outputset02 = (exampleapp.domain.Person)array69[i69];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(outputset02))
          { 
            WebDSLEntity temp58 = (WebDSLEntity)(Object)outputset02;
            forelementcounter = temp58.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp58.getId().toString();
          }
          else
            forelementcounter = Integer.toString(fallbackcounter);
          ThreadLocalPage.get().enterTemplateContext(forelementcounter);
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<li " + "" + ">");
          if(!org.webdsl.tools.Utils.equal(outputset02, null))
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<a href=\"");
            if(ThreadLocalEmailContext.inEmailContext())
            { 
              out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/person" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(outputset02.getNaturalId())), "Person")));
            }
            else
            { 
              out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/person" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(outputset02.getNaturalId())), "Person")));
            }
            out.print("\" " + ("class" + "='" + "outputparents" + "' ") + " class=\"navigate\">");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring63;
            try
            { 
              tmpstring63 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(outputset02.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(outputset02.setupForPropertyEvents(hibSession, out).getName()));
            }
            catch(NullPointerException npe)
            { 
              tmpstring63 = "";
            }
            out.print(tmpstring63);
            ThreadLocalPage.get().commonContextsCheckLeave(out);
            out.print("</a>");
            ThreadLocalPage.get().commonContextsCheckLeave(out);
          }
          else
          { }
          if(org.webdsl.tools.Utils.equal(outputset02, null))
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring64;
            try
            { 
              tmpstring64 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("null") : utils.HTMLFilter.filter(String.valueOf("null"));
            }
            catch(NullPointerException npe)
            { 
              tmpstring64 = "";
            }
            out.print(tmpstring64);
            ThreadLocalPage.get().commonContextsCheckLeave(out);
          }
          else
          { }
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
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getChildren(), null))
    { 
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
      String label91 = ident + "input48" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label91);
      java.util.List<String> messagesList29 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve32 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label91))
        { 
          ve32.add(ve);
        }
      }
      for(utils.ValidationException ve : ve32)
      { 
        messagesList29.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList29.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label91 + "\" " + "" + ">");
        String tmpstring66;
        try
        { 
          tmpstring66 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Children: ") : utils.HTMLFilter.filter(String.valueOf("Children: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring66 = "";
        }
        out.print(tmpstring66);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<ul " + "" + ">");
        java.util.ArrayList<exampleapp.domain.Person> list60 = new java.util.ArrayList<exampleapp.domain.Person>(arg0.setupForPropertyEvents(hibSession, out).getChildren());
        inForLoop = true;
        forLoopCounter++;
        int limit33 = 1000;
        int offset33 = 0;
        int removedcount33 = 0;
        Object[] array72 = list60.toArray();
        for(int i72 = 0; i72 < array72.length; i72++)
        { 
          exampleapp.domain.Person outputset12 = (exampleapp.domain.Person)array72[i72];
          if(limit33 <= 0)
          { 
            list60.remove(i72 - removedcount33);
            removedcount33++;
          }
          limit33--;
        }
        int separatorindex33 = 0;
        Object[] array73 = list60.toArray();
        for(int i73 = 0; i73 < array73.length; i73++)
        { 
          exampleapp.domain.Person outputset12 = (exampleapp.domain.Person)array73[i73];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(outputset12))
          { 
            WebDSLEntity temp60 = (WebDSLEntity)(Object)outputset12;
            forelementcounter = temp60.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp60.getId().toString();
          }
          else
            forelementcounter = Integer.toString(fallbackcounter);
          ThreadLocalPage.get().enterTemplateContext(forelementcounter);
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<li " + "" + ">");
          if(!org.webdsl.tools.Utils.equal(outputset12, null))
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<a href=\"");
            if(ThreadLocalEmailContext.inEmailContext())
            { 
              out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/person" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(outputset12.getNaturalId())), "Person")));
            }
            else
            { 
              out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/person" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(outputset12.getNaturalId())), "Person")));
            }
            out.print("\" " + ("class" + "='" + "outputchildren" + "' ") + " class=\"navigate\">");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring67;
            try
            { 
              tmpstring67 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(outputset12.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(outputset12.setupForPropertyEvents(hibSession, out).getName()));
            }
            catch(NullPointerException npe)
            { 
              tmpstring67 = "";
            }
            out.print(tmpstring67);
            ThreadLocalPage.get().commonContextsCheckLeave(out);
            out.print("</a>");
            ThreadLocalPage.get().commonContextsCheckLeave(out);
          }
          else
          { }
          if(org.webdsl.tools.Utils.equal(outputset12, null))
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring68;
            try
            { 
              tmpstring68 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("null") : utils.HTMLFilter.filter(String.valueOf("null"));
            }
            catch(NullPointerException npe)
            { 
              tmpstring68 = "";
            }
            out.print(tmpstring68);
            ThreadLocalPage.get().commonContextsCheckLeave(out);
          }
          else
          { }
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
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list61 = new java.util.ArrayList<String>(messagesList29);
        inForLoop = true;
        forLoopCounter++;
        int limit34 = 1000;
        int offset34 = 0;
        int removedcount34 = 0;
        Object[] array74 = list61.toArray();
        for(int i74 = 0; i74 < array74.length; i74++)
        { 
          String ve3 = (String)array74[i74];
          if(limit34 <= 0)
          { 
            list61.remove(i74 - removedcount34);
            removedcount34++;
          }
          limit34--;
        }
        int separatorindex34 = 0;
        Object[] array75 = list61.toArray();
        for(int i75 = 0; i75 < array75.length; i75++)
        { 
          String ve3 = (String)array75[i75];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp61 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp61.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp61.getId().toString();
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
          String tmpstring69;
          try
          { 
            tmpstring69 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring69 = "";
          }
          out.print(tmpstring69);
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
        out.print("<label for=\"" + label91 + "\" " + "" + ">");
        String tmpstring66;
        try
        { 
          tmpstring66 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Children: ") : utils.HTMLFilter.filter(String.valueOf("Children: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring66 = "";
        }
        out.print(tmpstring66);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<ul " + "" + ">");
        java.util.ArrayList<exampleapp.domain.Person> list60 = new java.util.ArrayList<exampleapp.domain.Person>(arg0.setupForPropertyEvents(hibSession, out).getChildren());
        inForLoop = true;
        forLoopCounter++;
        int limit33 = 1000;
        int offset33 = 0;
        int removedcount33 = 0;
        Object[] array72 = list60.toArray();
        for(int i72 = 0; i72 < array72.length; i72++)
        { 
          exampleapp.domain.Person outputset12 = (exampleapp.domain.Person)array72[i72];
          if(limit33 <= 0)
          { 
            list60.remove(i72 - removedcount33);
            removedcount33++;
          }
          limit33--;
        }
        int separatorindex33 = 0;
        Object[] array73 = list60.toArray();
        for(int i73 = 0; i73 < array73.length; i73++)
        { 
          exampleapp.domain.Person outputset12 = (exampleapp.domain.Person)array73[i73];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(outputset12))
          { 
            WebDSLEntity temp60 = (WebDSLEntity)(Object)outputset12;
            forelementcounter = temp60.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp60.getId().toString();
          }
          else
            forelementcounter = Integer.toString(fallbackcounter);
          ThreadLocalPage.get().enterTemplateContext(forelementcounter);
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<li " + "" + ">");
          if(!org.webdsl.tools.Utils.equal(outputset12, null))
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<a href=\"");
            if(ThreadLocalEmailContext.inEmailContext())
            { 
              out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/person" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(outputset12.getNaturalId())), "Person")));
            }
            else
            { 
              out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/person" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(outputset12.getNaturalId())), "Person")));
            }
            out.print("\" " + ("class" + "='" + "outputchildren" + "' ") + " class=\"navigate\">");
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring67;
            try
            { 
              tmpstring67 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(outputset12.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(outputset12.setupForPropertyEvents(hibSession, out).getName()));
            }
            catch(NullPointerException npe)
            { 
              tmpstring67 = "";
            }
            out.print(tmpstring67);
            ThreadLocalPage.get().commonContextsCheckLeave(out);
            out.print("</a>");
            ThreadLocalPage.get().commonContextsCheckLeave(out);
          }
          else
          { }
          if(org.webdsl.tools.Utils.equal(outputset12, null))
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            String tmpstring68;
            try
            { 
              tmpstring68 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("null") : utils.HTMLFilter.filter(String.valueOf("null"));
            }
            catch(NullPointerException npe)
            { 
              tmpstring68 = "";
            }
            out.print(tmpstring68);
            ThreadLocalPage.get().commonContextsCheckLeave(out);
          }
          else
          { }
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
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getPhoto(), null))
    { 
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
      String label92 = ident + "input49" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label92);
      java.util.List<String> messagesList31 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve34 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label92))
        { 
          ve34.add(ve);
        }
      }
      for(utils.ValidationException ve : ve34)
      { 
        messagesList31.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList31.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label92 + "\" " + "" + ">");
        String tmpstring70;
        try
        { 
          tmpstring70 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Photo: ") : utils.HTMLFilter.filter(String.valueOf("Photo: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring70 = "";
        }
        out.print(tmpstring70);
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
        ident += "input50" + "";
        java.util.List<String> messagesList30 = new java.util.LinkedList<String>();
        java.util.List<utils.ValidationException> ve33 = new java.util.LinkedList<utils.ValidationException>();
        for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
        { 
          if(ve.getName() != null && ve.getName().equals(ident))
          { 
            ve33.add(ve);
          }
        }
        for(utils.ValidationException ve : ve33)
        { 
          messagesList30.add(ve.getErrorMessage());
          ThreadLocalPage.get().getValidationExceptions().remove(ve);
        }
        if(messagesList30.size() > 0)
        { 
          out.print("<img alt=\"");
          String tmpstring71;
          try
          { 
            tmpstring71 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getPhoto().getFileName()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getPhoto().getFileName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring71 = "";
          }
          out.print(tmpstring71);
          out.print("\"" + (" class=\"" + "outputImage" + (" " + "outputphoto") + "\" " + "" + " ") + "src='" + ThreadLocalServlet.getContextPath() + "/" + ThreadLocalPage.get().getActionTarget() + "?" + ident + "=1&" + "action-call-with-get-request-type" + "=1&" + ThreadLocalPage.get().getHiddenPostParams() + "' >");
          out.print("</img>");
          java.util.ArrayList<String> list62 = new java.util.ArrayList<String>(messagesList30);
          inForLoop = true;
          forLoopCounter++;
          int limit35 = 1000;
          int offset35 = 0;
          int removedcount35 = 0;
          Object[] array76 = list62.toArray();
          for(int i76 = 0; i76 < array76.length; i76++)
          { 
            String ve3 = (String)array76[i76];
            if(limit35 <= 0)
            { 
              list62.remove(i76 - removedcount35);
              removedcount35++;
            }
            limit35--;
          }
          int separatorindex35 = 0;
          Object[] array77 = list62.toArray();
          for(int i77 = 0; i77 < array77.length; i77++)
          { 
            String ve3 = (String)array77[i77];
            fallbackcounter += 1;
            if(WebDSLEntity.class.isInstance(ve3))
            { 
              WebDSLEntity temp62 = (WebDSLEntity)(Object)ve3;
              forelementcounter = temp62.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp62.getId().toString();
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
            String tmpstring72;
            try
            { 
              tmpstring72 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
            }
            catch(NullPointerException npe)
            { 
              tmpstring72 = "";
            }
            out.print(tmpstring72);
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
          out.print("<img alt=\"");
          String tmpstring71;
          try
          { 
            tmpstring71 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getPhoto().getFileName()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getPhoto().getFileName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring71 = "";
          }
          out.print(tmpstring71);
          out.print("\"" + (" class=\"" + "outputImage" + (" " + "outputphoto") + "\" " + "" + " ") + "src='" + ThreadLocalServlet.getContextPath() + "/" + ThreadLocalPage.get().getActionTarget() + "?" + ident + "=1&" + "action-call-with-get-request-type" + "=1&" + ThreadLocalPage.get().getHiddenPostParams() + "' >");
          out.print("</img>");
        }
        ThreadLocalPage.get().commonContextsCheckLeave(out);
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list63 = new java.util.ArrayList<String>(messagesList31);
        inForLoop = true;
        forLoopCounter++;
        int limit36 = 1000;
        int offset36 = 0;
        int removedcount36 = 0;
        Object[] array78 = list63.toArray();
        for(int i78 = 0; i78 < array78.length; i78++)
        { 
          String ve3 = (String)array78[i78];
          if(limit36 <= 0)
          { 
            list63.remove(i78 - removedcount36);
            removedcount36++;
          }
          limit36--;
        }
        int separatorindex36 = 0;
        Object[] array79 = list63.toArray();
        for(int i79 = 0; i79 < array79.length; i79++)
        { 
          String ve3 = (String)array79[i79];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp63 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp63.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp63.getId().toString();
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
          String tmpstring73;
          try
          { 
            tmpstring73 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring73 = "";
          }
          out.print(tmpstring73);
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
        out.print("<label for=\"" + label92 + "\" " + "" + ">");
        String tmpstring70;
        try
        { 
          tmpstring70 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Photo: ") : utils.HTMLFilter.filter(String.valueOf("Photo: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring70 = "";
        }
        out.print(tmpstring70);
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
        ident += "input50" + "";
        java.util.List<String> messagesList30 = new java.util.LinkedList<String>();
        java.util.List<utils.ValidationException> ve33 = new java.util.LinkedList<utils.ValidationException>();
        for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
        { 
          if(ve.getName() != null && ve.getName().equals(ident))
          { 
            ve33.add(ve);
          }
        }
        for(utils.ValidationException ve : ve33)
        { 
          messagesList30.add(ve.getErrorMessage());
          ThreadLocalPage.get().getValidationExceptions().remove(ve);
        }
        if(messagesList30.size() > 0)
        { 
          out.print("<img alt=\"");
          String tmpstring71;
          try
          { 
            tmpstring71 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getPhoto().getFileName()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getPhoto().getFileName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring71 = "";
          }
          out.print(tmpstring71);
          out.print("\"" + (" class=\"" + "outputImage" + (" " + "outputphoto") + "\" " + "" + " ") + "src='" + ThreadLocalServlet.getContextPath() + "/" + ThreadLocalPage.get().getActionTarget() + "?" + ident + "=1&" + "action-call-with-get-request-type" + "=1&" + ThreadLocalPage.get().getHiddenPostParams() + "' >");
          out.print("</img>");
          java.util.ArrayList<String> list62 = new java.util.ArrayList<String>(messagesList30);
          inForLoop = true;
          forLoopCounter++;
          int limit35 = 1000;
          int offset35 = 0;
          int removedcount35 = 0;
          Object[] array76 = list62.toArray();
          for(int i76 = 0; i76 < array76.length; i76++)
          { 
            String ve3 = (String)array76[i76];
            if(limit35 <= 0)
            { 
              list62.remove(i76 - removedcount35);
              removedcount35++;
            }
            limit35--;
          }
          int separatorindex35 = 0;
          Object[] array77 = list62.toArray();
          for(int i77 = 0; i77 < array77.length; i77++)
          { 
            String ve3 = (String)array77[i77];
            fallbackcounter += 1;
            if(WebDSLEntity.class.isInstance(ve3))
            { 
              WebDSLEntity temp62 = (WebDSLEntity)(Object)ve3;
              forelementcounter = temp62.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp62.getId().toString();
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
            String tmpstring72;
            try
            { 
              tmpstring72 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
            }
            catch(NullPointerException npe)
            { 
              tmpstring72 = "";
            }
            out.print(tmpstring72);
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
          out.print("<img alt=\"");
          String tmpstring71;
          try
          { 
            tmpstring71 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getPhoto().getFileName()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getPhoto().getFileName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring71 = "";
          }
          out.print(tmpstring71);
          out.print("\"" + (" class=\"" + "outputImage" + (" " + "outputphoto") + "\" " + "" + " ") + "src='" + ThreadLocalServlet.getContextPath() + "/" + ThreadLocalPage.get().getActionTarget() + "?" + ident + "=1&" + "action-call-with-get-request-type" + "=1&" + ThreadLocalPage.get().getHiddenPostParams() + "' >");
          out.print("</img>");
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
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getAdmin(), null))
    { 
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
      String label93 = ident + "input51" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label93);
      java.util.List<String> messagesList32 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve35 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label93))
        { 
          ve35.add(ve);
        }
      }
      for(utils.ValidationException ve : ve35)
      { 
        messagesList32.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList32.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label93 + "\" " + "" + ">");
        String tmpstring74;
        try
        { 
          tmpstring74 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Admin: ") : utils.HTMLFilter.filter(String.valueOf("Admin: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring74 = "";
        }
        out.print(tmpstring74);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<input type=\"checkbox\" disabled=\"true\"" + (" class=\"" + "inputBool" + (" " + "outputadmin") + "\" " + "" + " "));
        if(arg0.setupForPropertyEvents(hibSession, out).getAdmin())
        { 
          out.print(" checked=\"true\" ");
        }
        out.print(" />");
        ThreadLocalPage.get().commonContextsCheckLeave(out);
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list64 = new java.util.ArrayList<String>(messagesList32);
        inForLoop = true;
        forLoopCounter++;
        int limit37 = 1000;
        int offset37 = 0;
        int removedcount37 = 0;
        Object[] array80 = list64.toArray();
        for(int i80 = 0; i80 < array80.length; i80++)
        { 
          String ve3 = (String)array80[i80];
          if(limit37 <= 0)
          { 
            list64.remove(i80 - removedcount37);
            removedcount37++;
          }
          limit37--;
        }
        int separatorindex37 = 0;
        Object[] array81 = list64.toArray();
        for(int i81 = 0; i81 < array81.length; i81++)
        { 
          String ve3 = (String)array81[i81];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp64 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp64.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp64.getId().toString();
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
          String tmpstring75;
          try
          { 
            tmpstring75 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring75 = "";
          }
          out.print(tmpstring75);
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
        out.print("<label for=\"" + label93 + "\" " + "" + ">");
        String tmpstring74;
        try
        { 
          tmpstring74 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Admin: ") : utils.HTMLFilter.filter(String.valueOf("Admin: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring74 = "";
        }
        out.print(tmpstring74);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<input type=\"checkbox\" disabled=\"true\"" + (" class=\"" + "inputBool" + (" " + "outputadmin") + "\" " + "" + " "));
        if(arg0.setupForPropertyEvents(hibSession, out).getAdmin())
        { 
          out.print(" checked=\"true\" ");
        }
        out.print(" />");
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
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor(), null))
    { 
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
      String label94 = ident + "input52" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label94);
      java.util.List<String> messagesList33 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve36 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label94))
        { 
          ve36.add(ve);
        }
      }
      for(utils.ValidationException ve : ve36)
      { 
        messagesList33.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList33.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label94 + "\" " + "" + ">");
        String tmpstring76;
        try
        { 
          tmpstring76 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Favorite color: ") : utils.HTMLFilter.filter(String.valueOf("Favorite color: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring76 = "";
        }
        out.print(tmpstring76);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor(), null))
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<a href=\"");
          if(ThreadLocalEmailContext.inEmailContext())
          { 
            out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/color" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor().getNaturalId())), "Color")));
          }
          else
          { 
            out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/color" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor().getNaturalId())), "Color")));
          }
          out.print("\" " + ("class" + "='" + "outputfavoriteColor" + "' ") + " class=\"navigate\">");
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          String tmpstring77;
          try
          { 
            tmpstring77 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor().setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor().setupForPropertyEvents(hibSession, out).getName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring77 = "";
          }
          out.print(tmpstring77);
          ThreadLocalPage.get().commonContextsCheckLeave(out);
          out.print("</a>");
          ThreadLocalPage.get().commonContextsCheckLeave(out);
        }
        else
        { }
        if(org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor(), null))
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          String tmpstring78;
          try
          { 
            tmpstring78 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("null") : utils.HTMLFilter.filter(String.valueOf("null"));
          }
          catch(NullPointerException npe)
          { 
            tmpstring78 = "";
          }
          out.print(tmpstring78);
          ThreadLocalPage.get().commonContextsCheckLeave(out);
        }
        else
        { }
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list65 = new java.util.ArrayList<String>(messagesList33);
        inForLoop = true;
        forLoopCounter++;
        int limit38 = 1000;
        int offset38 = 0;
        int removedcount38 = 0;
        Object[] array82 = list65.toArray();
        for(int i82 = 0; i82 < array82.length; i82++)
        { 
          String ve3 = (String)array82[i82];
          if(limit38 <= 0)
          { 
            list65.remove(i82 - removedcount38);
            removedcount38++;
          }
          limit38--;
        }
        int separatorindex38 = 0;
        Object[] array83 = list65.toArray();
        for(int i83 = 0; i83 < array83.length; i83++)
        { 
          String ve3 = (String)array83[i83];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp65 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp65.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp65.getId().toString();
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
          String tmpstring79;
          try
          { 
            tmpstring79 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring79 = "";
          }
          out.print(tmpstring79);
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
        out.print("<label for=\"" + label94 + "\" " + "" + ">");
        String tmpstring76;
        try
        { 
          tmpstring76 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Favorite color: ") : utils.HTMLFilter.filter(String.valueOf("Favorite color: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring76 = "";
        }
        out.print(tmpstring76);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor(), null))
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<a href=\"");
          if(ThreadLocalEmailContext.inEmailContext())
          { 
            out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/color" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor().getNaturalId())), "Color")));
          }
          else
          { 
            out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/color" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor().getNaturalId())), "Color")));
          }
          out.print("\" " + ("class" + "='" + "outputfavoriteColor" + "' ") + " class=\"navigate\">");
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          String tmpstring77;
          try
          { 
            tmpstring77 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor().setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor().setupForPropertyEvents(hibSession, out).getName()));
          }
          catch(NullPointerException npe)
          { 
            tmpstring77 = "";
          }
          out.print(tmpstring77);
          ThreadLocalPage.get().commonContextsCheckLeave(out);
          out.print("</a>");
          ThreadLocalPage.get().commonContextsCheckLeave(out);
        }
        else
        { }
        if(org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor(), null))
        { 
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          String tmpstring78;
          try
          { 
            tmpstring78 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("null") : utils.HTMLFilter.filter(String.valueOf("null"));
          }
          catch(NullPointerException npe)
          { 
            tmpstring78 = "";
          }
          out.print(tmpstring78);
          ThreadLocalPage.get().commonContextsCheckLeave(out);
        }
        else
        { }
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
    }
    else
    { }
    ThreadLocalPage.get().leaveTableContext();
    out.print("</table>");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</fieldset>");
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
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getPhoto(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident += "input50" + "";
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        inline_action00 temp = (inline_action00)env.getAction("inline_action00");
        temp.inline_action00(ident);
      }
    }
    else
    { }
  }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { 
    env.putAction("inline_action00", new inline_action00()
                                     { 
                                       boolean isRedirected = false;

                                       public void setIsRedirected(boolean b)
                                       { 
                                         isRedirected = b;
                                       }

                                       public void inline_action00(String actionident)
                                       { 
                                         ThreadLocalAction.set(this);
                                         if(!ThreadLocalPage.get().hasExecutedAction)
                                         { 
                                           boolean actionFailed = false;
                                           ThreadLocalPage.get().hasExecutedAction = true;
                                           try
                                           { 
                                             ThreadLocalPage.get().setDownload(arg0.setupForPropertyEvents(hibSession, out).getPhoto());
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
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getFullname(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input42" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getEmail(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input43" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getUsername(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input44" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getBio(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input45" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getDateOfBirth(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input46" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getParents(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input47" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getChildren(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input48" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getPhoto(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input49" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getAdmin(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input51" + uniqueid;
    }
    else
    { }
    if(!org.webdsl.tools.Utils.equal(arg0.setupForPropertyEvents(hibSession, out).getFavoriteColor(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input52" + uniqueid;
    }
    else
    { }
  }
}