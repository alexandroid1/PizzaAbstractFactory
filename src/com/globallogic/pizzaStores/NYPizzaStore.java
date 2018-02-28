package com.globallogic.pizzaStores;

import com.globallogic.ingredientFactoryInterface.PizzaIngredientFactory;
import com.globallogic.abstractPizzaStore.PizzaStore;
import com.globallogic.abstractPizza.Pizza;
import com.globallogic.ingredientFactories.NYPizzaIngredientFactory;
import com.globallogic.pizzaType.CheesePizza;
import com.globallogic.pizzaType.ClamPizza;
import com.globallogic.pizzaType.PepperoniPizza;
import com.globallogic.pizzaType.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
