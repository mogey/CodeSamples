
import java.text.NumberFormat;
import java.util.Locale;

public class SavingsAccount
{
private String myFirstName;
private String myLastName;
private final String mySSnum;        // Social Security #  - Answer these 3 questions: (1) Why is mySSnum a String?  
private double mySavingsBalance;                          //    (2) Why is it declared final? (3) Why doesn't it have to be initialized now?
private static double myAnnualInterestRate;
private Date myBirthDate;
private Date myStartDate; 
    public SavingsAccount()
    {
        myFirstName = myLastName = "";
        mySSnum="";
        myBirthDate = new Date(0,0,0);
        myStartDate = new Date(0,0,0);        
        mySavingsBalance=0;
    }
    public SavingsAccount(String firstN, String lastN,String ss,
                          int bMonth,int bDay, int bYear,int sMonth, int sDay, int sYear, double sb)
    {  
         this.myFirstName = firstN;
         this.myLastName = lastN;
         this.mySSnum = ss;
         this.myBirthDate = new Date(bMonth, bDay, bYear);
         this.myStartDate = new Date(sMonth, sDay, bYear);
         this.mySavingsBalance = sb;
    }

    public void calculateMonthlyInterest()
    {
          /*double temp = this.mySavingsBalance;
          temp /= 12;
          temp *= this.myAnnualInterestRate;
          temp += this.mySavingsBalance;
          this.mySavingsBalance = temp;*/
          this.mySavingsBalance += this.mySavingsBalance * myAnnualInterestRate / 12;
    }

    public static void modifyInterestRate(double apr)
    {
           myAnnualInterestRate = apr;
    }
    public static double getAnnualInterestRate()
    {
        return myAnnualInterestRate;
    }

    public double getSavingsBalance()
    {
          return this.mySavingsBalance;
    }    
    
    public String printBalance()
    {
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);                      

           return moneyFormat.format(mySavingsBalance)+"\n";           
    }
    
    public String toString()
    {  
          return "Name: " + this.myFirstName + this.myLastName + "\n" + "Social Security: "
          + this.mySSnum + "\n" + "Birth Date: " + this.myBirthDate + "\n" + "Start Date: " + 
          this.myStartDate + "\n" + "Savings Balance: $" + this.mySavingsBalance + "\n" + "Annual Interest Rate: " + this.myAnnualInterestRate;
    } 

}