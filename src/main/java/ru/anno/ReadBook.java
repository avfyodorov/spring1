package ru.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReadBook implements Read {
   private Book book;

   @Autowired
   public ReadBook(Book book) {
      this.book = book;
   }

   @Override
   public String whatRead() {
      return "Now readBook: "+book.getName();
   }
}
