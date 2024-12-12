import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);
            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v,2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));
        }

        @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
            // tests to make sure input is valid
            assertTrue(Ex1.isNumber("1"));
            assertTrue(Ex1.isNumber("10b2"));
            assertTrue(Ex1.isNumber("123bA"));
            assertTrue(Ex1.isNumber("ABbG"));
            assertTrue(Ex1.isNumber("0bA"));

            // tests to make sure that invalid input won't work
            assertFalse(Ex1.isNumber(""));
            assertFalse(Ex1.isNumber("b"));
            assertFalse(Ex1.isNumber("123b17"));
            assertFalse(Ex1.isNumber("123Z"));
            assertFalse(Ex1.isNumber("123bZ"));
        }
        @Test
        void int2NumberTest() {
            // testing valid conversions
            assertEquals("1011b2", Ex1.int2Number(11,2));
            assertEquals("0b2", Ex1.int2Number(0, 2));
            assertEquals("123bA", Ex1.int2Number(123, 10));
            assertEquals("1b2", Ex1.int2Number(1, 2));

            // testing invalid conversions
            assertEquals("", Ex1.int2Number(-1, 10));
            assertEquals("", Ex1.int2Number(10, 1));
            assertEquals("", Ex1.int2Number(10, 17));

        }
        @Test
        void maxIndexTest() {
            // testing Valid arrays
            String[] validArray = {"101b2", "AAbB", "FFbG", "10b2"};
            assertEquals(2, Ex1.maxIndex(validArray));

            // testing both valid and invalid in the same array
            String[] mixedArray = {"123b2", "MyLittleEasterEgg", "0b2", "FFbG"};
            assertEquals(3, Ex1.maxIndex(mixedArray));

            // testing invalid arrays
            String[] invalidArray = {"WhoCould", "Itbe", "Now"};
            assertEquals(-1, Ex1.maxIndex(invalidArray));
        }


    }
