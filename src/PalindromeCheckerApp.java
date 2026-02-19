public class PalindromeCheckerApp{
    public static void main(String[] args){
        String text= "lokol";
        String reversed = "";
        System.out.println("Input text: " + text);
        boolean palindrome =true;
        for (int i= text.length()-1; i>=0;i--){
            reversed+=text.charAt(i);
        }
        if (text.equals(reversed)){
            System.out.println("Is it a palindrome? : True");
        }
        else{
            System.out.println("Is it a palindrome? : False");

        }
    }
}