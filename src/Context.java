public class Context {
    private Strategy strategy = new ConcreteStrategyA();
    public void execute() {
        strategy.executeAlgorithm();
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
