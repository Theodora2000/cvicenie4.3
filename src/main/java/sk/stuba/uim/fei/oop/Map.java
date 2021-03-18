package sk.stuba.uim.fei.oop;

public class Map {

    public String word;
    public String translate;

    public Map(String word, String translate) {
        this.word = word;
        this.translate = translate;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate() {
        this.translate = translate;
    }


/*
    public void tran(String word){
        if (word =="Ano") {
            System.out.println("Yes");
        }
        else if(word == "Nie"){
            System.out.println("No");
        }else{
            System.out.println("Objected oriented programming");

    }*/
}



