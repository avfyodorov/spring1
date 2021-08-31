package ru.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class AnnoTest {
   public static void main(String[] args) {
      ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("AnnoContext.xml");

      //просто получить
      //если singleton - вообще ничего больше не надо
      Paper book = con.getBean(Book.class);
      System.out.println(book.getName());

      //внедрить единственно подходящий -- ТИП КЛАССА
      ReadBook readBook = con.getBean(ReadBook.class);
      System.out.println(readBook.whatRead());

      //вложенное внедрение -- цепочка зависимостей
      Library library = con.getBean(Library.class);
      System.out.println(library);
      library.getReader().whatRead();

      //закомметировать бин Magaz иначе неоднозначность
      Reader reader = con.getBean(Reader.class);
      reader.whatRead();

      //читать из списка
//      BookList bl=con.getBean(BookList.class);
//      for (String s:bl.getNames())
//         System.out.println(s);
      ReaderList readerList = con.getBean(ReaderList.class);
      for (int i = 0; i < 5; i++) {
         System.out.println(readerList.readPaper(PaperEnum.BOOK));
      }
      System.out.println(readerList.readPaper(PaperEnum.MAGAZ));

      //@Value - получать значения из файла
      System.out.println(con.getBean(FromProp.class));

      //
      List<BeanPrototype>bpList=new ArrayList<>();
      BeanPrototype bp=con.getBean(BeanPrototype.class);   bp.setS("11111111111"); bpList.add(bp);
      bp=con.getBean(BeanPrototype.class);      bp.setS("2222222");bpList.add(bp);
      bp=con.getBean(BeanPrototype.class);      bp.setS("3377777733333333333");bpList.add(bp);
      for (BeanPrototype b :bpList)
      System.out.println(b.getS());
      //хватит уже
      con.close();

      System.out.println("289468 + 56624 + 88464 = " + (289468 + 56624 + 88464));
   }
}
