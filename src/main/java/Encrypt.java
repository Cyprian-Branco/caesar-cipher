public class Encrypt {
    private String text;
    private int shiftKey;
    private StringBuffer Encryption;

    public Encrypt(String text, int shiftKey){
        this.text = text;
        this.shiftKey = shiftKey;

    }
    public String getText(){
        return text;
    }
    public int getShiftKey(){
        return shiftKey;
    }
        public <Encryption> void Encryption(){
            for (int i=0; i<text.length(); i++){
            if(Character.isUpperCase(this.text.charAt(i))){
                char e = (char) (((int)this.text.charAt(i) + this.shiftKey -65) % 26 + 65);
                Encryption.append(e);
            }else{
                char e = (char) (((int)this.text.charAt(1) + this.shiftKey -97) % 26 + 97);
                Encryption.append(e);
            }


        }

    }

}
