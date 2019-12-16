import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class codeupCryptTest {

    @Before
    public void setup(){
        CodeupCrypt.hash = "Fer";
    }

   @Test
   public void TestIfHashExists(){
        assertNotNull(CodeupCrypt.hash);
        assertEquals("Fer", CodeupCrypt.hash);
   }

   @Test
    public void testTheEncryption(){
       assertEquals("f3r", CodeupCrypt.checkPassword());
       CodeupCrypt.hash = "codeup";
       assertEquals("c0d39p", CodeupCrypt.checkPassword());
   }


}
