public class BusStrategy implements RouteStrategy {
    private static final int WAIT_TIME_MIN = 7;
    private static final int MIN_PER_KM = 3;

    @Override
    public String buildRoute(String from, String to, int km) {
        int minutes = WAIT_TIME_MIN + (MIN_PER_KM * km);
        return from + " -> bus lane -> " + to + " (" + km + " km, ~" + minutes + " min by Bus)";
    }
}