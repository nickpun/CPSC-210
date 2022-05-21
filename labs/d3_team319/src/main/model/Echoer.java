package model;

import java.util.List;

public interface Echoer {
    boolean didIHear(String statement);
    boolean didISay(String statement);
    void echo(String statement);
    List<String> getListSaid();
    List<String> getListHeard();
}
