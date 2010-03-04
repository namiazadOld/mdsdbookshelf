package exampleapp.domain;

import java.util.*;
import javax.persistence.*;
import exampleapp.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_Color", uniqueConstraints = @UniqueConstraint(columnNames = {"_name"})) @javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.SINGLE_TABLE) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) class Color  implements org.webdsl.WebDSLEntity
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
    if(!GlobalFunctions.isUniqueColor_(hibSession, env, this, out))
    { 
      exceptions.add(new utils.ValidationException(null, "Color exists already"));
    }
    if(!(!(org.webdsl.tools.Utils.equal(_name.length(), null) || org.webdsl.tools.Utils.equal(0, null)) && _name.length() > 0))
    { 
      exceptions.add(new utils.ValidationException(null, "Color name may not be empty"));
    }
    if(exceptions.size() > 0)
    { 
      throw new MultipleValidationExceptions(exceptions);
    }
  }

  public Color () 
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("Color") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? Color.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : Color.class.cast(o)).getId(), getId());
  }

  @Transient public boolean propertyEventsEnabled = false;

  @Transient public org.hibernate.Session hibSession = null;

  @Transient public Environment env = null;

  @Transient public java.io.PrintWriter out = null;

  public Color setupForPropertyEvents(org.hibernate.Session hibSession, java.io.PrintWriter out)
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
    return getId().compareTo(((Color)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("Color") || s.equals("Object") || s.equals("Entity");
  }

  @javax.persistence.Column(length = 255) @org.hibernate.annotations.AccessType(value = "field") protected String _name = "";

  public String getName()
  { 
    return _name;
  }

  public void setName(String newitem)
  { 
    if(!nameBeingSet)
    { 
      nameBeingSet = true;
      String item = newitem;
      String oldthing = getName();
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
        this.setName_(hibSession, env, newitem, out);
      }
      String olditem = _name;
      _name = newitem;
      nameBeingSet = false;
      java.util.List<utils.ValidationException> exceptions = new java.util.LinkedList<utils.ValidationException>();
      if(!GlobalFunctions.isUniqueColor_(hibSession, env, this, out))
      { 
        exceptions.add(new utils.ValidationException(null, "Color exists already"));
      }
      if(!(!(org.webdsl.tools.Utils.equal(_name.length(), null) || org.webdsl.tools.Utils.equal(0, null)) && _name.length() > 0))
      { 
        exceptions.add(new utils.ValidationException(null, "Color name may not be empty"));
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

  public void setNameNoEventsOrValidation(String newitem)
  { 
    _name = newitem;
  }

  @Transient boolean nameBeingSet = false;

  public String getNaturalId()
  { 
    return _name.toString();
  }

  public String get_WebDslEntityType()
  { 
    return "Color";
  }

  public void Color_(org.hibernate.Session hibSession, Environment env, PrintWriter out)
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

  public void setName_(org.hibernate.Session hibSession, Environment env, String value12, PrintWriter out)
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