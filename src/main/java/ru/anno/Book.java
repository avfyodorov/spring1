package ru.anno;

import org.springframework.stereotype.Component;

@Component("book")
public class Book implements Paper{
   private String name;
   @Override
   public String getName() {
      return "Book";
   }
}
