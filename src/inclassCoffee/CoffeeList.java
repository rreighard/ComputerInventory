package inclassCoffee;

public class CoffeeList {

    ArrayList<Coffee> coffeeList = new ArrayList<>();

    public void addCoffee(Coffee coffee){
        coffeeList.add(coffee);
    }

    public void removeCoffee(int index) { coffeeList.remove(index); }

    public ArrayList<Coffee> getCoffeeList() { return coffeeList; }

}
