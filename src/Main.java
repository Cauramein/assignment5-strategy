public class Main {
    public static void main(String[] args) {
        Navigator nav = new Navigator(new CarStrategy());
        System.out.println(nav.route("AITU", "Park", 5));


        nav.setStrategy(new WalkStrategy());
        System.out.println(nav.route("AITU", "Park", 5));


        nav.setStrategy(new CycleStrategy());
        System.out.println(nav.route("AITU", "Park", 5));


        nav.setStrategy(new BusStrategy());
        System.out.println(nav.route("AITU", "Park", 5));
    }
}