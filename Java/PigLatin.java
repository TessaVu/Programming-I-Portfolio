import java.util.Scanner;

public class PigLatin {
    public static void main(String args[]) {
        System.out.println("Word: ");
        Scanner scanner = new Scanner(System.in);
        String firstVowel = scanner.nextLine();
        char v = Character.toLowerCase(firstVowel.charAt(0));
        if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
            String convertToPigLatin = firstVowel + "ay";
            System.out.println(convertToPigLatin);
        }
        else {
            String first = firstVowel.substring(0, 1);
            String slice = firstVowel.substring(1, firstVowel.length());
            System.out.println(slice + first + "ay");
        }
    }
}