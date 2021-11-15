public class Doctor {
    static int id = 0;
    String speciality;
    String name;

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
}
