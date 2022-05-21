import model.IntegerSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerSetTestScratch {

    IntegerSet is;

    @BeforeEach
    void init(){
        is = new IntegerSet();
    }

    @Test
    void testInsertOne(){
        IntegerSet is = new IntegerSet();
        assertEquals(is.size(),0);
        is.insert(3);
        assertEquals(is.size(),1);
        assertTrue(is.contains(3));
    }

    @Test
    void testIntersection(){
        IntegerSet a = new IntegerSet();
        assertEquals(is.size())
    }


}
