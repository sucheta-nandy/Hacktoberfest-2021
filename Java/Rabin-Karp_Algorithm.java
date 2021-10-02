import java.util.*;
public class Rabin_Karp_algo {
    private static final int d = 26; // total number of  alphabets
    private static final int p = 5381; // prime number
public static void main(String []args)
{
    Scanner in=new Scanner(System.in);
    String txt = in.next();
    String pat = in.next();

    search(pat, txt);
}

    public static void search(String pat, String txt)
    {
        int patHash = 0; // Hash value of pattern
        int txtHash = 0; // Hash value of text

        for (int i = 0; i < pat.length(); i++) // Generating Hash values for pattern and first window text
        {
            patHash = patHash * d;
            txtHash = txtHash * d;
            patHash = patHash + ((pat.charAt(i) - 'A' + 1) % p);
            txtHash = txtHash + ((txt.charAt(i) - 'A' + 1) % p);
        }


        for (int i = 0; i < txt.length() - pat.length(); i++) // Loop of text size minus  window
        {
            if (patHash == txtHash)
            {
                System.out.println("Pattern found at index " + i);
            }

            if (i < txt.length() - pat.length())
            {
                txtHash = txtHash - ((txt.charAt(i) - 'A' + 1) * (int)Math.pow(d, pat.length() - 1));  // Subtracting first element from current hash of d^window-1
                txtHash = txtHash * d + (txt.charAt(i + pat.length()) - 'A' + 1);  // multiplying obtained hash with d to left shift the number and then adding the next new element
            }
        }
    }


}
