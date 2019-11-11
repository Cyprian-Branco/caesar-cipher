import org.junit.Test;

import static org.junit.Assert.*;

public class CipherDecryptTest {
    @Test
    public void testCipherDecrypt_checkText_String(){
        CipherDecrypt cipherdecrypt = new CipherDecrypt("st", 1);
        assertEquals(true, cipherdecrypt instanceof CipherDecrypt);
    }


}