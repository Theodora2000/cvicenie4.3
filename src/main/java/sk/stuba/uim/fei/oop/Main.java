package sk.stuba.uim.fei.oop;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> recnik= new HashMap<String,String>();

        recnik.put("pas", "dog");
        recnik.put("kuca","house");

        if(!recnik.containsKey("pas"))
        {

        }

        for(String key : recnik.keySet())
        {

            recnik.get(key);
        }
        HashMap<String,String> recnik2;

        recnik2=new HashMap<String,String>(recnik);
        recnik.equals(recnik2);
    }
}