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

  public static exampleapp.domain.Gender loadGender_(org.hibernate.Session hibSession, Environment env, java.util.UUID prop12, PrintWriter out)
  { 
    try
    { 
      return (exampleapp.domain.Gender)org.webdsl.tools.Utils.cast(utils.EntityType.loadEntity(hibSession, String.class, prop12), exampleapp.domain.Gender.class);
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

  public static java.util.List<exampleapp.domain.Gender> findGenderByName_(org.hibernate.Session hibSession, Environment env, String prop13, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from Gender as g where g . _name = :param12").setParameter("param12", prop13).list();
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

  public static java.util.List<exampleapp.domain.Gender> findGenderByNameLike_(org.hibernate.Session hibSession, Environment env, String prop14, PrintWriter out)
  { 
    try
    { 
      String s6 = "%" + prop14 + "%";
      return hibSession.createQuery("select g from Gender as g where g . _name like :param13").setParameter("param13", s6).list();
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

  public static exampleapp.domain.User findUser_(org.hibernate.Session hibSession, Environment env, String theid2, PrintWriter out)
  { 
    try
    { 
      java.util.List<exampleapp.domain.User> list12 = hibSession.createQuery("select g from User as g where g . _username = :param14").setParameter("param14", theid2).list();
      if(!(org.webdsl.tools.Utils.equal(list12.size(), null) || org.webdsl.tools.Utils.equal(0, null)) && list12.size() > 0)
      { 
        return 0 >= 0 && 0 < list12.size() ? list12.get(0) : null;
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

  public static exampleapp.domain.User loadUser_(org.hibernate.Session hibSession, Environment env, String prop15, PrintWriter out)
  { 
    try
    { 
      return GlobalFunctions.findUser_(hibSession, env, prop15, out);
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

  public static java.util.List<exampleapp.domain.User> findUserByUsername_(org.hibernate.Session hibSession, Environment env, String prop16, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from User as g where g . _username = :param15").setParameter("param15", prop16).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByUsernameLike_(org.hibernate.Session hibSession, Environment env, String prop17, PrintWriter out)
  { 
    try
    { 
      String s7 = "%" + prop17 + "%";
      return hibSession.createQuery("select g from User as g where g . _username like :param16").setParameter("param16", s7).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByPassword_(org.hibernate.Session hibSession, Environment env, String prop18, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from User as g where g . _password = :param17").setParameter("param17", prop18).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByPasswordLike_(org.hibernate.Session hibSession, Environment env, String prop19, PrintWriter out)
  { 
    try
    { 
      String s8 = "%" + prop19 + "%";
      return hibSession.createQuery("select g from User as g where g . _password like :param18").setParameter("param18", s8).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByFirstname_(org.hibernate.Session hibSession, Environment env, String prop20, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from User as g where g . _firstname = :param19").setParameter("param19", prop20).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByFirstnameLike_(org.hibernate.Session hibSession, Environment env, String prop21, PrintWriter out)
  { 
    try
    { 
      String s9 = "%" + prop21 + "%";
      return hibSession.createQuery("select g from User as g where g . _firstname like :param20").setParameter("param20", s9).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByLastname_(org.hibernate.Session hibSession, Environment env, String prop22, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from User as g where g . _lastname = :param21").setParameter("param21", prop22).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByLastnameLike_(org.hibernate.Session hibSession, Environment env, String prop23, PrintWriter out)
  { 
    try
    { 
      String s10 = "%" + prop23 + "%";
      return hibSession.createQuery("select g from User as g where g . _lastname like :param22").setParameter("param22", s10).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByEmail_(org.hibernate.Session hibSession, Environment env, String prop24, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from User as g where g . _email = :param23").setParameter("param23", prop24).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByEmailLike_(org.hibernate.Session hibSession, Environment env, String prop25, PrintWriter out)
  { 
    try
    { 
      String s11 = "%" + prop25 + "%";
      return hibSession.createQuery("select g from User as g where g . _email like :param24").setParameter("param24", s11).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByPhoneno_(org.hibernate.Session hibSession, Environment env, String prop26, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from User as g where g . _phoneno = :param25").setParameter("param25", prop26).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByPhonenoLike_(org.hibernate.Session hibSession, Environment env, String prop27, PrintWriter out)
  { 
    try
    { 
      String s12 = "%" + prop27 + "%";
      return hibSession.createQuery("select g from User as g where g . _phoneno like :param26").setParameter("param26", s12).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByMobileno_(org.hibernate.Session hibSession, Environment env, String prop28, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from User as g where g . _mobileno = :param27").setParameter("param27", prop28).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByMobilenoLike_(org.hibernate.Session hibSession, Environment env, String prop29, PrintWriter out)
  { 
    try
    { 
      String s13 = "%" + prop29 + "%";
      return hibSession.createQuery("select g from User as g where g . _mobileno like :param28").setParameter("param28", s13).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByAddress1_(org.hibernate.Session hibSession, Environment env, String prop30, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from User as g where g . _address1 = :param29").setParameter("param29", prop30).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByAddress1Like_(org.hibernate.Session hibSession, Environment env, String prop31, PrintWriter out)
  { 
    try
    { 
      String s14 = "%" + prop31 + "%";
      return hibSession.createQuery("select g from User as g where g . _address1 like :param30").setParameter("param30", s14).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByAddress2_(org.hibernate.Session hibSession, Environment env, String prop32, PrintWriter out)
  { 
    try
    { 
      return hibSession.createQuery("select g from User as g where g . _address2 = :param31").setParameter("param31", prop32).list();
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

  public static java.util.List<exampleapp.domain.User> findUserByAddress2Like_(org.hibernate.Session hibSession, Environment env, String prop33, PrintWriter out)
  { 
    try
    { 
      String s15 = "%" + prop33 + "%";
      return hibSession.createQuery("select g from User as g where g . _address2 like :param32").setParameter("param32", s15).list();
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

  public static exampleapp.domain.User getUniqueUser_(org.hibernate.Session hibSession, Environment env, String ident, PrintWriter out)
  { 
    exampleapp.domain.User result = (exampleapp.domain.User)hibSession.createCriteria(exampleapp.domain.User.class).add(org.hibernate.criterion.Restrictions.eq("_" + "username", ident)).uniqueResult();
    if(result != null)
    { 
      return result;
    }
    else
    { 
      exampleapp.domain.User newObject = new exampleapp.domain.User();
      newObject.setUsernameNoEventsOrValidation(ident);
      hibSession.save(newObject);
      hibSession.flush();
      return newObject;
    }
  }

  public static boolean isUniqueUser_(org.hibernate.Session hibSession, Environment env, exampleapp.domain.User object, PrintWriter out)
  { 
    exampleapp.domain.User result = (exampleapp.domain.User)hibSession.createCriteria(exampleapp.domain.User.class).add(org.hibernate.criterion.Restrictions.eq("_" + "username", object.getUsername().toLowerCase())).uniqueResult();
    if(result != null && !result.getId().equals(object.getId()))
    { 
      return false;
    }
    else
    { 
      return true;
    }
  }

  public static boolean isUniqueUserId_(org.hibernate.Session hibSession, Environment env, String ident, PrintWriter out)
  { 
    exampleapp.domain.User temp = new exampleapp.domain.User();
    temp.setUsernameNoEventsOrValidation(ident);
    return isUniqueUser_(hibSession, env, temp, out);
  }

  public static boolean isUniqueUserId_(org.hibernate.Session hibSession, Environment env, String ident, exampleapp.domain.User object, PrintWriter out)
  { 
    exampleapp.domain.User tempobject = new exampleapp.domain.User();
    tempobject.setId(object.getId());
    tempobject.setUsernameNoEventsOrValidation(ident);
    return isUniqueUser_(hibSession, env, tempobject, out);
  }
}