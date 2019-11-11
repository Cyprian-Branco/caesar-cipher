import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void Cipher_ccText_String(){
        Encrypt encrypt = new Encrypt();
        assertEquals("rt", encrypt.excryption("qs", 1));
    }

}