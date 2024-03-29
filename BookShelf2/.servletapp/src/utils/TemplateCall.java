package utils;

import java.util.Map;
import java.util.HashMap;

public class TemplateCall {
    
  public TemplateCall(boolean valid, String name, Object[] args){
      this.valid = valid;
      this.name = name;
      this.args = args;
  }
    
  
  public TemplateCall(String name, Object[] args){
      this.valid = true;
      this.name = name;
      this.args = args;
  }
  
  public static TemplateCall None = new TemplateCall(false, "", new Object[0]);	
    
  public static Map<String, utils.TemplateCall> NoWithCalls = new HashMap<String, utils.TemplateCall>();
  
  public boolean valid;
  public String name;
  public Object[] args;
  
  public static String getAttribute(Map<String,String> attrs, String key, String def) {
    if (attrs == null) 
        return def;
    else if (attrs.containsKey(key))
        return attrs.get(key);
    else 
        return def;  
  }

  //this one should stay empty!!
  public static final Map<String, String> EmptyAttrs = new HashMap<String, String>();
  
}
