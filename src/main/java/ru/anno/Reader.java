package ru.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Reader {
//   @Autowired
//   @Qualifier("book")
   private Paper paper;

   @Autowired
   public Reader(@Qualifier("book")Paper paper) {
      this.paper = paper;
   }
//   public Reader(Paper paper) { this.paper = paper;  }

   public void whatRead() {
      System.out.println("Now reading: " + paper.getName());
   }

   @Override
   public String toString() {
      return "Reader{}";
   }
}
