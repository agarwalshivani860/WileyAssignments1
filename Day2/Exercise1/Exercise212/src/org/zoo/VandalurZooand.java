package org.zoo;

import java.util.ArrayList;
import java.util.Scanner;

import org.animals.Animals;
import org.animals.Deer;
import org.animals.Elephant;
import org.animals.Giraffe;
import org.animals.Monkey;
import org.animals.Tiger;

public class VandalurZooand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ZooLand zoo=new ZooLand();
		//ArrayList<Animals> arrList=new ArrayList<Animals>();
		while(true){
			ZooMenu zmenu=new ZooMenu();
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:Tiger tiger1=new Tiger(112, 3, "yellow");
					System.out.println("TIGER Details: ");
					zoo.getCharacterstics(tiger1);
					break;
			case 2:Deer deer=new Deer(70,5,"Golden");
					System.out.println("DEER Details");
					zoo.getCharacterstics(deer);
					break;
			case 3:Elephant elephant=new Elephant(144,6,"grey");
					System.out.println("ELEPHANT Details");
					zoo.getCharacterstics(elephant);
					break;
			case 4:Giraffe gf=new Giraffe(10,7,"Golden");
					System.out.println("GIRAFFE Details");
					zoo.getCharacterstics(gf);
					break;
			case 5:Monkey monkey=new Monkey(25,4,"Brown");
					System.out.println("MONKEY Details");
					zoo.getCharacterstics(monkey);
					break;
			case 6:System.out.println("HOPE YOU ENJOYED");
					System.exit(0);
			

			}
		}
		
	
	    
		
	}

}
