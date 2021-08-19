package ru.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FromProp {
   @Value("${fromProp.name}")
   private String name;
   @Value("${fromProp.value}")
   private int value;

   @Override
   public String toString() {
      return "FromProp{" +
              "name='" + name + '\'' +
              ", value=" + value +
              '}';
   }
}
