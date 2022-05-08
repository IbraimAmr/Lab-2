import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class StateChartTest {
    @Nested
    class EdgeCoverage{
        Schart mainObj;
        @BeforeEach
        public void setup(){
            mainObj = new Schart();
        }
        @Test
        public void test1(){
            String[] x = mainObj.input('a');
            assertEquals("NORMAL", x[0]);
            assertEquals("DATE", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("0:0", x[3]);
        }
        @Test
        public void test2(){
            mainObj.input('a');
            String[] x = mainObj.input('a');
            assertEquals("NORMAL", x[0]);
            assertEquals("TIME", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("0:0", x[3]);
        }
        @Test
        public void test3(){
            mainObj.input('a');
            mainObj.input('a');
            String[] x = mainObj.input('c');
            assertEquals("UPDATE", x[0]);
            assertEquals("min", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("0:0", x[3]);
        }
        @Test
        public void test4(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("min", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("0:1", x[3]);
        }
        @Test
        public void test5(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            String[] x = mainObj.input('a');
            assertEquals("UPDATE", x[0]);
            assertEquals("hour", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("0:1", x[3]);
        }
        @Test
        public void test6(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("hour", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test7(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] x = mainObj.input('a');
            assertEquals("UPDATE", x[0]);
            assertEquals("day", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test8(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("day", x[1]);
            assertEquals("2000-1-2", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test9(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] x = mainObj.input('a');
            assertEquals("UPDATE", x[0]);
            assertEquals("month", x[1]);
            assertEquals("2000-1-2", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test10(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("month", x[1]);
            assertEquals("2000-2-2", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test11(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] x = mainObj.input('a');
            assertEquals("UPDATE", x[0]);
            assertEquals("year", x[1]);
            assertEquals("2000-2-2", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test12(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("year", x[1]);
            assertEquals("2001-2-2", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test13(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] x = mainObj.input('a');
            assertEquals("NORMAL", x[0]);
            assertEquals("TIME", x[1]);
            assertEquals("2001-2-2", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test14(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            String[] x = mainObj.input('c');
            assertEquals("UPDATE", x[0]);
            assertEquals("min", x[1]);
            assertEquals("2001-2-2", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test15(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('c');
            String[] x = mainObj.input('d');
            assertEquals("NORMAL", x[0]);
            assertEquals("TIME", x[1]);
            assertEquals("2001-2-2", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test16(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('d');
            String[] x = mainObj.input('b');
            assertEquals("ALARM", x[0]);
            assertEquals("Alarm", x[1]);
            assertEquals("2001-2-2", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test17(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('d');
            mainObj.input('b');
            String[] x = mainObj.input('a');
            assertEquals("ALARM", x[0]);
            assertEquals("Chime", x[1]);
            assertEquals("2001-2-2", x[2]);
            assertEquals("1:1", x[3]);
        }
        @Test
        public void test18(){
            mainObj.input('a');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('c');
            mainObj.input('d');
            mainObj.input('b');
            mainObj.input('a');
            String[] x = mainObj.input('d');
            assertEquals("NORMAL", x[0]);
            assertEquals("TIME", x[1]);
            assertEquals("2001-2-2", x[2]);
            assertEquals("1:1", x[3]);
        }
    }
    @Nested
    class ADUP{
        Schart mainObj;
        @BeforeEach
        public void setup(){
            mainObj = new Schart();
        }
        @Test
        public void Test1(){
            String[] x = mainObj.input('c');
            assertEquals("UPDATE", x[0]);
            assertEquals("min", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("0:0", x[3]);
        }
        @Test
        public void Test2(){
            mainObj.input('c');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("min", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("0:1", x[3]);
        }
        @Test
        public void Test3(){
            mainObj.input('c');
            mainObj.input('b');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("min", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("0:2", x[3]);
        }
        @Test
        public void Test4(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            String[] x = mainObj.input('a');
            assertEquals("UPDATE", x[0]);
            assertEquals("hour", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("0:2", x[3]);
        }
        @Test
        public void Test5(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("hour", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("1:2", x[3]);
        }
        @Test
        public void Test6(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("hour", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("2:2", x[3]);
        }
        @Test
        public void Test7(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            String[] x = mainObj.input('a');
            assertEquals("UPDATE", x[0]);
            assertEquals("day", x[1]);
            assertEquals("2000-1-1", x[2]);
            assertEquals("2:2", x[3]);
        }
        @Test
        public void Test8(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("day", x[1]);
            assertEquals("2000-1-2", x[2]);
            assertEquals("2:2", x[3]);
        }
        @Test
        public void Test9(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("day", x[1]);
            assertEquals("2000-1-3", x[2]);
            assertEquals("2:2", x[3]);
        }
        @Test
        public void Test10(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            String[] x = mainObj.input('a');
            assertEquals("UPDATE", x[0]);
            assertEquals("month", x[1]);
            assertEquals("2000-1-3", x[2]);
            assertEquals("2:2", x[3]);
        }
        @Test
        public void Test11(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("month", x[1]);
            assertEquals("2000-2-3", x[2]);
            assertEquals("2:2", x[3]);
        }
        @Test
        public void Test12(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] res = mainObj.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void Test13(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            String[] x = mainObj.input('a');
            assertEquals("UPDATE", x[0]);
            assertEquals("year",x[1]);
            assertEquals("2000-3-3", x[2]);
            assertEquals("2:2", x[3]);
        }
        @Test
        public void Test14(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("year", x[1]);
            assertEquals("2001-3-3", x[2]);
            assertEquals("2:2", x[3]);
        }
        @Test
        public void Test15(){
            mainObj.input('c');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            mainObj.input('b');
            mainObj.input('a');
            mainObj.input('b');
            String[] x = mainObj.input('b');
            assertEquals("UPDATE", x[0]);
            assertEquals("year", x[1]);
            assertEquals("2002-3-3", x[2]);
            assertEquals("2:2", x[3]);
        }
    }
}
