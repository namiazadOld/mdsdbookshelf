package utils;

import java.util.*;

public class TypesInfo  
{ 
  private static List<String> stringCompatibleTypes = Arrays.asList("Secret", "Email", "URL", "String", "WikiText", "Text", "Patch");

  public static List<String> getStringCompatibleTypes()
  { 
    return stringCompatibleTypes;
  }
}