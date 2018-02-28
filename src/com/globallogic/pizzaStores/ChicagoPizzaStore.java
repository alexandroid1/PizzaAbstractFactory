package com.globallogic.pizzaStores;

import com.globallogic.ingredientFactoryInterface.PizzaIngredientFactory;
import com.globallogic.abstractPizzaStore.PizzaStore;
import com.globallogic.abstractPizza.Pizza;
import com.globallogic.ingredientFactories.ChicagoPizzaIngredientFactory;
import com.globallogic.pizzaType.CheesePizza;
import com.globallogic.pizzaType.ClamPizza;
import com.globallogic.pizzaType.PepperoniPizza;
import com.globallogic.pizzaType.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
