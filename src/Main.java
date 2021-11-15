import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("John Wick", "general");
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor mySurgeonDoctor = new Doctor("Surgeon Ryan", "surgeon");
        mySurgeonDoctor.showId();
        System.out.println(Doctor.id);

        /*showMenu();*/
    }
}
