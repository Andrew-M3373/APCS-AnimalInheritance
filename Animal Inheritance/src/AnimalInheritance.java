import java.util.ArrayList;

public class AnimalInheritance {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cow());
		animals.add(new Bat());
		animals.add(new Penguin());
		animals.add(new Robin());

		for (Animal a : animals) {
			a.bearsYoung();
			a.eats();
			a.makesNoise();
			System.out.println();
		}
	}
	

}
