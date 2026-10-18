package pizzaModule;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

enum ToppingsEnum {
	PEPPERONI,
	SAUSAGE,
	MUSHROOMS,
	BACON,
	ONIONS,
	EXTRA_CHEESE,
	PEPPERS,
	CHICKEN,
	OLIVES,
	SPINACH,
	TOMATO_AND_BASIL,
	BEEF,
	HAM,
	PESTO,
	SPICY_PORK,
	HAM_AND_PINEAPPLE
	}

enum Sizes {
	SMALL,
	MEDIUM,
	LARGE
	}

public class Pizza {
	private Sizes size;
	private String chain;
    private Map<ToppingsEnum,Boolean> toppings = Arrays.stream(ToppingsEnum.values())
	        .collect(Collectors.toMap(t -> t, t -> false, (a, b) -> a, HashMap::new));

	public Pizza(String chain, Sizes size) {
		super();
		this.chain = chain;
		this.size = size;
	}
	
	public void eat() {
		System.out.println(this.chain + " " + this.capitalizeWords(this.size.name().toLowerCase()) + " Pizza");
		System.out.println("Toppings: ");
		this.printToppings();
	}
	
	private void printToppings() {

		StringBuilder toppingsOutput = new StringBuilder();
		this.toppings.forEach((topping, hasTopping) -> {
		   if(hasTopping) toppingsOutput.append(this.capitalizeWords(topping.name().toLowerCase()) + ", ");
		});
	    
		if(!toppingsOutput.isEmpty()) toppingsOutput.deleteCharAt(toppingsOutput.length() - 2); //remove extra comma
		
		System.out.println(toppingsOutput.isEmpty() ? "None" : toppingsOutput);
	}
	
	private String capitalizeWords(String input) {
	    if (input == null || input.isEmpty()) {
	        return input;
	    }
	    
	    String[] words = input.split("_");
	    StringBuilder result = new StringBuilder();
	    
	    for (String word : words) {
	        if (!word.isEmpty()) {
	            result.append(Character.toUpperCase(word.charAt(0)))
	                  .append(word.substring(1))
	                  .append(" ");
	        }
	    }
	    
	    return result.toString().trim();
	}
	
	public Pizza addPepperoni() {
		toppings.replace(ToppingsEnum.PEPPERONI, true);
		return this;
	}
	public Pizza addSausage() {
		toppings.replace(ToppingsEnum.SAUSAGE, true);
		return this;
	}
	public Pizza addMushrooms() {
		toppings.replace(ToppingsEnum.MUSHROOMS, true);
		return this;
	}
	public Pizza addBacon() {
		toppings.replace(ToppingsEnum.BACON, true);
		return this;
	}
	public Pizza addOnions() {
		toppings.replace(ToppingsEnum.ONIONS, true);
		return this;
	}
	public Pizza addExtraCheese() {
		toppings.replace(ToppingsEnum.EXTRA_CHEESE, true);
		return this;
	}
	public Pizza addPeppers() {
		toppings.replace(ToppingsEnum.PEPPERS, true);
		return this;
	}
	public Pizza addChicken() {
		toppings.replace(ToppingsEnum.CHICKEN, true);
		return this;
	}
	public Pizza addOlives() {
		toppings.replace(ToppingsEnum.OLIVES, true);
		return this;
	}
	public Pizza addSpinach() {
		toppings.replace(ToppingsEnum.SPINACH, true);
		return this;
	}
	public Pizza addTomatoAndBasil() {
		toppings.replace(ToppingsEnum.TOMATO_AND_BASIL, true);
		return this;
	}
	public Pizza addBeef() {
		toppings.replace(ToppingsEnum.BEEF, true);
		return this;
	}
	public Pizza addHam() {
		toppings.replace(ToppingsEnum.HAM, true);
		return this;
	}
	public Pizza addPesto() {
		toppings.replace(ToppingsEnum.PESTO, true);
		return this;
	}
	public Pizza addSpicyPork() {
		toppings.replace(ToppingsEnum.SPICY_PORK, true);
		return this;
	}
	public Pizza addHamAndPineapple() {
		toppings.replace(ToppingsEnum.HAM_AND_PINEAPPLE, true);
		return this;
	}

}
