import model.Doctor;

import java.util.Date;

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

        /*model.Doctor mySurgeonDoctor = new model.Doctor("Surgeon Ryan", "surgeon");
        mySurgeonDoctor.showId();

        model.Patient patient = new model.Patient("David", "david@mail.com");
        patient.setWeight(70);
        System.out.println(patient.getWeight());
*/
        /*showMenu();*/
    }
}
