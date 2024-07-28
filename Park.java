public class Park {

    private String name;
    private String time;
    private String cost;


    public Park(String name, String time, String cost){
        this.name = name;
        this.time = time;
        this.cost = cost;
    }

    public void getParkInfo(){
        System.out.println("name: " + name);
        System.out.println("time: " + time);
        System.out.println("cost: " + cost);
        System.out.println("=========================");
    }



}