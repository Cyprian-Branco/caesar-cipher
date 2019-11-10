import org.junit.Test
import static org.junit.Assert

public class EncryptTest {
    @Test
    void testEncrypt_ccText_String(){
        Encrypt testingEncrypt = new Encrypt();
        assertEquals(true, testingEncrypt instanceof Encrypt );
    }
    @Test
    void testEncrypt_ccShiftKey_(){
        Encrypt testingShiftKey = new Encrypt();
        assertEquals(true, testingShiftKey instanceof Encrypt);
    }
}
