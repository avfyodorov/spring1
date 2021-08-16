package ru.alish;

public class TestBean {
   private String name;

   public int getVol() {
      return vol;
   }

   public void setVol(int vol) {
      this.vol = vol;
   }

   private int vol;
   public TestBean(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
