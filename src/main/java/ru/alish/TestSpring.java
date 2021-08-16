package ru.alish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
   public static void main(String[] args) {
      ClassPathXmlApplicationContext con =
              new ClassPathXmlApplicationContext("ApplicationContext.xml");

      InitDestroy id = con.getBean(InitDestroy.class, "initd");
      InitDestroy id2 = con.getBean(InitDestroy.class, "initd");
      id.setName("abra");
      String s = id.getName();
      System.out.println(id.getName());
      System.out.println(id2.getName());
//
//      TestBean tb1 = con.getBean(TestBean.class,"testBean");
//      TestBean tb2 = con.getBean(TestBean.class,"testBean");
//      System.out.println(tb1==tb2);
//
//      System.out.println(tb1.getName()+" : "+tb1.getVol());
//      tb1.setVol(99);
//      System.out.println(tb1.getName()+" : "+tb1.getVol());
//      System.out.println(tb2.getName()+" : "+tb2.getVol());
//
//      //
////      Music music = con.getBean("musicBean", Music.class);
////      MusicPlayer musicPlayer = new MusicPlayer(music);
//      MusicPlayer musicPlayer = con.getBean( MusicPlayer.class,"playner");
//      musicPlayer.play();

      con.close();
   }
}
