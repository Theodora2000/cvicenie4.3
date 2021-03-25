package sk.stuba.uim.fei.oop;

public class Map {

    public String word;
    public String translate;

    public Map(String word, String translate) {
        this.word = word;
        this.translate = translate;
    }

    public boolean equals(Map that) {
        return this.word == that.word;
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

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    @Override
    public String toString() {
        return "word='" + word + '\'' +
                " translate='" + translate + '\'';
    }
}



