public class Order {

    //-------Attribute-------//
//    private Costumer Owner ; //From Ghassan Classes
    private double TotalCost;
    private Meal[] meals;


    //-------Getter , Setter-------//
    public double getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(double totalCost) {
        TotalCost = totalCost;
    }

    public Meal[] getMeals() {
        return meals;
    }

    public void setMeals(Meal[] meals) {
        this.meals = meals;
    }
}
