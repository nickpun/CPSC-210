package test;

import implementations.Participant;
import model.Hearer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HearerTest {
    private Hearer participant;

    @BeforeEach
    public void runBefore() {
        participant = new Participant();
        participant.hear("str1");
    }

    @Test
    public void testDidIHear(){
        assertTrue(participant.didIHear("str1"));
        assertFalse(participant.didIHear("str3"));
    }

    @Test
    public void testHeard(){
        List<String> listHeard = new ArrayList<>();
        listHeard.add("str1");
        listHeard.add("str2");
        assertEquals(participant.hear("str2"), "I heard str2");
        assertEquals(participant.getListHeard(), listHeard);
    }
}
