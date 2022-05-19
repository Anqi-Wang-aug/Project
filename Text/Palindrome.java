import java.lang.Math;
import java.util.Scanner;
public class Palindrome {

    private String text;

    // thought I would use this class somewhere else for other palindrome practices, so I construct this object
    public Palindrome(String s)
    {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        this.text = s.toLowerCase();
    }

    public boolean checkIfPalindrome()
    {
        int l = text.length();
        if (l<2) return true;
        int i,j;
        // if text is of even length
        if(l%2==0)
        {   
            i = (int)(l/(float)2);
            j = i-1;
        }
        // if text is of odd length
        else
        {
            j = (int)Math.ceil(l/(float)2);
            i = j-2;
        }
        /* Starting from the middle of the string, take one character at the left and one at the right, 
         * further and further from the center until both left and right ends are reached
         * Check if the given string is a palindrome
         * return false if left and right does not match
         * return true if no such mismatch
         */
        while(i>=0 && j<l)
        {
            if(text.charAt(i)!=text.charAt(j)) return false;
            i--;
            j++;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Palindrome p;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter palindrome: ");
        String i = s.nextLine();
        long starTime = System.nanoTime();
        p = new Palindrome(i);
        if(p.checkIfPalindrome()) System.out.println(i+" is a palindrome");
        else System.out.println(i+" is NOT a palindrome");
        long endTime = System.nanoTime();
        System.out.println("Time elapsed in nanosecond: "+ (endTime-starTime));
        System.out.println("-------------------------------------------");
    }
}
