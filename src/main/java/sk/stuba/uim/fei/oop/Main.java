package sk.stuba.uim.fei.oop;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args){
        Map dictionary[];
        dictionary= new Map[100];

        for(int i=0;i<3;i++){
            dictionary[i] = new Map(ZKlavesnice.readString("Enter word"), ZKlavesnice.readString("Enter translate"));
        }
        String new_word = ZKlavesnice.readString("Enter word");
        for(int i=0;i< dictionary.length;i++){

            if(new_word ==dictionary[i].word){
                System.out.println("%s" + dictionary[i].translate);
            }

        }

        /*
        m.tran("Ano");
        m.tran("Nie");
        m.tran("Objektovo orientovan´e programovanie");*/



    }

}
