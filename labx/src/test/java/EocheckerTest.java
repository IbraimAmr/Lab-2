import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EocheckerTest {

    @Test
    public void test2(){
        var c = new Eochecker();
        assertTrue(c.checker(9));
    }
    @Test
    public void test3(){
        var c = new Eochecker();
        assertTrue(c.checker(6));
    }
    @Test
    public void test5(){
        var c = new Eochecker();
        assertFalse(c.checker(4));
    }


}