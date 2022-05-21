package test;

import implementations.Participant;
import implementations.Presenter;
import model.Hearer;
import model.Speaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SpeakerTest {
    private Speaker presenter;
    private Hearer participant;

    @BeforeEach
    public void runBefore() {
        presenter = new Presenter();
        participant = new Participant();
        presenter.say("str1", participant);
    }

    @Test
    public void testDidISay(){
        assertTrue(presenter.didISay("str1"));
        assertFalse(presenter.didISay("str3"));
    }

    @Test
    public void testSay(){
        List<String> listSaid = new ArrayList<>();
        listSaid.add("str1");
        listSaid.add("str2");
        presenter.say("str2", participant);
        assertEquals(presenter.getListSaid(), listSaid);
    }
}
