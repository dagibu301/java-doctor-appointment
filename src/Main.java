import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("John Wick", "general");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()
        ) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        /*Doctor mySurgeonDoctor = new Doctor("Surgeon Ryan", "surgeon");
        mySurgeonDoctor.showId();

        Patient patient = new Patient("David", "david@mail.com");
        patient.setWeight(70);
        System.out.println(patient.getWeight());
*/
        /*showMenu();*/
    }
}
