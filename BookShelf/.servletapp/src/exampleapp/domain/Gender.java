package exampleapp.domain;

import java.util.*;
import javax.persistence.*;
import exampleapp.domain.*;
import java.io.Serializable;
import utils.*;
import java.io.PrintWriter;
import org.webdsl.lang.Environment;

public @javax.persistence.Entity @javax.persistence.Table(name = "_Gender") @javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType.SINGLE_TABLE) @javax.persistence.DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = javax.persistence.DiscriminatorType.STRING, length = 255) class Gender  implements org.webdsl.WebDSLEntity
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

  public Gender () 
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

  public String getNaturalId()
  { 
    return _id.toString();
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
    return o != null && o instanceof org.webdsl.WebDSLEntity && ((org.webdsl.WebDSLEntity)o).instanceOf("Gender") && org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy ? Gender.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()) : Gender.class.cast(o)).getId(), getId());
  }

  @Transient public boolean propertyEventsEnabled = false;

  @Transient public org.hibernate.Session hibSession = null;

  @Transient public Environment env = null;

  @Transient public java.io.PrintWriter out = null;

  public Gender setupForPropertyEvents(org.hibernate.Session hibSession, java.io.PrintWriter out)
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
    return getId().compareTo(((Gender)o).getId());
  }

  public boolean isInstance(Class<?> c)
  { 
    return c.isInstance(this);
  }

  public boolean instanceOf(String s)
  { 
    return s.equals("Gender") || s.equals("Object") || s.equals("Entity");
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

  public String get_WebDslEntityType()
  { 
    return "Gender";
  }

  public void Gender_(org.hibernate.Session hibSession, Environment env, PrintWriter out)
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

  public void setName_(org.hibernate.Session hibSession, Environment env, String value13, PrintWriter out)
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