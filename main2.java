package Class;

public class main2 {

	public static void main(String[] args) {
		//setting stuffs
		cl pp1 = new cl("Long beo");
		cl pp2 = new cl("Trang", 12, "student");
		cl pp3 = new cl("Hai", 46, "Soldier", 700);
		cl pp4 = new cl("Van", 45, "Teacher", 900, "Teaching");
		cl pp5 = new cl("Bi");
		//testing static
		System.out.println("There are " + cl.getNumPp() + " people.");
		//testing setters
		pp1.setAge(18);
		pp1.setName("Long");
		pp2.setAge(15);
		pp3.setHobby("Driving");
		pp5.setJob("Dog");
		//testing methods
		pp1.Print2();
		if (pp2.isAdult()) {
			System.out.println(pp2.getName() + " is an adult.");
		}
		else {
			System.out.println(pp2.getName() + " is not an adult");
		}
		pp2.Print3();
		pp3.Print5();
		pp4.Print5();
		if (pp5.isDog()) {
			System.out.println(pp5.getName() + " is a dog.");
		}
		else {
			System.out.println(pp5.getName() + " is not a dog");
		}
	}

}
