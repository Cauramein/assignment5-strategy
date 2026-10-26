public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(RouteStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }

    public String route(String from, String to, int km) {
        if (km <= 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }
        return strategy.buildRoute(from, to, km);
    }
}