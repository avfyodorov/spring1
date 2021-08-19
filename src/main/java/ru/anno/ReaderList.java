package ru.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class ReaderList {
   private PaperList list;

   @Autowired
   public ReaderList(PaperList list) {
      this.list = list;
   }

   public String readPaper(PaperEnum paperEnum) {
      //получить случ.число в пределах размера списка
      int rand = new Random().nextInt(list.getNames().size());

      return paperEnum == PaperEnum.BOOK ? list.getNames().get(rand) : "Не завезли еще";
   }
}
