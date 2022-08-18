public class Budget {
    public static void main(String[] args) {
        // *******************************************************************************************************************************************************************************************************
        // Project 1
        // *******************************************************************************************************************************************************************************************************
        double monthlyRent = 625.0;
        double monthlyInternet = 27.0;
        double monthlyGrocery = 250.0;
        double monthlyFun = 150.0;
        //Adding together all of the expenses to find the total monthly expenses
        double monthlyTotalExpenses = monthlyRent + monthlyInternet + monthlyGrocery + monthlyFun;
        //Printing out all of the individual expenses
        System.out.println("The total monthly rent expenses are $" + monthlyRent + ".");
        System.out.println("The total monthly Internet service expenses are $" + monthlyInternet + ".");
        System.out.println("The total monthly grocery expenses are $" + monthlyGrocery + ".");
        System.out.println("The total monthly 'fun' expenses are $" + monthlyFun + ".");
        //Printing out the total monthly expenses
        System.out.println("The total monthly expenses are $" + monthlyTotalExpenses + ".");
        double hourlyWage = 10.0;
        //Printing out the hourly wage
        System.out.println("The hourly wage for the TA is $" + hourlyWage + ".");
        //Dividing total monthly expenses by hourly wage to find number of hours per month to break even and casting it as a double
        double hoursPerMonth = monthlyTotalExpenses/hourlyWage;
        //Dividing the number of hours to break even per month by 4 weeks to find the number of hours needed per week
        double hoursPerWeek = hoursPerMonth/4;
        //Printing out the number of hours per week the TA would need to work to break even as a double hour value
        System.out.println("The number of hours per week the TA would need to work to break even is " + hoursPerWeek + " hours.");
        //Dividing 100 (which is the amount the TA wants to save every month) by the TA's hourly wage to find the number of hours the TA needs to work
        double hoursForSaving = 100/hourlyWage;
        //Adding together the number of hours per month to pay off expenses and the number of hours to save $100 to find the total number of hours per month
        double totalHoursPerMonth = hoursPerMonth + hoursForSaving;
        //Printing out the total number of hours per month that the TA would need to work to pay off expenses and save $100
        System.out.println("The number of hours the TA would need to work per month to pay off expenses and save $100 a month is " + totalHoursPerMonth + " hours.");
    }
}