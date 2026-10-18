package pizzaModule;

public class Driver {

	public static void main(String[] args) {
//		1)	Create a driver program to create three pizzas one of each size with 3, 6, and 9 toppings to your liking and eat() all of them

		Pizza pizza1 = new Pizza("Pizza Hut", Sizes.SMALL).addBeef().addChicken().addOlives();
		Pizza pizza2 = new Pizza("Pizza Hut", Sizes.MEDIUM).addBeef().addChicken().addOlives().addExtraCheese().addOlives().addOnions();
		Pizza pizza3 = new Pizza("Pizza Hut", Sizes.LARGE).addBeef().addChicken().addOlives().addExtraCheese().addOlives().addOnions().addPeppers().addPesto().addSpinach();
		
		pizza1.eat();
		System.out.println();
		pizza2.eat();
		System.out.println();
		pizza3.eat();
		System.out.println();
		System.out.println();
		
		
//		2)	Now assume you purchased another two pizza chains, Little Caesars, and Dominos. You want to add them to your program following the rules mentioned above. 
//		Create the following pizzas and eat() all of them:
	 
//		Pizza Hut 
//		Large pizza with 3 toppings		
//		Small pizza with 2 toppings
		Pizza pizzaHut1 = new Pizza("Pizza Hut", Sizes.LARGE).addBeef().addChicken().addOlives();
		Pizza pizzaHut2 = new Pizza("Pizza Hut", Sizes.SMALL).addBeef().addChicken();
		
		pizzaHut1.eat();
		System.out.println();
		pizzaHut2.eat();
		System.out.println();
		System.out.println();

		
//		Little Caesars
//		Medium pizza with 8 toppings          
//		Small pizza with 6 toppings
		Pizza littleCaesars1 = new Pizza("Little Caesars", Sizes.MEDIUM).addBeef().addChicken().addOlives().addExtraCheese().addOlives().addOnions().addPeppers().addPesto();
		Pizza littleCaesars2 = new Pizza("Little Caesars", Sizes.SMALL).addBeef().addChicken().addOlives().addExtraCheese().addOlives().addOnions();
		
		littleCaesars1.eat();
		System.out.println();
		littleCaesars2.eat();
		System.out.println();
		System.out.println();

 
//		Dominos
//		Small pizza with 1 topping
//		Large pizza with 3 toppings
		Pizza dominos1 = new Pizza("Dominos", Sizes.SMALL).addBeef();
		Pizza dominos2 = new Pizza("Dominos", Sizes.LARGE).addBeef().addChicken().addOlives();
		
		dominos1.eat();
		System.out.println();
		dominos2.eat();
		System.out.println();
		System.out.println();
	}

}
