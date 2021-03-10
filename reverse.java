
/**
 * Write a description of class reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reverse
{
    public static void main(String args[])
    {
        String str = "my test";
        String reverse="";
        for (int i=0; i<str.length(); i++)
            reverse+=str.charAt(str.length()-1-i);
        System.out.println(reverse);
    }
}
