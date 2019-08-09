
package OOPChallenge_Solution;

public class DeluxBurger extends HumeBurger {
    
    public DeluxBurger() {
        super("Durbage", "Include", 1000, "Japan");
        super.AddBurgerAddition1("Chips",100);
        super.AddBurgerAddition2("Drink", 120);
    }

    @Override
    public void AddBurgerAddition4(String name, double price) {
        System.out.println("Can not Added additional  DeluxBurger ") ;
    }

    @Override
    public void AddBurgerAddition3(String name, double price) {
        System.out.println("Can not Added additional  DeluxBurger ") ;
    }

    @Override
    public void AddBurgerAddition2(String name, double price) {
       System.out.println("Can not Added additional  DeluxBurger ") ;
    }

    @Override
    public void AddBurgerAddition1(String name, double price) {
       System.out.println("Can not Added additional  DeluxBurger ") ;
    }
    
    
}
