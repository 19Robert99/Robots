package com.lesson5.cw.tasks.gordey.lesson6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String song = "У лукоморья дуб зелёный Златая цепь на дубе том И днём и ночью кот учёный Всё ходит по цепи кругом";
        String[] text = song.split(" ");
        System.out.println(Arrays.toString(text));
        for (int i = 0; i < text.length; i++) {
            if (text[i].contains("а")) {
                System.out.println(text[i]);
            }
        }
    }
}
