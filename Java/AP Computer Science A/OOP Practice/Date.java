public class Date
{
    private int year = 0;
    private int month = 0;
    private int day = 0;

    public Date()
    {
        //blank
    }

    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void addDays(int days)
    {
        for (int i = 1; i <= days; i++)
        {
            this.day++;
            if(this.day == 32) 
            {
                if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8|| this.month == 10 || this.month == 12)
                {
                    if(this.month <= 12)
                    {
                        this.month++;
                        this.day = 1;
                    }
                    if(this.month == 13)
                    {
                        this.day = 1;
                        this.month = 1;
                        this.year++;
                    }
                }
            }
            else if(this.day == 31)
            {
                if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)
                {
                    this.month++;
                    this.day = 1;
                }
            }
            else if (this.day == 30 && this.month == 2)
            {
                if(((this.year % 100 == 0) && (this.year % 400 == 0)) || ((this.year % 4 == 0) && (this.year % 100 != 0)))
                {
                    this.month++;
                    this.day = 1;
                }
            }
            else if (this.day == 29 && this.month == 2)
            {
                this.month++;
                this.day = 1;
            }
        }
    }

    public void addWeeks(int weeks)
    {
        this.addDays(weeks * 7);       
    }

    public boolean isLeapYear()
    {
        if((this.year % 100 == 0) && (this.year % 400 == 0))
        {
            return true;
        }
        else
        if((this.year % 4 == 0) && (this.year % 100 != 0))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public int daysTo(Date other)
    {
        int days = 0;
        if (this.year >= other.year)
        {
            while (this.year != other.year)
            {
                if((this.year % 100 == 0) && (this.year % 400 == 0))
                {
                    this.year--;
                    days += 366;
                }
                else if((this.year % 4 == 0) && (this.year % 100 != 0))
                {
                    this.year--;
                    days += 366;
                }
                else 
                {
                    this.year--;
                    days += 365;
                }
            }
        }
        else
        {
            while (this.year != other.year)
            {
                if((this.year % 100 == 0) && (this.year % 400 == 0))
                {
                    this.year++;
                    days += 366;
                }
                else if((this.year % 4 == 0) && (this.year % 100 != 0))
                {
                    this.year++;
                    days += 366;
                }
                else 
                {
                    this.year++;
                    days += 365;
                }
            }
        }
        if (this.month >= other.month)
        {
            while (this.month != other.month)
            {
                if (this.month == 1 || this.month == 2 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12)
                {
                    this.month--;
                    days += 31;
                }
                else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)
                {
                    this.month--;
                    days += 30;
                }
                else if (this.month==3)
                {
                    if((this.year % 100 == 0) && (this.year % 400 == 0))
                    {
                        this.month--;
                        days += 28;
                    }
                    else if((this.year % 4 == 0) && (this.year % 100 != 0))
                    {
                        this.month--;
                        days += 28;
                    }
                    else
                    {
                        this.month--;
                        days += 29;
                    }
                }
            }
        }
        else
        {
            while (this.month != other.month)
            {
                if (this.month == 1|| month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12)
                {
                    this.month++;
                    days += 31;
                }
                else if(this.month == 4 || this.month == 6  || this.month == 9 || this.month == 11)
                {
                    this.month++;
                    days += 30;
                }
                else //if(month == 3)
                {
                    if((this.year % 100 == 0) && (this.year % 400 == 0))
                    {
                        this.month++;
                        days += 28;
                    }
                    else if((this.year % 4 == 0) && (this.year % 100 != 0))
                    {
                        this.month++;
                        days += 28;
                    }
                    else
                    {
                        this.month++;
                        days += 29;
                    }
                }
            }
        }
        days += Math.abs(this.day - other.day);
        return days;
    }

    public int getday()
    {
        return this.day;
    }

    public int getmonth()
    {
        return this.month;
    }

    public int getyear()
    {
        return this.year;
    }

    public String toString()
    {
        return month + "/ " + day + "/ " + year; 
    }
}