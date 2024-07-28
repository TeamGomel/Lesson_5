

public class Main {

    public static void main(String[] args) {
        Employee aleksandr = new Employee("Александр", "Директор", "dirik@gmail.com", "+37529000007", 4500, 47);
        aleksandr.getEmployeeInfo();
        Employee dima = new Employee("Дмитрий", "Заместитель директора", "zamdirik@gmail.com", "+375291340002", 3500, 39);
        dima.getEmployeeInfo();
        Employee mashustik = new Employee("Мария", "Секретарь", "mashustik@gmail.com", "+375290000003", 2700, 25);
        mashustik.getEmployeeInfo();
        Employee natalia = new Employee("Наталья Михайловна", "Главный бухгалтер", "glbuh@gmail.com", "+375296575494", 5100, 62);
        natalia.getEmployeeInfo();
        Employee galia = new Employee("Галина", "Кассир", "galiaotmena@gmail.com", "+375292500500", 1500, 58);
        galia.getEmployeeInfo();

    }
}