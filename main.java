import java.util.*;


public class main{

    //encryption function
    public static StringBuffer encrypt(String text, int shift){
        StringBuffer ciphered= new StringBuffer();
        for(int i = 0; i<text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))){
                char c = (char)(((int)text.charAt(i)+shift-65)%26+65);//
                ciphered.append(c);
            }
            else if(Character.isLowerCase(text.charAt(i))){
                char c = (char)(((int)text.charAt(i)+shift-97)%26+97);
                ciphered.append(c);
            }
            else{
                ciphered.append(text.charAt(i));
            }
        }
        return ciphered;
    }

    //decryption function
    public static StringBuffer decrypt(String text, int shift){
        StringBuffer deciphered= new StringBuffer();
        for(int i = 0; i<text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))){
                char c = (char)(90 - (90 - (int)text.charAt(i)+shift)%26);
                deciphered.append(c);
            }
            else if(Character.isLowerCase(text.charAt(i))){
                char c = (char)(122 - ( 122 - (int)text.charAt(i)+shift)%26);
                deciphered.append(c);
            }
            else{
                deciphered.append(text.charAt(i));
            }
        }
        return deciphered;
    }

    //driver code 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose 1 for encryption\nChoose 2 for decryption");
        //to choose the option
        int option = in.nextInt();
        
        System.out.println("Enter the string :-");
        String text = in.nextLine();
        System.out.println("Enter the shift :-");
        int shift = in.nextInt();
        //String ciphered = encrypt(text,shift);
        switch (option) {
            case 1:
              System.out.println("Ciphered text :- " + encrypt(text,shift));
              break;
            case 2:
              System.out.println("De-Ciphered text :- " + decrypt(text,shift));
              break;
            default:
              System.out.println("Wrong option");
          }
        
        in.close();
    }
}