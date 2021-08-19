package ru.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanPrototype {
   private String s;

   public String getS() {
      return s;
   }

   public void setS(String s) {
      this.s = s;
   }
}
