package exampleapp.domain;

import java.util.*;
import javax.persistence.*;
import exampleapp.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_User", uniqueConstraints = @UniqueConstraint(columnNames = {"_username"})) @javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.SINGLE_TABLE) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) class User  implements org.webdsl.WebDSLEntity
{ 
  public void validateDelete()
  { 
    java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
    if(exceptions.size() > 0)
    { 
      throw new MultipleValidationExceptions(exceptions);
    }
  }

  public void validateSave()
  { 
    java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
    if(exceptions.size() > 0)
    { 
      throw new MultipleValidationExceptions(exceptions);
    }
  }

  public User () 
  { }

  @javax.persistence.Id @org.hibernate.annotations.Type(type = "utils.UUIDUserType") @javax.persistence.Column(name = "id", length = 32) protected java.util.UUID _id = java.util.UUID.randomUUID();

  public java.util.UUID getId()
  { 
    return _id;
  }

  public void setId(java.util.UUID idarg)
  { 
    this._id = idarg;
  }

  @Version @Column(name = "version_opt_lock") protected Integer _version = 0;

  public Integer getVersion()
  { 
    return _version;
  }

  public void setVersion(Integer v)
  { 
    this._version = v;
  }

  public boolean equals(Object o)
  { 
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("User") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? User.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : User.class.cast(o)).getId(), getId());
  }

  @Transient public boolean propertyEventsEnabled = false;

  @Transient public org.hibernate.Session hibSession = null;

  @Transient public Environment env = null;

  @Transient public java.io.PrintWriter out = null;

  public User setupForPropertyEvents(org.hibernate.Session hibSession, java.io.PrintWriter out)
  { 
    if(!propertyEventsEnabled)
    { 
      this.hibSession = hibSession;
      this.out = out;
      if(ThreadLocalPage.get() != null)
      { 
        this.env = ThreadLocalPage.get().envGlobalAndSession;
      }
      propertyEventsEnabled = true;
    }
    return this;
  }

  public int hashCode()
  { 
    if(getId() == null)
      return super.hashCode();
    else
      return getId().hashCode();
  }

  public int compareTo(org.webdsl.WebDSLEntity o)
  { 
    return getId().compareTo(((User)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("User") || s.equals("Object") || s.equals("Entity");
  }

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _username = "";

  public String getUsername()
  { 
    return _username;
  }

  public void setUsername(String newitem)
  { 
    if(!usernameBeingSet)
    { 
      usernameBeingSet = true;
      String item = newitem;
      String oldthing = getUsername();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setUsername_(hibSession, env, newitem, out);
      }
      String olditem = _username;
      _username = newitem;
      usernameBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!(newitem.length() <= 255))
      { 
        exceptions.add(new utils.ValidationException(null, "value too long (max " + 255 + " characters)"));
      }
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setUsernameNoEventsOrValidation(String newitem)
  { 
    _username = newitem;
  }

  @Transient boolean usernameBeingSet = false;

  public String getNaturalId()
  { 
    return _username.toString();
  }

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _password = "";

  public String getPassword()
  { 
    return _password;
  }

  public void setPassword(String newitem)
  { 
    if(!passwordBeingSet)
    { 
      passwordBeingSet = true;
      String item = newitem;
      String oldthing = getPassword();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setPassword_(hibSession, env, newitem, out);
      }
      String olditem = _password;
      _password = newitem;
      passwordBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!(newitem.length() <= 255))
      { 
        exceptions.add(new utils.ValidationException(null, "value too long (max " + 255 + " characters)"));
      }
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setPasswordNoEventsOrValidation(String newitem)
  { 
    _password = newitem;
  }

  @Transient boolean passwordBeingSet = false;

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _firstname = "";

  public String getFirstname()
  { 
    return _firstname;
  }

  public void setFirstname(String newitem)
  { 
    if(!firstnameBeingSet)
    { 
      firstnameBeingSet = true;
      String item = newitem;
      String oldthing = getFirstname();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setFirstname_(hibSession, env, newitem, out);
      }
      String olditem = _firstname;
      _firstname = newitem;
      firstnameBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!(newitem.length() <= 255))
      { 
        exceptions.add(new utils.ValidationException(null, "value too long (max " + 255 + " characters)"));
      }
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setFirstnameNoEventsOrValidation(String newitem)
  { 
    _firstname = newitem;
  }

  @Transient boolean firstnameBeingSet = false;

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _lastname = "";

  public String getLastname()
  { 
    return _lastname;
  }

  public void setLastname(String newitem)
  { 
    if(!lastnameBeingSet)
    { 
      lastnameBeingSet = true;
      String item = newitem;
      String oldthing = getLastname();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setLastname_(hibSession, env, newitem, out);
      }
      String olditem = _lastname;
      _lastname = newitem;
      lastnameBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!(newitem.length() <= 255))
      { 
        exceptions.add(new utils.ValidationException(null, "value too long (max " + 255 + " characters)"));
      }
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setLastnameNoEventsOrValidation(String newitem)
  { 
    _lastname = newitem;
  }

  @Transient boolean lastnameBeingSet = false;

  @ManyToOne(fetch = javax.persistence.FetchType.LAZY) @JoinColumn(name = "User_gender") @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.MERGE}) @org.hibernate.annotations.AccessType(value = "field") protected exampleapp.domain.Gender _gender = null;

  public exampleapp.domain.Gender getGender()
  { 
    return _gender;
  }

  public void setGender(exampleapp.domain.Gender newitem)
  { 
    if(!genderBeingSet)
    { 
      genderBeingSet = true;
      exampleapp.domain.Gender item = newitem;
      exampleapp.domain.Gender oldthing = getGender();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setGender_(hibSession, env, newitem, out);
      }
      exampleapp.domain.Gender olditem = _gender;
      _gender = newitem;
      genderBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setGenderNoEventsOrValidation(exampleapp.domain.Gender newitem)
  { 
    _gender = newitem;
  }

  @Transient boolean genderBeingSet = false;

  @Temporal(TemporalType.DATE) @org.hibernate.annotations.AccessType(value = "field") protected java.util.Date _birthdate = null;

  public java.util.Date getBirthdate()
  { 
    return _birthdate;
  }

  public void setBirthdate(java.util.Date newitem)
  { 
    if(!birthdateBeingSet)
    { 
      birthdateBeingSet = true;
      java.util.Date item = newitem;
      java.util.Date oldthing = getBirthdate();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setBirthdate_(hibSession, env, newitem, out);
      }
      java.util.Date olditem = _birthdate;
      _birthdate = newitem;
      birthdateBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setBirthdateNoEventsOrValidation(java.util.Date newitem)
  { 
    _birthdate = newitem;
  }

  @Transient boolean birthdateBeingSet = false;

  @org.hibernate.annotations.AccessType(value = "field") protected Boolean _isactive = false;

  public Boolean getIsactive()
  { 
    return _isactive;
  }

  public void setIsactive(Boolean newitem)
  { 
    if(!isactiveBeingSet)
    { 
      isactiveBeingSet = true;
      Boolean item = newitem;
      Boolean oldthing = getIsactive();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setIsactive_(hibSession, env, newitem, out);
      }
      Boolean olditem = _isactive;
      _isactive = newitem;
      isactiveBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setIsactiveNoEventsOrValidation(Boolean newitem)
  { 
    _isactive = newitem;
  }

  @Transient boolean isactiveBeingSet = false;

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _email = "";

  public String getEmail()
  { 
    return _email;
  }

  public void setEmail(String newitem)
  { 
    if(!emailBeingSet)
    { 
      emailBeingSet = true;
      String item = newitem;
      String oldthing = getEmail();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setEmail_(hibSession, env, newitem, out);
      }
      String olditem = _email;
      _email = newitem;
      emailBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!(newitem.length() <= 255))
      { 
        exceptions.add(new utils.ValidationException(null, "value too long (max " + 255 + " characters)"));
      }
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setEmailNoEventsOrValidation(String newitem)
  { 
    _email = newitem;
  }

  @Transient boolean emailBeingSet = false;

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _phoneno = "";

  public String getPhoneno()
  { 
    return _phoneno;
  }

  public void setPhoneno(String newitem)
  { 
    if(!phonenoBeingSet)
    { 
      phonenoBeingSet = true;
      String item = newitem;
      String oldthing = getPhoneno();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setPhoneno_(hibSession, env, newitem, out);
      }
      String olditem = _phoneno;
      _phoneno = newitem;
      phonenoBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!(newitem.length() <= 255))
      { 
        exceptions.add(new utils.ValidationException(null, "value too long (max " + 255 + " characters)"));
      }
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setPhonenoNoEventsOrValidation(String newitem)
  { 
    _phoneno = newitem;
  }

  @Transient boolean phonenoBeingSet = false;

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _mobileno = "";

  public String getMobileno()
  { 
    return _mobileno;
  }

  public void setMobileno(String newitem)
  { 
    if(!mobilenoBeingSet)
    { 
      mobilenoBeingSet = true;
      String item = newitem;
      String oldthing = getMobileno();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setMobileno_(hibSession, env, newitem, out);
      }
      String olditem = _mobileno;
      _mobileno = newitem;
      mobilenoBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!(newitem.length() <= 255))
      { 
        exceptions.add(new utils.ValidationException(null, "value too long (max " + 255 + " characters)"));
      }
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setMobilenoNoEventsOrValidation(String newitem)
  { 
    _mobileno = newitem;
  }

  @Transient boolean mobilenoBeingSet = false;

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _address1 = "";

  public String getAddress1()
  { 
    return _address1;
  }

  public void setAddress1(String newitem)
  { 
    if(!address1BeingSet)
    { 
      address1BeingSet = true;
      String item = newitem;
      String oldthing = getAddress1();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setAddress1_(hibSession, env, newitem, out);
      }
      String olditem = _address1;
      _address1 = newitem;
      address1BeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!(newitem.length() <= 255))
      { 
        exceptions.add(new utils.ValidationException(null, "value too long (max " + 255 + " characters)"));
      }
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setAddress1NoEventsOrValidation(String newitem)
  { 
    _address1 = newitem;
  }

  @Transient boolean address1BeingSet = false;

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _address2 = "";

  public String getAddress2()
  { 
    return _address2;
  }

  public void setAddress2(String newitem)
  { 
    if(!address2BeingSet)
    { 
      address2BeingSet = true;
      String item = newitem;
      String oldthing = getAddress2();
      if(oldthing != null && item == null)
      { 
        item = oldthing;
      }
      else
        if(oldthing != null && item != null)
        { 
          item = oldthing;
        }
        else
          if(oldthing == null && item != null)
          { }
      if(propertyEventsEnabled)
      { 
        this.setAddress2_(hibSession, env, newitem, out);
      }
      String olditem = _address2;
      _address2 = newitem;
      address2BeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!(newitem.length() <= 255))
      { 
        exceptions.add(new utils.ValidationException(null, "value too long (max " + 255 + " characters)"));
      }
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setAddress2NoEventsOrValidation(String newitem)
  { 
    _address2 = newitem;
  }

  @Transient boolean address2BeingSet = false;

  public String getName()
  { 
    if(getId() != null)
    { 
      return getId().toString();
    }
    else
    { 
      return "";
    }
  }

  public String get_WebDslEntityType()
  { 
    return "User";
  }

  public void signup_(org.hibernate.Session hibSession, Environment env, PrintWriter out)
  { 
    try
    { 
      this.setupForPropertyEvents(hibSession, out).setPassword(org.webdsl.tools.Utils.secretDigest(this.setupForPropertyEvents(hibSession, out).getPassword()));
      this.setupForPropertyEvents(hibSession, out).setIsactive(true);
      this.setupForPropertyEvents(hibSession, out).validateSave();
      this.setVersion(1);
      hibSession.save(this);
      System.out.println("Sign Up Log: " + this);
      ThreadLocalPage.get().getOutgoingSuccessMessages().add("Your registration has been done successfully.");
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

  public void User_(org.hibernate.Session hibSession, Environment env, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setUsername_(org.hibernate.Session hibSession, Environment env, String value14, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setPassword_(org.hibernate.Session hibSession, Environment env, String value15, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setFirstname_(org.hibernate.Session hibSession, Environment env, String value16, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setLastname_(org.hibernate.Session hibSession, Environment env, String value17, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setGender_(org.hibernate.Session hibSession, Environment env, exampleapp.domain.Gender value18, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setBirthdate_(org.hibernate.Session hibSession, Environment env, java.util.Date value19, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setIsactive_(org.hibernate.Session hibSession, Environment env, Boolean value20, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setEmail_(org.hibernate.Session hibSession, Environment env, String value21, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setPhoneno_(org.hibernate.Session hibSession, Environment env, String value22, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setMobileno_(org.hibernate.Session hibSession, Environment env, String value23, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setAddress1_(org.hibernate.Session hibSession, Environment env, String value24, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }

  public void setAddress2_(org.hibernate.Session hibSession, Environment env, String value25, PrintWriter out)
  { 
    try
    { }
    catch(ValidationException ve)
    { 
      throw ve;
    }
    catch(MultipleValidationExceptions ve)
    { 
      throw ve;
    }
  }
}