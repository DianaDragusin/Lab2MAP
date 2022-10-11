package Aufgabe;

public class MVCPatternDemo {
    public static void main(String[] args) {

        //fetch student record based on his roll no from the database
        Buch model  = retriveBuchFromDatabase();

        //Create a view : to write Buch details on console
        BuchView view = new BuchView();

        BuchController controller = new BuchController(model, view);

        controller.updateView();

        //update model data
        controller.setBuchName("Learn to code in 10 days");
        System.out.println("nAfter updating, Buch Details are as follows");

        controller.updateView();
    }

    private static Buch retriveBuchFromDatabase() {
        Buch buch = new Buch();
        buch.setName("Learn to code now");
        buch.setId("01");
        buch.setGenre("Programming");
        return buch;
    }
}