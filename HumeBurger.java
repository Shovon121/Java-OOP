package OOPChallenge_Solution;

import MasterChallengeExercise.*;

public class HumeBurger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String Addition1name;
    private double Addition1price;

    private String Addition2name;
    private double Addition2price;

    private String Addition3name;
    private double Addition3price;

    private String Addition4name;
    private double Addition4price;

    public HumeBurger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void AddBurgerAddition1(String name, double price) {

        this.Addition1name = name;
        this.Addition1price = price;
    }

    public void AddBurgerAddition2(String name, double price) {

        this.Addition2name = name;
        this.Addition2price = price;
    }

    public void AddBurgerAddition3(String name, double price) {

        this.Addition3name = name;
        this.Addition3price = price;
    }

    public void AddBurgerAddition4(String name, double price) {

        this.Addition4name = name;
        this.Addition4price = price;
    }
    public double ItemizeHumburger(){
        
        double humburgerPrice = this.price;
        System.out.println(this.name +" Humberger "+ "On a " + this.breadRollType +
                " Burger price "+ this.price);
        if(this.Addition1name!= null){
           humburgerPrice+=this.Addition1price;
            System.out.println("Added " + this.Addition1name +" for an extra "+ this.Addition1price);
           
        }
        if(this.Addition2name!= null){
           humburgerPrice+=this.Addition2price;
            System.out.println("Added " + this.Addition2name +" for an extra "+ this.Addition2price);
           
        }
        if(this.Addition3name!= null){
           humburgerPrice+=this.Addition3price;
            System.out.println("Added " + this.Addition3name +" for an extra "+ this.Addition3price);
           
        }
        if(this.Addition4name!= null){
           humburgerPrice+=this.Addition4price;
            System.out.println("Added " + this.Addition4name +" for an extra "+ this.Addition4price);
           
        } return humburgerPrice;
    }
}
