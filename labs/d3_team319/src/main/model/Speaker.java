package model;

import java.util.List;

public interface Speaker {
    boolean didISay(String statement);
    void say(String statement, Hearer hearer);
    List<String> getListSaid();
}
