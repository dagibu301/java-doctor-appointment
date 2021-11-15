public class Doctor {
    static int id = 0;
    String speciality;
    String name;

    Doctor(String initialName) {
        id++;
        name = initialName;
    }

    // Methods
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("Id: " + id);
    }
}
