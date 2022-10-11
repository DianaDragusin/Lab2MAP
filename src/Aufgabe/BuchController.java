package Aufgabe;

import java.util.Vector;

public class BuchController {
    private Buch model;
    private BuchView view;
    private Vector<Buch> bucher = new Vector<Buch>();

    public void add(Buch buch)
    {
        bucher.add(buch);
    }
    public void delete(String name)
    {
        for (int i = 0; i < bucher.size(); i++)
        {
            if (bucher.get(i).getName() == name )
                bucher.remove(bucher.get(i));
        }

    }
    public void read(int index)
    {
        if (index < 1 || index > bucher.size() )
        {
            System.out.println("This book is not in our database");
        }
        else {
            BuchView view = new BuchView();
            view.printBuchDetails(bucher.get(index).getName(),bucher.get(index).getId(),bucher.get(index).getGenre());
        }
    }
    public void update(Buch buch, Buch changed)
    {
        for (int i = 0; i < bucher.size(); i++)
        {
            if (bucher.get(i) == buch)
            {

                bucher.set(i,changed);

            }

        }


    }

    public BuchController(Buch model, BuchView view){
        this.model = model;
        this.view = view;
    }

    public void setBuchName(String name){
        model.setName(name);
    }

    public String getBuchName(){
        return model.getName();
    }

    public void setBuchId(String id){
        model.setId(id);
    }
    public String getBuchId(){
        return model.getId();
    }

    public void setBuchGenre(String Genre){
        model.setGenre(Genre);
    }

    public String getBuchGenre(){
        return model.getGenre();
    }
    public void updateView(){
        view.printBuchDetails(model.getName(), model.getId(), model.getGenre());
    }
}
