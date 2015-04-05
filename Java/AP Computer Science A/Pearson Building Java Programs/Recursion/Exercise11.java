public class Exercise11 
{
    public static void main() 
    {
        String s = "hello";
        String s2 = "oLLeH";
        int i = 0;
        boolean a = isReverse(s, s2, i);
        System.out.print(a);

    }

    public static boolean isReverse(String s1, String s2, int i) {
        if(!Character.toString(s1.charAt(i)).toUpperCase().equals(Character.toString(s2.charAt(s2.length() - 1 - i)).toUpperCase())) {
            return false;
        }
        /*else if(!Character.toString(s1.charAt(i)).equals(Character.toString(s2.charAt(s2.length() - 1 - i)))) {
        return false;
        }*/
        else if(i == s1.length() || s2.length() -2 - i == 0) {
            return true;
        }
        else {
            return isReverse(s1, s2, i + 1);
        }
    } 
}