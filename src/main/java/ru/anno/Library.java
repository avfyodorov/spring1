package ru.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {
   @Autowired
   private Reader reader;

   public Reader getReader() {
      return reader;
   }

   @Override
   public String toString() {
      return "Library{" +
              "reader=" + reader +
              '}';
   }
}
