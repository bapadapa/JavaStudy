package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}

class Tiger extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("호랑이가 네 발로 걷습니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}

class Eagle extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("독수리가 하늘을 날아갑니다.");
	}

	public void flying() {
		System.out.println("독수리가 하늘을 날아다닙니다.");
	}

}

public class AnimalTest {
	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

		// 아래는 에러, 이유 : hAnimal이 Eagle의 instance가 아니기 때문.
		// Eagle human = (Eagle)hAnimal;
		/*
		 * if(hAnimal instanceof Human) { Human human = (Human)hAnimal; } AnimalTest
		 * test = new AnimalTest();
		 */

		/*
		 * test.moveAnimal(hAnimal); test.moveAnimal(tAnimal); test.moveAnimal(eAnimal);
		 */

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);

		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		/*
		 * for (Animal elem : animalList) { elem.move(); }
		 */

	}

	public void testDownCasting(ArrayList<Animal> list) {
		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);

			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBooks();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			} else
				System.out.println("Error");
		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
