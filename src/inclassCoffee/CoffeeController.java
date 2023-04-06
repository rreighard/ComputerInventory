package inclassCoffee;

public class CoffeeController {

    ArrayList<Coffee> coffeeLIst = new ArrayList<Coffee>();
    CoffeeTableModel coffeeTM = new CoffeeTableModel(coffeeList);
    CoffeeList coffeeList;

    public CoffeeTableMOdel getCoffeeTm() { return coffeeTM; }

    coffeeDetails details;

    CoffeeController(CoffeeList list, CoffeeDetails view){
        coffeeList = list == null ? new CoffeeList() : list;
        details = view;

        coffeeTM = new CoffeeTableModel(coffeeList.getCoffeeList());

        initHandlers();
    }

    private void initHandlers(){
        details.getAddButton().addActionListener(a -> {
            coffeeList.addCoffee(new Coffee(details.getIsIcedCheckBox().isSelected(),
                    Arrays.asList(details.getFlavorTxtFld.getText().split(",")),
                    details.getCreamerTxtFld.getText(),
                    Coffe.getSizeHelper(details.getSizeTxtFld().getText()),
                    details.getRoastTxtFld().getText()));
        });

        details.getNextButton().addActionListener(a -> {
            int currentCoffee = (this.currentCoffe +1) % coffeeList.getCoffeeList.size();
            details.parseCoffeeDetails(coffeeList.getCoffeeList().get(currentCoffee));
        });

        details.getPrevButton().addActionListener(a -> {
            currentCoffee = (this.currentCoffee -1) < 0 ? coffeeList.getCoffeeList().size()-1 : this.currentCoffe -1;
            details.parseCoffeeDetails(coffeeList.getCoffeeList().get(currentCoffee));
        });

        details.getDeleteButton().addActionListener(a -> {
            coffeeList.removeCoffee(currentCoffee)
        });

        details.getQuitButton().addActionListener(a -> {
            System.exit(0);
        });

        details.getUpdateButton().addActionListener(a -> {
            coffeeList.getCoffeeList().set(currentCoffe, new Coffee(details.getIsIcedCheckBox().isSelected(),
                    Arrays.asList(details.getFlavorTxtFld.getText().split(",")),
                    details.getCreamerTxtFld.getText(),
                    Coffe.getSizeHelper(details.getSizeTxtFld().getText()),
                    details.getRoastTxtFld().getText()));
        });
    }
}
