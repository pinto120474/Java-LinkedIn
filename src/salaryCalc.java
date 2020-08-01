public class salaryCalc {
    public static void main(String[] args) {

        double salary = SalaryCalculator(1, 10, 8);
        System.out.println(salary);
    }

    //end of main function here
    //below the salary function starts

    public static int SalaryCalculator(double hoursPerWeek,
                                       double amountPerHour,
                                       int vacationDays) {

        if(hoursPerWeek < 0) {
            return -1;
        }

        if(amountPerHour < 0) {
            return -1;
        }

        double weeklyPayCheck = hoursPerWeek * amountPerHour;
        System.out.println(weeklyPayCheck);
        double total_salary_excluding_vacation =  weeklyPayCheck * 52;
        System.out.println(total_salary_excluding_vacation);
        double vacationDaysAmount = (vacationDays/52) * hoursPerWeek;
        System.out.println(vacationDaysAmount);
        double total_salary_after_vacation = total_salary_excluding_vacation - vacationDaysAmount;
        System.out.println(total_salary_after_vacation);
        return (int) total_salary_after_vacation;
    }

}
