// Virker som det skal, men måske en anelse voldsomt at skulle lave til eksamen.
public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName) {
        String[] names = fullName.split("\s+");
        // hvis names >= 3, så skal alt fra index 1 til names.length - 2 (Det andet sidste navn) være middleName
        if (names.length >= 3) {
            middleName = names[1];
            for (int i = 2; i < names.length - 1; i++) {
                middleName += " " + names[i];
            }

        }
        firstName = names[0];
        lastName = names[names.length - 1];
    }

    public static void main(String[] args) {
        Names names = new Names("Martin Arnt Schreiner Pedersen");
        System.out.println(names);

    }
    public String toString() {
        String fullName;
        if (middleName != null)
            fullName = firstName + " " + middleName + " " + lastName;

        else {
            fullName = firstName + " " + lastName;
        }
        return fullName;
    }
}
