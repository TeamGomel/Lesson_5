public class Main {

    public static void main(String[] args) {
        Park attraction = new Park("Сюрприз", "10:00 - 20:00", "55");
        attraction.getParkInfo();
        Park attraction2 = new Park("Салют", "12:00 - 20:00", "15");
        attraction2.getParkInfo();
        Park attraction3 = new Park("Штопор", "20:00 - 23:00", "70");
        attraction3.getParkInfo();
        Park attraction4 = new Park("Угар", "07:00 - 10:00", "5");
        attraction4.getParkInfo();
    }
}