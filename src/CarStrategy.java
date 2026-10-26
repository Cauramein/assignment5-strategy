public class CarStrategy implements RouteStrategy {
    private static final int BASE_DELAY_MIN = 5;
    private static final int MIN_PER_KM = 2;

    @Override
    public String buildRoute(String from, String to, int km) {
        int minutes = BASE_DELAY_MIN + (MIN_PER_KM * km);
        return from + " -> highway -> " + to + " (" + km + " km, ~" + minutes + " min by Car)";
    }
}