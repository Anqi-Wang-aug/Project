import java.util.Scanner;

public class ReverseString {
    private static String swapChar(String s, int i,int j)
    {
        char leftChar = s.charAt(i);
        char[] tmp = s.toCharArray();
        tmp[i] = tmp[j];
        tmp[j] = leftChar;
        s = String.valueOf(tmp);
        return s;
    }
    public static void main (String[] args)
    {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = io.nextLine();
        long starTime = System.nanoTime();
        int i = 0;
        int j = s.length()-1;
        while((i!=j && s.length()%2==1)||(s.length()%2==0 && i<j))
        {
            s = swapChar(s,i,j);
            i++;
            j--;
        }
        System.out.println(s);
        long endTime = System.nanoTime();
        System.out.println("Time elapsed: "+(endTime-starTime));
    }
}
