public class CycleStrategy implements RouteStrategy {
    private static final int MIN_PER_KM = 4;

    @Override
    public String buildRoute(String from, String to, int km) {
        int minutes = MIN_PER_KM * km;
        return from + " -> cycle lane -> " + to + " (" + km + " km, ~" + minutes + " min by Cycle)";
    }
}