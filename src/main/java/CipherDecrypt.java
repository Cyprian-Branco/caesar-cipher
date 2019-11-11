public class CipherDecrypt {
    private String text;
    private int key;
    public CipherDecrypt( String text, int key){
        this.text = text;
        this.key = key;
    }
    public String getText(){
        return text;
    }
    public int getKey(){
        return key;
    }
    public void Decrypt() {
        StringBuffer decryption = new StringBuffer();
        for (int j = 0; j < text.length(); j++) {
            if (Character.isUpperCase(this.text.charAt(j))) {
                char e = (char) (((int) this.text.charAt(j) + this.key - 65) % 26 + 65);
                decryption.append(e);
            } else {
                char e = (char) (((int) this.text.charAt(j) + this.key - 97) % 26 + 97);
                decryption.append(e);
            }
        }
    }
}
