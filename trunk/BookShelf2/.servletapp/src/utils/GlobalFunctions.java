package utils;

import java.io.*;
import java.util.HashMap;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import utils.*;
import exampleapp.beans.*;
import exampleapp.domain.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public class GlobalFunctions  
{ 
  private static org.hibernate.Session hibSession;

  private static TemplateCall templateArg = TemplateCall.None;

  private static HashMap<String, utils.TemplateCall> withcallsmap = new HashMap<String, utils.TemplateCall>();

  public static exampleapp.domain.Person findPerson_(org.hibernate.Session hibSession, Environment env, String theid0, PrintWriter out)
  { 
    try
    { 
      java.util.List<exampleapp.domain.Person> list0 = hibSession.createQuery("select g from Person as g where g . _username = :param0").setParameter("param0", theid0).list();
      if(!(org.webdsl.tools.Utils.equal(list0.size(), null) || org.webdsl.tools.Utils.equal(0, null)) && list0.size() > 0)
      { 
        return 0 >= 0 && 0 < list0.size() ? list0.get(0) : null;
      }
      else
      { 
        return null;
      }
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static exampleapp.domain.Person loadPerson_(org.hibernate.Session hibSession, Environment env, String prop0, PrintWriter out)
  { 
    try
    { 
      return GlobalFunctions.findPerson_(hibSession, env, prop0, out);
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static java.util.List<exampleapp.domain.Person> findPersonByFullname_(org.hibernate.Session hibSession, Environment env, String prop1, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from Person as g where g . _fullname = :param1").setParameter("param1", prop1).list();
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static java.util.List<exampleapp.domain.Person> findPersonByFullnameLike_(org.hibernate.Session hibSession, Environment env, String prop2, PrintWriter out)
  { 
    try
    { 
      String s0 = "%" + prop2 + "%";
      return hibSession.createQuery("select g from Person as g where g . _fullname like :param2").setParameter("param2", s0).list();
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static java.util.List<exampleapp.domain.Person> findPersonByEmail_(org.hibernate.Session hibSession, Environment env, String prop3, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from Person as g where g . _email = :param3").setParameter("param3", prop3).list();
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static java.util.List<exampleapp.domain.Person> findPersonByEmailLike_(org.hibernate.Session hibSession, Environment env, String prop4, PrintWriter out)
  { 
    try
    { 
      String s2 = "%" + prop4 + "%";
      return hibSession.createQuery("select g from Person as g where g . _email like :param4").setParameter("param4", s2).list();
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static java.util.List<exampleapp.domain.Person> findPersonByUsername_(org.hibernate.Session hibSession, Environment env, String prop5, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from Person as g where g . _username = :param5").setParameter("param5", prop5).list();
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static java.util.List<exampleapp.domain.Person> findPersonByUsernameLike_(org.hibernate.Session hibSession, Environment env, String prop6, PrintWriter out)
  { 
    try
    { 
      String s3 = "%" + prop6 + "%";
      return hibSession.createQuery("select g from Person as g where g . _username like :param6").setParameter("param6", s3).list();
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static java.util.List<exampleapp.domain.Person> findPersonByBio_(org.hibernate.Session hibSession, Environment env, String prop7, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from Person as g where g . _bio = :param7").setParameter("param7", prop7).list();
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static java.util.List<exampleapp.domain.Person> findPersonByBioLike_(org.hibernate.Session hibSession, Environment env, String prop8, PrintWriter out)
  { 
    try
    { 
      String s4 = "%" + prop8 + "%";
      return hibSession.createQuery("select g from Person as g where g . _bio like :param8").setParameter("param8", s4).list();
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static exampleapp.domain.Color findColor_(org.hibernate.Session hibSession, Environment env, String theid1, PrintWriter out)
  { 
    try
    { 
      java.util.List<exampleapp.domain.Color> list2 = hibSession.createQuery("select g from Color as g where g . _name = :param9").setParameter("param9", theid1).list();
      if(!(org.webdsl.tools.Utils.equal(list2.size(), null) || org.webdsl.tools.Utils.equal(0, null)) && list2.size() > 0)
      { 
        return 0 >= 0 && 0 < list2.size() ? list2.get(0) : null;
      }
      else
      { 
        return null;
      }
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static exampleapp.domain.Color loadColor_(org.hibernate.Session hibSession, Environment env, String prop9, PrintWriter out)
  { 
    try
    { 
      return GlobalFunctions.findColor_(hibSession, env, prop9, out);
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static java.util.List<exampleapp.domain.Color> findColorByName_(org.hibernate.Session hibSession, Environment env, String prop10, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from Color as g where g . _name = :param10").setParameter("param10", prop10).list();
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static java.util.List<exampleapp.domain.Color> findColorByNameLike_(org.hibernate.Session hibSession, Environment env, String prop11, PrintWriter out)
  { 
    try
    { 
      String s5 = "%" + prop11 + "%";
      return hibSession.createQuery("select g from Color as g where g . _name like :param11").setParameter("param11", s5).list();
    }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public static exampleapp.domain.Person getUniquePerson_(org.hibernate.Session hibSession, Environment env, String ident, PrintWriter out)
  { 
    exampleapp.domain.Person result = (exampleapp.domain.Person)hibSession.createCriteria(exampleapp.domain.Person.class).add(org.hibernate.criterion.Restrictions.eq("_" + "username", ident)).uniqueResult();
    if(result != null)
    { 
      return result;
    }
    else
    { 
      exampleapp.domain.Person newObject = new exampleapp.domain.Person();
      newObject.setUsernameNoEventsOrValidation(ident);
      hibSession.save(newObject);
      hibSession.flush();
      return newObject;
    }
  }

  public static boolean isUniquePerson_(org.hibernate.Session hibSession, Environment env, exampleapp.domain.Person object, PrintWriter out)
  { 
    exampleapp.domain.Person result = (exampleapp.domain.Person)hibSession.createCriteria(exampleapp.domain.Person.class).add(org.hibernate.criterion.Restrictions.eq("_" + "username", object.getUsername().toLowerCase())).uniqueResult();
    if(result != null && !result.getId().equals(object.getId()))
    { 
      return false;
    }
    else
    { 
      return true;
    }
  }

  public static boolean isUniquePersonId_(org.hibernate.Session hibSession, Environment env, String ident, PrintWriter out)
  { 
    exampleapp.domain.Person temp = new exampleapp.domain.Person();
    temp.setUsernameNoEventsOrValidation(ident);
    return isUniquePerson_(hibSession, env, temp, out);
  }

  public static boolean isUniquePersonId_(org.hibernate.Session hibSession, Environment env, String ident, exampleapp.domain.Person object, PrintWriter out)
  { 
    exampleapp.domain.Person tempobject = new exampleapp.domain.Person();
    tempobject.setId(object.getId());
    tempobject.setUsernameNoEventsOrValidation(ident);
    return isUniquePerson_(hibSession, env, tempobject, out);
  }

  public static exampleapp.domain.Color getUniqueColor_(org.hibernate.Session hibSession, Environment env, String ident, PrintWriter out)
  { 
    exampleapp.domain.Color result = (exampleapp.domain.Color)hibSession.createCriteria(exampleapp.domain.Color.class).add(org.hibernate.criterion.Restrictions.eq("_" + "name", ident)).uniqueResult();
    if(result != null)
    { 
      return result;
    }
    else
    { 
      exampleapp.domain.Color newObject = new exampleapp.domain.Color();
      newObject.setNameNoEventsOrValidation(ident);
      hibSession.save(newObject);
      hibSession.flush();
      return newObject;
    }
  }

  public static boolean isUniqueColor_(org.hibernate.Session hibSession, Environment env, exampleapp.domain.Color object, PrintWriter out)
  { 
    exampleapp.domain.Color result = (exampleapp.domain.Color)hibSession.createCriteria(exampleapp.domain.Color.class).add(org.hibernate.criterion.Restrictions.eq("_" + "name", object.getName().toLowerCase())).uniqueResult();
    if(result != null && !result.getId().equals(object.getId()))
    { 
      return false;
    }
    else
    { 
      return true;
    }
  }

  public static boolean isUniqueColorId_(org.hibernate.Session hibSession, Environment env, String ident, PrintWriter out)
  { 
    exampleapp.domain.Color temp = new exampleapp.domain.Color();
    temp.setNameNoEventsOrValidation(ident);
    return isUniqueColor_(hibSession, env, temp, out);
  }

  public static boolean isUniqueColorId_(org.hibernate.Session hibSession, Environment env, String ident, exampleapp.domain.Color object, PrintWriter out)
  { 
    exampleapp.domain.Color tempobject = new exampleapp.domain.Color();
    tempobject.setId(object.getId());
    tempobject.setNameNoEventsOrValidation(ident);
    return isUniqueColor_(hibSession, env, tempobject, out);
  }
}