package Aufgabe;

import java.util.Scanner;

public class BuchView {
    public void printBuchDetails(String BuchName, String BuchId, String BuchGenre){
        System.out.println("Buch Details: ");
        System.out.println("Name: " +BuchName);
        System.out.println("Buch ID: " +BuchId);
        System.out.println("Buch Genre: " + BuchGenre);
}
   public void menu()
   {
       System.out.println("Pick an option from below!");
       System.out.println("1. Add a book in the database");
       System.out.println("2. Remove a book in the database");
       System.out.println("3. Read a book in the database");
       System.out.println("4. Change a book in the database");
       Scanner myInput = new Scanner( System.in );
       int nr = myInput.nextInt();
       if (nr == 1)
       {
           System.out.println("Give us the name of the book : ");
           String name = myInput.nextLine();
           System.out.println("Give us the genre of the book : ");
           String genre = myInput.nextLine();
           Buch buch = new Buch();
           BuchController controller = new BuchController(buch,this);
           controller.add(buch);
       }
       if (nr == 2)
       {
           System.out.println("Give us bookname you want to delete ");
           String name = myInput.nextLine();

           Buch buch = new Buch();
           BuchController controller = new BuchController(buch,this);
           controller.delete(name);
       }
       if (nr == 3)
       {
           System.out.println("Give us the index of the book : ");
           int nr2 = myInput.nextInt();

           Buch buch = new Buch();
           BuchController controller = new BuchController(buch,this);
           controller.read(nr2);
       }
       if (nr == 4)
       {
           System.out.println("Give us the name of the book : ");
           String name = myInput.nextLine();
           System.out.println("Give us the genre of the book : ");
           String genre = myInput.nextLine();
           Buch buch = new Buch();
           BuchController controller = new BuchController(buch,this);
           controller.add(buch);
       }

   }
}
