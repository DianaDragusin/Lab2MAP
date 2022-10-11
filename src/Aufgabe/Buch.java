package Aufgabe;

import java.util.Vector;

public class Buch {
    private String BuchName;
    private String BuchId;
    private String BuchGenre;

    public String getId() {
        return BuchId;
    }

    public void setId(String id) {
        this.BuchId = id;
    }

    public String getName() {
        return BuchName;
    }
    public void setName(String name) {
        this.BuchName = name;
    }

    public String getGenre() {
        return BuchGenre;
    }

    public void setGenre(String genre) {
        this.BuchGenre = genre;
    }


}
