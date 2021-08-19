package ru.anno;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookList implements PaperList {

   List<String> list = new ArrayList<>();

   {
      list.add("Book 1");
      list.add("Book 2");
      list.add("Book 3");
      list.add("Book 4");
   }

   @Override
   public List<String> getNames() {
      return list;
   }
}
