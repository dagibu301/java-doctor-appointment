public class Doctor {
    int id;
    String speciality;
    String name;

    Doctor(String initialName) {
        name = initialName;
    }

    // Methods
    public void showName() {
        System.out.println(name);
    }
}
