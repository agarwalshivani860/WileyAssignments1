package org.zoo;

import org.animals.Animals;
import org.animals.Deer;
import org.animals.Elephant;
import org.animals.Giraffe;
import org.animals.Monkey;
import org.animals.Tiger;

public class ZooLand {

	public void getCharacterstics(Animals A)
{

System.out.println("Weight: "+A.getWeight()+" Age: "+A.getAge()+" Color: "+A.getColor());
	
	A.isVegetarian();
	A.canClimb();
	A.sound();
}
}
