package strategyMode;

import java.util.ArrayList;
import java.util.List;

public class FSS implements Strategy{
    @Override
    public List<String> genTips() {
        List<String> list = new ArrayList<>();
        list.add("yes");
        list.add("yes");
        list.add("yes");
        return list;
    }
}
