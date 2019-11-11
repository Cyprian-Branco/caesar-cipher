import java.util.Scanner;

public class App {
    public static void main (String[] args){
        Cipher cipher = new Cipher();
        Scanner option = new Scanner(System.in);
        System.out.println("choice\n 1.Encrypt\n 2.Decrypt\n3.Exit");

        Integer choice = option.nextInt();


        if (choice == 1){
            Scanner inputText = new Scanner(System.in);
            System.out.println("Enter a Text: ");
            String text = inputText.nextLine();
            System.out.println("The input text is: " + text );
            

        }
    }
}
