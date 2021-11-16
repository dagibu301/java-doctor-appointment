import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("John Wick", "general");
        myDoctor.showName();
        myDoctor.showId();

        Doctor mySurgeonDoctor = new Doctor("Surgeon Ryan", "surgeon");
        mySurgeonDoctor.showId();

        Patient patient = new Patient("David", "david@mail.com");
        patient.setWeight(70);
        System.out.println(patient.getWeight());

        /*showMenu();*/
    }
}
