import java.awt.*;
import java.util.Scanner;
import java.io.IOException;


public class App {
    public static void main (String[] args){

        Scanner option = new Scanner(System.in);
        System.out.println("choice\n 1.Encrypt\n 2.Decrypt\n3.Exit");

        Integer choice = option.nextInt();


        if (choice == 1){
            Scanner inputText = new Scanner(System.in);
            System.out.println("Enter a Text: ");
            String text = inputText.nextLine();
            System.out.println("The input text is: " + text );

            Scanner inputKey = new Scanner(System.in);
            System.out.println("Enter the key: ");
            int key = Integer.parseInt(inputKey.nextLine());
            System.out.println("The key is: " + key);

            Cipher cipher = new Cipher(text, key);
            System.out.println("The Encrypted text is: " + cipher.encrypt());

        }else if(choice == 2){
            Scanner inputText2 = new Scanner(System.in);
            System.out.println("Enter a text: ");
            String text = inputText2.nextLine();
            System.out.println("The input text is: " + text);

            Scanner inputKey2 = new Scanner(System.in);
            System.out.println("Enter the key: ");
            int key = Integer.parseInt(inputKey2.nextLine());
            System.out.println("The key is: " + key);

            CipherDecrypt cipherdecrypt = new CipherDecrypt(text, key);
            System.out.println("The decrypted text is: " + cipherdecrypt.Decrypt());

        }else if(choice == 3){
            System.out.println("------Goodbye------");

        }else{
            System.out.println("Sorry, the option you have selected does not exist. Please try again!");

        }

    }
}
