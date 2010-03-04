package utils;

import java.io.*;
import java.util.HashMap;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import utils.*;
import exampleapp.beans.*;
import exampleapp.domain.*;
import org.webdsl.lang.Environment;

public class GlobalInit  
{ 
  private static org.hibernate.Session hibSession;

  static boolean applicationContextPropertyExists(String name, List<ApplicationContextProperty> res)
  { 
    for(ApplicationContextProperty a : res)
    { 
      if(a.getName().equals(name))
        return true;
    }
    return false;
  }

  static java.io.PrintWriter out;

  private static Environment env;

  public static void load()
  { 
    try
    { 
      hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
      hibSession.beginTransaction();
      env = PageServlet.staticEnv;
      boolean pageServletIsNotSet = ThreadLocalPage.get() == null;
      if(pageServletIsNotSet)
      { 
        ThreadLocalPage.set(new GlobalsPageServlet(env));
      }
      org.hibernate.Query q = hibSession.createQuery("from ApplicationContextProperty where name = '__global__init__'");
      List<ApplicationContextProperty> res = q.list();
      if(res.isEmpty())
      { 
        initialize();
        initActions();
        ApplicationContextProperty flag = new ApplicationContextProperty();
        flag.setName("__global__init__");
        hibSession.save(flag);
      }
      hibSession.flush();
      out = null;
      hibSession = null;
      env = null;
      if(pageServletIsNotSet)
      { 
        ThreadLocalPage.set(null);
      }
    }
    catch(Exception ex)
    { 
      System.out.println("exception occured: " + ex.getMessage());
      ex.printStackTrace();
      hibSession.getTransaction().rollback();
    }
  }

  public static void initActions()
  { 
    exampleapp.domain.Color color0 = null;
    exampleapp.domain.Color objCr5 = new exampleapp.domain.Color().setupForPropertyEvents(hibSession, out);
    objCr5.setupForPropertyEvents(hibSession, out).setName("blue");
    objCr5.Color_(hibSession, env, out);
    color0 = objCr5;
    color0.setupForPropertyEvents(hibSession, out).validateSave();
    color0.setVersion(1);
    hibSession.save(color0);
    exampleapp.domain.Color objCr7 = new exampleapp.domain.Color().setupForPropertyEvents(hibSession, out);
    objCr7.setupForPropertyEvents(hibSession, out).setName("yellow");
    objCr7.Color_(hibSession, env, out);
    color0 = objCr7;
    color0.setupForPropertyEvents(hibSession, out).validateSave();
    color0.setVersion(1);
    hibSession.save(color0);
    exampleapp.domain.Color objCr9 = new exampleapp.domain.Color().setupForPropertyEvents(hibSession, out);
    objCr9.setupForPropertyEvents(hibSession, out).setName("red");
    objCr9.Color_(hibSession, env, out);
    color0 = objCr9;
    color0.setupForPropertyEvents(hibSession, out).validateSave();
    color0.setVersion(1);
    hibSession.save(color0);
    exampleapp.domain.Color objCr11 = new exampleapp.domain.Color().setupForPropertyEvents(hibSession, out);
    objCr11.setupForPropertyEvents(hibSession, out).setName("green");
    objCr11.Color_(hibSession, env, out);
    color0 = objCr11;
    color0.setupForPropertyEvents(hibSession, out).validateSave();
    color0.setVersion(1);
    hibSession.save(color0);
  }

  protected static void initialize()
  { }
}