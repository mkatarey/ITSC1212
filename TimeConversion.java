public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here
    
    //Converted the user input of seconds to decaseconds by multiplying by 0.1 since 1 second is 0.1 decaseconds
    public void showDecaseconds(int num){
        System.out.println("A decasecond is 10 seconds.");
        double decaseconds = num * 0.1;
        System.out.println("This will be " + decaseconds + " decaseconds.");
    }


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here
    
    //Converted the user input of seconds to jiffies by dividing by 0.01 since 1 second is 100 jiffies
    public void showJiffies(int num){
        System.out.println("A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds.");
        double jiffies = num / 0.01;
        System.out.println("This will be " + jiffies + " jiffies.");
    }


    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here

    //Converted the user input of seconds to New York Minutes by dividing by 0.05 since 1 second is 20 New York Minutes
    public void showNewYorkMinutes(int num){
        System.out.println("A new york minute is the period of time between the traffic lights turning green and the cab behind you honking. It is 1/20th of 1 second.");
        double newYorkMinutes = num / 0.05;
        System.out.println("This will be " + newYorkMinutes + " New York Minutes.");
    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here

    //Converted the user input of seconds to nanocenturies by dividing by 3.156 since 1 second is 1/3.156 nanocenturies
    public void showNanoCenturies(int num){
        System.out.println("A nanocentury is a computing measurement coined from the expression -  \"never to let the user wait more than a few nanocenturies for a response.\" It is 3.156 seconds.");
        double nanocenturies = num / 3.156;
        System.out.println("This will be " + nanocenturies + " nanocenturies.");
    }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here

    //Converted the user input of seconds to Scaramuccis by dividing by 950400 since 1 second is 1/950400 Scaramuccis
    public void showScaramuccis(int num){
        System.out.println("A Scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days.");
        double scaramucci = (double) num / 950400;
        System.out.println("This will be " + scaramucci + " Scaramuccis.");
    }



    
}//end class