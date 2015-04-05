import java.util.*;
import javax.swing.JOptionPane;
public class Transporter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System. in );
        int k = 1;
        // Inputs
        System.out.print("How much money do you have? ");
        double bank = in .nextDouble();

        while (k > 0) {
            int i = 0;
            int j = 0;

            int curZone;
            int curTime;
            int TwelveHr;
            String curAP;
            double cost = 0;
            System.out.println("(1) Atlantic");
            System.out.println("(2) Eastern");
            System.out.println("(3) Central");
            System.out.println("(4) Mountain");
            System.out.println("(5) Pacific");

            System.out.print("What is the starting location? ");
            int starting = in .nextInt();
            curZone = starting;
            System.out.print("What is the destination location? ");
            int dest = in .nextInt();

            System.out.print("What time do you start? ");
            int startTime = in .nextInt();

            System.out.print("AM or PM? (A for AM P for PM) ");
            String AP = in .next() + "M";
            curAP = AP;
            //Convert time to military
            if (AP == "PM" && startTime >= 1 && startTime <= 11) {
                curTime = startTime + 12;
            } else if (AP == "PM" && startTime == 12) {
                curTime = startTime;
            } else if (AP == "AM" && startTime == 12) {
                curTime = 0;
            } else {
                curTime = startTime;
            }

            i = curZone;
            j = dest;
            if (i < j) {

                //Traveling forwards
                while (i <= j) {
                    //System.out.println("Going forwards");
                    //System.out.println(curZone);

                    i++;
                    curZone = i;
                    if (curTime < 0) {
                        curTime = 23;
                    }
                    if (i <= j) {
                        curTime--;
                    }
                }
            } else {
                while (i >= j) {
                    //System.out.println("Backawrds");
                    //System.out.println(curZone);
                    if (i == 4) {
                        cost += .5;

                    } else if( i == 1 || j == 1){
                        cost += .75;
                    } else {
                        cost += 1;
                    }
                    i--;
                    curZone = i;
                    if (curTime > 23) {
                        curTime = 0;
                    }
                    if (i >= j) {
                        curTime++;
                    }
                }
            }
            //Convert time back to 12 hour
            if (curTime >= 13) {
                curAP = "PM";
                TwelveHr = curTime - 12;
            } else if (curTime == 12) {
                curAP = "PM";
                TwelveHr = curTime;
            } else if (curTime == 0) {
                curAP = "AM";
                TwelveHr = 12;
            } else {
                curAP = "AM";
                TwelveHr = curTime;
            }
            //Check their bank before applying the cost
            if (bank - cost > 0) {
                bank -= cost;
                System.out.println("From " + formatRegion(starting) + " to " + formatRegion(dest) + " starting @ " + startTime + " " + AP + " you will arrive @ " + TwelveHr + " " + curAP + ".");
                System.out.println("Cost = $" + cost);
                System.out.println("Bank = $" + bank);
                System.out.println("Count = " + k);

                //System.out.println("This will cost " + cost + " " + TwelveHr + curAP);
            } else {
                System.out.println("Insufficient funds");
                System.out.println("Cost = $" + cost);
                System.out.println("Bank = $" + bank);
                System.out.println("Count = " + k);
            }
            // Break out of the loop if they don't want to go again, or increase the count to restart
            System.out.println("Would you like to travel again? y/n");
            String Answer = in .next();
            if (Answer.equals("n")) {
                System.out.println("Thank you for traveling with us! \n Have a great day!");
                break;
            } else {
                k++;
            }
            System.out.println();
        }
    }

    public static String formatRegion(int x) {
        String y = null;
        if (x == 1) {
            y = "Atlantic";
            return y;
        } else if (x == 2) {
            y = "Eastern";
            return y;
        } else if (x == 3) {
            y = "Central";
            return y;
        } else if (x == 4) {
            y = "Mountain";
            return y;
        } else if (x == 5) {
            y = "Pacific";
            return y;
        } else {
            return y;
        }
    }
}