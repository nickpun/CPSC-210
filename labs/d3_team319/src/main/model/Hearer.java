package model;

import java.util.List;

public interface Hearer {
    boolean didIHear(String statement);
    String hear(String statement);
    List<String> getListHeard();
}
