import java.util.*;
public class MemoryMatch
{
    public static void main() throws InterruptedException
    {
        Scanner in = new Scanner(System.in);
        final int NUM_PAIRS = 4;
        boolean printElement[] = new boolean[NUM_PAIRS*2+1];
        int board[] = GenerateBoard(NUM_PAIRS);
        
        System.out.print("SHUFFLED : ");
        for (int i=1; i<board.length; i++)
        {
            System.out.print( board[i] + ", ");
        }
        
        System.out.println("\n");
        System.out.print("Player 1 Name: ");
        String p1name = in.nextLine();
        System.out.print("Player 2 Name: ");
        String p2name = in.nextLine();
        int p1score = 0;
        int p2score = 0;
        int games = 0; 
        int curPlayer = 1;
        int k = 0;
        int p1choice = -1;;
        int p2choice = -1;
        int p1choice2 = -1;;
        int count = 0;
        int p2choice2 = -1;
        while (games == 0)
        {
            while(curPlayer == 1)
            {
                refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                for(int i = 0; i < printElement.length; i++){
                    if (printElement[i] == true){
                        count++;
                        if(count >= 8){
                            curPlayer = 0;
                        }
                    }
                }
                if(curPlayer == 0){
                    break;
                }
                refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                System.out.print("\n" + p1name + ", Please enter your choice: ");
                p1choice = in.nextInt();
                p1choice--;
                count = 0;
                if (printElement[p1choice] == false){
                    printElement[p1choice] = true;
                }
                else
                {
                    System.out.print("INVALID Please pick again!"); 
                    System.out.print("\n" + p1name + ", Please enter your choice: ");
                    p1choice = in.nextInt();
                }
                refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                System.out.print("\n" + p1name + ", Please enter your 2nd choice: ");
                p1choice2 = in.nextInt();
                p1choice2--;
                if (printElement[p1choice2] == false){
                    printElement[p1choice2] = true;
                }
                else
                {
                    System.out.print("INVALID Please pick again!"); 
                    System.out.print("\n" + p1name + ", Please enter your 2nd choice: ");
                    p1choice2 = in.nextInt();
                }
                refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                if (board[p1choice] == board[p1choice2])
                {
                    System.out.println("\nMatch!!");
                    p1score++;
                    Thread.sleep(500);
                    refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                }
                else
                {
                    refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                    System.out.println("\nNo match! :(");
                    printElement[p1choice] = false;
                    printElement[p1choice2] = false;
                    Thread.sleep(500);
                    curPlayer = 2;
                }
            }
            while(curPlayer == 2)
            {
                refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                for(int i = 0; i < printElement.length; i++){
                    if (printElement[i] == true){
                        count++;
                        if(count >= 8){
                            curPlayer = 0;
                        }
                    }
                }
                if(curPlayer == 0){
                    break;
                }
                refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                System.out.print("\n" + p2name + ", Please enter your choice: ");
                p2choice = in.nextInt();
                p2choice--;
                count = 0;
                if (printElement[p2choice] == false){
                    printElement[p2choice] = true;
                }
                else
                {
                    System.out.print("INVALID Please pick again!"); 
                    System.out.print("\n" + p2name + ", Please enter your choice: ");
                    p2choice = in.nextInt();
                }
                refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                System.out.print("\n" + p2name + ", Please enter your 2nd choice: ");
                p2choice2 = in.nextInt();
                p2choice2--;
                if (printElement[p2choice2] == false){
                    printElement[p2choice2] = true;
                }
                else
                {
                    System.out.print("INVALID Please pick again!"); 
                    System.out.print("\n" + p1name + ", Please enter your 2nd choice: ");
                    p2choice2 = in.nextInt();
                }
                refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                if (board[p2choice] == board[p2choice2])
                {
                    System.out.println("\nMatch!!");
                    p2score++;
                    Thread.sleep(500);
                    refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                }
                else
                {
                    refreshBoard(p1name, p2name, p1score, p2score, NUM_PAIRS, board, printElement);
                    System.out.println("\nNo match! :(");
                    printElement[p2choice] = false;
                    printElement[p2choice2] = false;
                    Thread.sleep(500);
                    curPlayer = 1;
                }
            }
            if (curPlayer == 0){
                if(p1score > p2score){
                    System.out.println("\f Congratulations! You won: " + p1name + "!");
                }
                else if(p2score > p1score){
                    System.out.println("\f Congratulations! You won: " + p2name + "!");
                }
                else if(p1score == p2score){
                    System.out.println("\f " + p1name + ", You and " + p2name + " tied.");
                }
                games = 1;
            }
        }
    }
    public static int[] GenerateBoard(int NUM_PAIRS)
    {
        int board[] = {1,1,2,2,3,3,4,4};
        int k = 1;
        int temp, pos1, pos2;
        
        for (int i = 1; i <= 1000; i++)
        {
            //randomize and shuffle board 1000 times
            pos1 = ((int) (Math.random() * (board.length-1) + 1));
            pos2 = ((int) (Math.random() * (board.length-1) + 1));
            
            temp = board[pos1];
            board[pos1] = board[pos2];
            board[pos2] = temp;
        }
        return board;
    }
    public static void refreshBoard(String p1name, String p2name, int p1score, int p2score, int NUM_PAIRS, int[] board, boolean[] printElement){
        System.out.print("\f");
        /*for(int i = 0; i<NUM_PAIRS*2; i++)
        {
                 System.out.print(board[i] + " ");
        }
        for(int i = 0; i<NUM_PAIRS*2; i++)
        {
           if( printElement[i] == true){     
                System.out.print("true ");
           }
           else
           {
               System.out.print("false ");
           }
        }
        System.out.println("\n");*/
        System.out.println(p1name + ": " + p1score);
        System.out.println(p2name + ": " + p2score);
        System.out.println("\n");
        for(int i = 1; i <9; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i<NUM_PAIRS*2; i++)
         {
            if (printElement[i] == true)
             {
                 System.out.print(board[i] + " ");
            }
            else
            {
                System.out.print("* ");
            }
        }
    }
}