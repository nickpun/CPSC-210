package implementations;

import model.Echoer;
import model.Hearer;
import model.Speaker;

import java.util.ArrayList;
import java.util.List;

// Represents a presenter with a list of statements said and a list of statements heard
public class Presenter implements Speaker, Echoer{
    private List<String> listSaid;
    private List<String> listHeard;

    // EFFECTS: list of statements said and list of statements heard are empty
    public Presenter() {
        listSaid = new ArrayList<>();
        listHeard = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: statement is added to list of statements said and to list of statements heard
    @Override
    public void echo(String statement) {
        listSaid.add(statement);
        listHeard.add(statement);
    }

    // EFFECTS: returns true if this presenter has heard the statement
    @Override
    public boolean didIHear(String statement) {
        if (listHeard.size() == 0) {return false;}
        for (String str: listHeard) {
            if (statement.equals(str)) {
                return true;
            }
        }
        return false;
    }

    // EFFECTS: returns true if this presenter has said the statement
    @Override
    public boolean didISay(String statement) {
        if (listSaid.size() == 0) {return false;}
        for (String str: listSaid) {
            if (statement.equals(str)) {
                return true;
            }
        }
        return false;
    }

    // MODIFIES: this, hearer
    // EFFECTS: hearer hears statement and statement is added to list of statements said
    @Override
    public void say(String statement, Hearer hearer) {
        hearer.hear(statement);
        listSaid.add(statement);
    }

    @Override
    public List<String> getListSaid() {
        return listSaid;
    }
    @Override
    public List<String> getListHeard() {
        return listHeard;
    }
}

