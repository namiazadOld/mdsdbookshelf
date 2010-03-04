package utils;

import java.util.Properties;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.webdsl.*;
import org.hibernate.event.*;
import org.hibernate.event.def.*;
import java.util.*;
import exampleapp.domain.*;

public class HibernateUtilConfigured  
{ 
  private static final SessionFactory sessionFactory;

  private static AnnotationConfiguration annotationConfiguration;

  static
  { 
    try
    { 
      annotationConfiguration = new AnnotationConfiguration();
      annotationConfiguration.addPackage("utils");
      annotationConfiguration.addAnnotatedClass(utils.ApplicationContextProperty.class);
      annotationConfiguration.addAnnotatedClass(utils.File.class);
      annotationConfiguration.addPackage("exampleapp.domain");
      annotationConfiguration.addAnnotatedClass(exampleapp.domain.User.class);
      annotationConfiguration.addAnnotatedClass(exampleapp.domain.Gender.class);
      annotationConfiguration.addAnnotatedClass(exampleapp.domain.Color.class);
      annotationConfiguration.addAnnotatedClass(exampleapp.domain.Person.class);
      annotationConfiguration.setListener("save-update", new SetVersionSaveOrUpdateEventListener());
      sessionFactory = annotationConfiguration.buildSessionFactory();
    }
    catch(Throwable ex)
    { 
      throw new ExceptionInInitializerError(ex);
    }
  }

  public static SessionFactory getSessionFactory()
  { 
    return sessionFactory;
  }

  public static AnnotationConfiguration getAnnotationConfiguration()
  { 
    return annotationConfiguration;
  }

  private static class SetVersionSaveOrUpdateEventListener extends DefaultSaveOrUpdateEventListener 
  { 
    public void onSaveOrUpdate(SaveOrUpdateEvent event) throws HibernateException
    { 
      setVersion(event.getObject());
      super.onSaveOrUpdate(event);
    }

    public void setVersion(Object o)
    { 
      if(o instanceof WebDSLEntity)
      { 
        WebDSLEntity we = (WebDSLEntity)o;
        if(we.getVersion() <= 0)
        { 
          we.setVersion(1);
        }
      }
    }
  }
}