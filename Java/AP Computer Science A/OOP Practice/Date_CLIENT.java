public class Date_CLIENT
{
    public static void main()
    {
    Date d1 = new Date(1,1,2000); 
    Date d2 = new Date(1,1,2001);
    Date d3 = new Date(1,1,1800); 
    Date d4 = new Date(1,1,1999);    
 
        // Leap Year d1 & d2
        System.out.println("Is " + d1 + " a leap year?   Answer: " + d1.isLeapYear());        
        System.out.println("Is " + d2 + " a leap year?   Answer: " + d2.isLeapYear());        
        System.out.println("Is " + d3 + " a leap year?   Answer: " + d3.isLeapYear());        
        System.out.println("Is " + d4 + " a leap year?   Answer: " + d4.isLeapYear());        
          
        // Add days
        d1.addDays(1);
        System.out.println("d1 + 1 day = " + d1);
        d2.addDays(40);
        System.out.println("d2 + 40 days = " + d1);
        d1.addDays(100);
        System.out.println("d3 + 100 day = " + d1);
        d1.addDays(1000);
        System.out.println("d4 + 1000 day = " + d1);        
        
        // Reset add dates
        d1 = new Date(1,1,2000); 
        d2 = new Date(1,1,2001);
        d3 = new Date(1,1,1800); 
        d4 = new Date(1,1,1999);          
        
        // Add weeks
        d1.addWeeks(1);
        System.out.println("d1 + 1 week = " + d1);
        d2.addWeeks(4);
        System.out.println("d2 + 4 weeks = " + d1);
        d1.addWeeks(10);
        System.out.println("d3 + 10 weeks = " + d1);
        d1.addWeeks(100);
        System.out.println("d4 + 100 weeks = " + d1);           
        
        // daysTo part
        d1 = new Date(1,1,2000);
        d2 = new Date(2,1,2000); 
        System.out.println("Number of days from " + d1 + " to " + d2 + " = " + d1.daysTo(d2));
        System.out.println("Number of days from " + d2 + " to " + d1 + " = " + d2.daysTo(d1));       
        d2 = new Date(1,2,2000);         
        System.out.println("Number of days from " + d1 + " to " + d2 + " = " + d1.daysTo(d2));       
        d2 = new Date(1,6,2000);         
        System.out.println("Number of days from " + d1 + " to " + d2 + " = " + d1.daysTo(d2));               
        d2 = new Date(1,1,2001);         
        System.out.println("Number of days from " + d1 + " to " + d2 + " = " + d1.daysTo(d2));               
        d2 = new Date(1,6,2001);         
        System.out.println("Number of days from " + d1 + " to " + d2 + " = " + d1.daysTo(d2));               
        d2 = new Date(1,1,2010);         
        System.out.println("Number of days from " + d1 + " to " + d2 + " = " + d1.daysTo(d2));
 
    }  // main
  
}
