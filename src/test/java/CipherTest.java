import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void testCipher_checkText_String(){
        Cipher cipher = new Cipher("st", 1);
        assertEquals(true, cipher instanceof Cipher);
    }
    @Test
    public void testDecrypt_checkText_String(){
        CipherDecrypt cipherdecrypt = new CipherDecrypt("st", 1);
        assertEquals(true, cipherdecrypt instanceof CipherDecrypt);

}