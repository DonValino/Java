package Lab8.ArrayList;

/**
 * Created by x00112730 on 29/10/2014.
 */
public class Membership {


        private String name;
        private int month;
        private int year;


        public Membership(String name, int month, int year)

        {
            this.name = name;
            this.month = month;
            this.year = year;
        }

        public String getName()
        {
            return name;
        }


        public int getMonth()
        {
            return month;
        }


        public int getYear()
        {
            return year;
        }


        public String toString()
        {
            return "Name: " + name +
                    " joined in month " +
                    month + " of " + year;
        }
    }


