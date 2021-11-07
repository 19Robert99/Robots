package com.lesson5.cw.tasks.vova.lesson6;

public class Song {
    public static void main(String[] args) {
        String song = "Зайку бросила хозяйка Под дождем остался зайка Со скамейки слезть не мог Весь до ниточки промок";
        String[] songg = song.split(" ");
        // System.out.println(Arrays.toString(songg));
        for (int i = 0; i < songg.length; i++) {
            if (songg[i].contains("а")){
                System.out.println(songg[i]);
            }
        }

    }
}
