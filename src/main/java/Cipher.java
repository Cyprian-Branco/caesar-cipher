import java.security.PublicKey;

public class Cipher {
    private String text;
    private int key;

    public Cipher(String text, int key){
        this.text = text;
        this.key = key;
    }
    public String getText(){
        return text;
    }

}
