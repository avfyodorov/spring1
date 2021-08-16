package ru.alish;

import java.util.List;

public class MusicPlayer {
   public void setMusicList(List<Music> musicList) {
      this.musicList = musicList;
   }

   private List<Music> musicList;

   public MusicPlayer() {
   }

   public void play() {
      for (Music music : musicList)
         System.out.println(music.getSong());
   }
}
