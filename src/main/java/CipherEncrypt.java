class Cipher {
    private String text;
    private int key;

    public Cipher(String text, int key){
        this.text = text;
        this.key = key;
    }
    public String getText(){
        return text;
    }
    public void Encrypt() {
        StringBuffer encryption = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(this.text.charAt(i))) {
                char e = (char) (((int) this.text.charAt(i) + this.key - 65) % 26 + 65);
                encryption.append(e);
            } else {
                char e = (char) (((int) this.text.charAt(1) + this.key - 97) % 26 + 97);
                encryption.append(e);
            }
        }
    }
}
