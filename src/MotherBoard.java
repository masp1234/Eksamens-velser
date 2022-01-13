public class MotherBoard {


    private Satadrive[] sataDrives = new Satadrive[4];


    public void printSatadrives() {
        for (Satadrive satadrive : sataDrives) {
            if (satadrive != null) {
                System.out.println(satadrive);
            }
        }
    }
    public void addSatadrive(Satadrive satadrive) {
        int index = -1;
        for (int i = 0; i < sataDrives.length & index < 0; i++) {
            if (sataDrives[i] == null) {
                index = i;
            }
        }
        if (index >= 0) {
            sataDrives[index] = satadrive;
        }
        else {
            System.out.println("Der er ikke plads til flere satadrives");
        }
    }

    public static void main(String[] args) {
        MotherBoard mb = new MotherBoard();
        mb.addSatadrive(new Satadrive());
        mb.printSatadrives();
        mb.addSatadrive(new Satadrive());
        mb.addSatadrive(new Satadrive());
        mb.addSatadrive(new Satadrive());
        mb.printSatadrives();
        mb.addSatadrive(new Satadrive());
    }
}