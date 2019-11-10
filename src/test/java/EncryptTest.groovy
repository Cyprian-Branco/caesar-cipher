import org.junit.Test
import static org.junit.Assert

public class EncryptTest {
    @Test
    void testEncrypt_ccText_String(){
        Encrypt testingEncrypt = new Encrypt();
        assertEquals(true, testingEncrypt instanceof Encrypt );
    }
    @Test
    void testEncrypt_ccKey_(){
        Encrypt testingKey = new Encrypt();
        assertEquals(true, testingKey instanceof Encrypt);
    }
}
