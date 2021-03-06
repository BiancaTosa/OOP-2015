package javasmmr.zoosome.services.factories;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Tiger;
import javasmmr.zoosome.models.animals.Cow;
import javasmmr.zoosome.models.animals.Monkey;

//This class will implement the super class method getAnimal and it will return a new animal described in the String parameter type.
public class MammalFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Tiger.equals(type)) {
			return new Tiger();
		} else if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow();
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey();
		} else {
			throw new Exception("Illegal mammal name.");
		}
	}

}
