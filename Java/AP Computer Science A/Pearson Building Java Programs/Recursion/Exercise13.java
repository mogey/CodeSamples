import java.util.ArrayList;
public class Exercise13
{
    public static void main()
    {
        int n1 = 8342116;
        String n = Integer.toString(n1);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while(i < n.length()) {
            list.add(Integer.parseInt(Character.toString(n.charAt(i))));
            i++;
        }
        int count = 0;
        ArrayList<Integer> l = isReverse(i, list, count);
        for(int j =0; j < l.size(); j++) {
            System.out.print(l.get(j));
        }

    }

    public static ArrayList<Integer> isReverse(int n, ArrayList<Integer> list, int count) {
        if(count == list.size()) {
            return list;
        }
        else {
            if(list.get(count) % 2 != 0) {
                list.remove(count);
                count--;
            }
            return isReverse(n, list, count + 1);
        }
    } 
}