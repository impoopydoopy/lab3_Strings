import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner godOfScanners = new Scanner(System.in);

        System.out.println("Input a string to split: ");
        String check = godOfScanners.nextLine();
        splitString(check);

        System.out.println("Input a word for check if it ends with ed: ");
        check = godOfScanners.next();
        System.out.println("Ends on ed - " + checkIfEnds(check));

        System.out.println("Input a word to get sum of numbers: ");
        check = godOfScanners.next();
        System.out.println("Sum - " + getSum(check));

        System.out.println("Input a word to a value of repeating symbols: ");
        check = godOfScanners.next();
        System.out.println("Max count of repeating symbols - " + getLengthOfBlock(check));

        System.out.println("Input first word to join them: ");
        check = godOfScanners.next();
        System.out.println("Input second word to join them: ");
        String check2 = godOfScanners.next();
        System.out.println(joinStrings(check, check2));
    }

    public static boolean checkIfEnds(String s)
    {
        return(s.endsWith("ed"));
    }

    public static int getSum(String s)
    {
        int sum = 0;
        char[] charArray = s.toCharArray();

       for (Character c : charArray)
        {
            if (Character.isDigit(c))
                sum += Character.getNumericValue(c);
        }

        return sum;
    }

    public static int getLengthOfBlock(String s)
    {
        char[] charArray = s.toCharArray();
        int count = 1, maximum = 1;

        for (int i = 0; i < charArray.length - 1 ; i++)
        {
            if(charArray[i] == charArray[i+1])
                count++;
            else{
                count = 1;
            }
            if(count > maximum) maximum = count;
        }

        return maximum;
    }

    public static void splitString(String s)
    {
        String[] stringArray = s.split("\\s");

        System.out.println("Split:");

        for(String word : stringArray)
            System.out.println(word);
    }

    public static String joinStrings(String s, String t)
    {
        int min = Math.min(s.length(), t.length());

        String result = "";

        for (int i = 0; i < min; i++) {
            result = result + s.charAt(i) + t.charAt(i);
        }

        result = result + s.substring(min) + t.substring(min);

        return result;
    }
}