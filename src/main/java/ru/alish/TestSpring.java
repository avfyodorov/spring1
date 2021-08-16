package ru.alish;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
   public static void main(String[] args) {
      ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("ApplicationContext.xml");

      TestBean tb = con.getBean("testBean", TestBean.class);
      System.out.println(tb.getName());

      //
      Music music = con.getBean("musicBean", Music.class);
//      MusicPlayer musicPlayer = new MusicPlayer(music);
      MusicPlayer musicPlayer = con.getBean("playner", MusicPlayer.class);
      musicPlayer.play();

      con.close();
   }
}
