
public class Exercise12
{
    public static void main()
    {
        System.out.println(indexOf("Barack Obama", "bam"));
    }

    public static int indexOf(String s, String a){

        if (s.substring(0,a.length()).equals(a.substring(0,a.length()))){
            return 0;
        }

        if (s.length() <= 0 || a.length() <= 0){
            return -1;
        }

        if (a.length() > s.length()){
            return -1;
        }

        if (s.length() <= 1){
            return -1;
        }

        return (1 + indexOf(s.substring(1,s.length()), a));
    }
}

