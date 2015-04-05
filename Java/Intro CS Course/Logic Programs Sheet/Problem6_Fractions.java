public class Problem6_Fractions
{
    public static void main()
    {
        int numerator1 = 4;
        int numerator2 = 3;
        int denom1 = 5;
        int denom2 = 7;
        int newDigit = 0;
        
        String add;
        String subtract;
        String Multiply;
        String Divide;
        
        System.out.println(numerator1 + "/" + denom1);
        System.out.println(numerator2 + "/" + denom2);
        if (denom1 == denom2){//just incase so that if they're the same we dont just make a bigger fraction
            add = (numerator1 + numerator2) + "/" + (denom1);
            subtract = (numerator1 - numerator2) + "/" + (denom1);
            Multiply = (numerator1 * numerator2) + "/" + (denom1 * denom2);
            Divide = (numerator1 * denom2) + "/" + (numerator2 * denom1); 
        }
        else {
            newDigit = denom1 * denom2;
            numerator1 *= denom2; //common denominator
            numerator2 *= denom1;
            add = (numerator1 + numerator2) + "/" + (newDigit);
            subtract = (numerator1 - numerator2) + "/" + (newDigit);
            numerator1 = 4;
            numerator2 = 3; 
        }
        Multiply = (numerator1 * numerator2) + "/" + (denom1 * denom2);
        Divide = (numerator1 * denom2) + "/" + (numerator2 * denom1); 
        System.out.println("sum " + add);
        System.out.println("diff " + subtract);
        System.out.println("product " + Multiply);
        System.out.println("quot "+ Divide);
        
    }
}
