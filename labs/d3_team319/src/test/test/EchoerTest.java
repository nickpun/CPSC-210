package test;

import implementations.Participant;
import implementations.Presenter;
import model.Echoer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EchoerTest {
    private Echoer participant;
    private Echoer presenter;

    @BeforeEach
    public void runBefore() {
        participant = new Participant();
        presenter = new Presenter();
        participant.echo("str1");
        presenter.echo("str1");
    }

    @Test
    public void testDidIHear(){
        assertTrue(participant.didIHear("str1"));
        assertFalse(participant.didIHear("str2"));
        assertTrue(presenter.didIHear("str1"));
        assertFalse(presenter.didIHear("str2"));
    }

    @Test
    public void testDidISay(){
        assertTrue(participant.didISay("str1"));
        assertFalse(participant.didISay("str2"));
        assertTrue(presenter.didISay("str1"));
        assertFalse(presenter.didISay("str2"));
    }

    @Test
    public void testEcho(){
        List<String> listSaid = new ArrayList<>();
        List<String> listHeard = new ArrayList<>();
        listSaid.add("str1");
        listSaid.add("str2");
        listHeard.add("str1");
        listHeard.add("str2");
        participant.echo("str2");
        presenter.echo("str2");
        assertEquals(participant.getListSaid(), listSaid);
        assertEquals(participant.getListHeard(), listHeard);
        assertEquals(presenter.getListSaid(), listSaid);
        assertEquals(presenter.getListHeard(), listHeard);
    }
}


