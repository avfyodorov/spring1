package ru.anno;

import org.springframework.stereotype.Component;

@Component
public class Magaz implements Paper{
 private String name;
   @Override
   public String getName() {
      return name;
   }
}
