package core_java_basics.enum_types;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Picture picture = Picture.PIC;

		switch (picture) {
		case PHOTO:
			System.out.println("Its Photo");
			break;
		case PIC:
			System.out.println("Its  Pic");
			break;
		case SNAP:
			System.out.println("Its Snapshot");
			break;
		default:
			break;

		}

		System.out.println(picture.PHOTO);
		System.out.println(picture.PHOTO.getClass());

		Animal animal = Animal.LION;

		System.out.println(animal);
		System.out.println(animal.DOG);
		System.out.println(animal.LION.name());
		System.out.println(animal.LION.getName());
		System.out.println(animal.LION.getClass());
		System.out.println(animal.LION instanceof Enum);

		Animal animal1 = Animal.valueOf("CAT");
		System.out.println(animal1);

	}

}
