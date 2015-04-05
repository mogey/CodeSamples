public class Pearson_Arrays_12
{
    public static void main()
    {
        int Bids[] = {200, 300, 250, 1, 950, 40};
        int price = 280;
        int ClosestBid = PriceIsRight(Bids, price);
        System.out.println(ClosestBid + " is the winning price who didn't go over the price of " + price);
    }
    public static int PriceIsRight(int a[],int p)
    {
        int PotBid = -1;
        for (int i = 0; i <  a.length; i++)
        {
            if (a[0] == p)
            {
                return p;
            }
            else if (a[i] < p && a[i] > PotBid)
            {
                PotBid = a[i];
            }
        }
        return PotBid;
    }
}