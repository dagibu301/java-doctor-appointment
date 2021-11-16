import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0;
    private String speciality;
    private String name;
    private String email;

    Doctor() {
        id++;
    }

    Doctor(String name, String speciality) {
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    // Methods
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("Id: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
