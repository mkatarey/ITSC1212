public class ITSC1212Lab2 {
    public static void main(String[] args){
        //Part A

        /*short x = 0;
        short y = 2000;
        int z = 100000;
        char a = 'a';
        char b = 'b';
        boolean boo = true;
        System.out.println(x+y+z);
        System.out.println(a+b);
        System.out.println(x < y);
        System.out.println(y < z);
        System.out.println(z < a);
        greater than
        greater than or equal to
        less than
        less than or equal to
        equal to
        not equal to
        */

        //Part B
        /*int ex = (int) 4.0;
        System.err.println(ex);
        
        double x = 8.8;
        double y = 2.2;

        System.out.println(x / y);
        System.out.println(x / (int) y);
        System.out.println( (int) x / y);
        System.err.println( (int) (x / y));

        double cost = 10.10;
        double paid = 12.33;
        double change = ((double) ((int) ((paid - cost) * 100))) / 100;
        System.out.println("The change owed on this transaction is " + change + ".");
        */

        //Part C
        int totalDays = 3;
        int years = totalDays / 365;
        int weeks = (totalDays % 365) / 7;
        int remainderDays = (totalDays % 365) % 7;

        System.out.println("There are " + years + " years, " + weeks + " weeks, and " + remainderDays + " days in " + totalDays + " days.");
    }
}