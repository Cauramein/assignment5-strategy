public class WalkStrategy implements RouteStrategy {
    private static final int MIN_PER_KM = 12;

    @Override
    public String buildRoute(String from, String to, int km) {
        int minutes = MIN_PER_KM * km;
        return from + " -> footpath -> " + to + " (" + km + " km, ~" + minutes + " min by Walk)";
    }
}
