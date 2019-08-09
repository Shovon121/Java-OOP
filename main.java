
package OOPChallenge_Solution;

import MasterChallengeExercise.*;

public class main {
    
    public static void main(String[] args) {
        HumeBurger humburger = new HumeBurger("Asian","Seusage",210,"Red");
        double price = humburger.ItemizeHumburger();
        humburger.AddBurgerAddition1("tomato", 150);
        humburger.AddBurgerAddition2("Apple", 200);
        humburger.AddBurgerAddition3("Multa", 300);
        
        System.out.println("THE Total Burger price is " + humburger.ItemizeHumburger());
        
        
        HealthyBurger healthyBurger = new HealthyBurger("Becon",500);
        healthyBurger.ItemizeHumburger();
        healthyBurger.AddBurgerAddition1("mengo", 400);
         healthyBurger.AddBurgerAddition1("Benena", 350);
        System.out.println("Total healthy Burger price is " + healthyBurger.ItemizeHumburger());
        
        
        
        DeluxBurger deluxBurger =new DeluxBurger();
         deluxBurger.ItemizeHumburger();
        
    }
}
