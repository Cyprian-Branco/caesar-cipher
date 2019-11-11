import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void testCipher_checkText_String(){
        Cipher cipher = new Cipher("st", 1);
        assertEquals("rs", cipher.getText());
    }


}