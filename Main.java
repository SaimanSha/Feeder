public class Main {
    public static void daySimulate(int storage, int birds) {
        Feeder day = new Feeder(storage);
        day.simulateOneDay(birds);
        System.out.println(day.getFood());
    }

    public static void notWeekSimulate(int storage, int birds, int days) {
        Feeder week = new Feeder(storage);
        System.out.println(week.simulateManyDays(birds, days));
    }

    public static void main(String[] args) {
        Main.daySimulate(500, 12);
        Main.daySimulate(1000, 22);
        Main.daySimulate(100, 5);

        Main.notWeekSimulate(2400, 10, 4);
        Main.notWeekSimulate(250, 10, 5);
        Main.notWeekSimulate(0, 15, 10);
    }
}
