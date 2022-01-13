public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int lowestAcceptableDateAge() {
        return yourAge / 2 + 7;
    }
    public boolean DateTooYoung() {
        return dateAge >= lowestAcceptableDateAge();
    }

    public static void main(String[] args) {
        DateAgeCalculator dac = new DateAgeCalculator(22, 17);
        System.out.println(dac.lowestAcceptableDateAge());
        System.out.println(dac.DateTooYoung());
    }


}
