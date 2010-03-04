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

public class manageColor_body_Template  implements TemplateServlet
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
          this.uniqueid = Encoders.encodeTemplateId("manageColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("manageColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("manageColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
          this.uniqueid = Encoders.encodeTemplateId("manageColor_body_Template", "", ThreadLocalPage.get().getTemplateContextString());
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
    java.util.List<exampleapp.domain.Color> list103 = hibSession.createCriteria(exampleapp.domain.Color.class).setCacheable(true).list();
    inForLoop = true;
    forLoopCounter++;
    int limit75 = 1000;
    int offset75 = 0;
    int removedcount75 = 0;
    Object[] array162 = list103.toArray();
    for(int i162 = 0; i162 < array162.length; i162++)
    { 
      exampleapp.domain.Color elem2 = (exampleapp.domain.Color)array162[i162];
      if(limit75 <= 0)
      { 
        list103.remove(i162 - removedcount75);
        removedcount75++;
      }
      limit75--;
    }
    int separatorindex75 = 0;
    Object[] array163 = list103.toArray();
    for(int i163 = 0; i163 < array163.length; i163++)
    { 
      exampleapp.domain.Color elem2 = (exampleapp.domain.Color)array163[i163];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(elem2))
      { 
        WebDSLEntity temp128 = (WebDSLEntity)(Object)elem2;
        forelementcounter = temp128.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp128.getId().toString();
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
      out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/createColor"));
    }
    else
    { 
      out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/createColor"));
    }
    out.print("\" " + "" + " class=\"navigate\">");
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    String tmpstring156;
    try
    { 
      tmpstring156 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("create") : utils.HTMLFilter.filter(String.valueOf("create"));
    }
    catch(NullPointerException npe)
    { 
      tmpstring156 = "";
    }
    out.print(tmpstring156);
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    out.print("</a>");
    ThreadLocalPage.get().commonContextsCheckLeave(out);
    ThreadLocalPage.get().commonContextsCheckEnter(out);
    out.print("<ul " + "" + ">");
    java.util.List<exampleapp.domain.Color> list108 = hibSession.createCriteria(exampleapp.domain.Color.class).setCacheable(true).list();
    inForLoop = true;
    forLoopCounter++;
    int limit79 = 1000;
    int offset79 = 0;
    int removedcount79 = 0;
    Object[] array170 = list108.toArray();
    for(int i170 = 0; i170 < array170.length; i170++)
    { 
      exampleapp.domain.Color elem2 = (exampleapp.domain.Color)array170[i170];
      if(limit79 <= 0)
      { 
        list108.remove(i170 - removedcount79);
        removedcount79++;
      }
      limit79--;
    }
    int separatorindex79 = 0;
    Object[] array171 = list108.toArray();
    for(int i171 = 0; i171 < array171.length; i171++)
    { 
      exampleapp.domain.Color elem2 = (exampleapp.domain.Color)array171[i171];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(elem2))
      { 
        WebDSLEntity temp132 = (WebDSLEntity)(Object)elem2;
        forelementcounter = temp132.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp132.getId().toString();
      }
      else
        forelementcounter = Integer.toString(fallbackcounter);
      ThreadLocalPage.get().enterTemplateContext(forelementcounter);
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      out.print("<li " + "" + ">");
      if(!org.webdsl.tools.Utils.equal(elem2, null))
      { 
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<a href=\"");
        if(ThreadLocalEmailContext.inEmailContext())
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/color" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem2.getNaturalId())), "Color")));
        }
        else
        { 
          out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/color" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem2.getNaturalId())), "Color")));
        }
        out.print("\" " + "" + " class=\"navigate\">");
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring157;
        try
        { 
          tmpstring157 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(elem2.setupForPropertyEvents(hibSession, out).getName()) : utils.HTMLFilter.filter(String.valueOf(elem2.setupForPropertyEvents(hibSession, out).getName()));
        }
        catch(NullPointerException npe)
        { 
          tmpstring157 = "";
        }
        out.print(tmpstring157);
        ThreadLocalPage.get().commonContextsCheckLeave(out);
        out.print("</a>");
        ThreadLocalPage.get().commonContextsCheckLeave(out);
      }
      else
      { }
      if(org.webdsl.tools.Utils.equal(elem2, null))
      { 
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        String tmpstring158;
        try
        { 
          tmpstring158 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("null") : utils.HTMLFilter.filter(String.valueOf("null"));
        }
        catch(NullPointerException npe)
        { 
          tmpstring158 = "";
        }
        out.print(tmpstring158);
        ThreadLocalPage.get().commonContextsCheckLeave(out);
      }
      else
      { }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String tmpstring159;
      try
      { 
        tmpstring159 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(" ") : utils.HTMLFilter.filter(String.valueOf(" "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring159 = "";
      }
      out.print(tmpstring159);
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      out.print("<a href=\"");
      if(ThreadLocalEmailContext.inEmailContext())
      { 
        out.print(utils.HTMLFilter.filter(ThreadLocalPage.get().getAbsoluteLocation()) + utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/editColor" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem2.getNaturalId())), "Color")));
      }
      else
      { 
        out.print(utils.HTMLFilter.filter(ThreadLocalServlet.getContextPath() + "/editColor" + utils.URLFilter.removeTrailingDefaultValues(String.valueOf(utils.URLFilter.filter(elem2.getNaturalId())), "Color")));
      }
      out.print("\" " + "" + " class=\"navigate\">");
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String tmpstring160;
      try
      { 
        tmpstring160 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("edit") : utils.HTMLFilter.filter(String.valueOf("edit"));
      }
      catch(NullPointerException npe)
      { 
        tmpstring160 = "";
      }
      out.print(tmpstring160);
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      out.print("</a>");
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      String tmpstring161;
      try
      { 
        tmpstring161 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(" ") : utils.HTMLFilter.filter(String.valueOf(" "));
      }
      catch(NullPointerException npe)
      { 
        tmpstring161 = "";
      }
      out.print(tmpstring161);
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
      java.io.PrintWriter out6 = out;
      java.io.StringWriter stringwriter5 = new java.io.StringWriter();
      out = new java.io.PrintWriter(stringwriter5);
      out.print(">");
      out.print("<input type=\"hidden\" name=\"" + ident + "\" value=\"1\" />");
      out.print(ThreadLocalPage.get().getHiddenParams());
      ident = "";
      if(inForLoop)
      { 
        ident += forelementcounter;
      }
      ThreadLocalPage.get().commonContextsCheckEnter(out);
      ident = (inForLoop ? forelementcounter : "") + ("action11" + uniqueid + ("" + (elem2 != null ? elem2.getVersion() == 0 ? "_" : elem2.getId().toString() : "null")));
      java.util.List<String> messagesList68 = new java.util.LinkedList<String>();
      java.util.List<utils.ValidationException> ve71 = new java.util.LinkedList<utils.ValidationException>();
      for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
      { 
        if(ve.getName() != null && ve.getName().equals(ident))
        { 
          ve71.add(ve);
        }
      }
      for(utils.ValidationException ve : ve71)
      { 
        messagesList68.add(ve.getErrorMessage());
        ThreadLocalPage.get().getValidationExceptions().remove(ve);
      }
      if(messagesList68.size() > 0)
      { 
        ThreadLocalPage.get().commonContextsCheckEnter(out);
        out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
        java.util.ArrayList<String> list107 = new java.util.ArrayList<String>(messagesList68);
        inForLoop = true;
        forLoopCounter++;
        int limit78 = 1000;
        int offset78 = 0;
        int removedcount78 = 0;
        Object[] array168 = list107.toArray();
        for(int i168 = 0; i168 < array168.length; i168++)
        { 
          String ve1 = (String)array168[i168];
          if(limit78 <= 0)
          { 
            list107.remove(i168 - removedcount78);
            removedcount78++;
          }
          limit78--;
        }
        int separatorindex78 = 0;
        Object[] array169 = list107.toArray();
        for(int i169 = 0; i169 < array169.length; i169++)
        { 
          String ve1 = (String)array169[i169];
          fallbackcounter += 1;
          if(WebDSLEntity.class.isInstance(ve1))
          { 
            WebDSLEntity temp131 = (WebDSLEntity)(Object)ve1;
            forelementcounter = temp131.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp131.getId().toString();
          }
          else
            forelementcounter = Integer.toString(fallbackcounter);
          ThreadLocalPage.get().enterTemplateContext(forelementcounter);
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
          ThreadLocalPage.get().commonContextsCheckEnter(out);
          String tmpstring164;
          try
          { 
            tmpstring164 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
          }
          catch(NullPointerException npe)
          { 
            tmpstring164 = "";
          }
          out.print(tmpstring164);
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
          java.util.List<String> messagesList67 = new java.util.LinkedList<String>();
          java.util.List<utils.ValidationException> ve70 = new java.util.LinkedList<utils.ValidationException>();
          for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
          { 
            if(ve.getName() != null && ve.getName().equals(ident))
            { 
              ve70.add(ve);
            }
          }
          for(utils.ValidationException ve : ve70)
          { 
            messagesList67.add(ve.getErrorMessage());
            ThreadLocalPage.get().getValidationExceptions().remove(ve);
          }
          if(messagesList67.size() > 0)
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
            java.util.ArrayList<String> list106 = new java.util.ArrayList<String>(messagesList67);
            inForLoop = true;
            forLoopCounter++;
            int limit77 = 1000;
            int offset77 = 0;
            int removedcount77 = 0;
            Object[] array166 = list106.toArray();
            for(int i166 = 0; i166 < array166.length; i166++)
            { 
              String ve1 = (String)array166[i166];
              if(limit77 <= 0)
              { 
                list106.remove(i166 - removedcount77);
                removedcount77++;
              }
              limit77--;
            }
            int separatorindex77 = 0;
            Object[] array167 = list106.toArray();
            for(int i167 = 0; i167 < array167.length; i167++)
            { 
              String ve1 = (String)array167[i167];
              fallbackcounter += 1;
              if(WebDSLEntity.class.isInstance(ve1))
              { 
                WebDSLEntity temp130 = (WebDSLEntity)(Object)ve1;
                forelementcounter = temp130.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp130.getId().toString();
              }
              else
                forelementcounter = Integer.toString(fallbackcounter);
              ThreadLocalPage.get().enterTemplateContext(forelementcounter);
              ThreadLocalPage.get().commonContextsCheckEnter(out);
              out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
              ThreadLocalPage.get().commonContextsCheckEnter(out);
              String tmpstring163;
              try
              { 
                tmpstring163 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
              }
              catch(NullPointerException npe)
              { 
                tmpstring163 = "";
              }
              out.print(tmpstring163);
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
        String tmpstring162;
        try
        { 
          tmpstring162 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("remove") : utils.HTMLFilter.filter(String.valueOf("remove"));
        }
        catch(NullPointerException npe)
        { 
          tmpstring162 = "";
        }
        out.print(tmpstring162);
        out.print("\" " + ("class" + "='" + "button" + "' ") + " />");
        out.print("</div>");
        ThreadLocalPage.get().commonContextsCheckLeave(out);
      }
      else
      { 
        if(ThreadLocalPage.get().getParammap().get(ident) != null)
        { 
          java.util.List<String> messagesList67 = new java.util.LinkedList<String>();
          java.util.List<utils.ValidationException> ve70 = new java.util.LinkedList<utils.ValidationException>();
          for(utils.ValidationException ve : ThreadLocalPage.get().getValidationExceptions())
          { 
            if(ve.getName() != null && ve.getName().equals(ident))
            { 
              ve70.add(ve);
            }
          }
          for(utils.ValidationException ve : ve70)
          { 
            messagesList67.add(ve.getErrorMessage());
            ThreadLocalPage.get().getValidationExceptions().remove(ve);
          }
          if(messagesList67.size() > 0)
          { 
            ThreadLocalPage.get().commonContextsCheckEnter(out);
            out.print("<div " + ("style" + "='" + "clear:left; float:left; border: 1px solid #FF0000; margin-left: -5px; margin-top: 5px; margin-bottom: 5px; padding: 4px" + "' ") + " class=\"block\" >");
            java.util.ArrayList<String> list106 = new java.util.ArrayList<String>(messagesList67);
            inForLoop = true;
            forLoopCounter++;
            int limit77 = 1000;
            int offset77 = 0;
            int removedcount77 = 0;
            Object[] array166 = list106.toArray();
            for(int i166 = 0; i166 < array166.length; i166++)
            { 
              String ve1 = (String)array166[i166];
              if(limit77 <= 0)
              { 
                list106.remove(i166 - removedcount77);
                removedcount77++;
              }
              limit77--;
            }
            int separatorindex77 = 0;
            Object[] array167 = list106.toArray();
            for(int i167 = 0; i167 < array167.length; i167++)
            { 
              String ve1 = (String)array167[i167];
              fallbackcounter += 1;
              if(WebDSLEntity.class.isInstance(ve1))
              { 
                WebDSLEntity temp130 = (WebDSLEntity)(Object)ve1;
                forelementcounter = temp130.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp130.getId().toString();
              }
              else
                forelementcounter = Integer.toString(fallbackcounter);
              ThreadLocalPage.get().enterTemplateContext(forelementcounter);
              ThreadLocalPage.get().commonContextsCheckEnter(out);
              out.print("<div " + ("style" + "='" + "width:100%; clear:left; float:left; color: #FF0000; margin-top: 5px;" + "' ") + " class=\"block\" >");
              ThreadLocalPage.get().commonContextsCheckEnter(out);
              String tmpstring163;
              try
              { 
                tmpstring163 = ThreadLocalPage.get().isRawoutput() ? String.valueOf(ve1) : utils.HTMLFilter.filter(String.valueOf(ve1));
              }
              catch(NullPointerException npe)
              { 
                tmpstring163 = "";
              }
              out.print(tmpstring163);
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
        String tmpstring162;
        try
        { 
          tmpstring162 = ThreadLocalPage.get().isRawoutput() ? String.valueOf("remove") : utils.HTMLFilter.filter(String.valueOf("remove"));
        }
        catch(NullPointerException npe)
        { 
          tmpstring162 = "";
        }
        out.print(tmpstring162);
        out.print("\" " + ("class" + "='" + "button" + "' ") + " />");
      }
      ThreadLocalPage.get().commonContextsCheckLeave(out);
      out.print("</form>");
      if(ThreadLocalPage.get().formRequiresMultipartEnc)
      { 
        this.out.write(" enctype=\"multipart/form-data\"");
      }
      this.out.write(stringwriter5.toString());
      out = out6;
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
    java.util.List<exampleapp.domain.Color> list105 = hibSession.createCriteria(exampleapp.domain.Color.class).setCacheable(true).list();
    inForLoop = true;
    forLoopCounter++;
    int limit76 = 1000;
    int offset76 = 0;
    int removedcount76 = 0;
    Object[] array164 = list105.toArray();
    for(int i164 = 0; i164 < array164.length; i164++)
    { 
      exampleapp.domain.Color elem2 = (exampleapp.domain.Color)array164[i164];
      if(limit76 <= 0)
      { 
        list105.remove(i164 - removedcount76);
        removedcount76++;
      }
      limit76--;
    }
    int separatorindex76 = 0;
    Object[] array165 = list105.toArray();
    for(int i165 = 0; i165 < array165.length; i165++)
    { 
      exampleapp.domain.Color elem2 = (exampleapp.domain.Color)array165[i165];
      fallbackcounter += 1;
      if(WebDSLEntity.class.isInstance(elem2))
      { 
        WebDSLEntity temp129 = (WebDSLEntity)(Object)elem2;
        forelementcounter = temp129.getVersion() == 0 ? Integer.toString(fallbackcounter) : temp129.getId().toString();
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
      ident = (inForLoop ? forelementcounter : "") + ("action11" + uniqueid + ("" + (elem2 != null ? elem2.getVersion() == 0 ? "_" : elem2.getId().toString() : "null")));
      if(ThreadLocalPage.get().getParammap().get(ident) != null)
      { 
        remove2 temp = (remove2)env.getAction("remove2");
        temp.remove2(elem2, ident);
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
    env.putAction("remove2", new remove2()
                             { 
                               boolean isRedirected = false;

                               public void setIsRedirected(boolean b)
                               { 
                                 isRedirected = b;
                               }

                               public void remove2(exampleapp.domain.Color arg9, String actionident)
                               { 
                                 ThreadLocalAction.set(this);
                                 if(!ThreadLocalPage.get().hasExecutedAction)
                                 { 
                                   boolean actionFailed = false;
                                   ThreadLocalPage.get().hasExecutedAction = true;
                                   try
                                   { 
                                     arg9.setupForPropertyEvents(hibSession, out).validateDelete();
                                     hibSession.delete(arg9);
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