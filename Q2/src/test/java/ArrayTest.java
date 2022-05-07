import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ArrayTest {
    @Test
    void maximumarray(){
        Array max = new Array();
        assertEquals(90,max.Max(new int[]{50, 60, 1, 4, 90, 8 }));
    }
    @Test
    void minimumarray(){
        Array min = new Array();
        assertEquals(1,min.Min(new int[]{50, 60, 1, 4, 90, 8 }));
    }
    @Test
    void miniarray(){

        
        Array min = new Array();
        assertEquals(8,min.Min(new int[]{50, 60, 1, 4, 90, 8 }));
    }
}