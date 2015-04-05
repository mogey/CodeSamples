public class Problem20
{
    public static void main()
    {
        int year=1983, month=5, date=23, num, total, remainder;
        
        num = year % 100; 
        total = num/4;   
        
        total = total + num;   
        total = total + date;   
        
        boolean leapYear = false;
        
        
        if (month == 1 || month == 10)
            total += 1;
        else if (month == 2 || month == 3 || month == 11)
            total += 4;
        else if (month == 4 || month == 7)
            total += 0;
        else if (month == 5)
            total += 2;
        else if (month == 6)
            total += 5;
        else if (month == 8)
            total += 3;
        else if (month == 9 || month == 12)
            total += 6;
            
        
        
        if (year%4 == 0)    //leap step1
        {
            if(year%100 == 0)   //leap step2
            {
                if(year%400 == 0)   //leap step3
                {
                    leapYear = true;
                }
                else
                {
                    leapYear = false;
                }
            }
            else
            {
                leapYear = true;
            }
        }
        else
        {
            leapYear = false;
        }
        
      
        if (leapYear == true || month == 1 || month == 2)
        {
            total -= 1;
        }
        else
        {
            total = total;
        }
        
        remainder = total % 7;
        
        if (remainder == 0)
            System.out.print(month +"/" + date + "/" + year + " is on a Saturday.");
        else if (remainder == 1)
            System.out.print(month +"/" + date + "/" + year + " is on a Sunday.");
        else if (remainder == 2)
            System.out.print(month +"/" + date + "/" + year + " is on a Monday.");
        else if (remainder == 3)
            System.out.print(month +"/" + date + "/" + year + " is on a Tuesday.");
        else if (remainder == 4)
            System.out.print(month +"/" + date + "/" + year + " is on a Wednesday.");
        else if (remainder == 5)
            System.out.print(month +"/" + date + "/" + year + " is on a Thursday.");
        else if (remainder == 6)
            System.out.print(month +"/" + date + "/" + year + " is on a Friday.");
    }
}
                    