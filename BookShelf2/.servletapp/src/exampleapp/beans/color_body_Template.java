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

public class color_body_Template  implements TemplateServlet
{ 
  private exampleapp.domain.Color arg4;

  public exampleapp.domain.Color getArg4()
  { 
    return arg4;
  }

  public void setArg4(exampleapp.domain.Color arg4)
  { 
    this.arg4 = arg4;
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
          this.uniqueid = Encoders.encodeTemplateId("color_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("color_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("color_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("color_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
    if(!org.webdsl.tools.Utils.equal(arg4.setupForPropertyEvents(hibSession, out).getName(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input75" + uniqueid;
    }
    else
    { }
  }

  protected void initialize()
  { 
    arg4 = (exampleapp.domain.Color)env.getVariable("arg4");
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
    int sec4 = ThreadLocalPage.get().getSectionDepth();
    if(sec4 > 0)
    { 
      if(sec4 > 6)
      { 
        sec4 = 6;
      }
    }
    else
    { 
      sec4 = 1;
    }
    out.print("<h" + sec4);
    out.print(" class=\"header section" + sec4 + "\" " + "" + ">");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring141;
    try
    { 
      tmpstring141 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg4.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg4.setupForPropertyEvents(hibSession, out).getName()));
    }
    catch(NullPointerException npe)
    { 
      tmpstring141 = "";
    }
    out.print(tmpstring141);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</h" + sec4 + ">");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<fieldset " + "" + "><legend>");
    String tmpstring145;
    try
    { 
      tmpstring145 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Details") : utils.HTMLFilter.filter(String.valueOf("Details"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring145 = "";
    }
    out.print(tmpstring145);
    out.print("</legend>");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<table " + "" + ">");
    ThreadLocalPage.get().enterTableContext();
    if(!org.webdsl.tools.Utils.equal(arg4.setupForPropertyEvents(hibSession, out).getName(), null))
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
      String label106 = ident + "input75" + uniqueid;
      ThreadLocalPage.get().enterLabelContext(label106);
      java.util.List<String> messagesList62 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve65 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(label106))
        { 
          ve65.add(ve);
        }
      }
      for(utils.ValidationException ve : ve65)
      { 
        messagesList62.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList62.size() > 0)
      { 
        ThreadLocalPage.get().formGroupContextsDisplayLeftEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        out.print("<label for=\"" + label106 + "\" " + "" + ">");
        String tmpstring142;
        try
        { 
          tmpstring142 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Name: ") : utils.HTMLFilter.filter(String.valueOf("Name: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring142 = "";
        }
        out.print(tmpstring142);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring143;
        try
        { 
          tmpstring143 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg4.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg4.setupForPropertyEvents(hibSession, out).getName()));
        }
        catch(NullPointerException npe)
        { 
          tmpstring143 = "";
        }
        out.print(tmpstring143);
        ThreadLocalPage.get().commonContextsCheckLeave(out);
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        java.util.ArrayList<String> list98 = new java.util.ArrayList<String>(messagesList62);
        inForLoop = true;
        forLoopCounter++;
        int limit70 = 1000;
        int offset70 = 0;
        int removedcount70 = 0;
        Object[] array152 = list98.toArray();
        for(int i152 = 0; i152 < array152.length; i152++)
        { 
          String ve3 = (String)array152[i152];
          if(limit70 <= 0)
          { 
            list98.remove(i152 - removedcount70);
            removedcount70++;
          }
          limit70--;
        }
        int separatorindex70 = 0;
        Object[] array153 = list98.toArray();
        for(int i153 = 0; i153 < array153.length; i153++)
        { 
          String ve3 = (String)array153[i153];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve3))
          { 
            WebDSLEntity temp121 = (WebDSLEntity)(Object)ve3;
            forelementcounter = temp121.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp121.getId().toString();
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
          String tmpstring144;
          try
          { 
            tmpstring144 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve3) : utils.HTMLFilter.filter(String.valueOf(ve3));
          }
          catch(NullPointerException npe)
          { 
            tmpstring144 = "";
          }
          out.print(tmpstring144);
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
        out.print("<label for=\"" + label106 + "\" " + "" + ">");
        String tmpstring142;
        try
        { 
          tmpstring142 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("Name: ") : utils.HTMLFilter.filter(String.valueOf("Name: "));
        }
        catch(NullPointerException npe)
        { 
          tmpstring142 = "";
        }
        out.print(tmpstring142);
        out.print("</label>");
        ThreadLocalPage.get().columnContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsCheckLeave(out);
        ThreadLocalPage.get().formGroupContextsDisplayRightEnter(out);
        ThreadLocalPage.get().columnContextsCheckEnter(out);
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring143;
        try
        { 
          tmpstring143 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(arg4.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(arg4.setupForPropertyEvents(hibSession, out).getName()));
        }
        catch(NullPointerException npe)
        { 
          tmpstring143 = "";
        }
        out.print(tmpstring143);
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
  { }

  private void initializeLocalVars()
  { }

  private void initializePassOn()
  { }

  void initActions()
  { }

  private void storeInputsInternal()
  { 
    String ident = "";
    String forelementcounter = "0";
    int fallbackcounter = 0;
    boolean inForLoop = false;
    int forLoopCounter = 0;
    if(!org.webdsl.tools.Utils.equal(arg4.setupForPropertyEvents(hibSession, out).getName(), null))
    { 
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ident = ident + "input75" + uniqueid;
    }
    else
    { }
  }
}