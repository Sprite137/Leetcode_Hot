package strategyMode;

import java.util.List;

public class Context{
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public List<String> genTips(){
        return strategy.genTips();
    }
}
