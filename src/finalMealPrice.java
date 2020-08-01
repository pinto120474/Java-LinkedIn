public class finalMealPrice {
    public static void main(String[] args) {

        CalculateMealPrice("Steak", 100, 100, 0.50, .50);
    }

    public static void CalculateMealPrice
            (String mealName,
             double extraCheese,
             double listedMealPrice,
             double tipRate,
             double taxRate)
    {
        double cheese = extraCheese + listedMealPrice;
        double meal_price = cheese + listedMealPrice;
        double tip = tipRate * meal_price;
        double meal_price_after_tip = meal_price + tipRate;
        double tax =  taxRate * meal_price_after_tip;
        double result = meal_price_after_tip + tax;

        System.out.println(meal_price);
        System.out.println(meal_price_after_tip);
        System.out.println(tax);
        System.out.println();
        System.out.println("Your total meal price for " + mealName + " is " + result);
    }
}