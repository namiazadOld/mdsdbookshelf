package exampleapp.domain;

import java.util.*;
import javax.persistence.*;
import exampleapp.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_Person", uniqueConstraints = @UniqueConstraint(columnNames = {"_username"})) @javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.SINGLE_TABLE) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) class Person  implements org.webdsl.WebDSLEntity
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
    if(!GlobalFunctions.isUniquePerson_(hibSession, env, this, out))
    { 
      exceptions.add(new utils.ValidationException(null, "Username is taken"));
    }
    if(!(!(org.webdsl.tools.Utils.equal(_username.length(), null) || org.webdsl.tools.Utils.equal(0, null)) && _username.length() > 0))
    { 
      exceptions.add(new utils.ValidationException(null, "Username may not be empty"));
    }
    if(exceptions.size() > 0)
    { 
      throw new MultipleValidationExceptions(exceptions);
    }
  }

  public Person () 
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("Person") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? Person.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : Person.class.cast(o)).getId(), getId());
  }

  @Transient public boolean propertyEventsEnabled = false;

  @Transient public org.hibernate.Session hibSession = null;

  @Transient public Environment env = null;

  @Transient public java.io.PrintWriter out = null;

  public Person setupForPropertyEvents(org.hibernate.Session hibSession, java.io.PrintWriter out)
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
    return getId().compareTo(((Person)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("Person") || s.equals("Object") || s.equals("Entity");
  }

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _fullname = "";

  public String getFullname()
  { 
    return _fullname;
  }

  public void setFullname(String newitem)
  { 
    if(!fullnameBeingSet)
    { 
      fullnameBeingSet = true;
      String item = newitem;
      String oldthing = getFullname();
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
        this.setFullname_(hibSession, env, newitem, out);
      }
      String olditem = _fullname;
      _fullname = newitem;
      fullnameBeingSet = false;
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

  public void setFullnameNoEventsOrValidation(String newitem)
  { 
    _fullname = newitem;
  }

  @Transient boolean fullnameBeingSet = false;

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
      if(!GlobalFunctions.isUniquePerson_(hibSession, env, this, out))
      { 
        exceptions.add(new utils.ValidationException(null, "Username is taken"));
      }
      if(!(!(org.webdsl.tools.Utils.equal(_username.length(), null) || org.webdsl.tools.Utils.equal(0, null)) && _username.length() > 0))
      { 
        exceptions.add(new utils.ValidationException(null, "Username may not be empty"));
      }
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

  @javax.persistence.Column(length = 1000000) @org.hibernate.annotations.AccessType(value = "field") protected String _bio = "";

  public String getBio()
  { 
    return _bio;
  }

  public void setBio(String newitem)
  { 
    if(!bioBeingSet)
    { 
      bioBeingSet = true;
      String item = newitem;
      String oldthing = getBio();
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
        this.setBio_(hibSession, env, newitem, out);
      }
      String olditem = _bio;
      _bio = newitem;
      bioBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!(newitem.length() <= 1000000))
      { 
        exceptions.add(new utils.ValidationException(null, "value too long (max " + 1000000 + " characters)"));
      }
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setBioNoEventsOrValidation(String newitem)
  { 
    _bio = newitem;
  }

  @Transient boolean bioBeingSet = false;

  @Temporal(TemporalType.DATE) @org.hibernate.annotations.AccessType(value = "field") protected java.util.Date _dateOfBirth = null;

  public java.util.Date getDateOfBirth()
  { 
    return _dateOfBirth;
  }

  public void setDateOfBirth(java.util.Date newitem)
  { 
    if(!dateOfBirthBeingSet)
    { 
      dateOfBirthBeingSet = true;
      java.util.Date item = newitem;
      java.util.Date oldthing = getDateOfBirth();
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
        this.setDateOfBirth_(hibSession, env, newitem, out);
      }
      java.util.Date olditem = _dateOfBirth;
      _dateOfBirth = newitem;
      dateOfBirthBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setDateOfBirthNoEventsOrValidation(java.util.Date newitem)
  { 
    _dateOfBirth = newitem;
  }

  @Transient boolean dateOfBirthBeingSet = false;

  @ManyToMany(mappedBy = "_children", targetEntity = Person.class, fetch = javax.persistence.FetchType.LAZY) @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.MERGE}) protected java.util.Set<exampleapp.domain.Person> _parents = new java.util.LinkedHashSet<exampleapp.domain.Person>();

  public java.util.Set<exampleapp.domain.Person> getParents()
  { 
    return _parents;
  }

  public void setParents(java.util.Set<exampleapp.domain.Person> newitem)
  { 
    _parents = newitem;
  }

  @Transient boolean parentsBeingSet = false;

  public java.util.List<exampleapp.domain.Person> getParentsList()
  { 
    return new ArrayList(getParents());
  }

  public void setParentsList(java.util.List<exampleapp.domain.Person> list109)
  { 
    setParents(new java.util.LinkedHashSet<exampleapp.domain.Person>(list109));
  }

  public int getParentsLength()
  { 
    return getParents().size();
  }

  public void removeFromParents(exampleapp.domain.Person item)
  { 
    if(item != null && !parentsBeingSet)
    { 
      parentsBeingSet = true;
      getParents().remove(item);
      if(!getParents().contains(item))
      { 
        item.removeFromChildren(this);
        if(propertyEventsEnabled)
        { 
          this.removeFromParents_(hibSession, env, item, out);
        }
        java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
        if(exceptions.size() > 0)
        { 
          throw new MultipleValidationExceptions(exceptions);
        }
      }
      parentsBeingSet = false;
    }
  }

  public void removeAllFromParents()
  { 
    org.hibernate.Hibernate.initialize(getParents());
    while(!getParents().isEmpty())
    { 
      removeFromParents(getParents().iterator().next());
    }
  }

  public void addToParents(exampleapp.domain.Person item)
  { 
    if(item != null && !parentsBeingSet)
    { 
      parentsBeingSet = true;
      exampleapp.domain.Person oldthing = new exampleapp.domain.Person();
      getParents().add(item);
      item.addToChildren(this);
      if(propertyEventsEnabled)
      { 
        this.addToParents_(hibSession, env, item, out);
      }
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
      parentsBeingSet = false;
    }
  }

  public java.util.Set<exampleapp.domain.Person> addAllToParents(java.util.Collection<exampleapp.domain.Person> col)
  { 
    Iterator<exampleapp.domain.Person> it = col.iterator();
    while(it.hasNext())
    { 
      addToParents(it.next());
    }
    return getParents();
  }

  @ManyToMany(fetch = javax.persistence.FetchType.LAZY) @JoinTable(name = "Person_children_Person", joinColumns = {@JoinColumn(name = "Person_id_owner")}, inverseJoinColumns = {@JoinColumn(name = "Person_id_inverse")}) @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.MERGE}) protected java.util.Set<exampleapp.domain.Person> _children = new java.util.LinkedHashSet<exampleapp.domain.Person>();

  public java.util.Set<exampleapp.domain.Person> getChildren()
  { 
    return _children;
  }

  public void setChildren(java.util.Set<exampleapp.domain.Person> newitem)
  { 
    _children = newitem;
  }

  @Transient boolean childrenBeingSet = false;

  public java.util.List<exampleapp.domain.Person> getChildrenList()
  { 
    return new ArrayList(getChildren());
  }

  public void setChildrenList(java.util.List<exampleapp.domain.Person> list110)
  { 
    setChildren(new java.util.LinkedHashSet<exampleapp.domain.Person>(list110));
  }

  public int getChildrenLength()
  { 
    return getChildren().size();
  }

  public void removeFromChildren(exampleapp.domain.Person item)
  { 
    if(item != null && !childrenBeingSet)
    { 
      childrenBeingSet = true;
      getChildren().remove(item);
      if(!getChildren().contains(item))
      { 
        item.removeFromParents(this);
        if(propertyEventsEnabled)
        { 
          this.removeFromChildren_(hibSession, env, item, out);
        }
        java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
        if(exceptions.size() > 0)
        { 
          throw new MultipleValidationExceptions(exceptions);
        }
      }
      childrenBeingSet = false;
    }
  }

  public void removeAllFromChildren()
  { 
    org.hibernate.Hibernate.initialize(getChildren());
    while(!getChildren().isEmpty())
    { 
      removeFromChildren(getChildren().iterator().next());
    }
  }

  public void addToChildren(exampleapp.domain.Person item)
  { 
    if(item != null && !childrenBeingSet)
    { 
      childrenBeingSet = true;
      exampleapp.domain.Person oldthing = new exampleapp.domain.Person();
      getChildren().add(item);
      item.addToParents(this);
      if(propertyEventsEnabled)
      { 
        this.addToChildren_(hibSession, env, item, out);
      }
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
      childrenBeingSet = false;
    }
  }

  public java.util.Set<exampleapp.domain.Person> addAllToChildren(java.util.Collection<exampleapp.domain.Person> col)
  { 
    Iterator<exampleapp.domain.Person> it = col.iterator();
    while(it.hasNext())
    { 
      addToChildren(it.next());
    }
    return getChildren();
  }

  @org.hibernate.annotations.AccessType(value = "field") @OneToOne(fetch = javax.persistence.FetchType.LAZY) @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.MERGE}) protected utils.File _photo = null;

  public utils.File getPhoto()
  { 
    return _photo;
  }

  public void setPhoto(utils.File newitem)
  { 
    if(!photoBeingSet)
    { 
      photoBeingSet = true;
      utils.File item = newitem;
      utils.File oldthing = getPhoto();
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
        this.setPhoto_(hibSession, env, newitem, out);
      }
      utils.File olditem = _photo;
      _photo = newitem;
      photoBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setPhotoNoEventsOrValidation(utils.File newitem)
  { 
    _photo = newitem;
  }

  @Transient boolean photoBeingSet = false;

  @org.hibernate.annotations.AccessType(value = "field") protected Boolean _admin = false;

  public Boolean getAdmin()
  { 
    return _admin;
  }

  public void setAdmin(Boolean newitem)
  { 
    if(!adminBeingSet)
    { 
      adminBeingSet = true;
      Boolean item = newitem;
      Boolean oldthing = getAdmin();
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
        this.setAdmin_(hibSession, env, newitem, out);
      }
      Boolean olditem = _admin;
      _admin = newitem;
      adminBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setAdminNoEventsOrValidation(Boolean newitem)
  { 
    _admin = newitem;
  }

  @Transient boolean adminBeingSet = false;

  @ManyToOne(fetch = javax.persistence.FetchType.LAZY) @JoinColumn(name = "Person_favoriteColor") @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.MERGE}) @org.hibernate.annotations.AccessType(value = "field") protected exampleapp.domain.Color _favoriteColor = null;

  public exampleapp.domain.Color getFavoriteColor()
  { 
    return _favoriteColor;
  }

  public void setFavoriteColor(exampleapp.domain.Color newitem)
  { 
    if(!favoriteColorBeingSet)
    { 
      favoriteColorBeingSet = true;
      exampleapp.domain.Color item = newitem;
      exampleapp.domain.Color oldthing = getFavoriteColor();
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
        this.setFavoriteColor_(hibSession, env, newitem, out);
      }
      exampleapp.domain.Color olditem = _favoriteColor;
      _favoriteColor = newitem;
      favoriteColorBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(exceptions.size() > 0)
      { 
        throw new MultipleValidationExceptions(exceptions);
      }
    }
  }

  public void setFavoriteColorNoEventsOrValidation(exampleapp.domain.Color newitem)
  { 
    _favoriteColor = newitem;
  }

  @Transient boolean favoriteColorBeingSet = false;

  public String getName()
  { 
    if(getFullname() != null)
    { 
      return getFullname().toString();
    }
    else
    { 
      return "";
    }
  }

  public String get_WebDslEntityType()
  { 
    return "Person";
  }

  public void Person_(org.hibernate.Session hibSession, Environment env, PrintWriter out)
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

  public void setFullname_(org.hibernate.Session hibSession, Environment env, String value0, PrintWriter out)
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

  public void setEmail_(org.hibernate.Session hibSession, Environment env, String value1, PrintWriter out)
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

  public void setUsername_(org.hibernate.Session hibSession, Environment env, String value2, PrintWriter out)
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

  public void setBio_(org.hibernate.Session hibSession, Environment env, String value3, PrintWriter out)
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

  public void setDateOfBirth_(org.hibernate.Session hibSession, Environment env, java.util.Date value4, PrintWriter out)
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

  public void removeFromParents_(org.hibernate.Session hibSession, Environment env, exampleapp.domain.Person value6, PrintWriter out)
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

  public void addToParents_(org.hibernate.Session hibSession, Environment env, exampleapp.domain.Person value5, PrintWriter out)
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

  public void removeFromChildren_(org.hibernate.Session hibSession, Environment env, exampleapp.domain.Person value8, PrintWriter out)
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

  public void addToChildren_(org.hibernate.Session hibSession, Environment env, exampleapp.domain.Person value7, PrintWriter out)
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

  public void setPhoto_(org.hibernate.Session hibSession, Environment env, utils.File value9, PrintWriter out)
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

  public void setAdmin_(org.hibernate.Session hibSession, Environment env, Boolean value10, PrintWriter out)
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

  public void setFavoriteColor_(org.hibernate.Session hibSession, Environment env, exampleapp.domain.Color value11, PrintWriter out)
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