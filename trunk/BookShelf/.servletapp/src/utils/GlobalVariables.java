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

public class GlobalVariables  
{ 
  private static org.hibernate.Session hibSession;

  private static Environment env;

  private static java.io.PrintWriter out = null;

  private static UUID maleGenderId = null;

  public static exampleapp.domain.Gender getMaleGender(org.hibernate.Session hibSession)
  { 
    exampleapp.domain.Gender maleGender = (exampleapp.domain.Gender)hibSession.get(exampleapp.domain.Gender.class, maleGenderId);
    return maleGender;
  }

  private static UUID femaleGenderId = null;

  public static exampleapp.domain.Gender getFemaleGender(org.hibernate.Session hibSession)
  { 
    exampleapp.domain.Gender femaleGender = (exampleapp.domain.Gender)hibSession.get(exampleapp.domain.Gender.class, femaleGenderId);
    return femaleGender;
  }

  private static exampleapp.domain.Gender maleGender = null;

  private static void globalDeclarationMaleGender()
  { 
    try
    { 
      maleGender.setupForPropertyEvents(hibSession, out).setName("Male");
      maleGender.Gender_(hibSession, env, out);
    }
    catch(Exception iea)
    { 
      throw new RuntimeException("Catched in globalDeclaration: ", iea);
    }
  }

  private static void globalDeclarationMaleGenderPersist()
  { 
    hibSession.save(maleGender);
    ApplicationContextProperty id14 = new ApplicationContextProperty();
    id14.setName("maleGender");
    id14.setDatabaseId(maleGender.getId());
    hibSession.save(id14);
    GlobalVariables.maleGenderId = id14.getDatabaseId();
    maleGender.setVersion(1);
    hibSession.flush();
    maleGender = null;
  }

  private static exampleapp.domain.Gender femaleGender = null;

  private static void globalDeclarationFemaleGender()
  { 
    try
    { 
      femaleGender.setupForPropertyEvents(hibSession, out).setName("Female");
      femaleGender.Gender_(hibSession, env, out);
    }
    catch(Exception iea)
    { 
      throw new RuntimeException("Catched in globalDeclaration: ", iea);
    }
  }

  private static void globalDeclarationFemaleGenderPersist()
  { 
    hibSession.save(femaleGender);
    ApplicationContextProperty id15 = new ApplicationContextProperty();
    id15.setName("femaleGender");
    id15.setDatabaseId(femaleGender.getId());
    hibSession.save(id15);
    GlobalVariables.femaleGenderId = id15.getDatabaseId();
    femaleGender.setVersion(1);
    hibSession.flush();
    femaleGender = null;
  }

  static boolean applicationContextPropertyExists(String name, List<ApplicationContextProperty> res)
  { 
    for(ApplicationContextProperty a : res)
    { 
      if(a.getName().equals(name))
        return true;
    }
    return false;
  }

  public static void load()
  { 
    try
    { 
      maleGender = new exampleapp.domain.Gender();
      femaleGender = new exampleapp.domain.Gender();
      hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
      hibSession.beginTransaction();
      env = PageServlet.staticEnv;
      boolean pageServletIsNotSet = ThreadLocalPage.get() == null;
      if(pageServletIsNotSet)
      { 
        ThreadLocalPage.set(new GlobalsPageServlet(env));
      }
      org.hibernate.Query q = hibSession.createQuery("from ApplicationContextProperty");
      List<ApplicationContextProperty> res = q.list();
      if(!applicationContextPropertyExists("maleGender", res))
      { 
        env.putVariable("maleGender", maleGender);
      }
      if(!applicationContextPropertyExists("femaleGender", res))
      { 
        env.putVariable("femaleGender", femaleGender);
      }
      if(!applicationContextPropertyExists("maleGender", res))
        globalDeclarationMaleGender();
      if(!applicationContextPropertyExists("femaleGender", res))
        globalDeclarationFemaleGender();
      if(!applicationContextPropertyExists("maleGender", res))
        globalDeclarationMaleGenderPersist();
      if(!applicationContextPropertyExists("femaleGender", res))
        globalDeclarationFemaleGenderPersist();
      org.hibernate.Query q2 = hibSession.createQuery("from ApplicationContextProperty");
      List<ApplicationContextProperty> results = q2.list();
      for(ApplicationContextProperty a : results)
      { 
        if(a.getName().equals("maleGender"))
        { 
          maleGenderId = a.getDatabaseId();
        }
        if(a.getName().equals("femaleGender"))
        { 
          femaleGenderId = a.getDatabaseId();
        }
      }
      hibSession = null;
      env = null;
      if(pageServletIsNotSet)
      { 
        ThreadLocalPage.set(null);
      }
      out = null;
    }
    catch(Exception se)
    { 
      System.out.println("Exception occured while instantiating global variables.");
      se.printStackTrace();
    }
  }

  static
  { 
    load();
  }
}