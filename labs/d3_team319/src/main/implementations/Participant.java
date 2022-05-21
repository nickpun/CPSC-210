package implementations;

import model.Echoer;
import model.Hearer;

import java.util.ArrayList;
import java.util.List;

// Represents a participant with a list of statements said and a list of statements heard
public class Participant implements Hearer, Echoer{
    private List<String> listSaid;
    private List<String> listHeard;

    // EFFECTS: list of statements said and list of statements heard are empty
    public Participant() {
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

    // MODIFIES: this
    // EFFECTS: statement is added to list of statements heard and string of form "I heard <statement>" is returned
    @Override
    public String hear(String statement) {
        listHeard.add(statement);
        return "I heard "+statement;
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

