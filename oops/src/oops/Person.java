package oops;

public class Person {
	private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean isEligibleToVote() {
        if (this.age >= 18) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {

        Person[] persons = {
                new Person("Priya", 21, "Male"),
                new Person("Harsha", 17, "Male"),
                new Person("Rajesh", 22, "Male"),
                new Person("Gokul", 18, "Male"),
                new Person("Srav", 22, "Female"),
                new Person("Lily", 18, "Female"),
                new Person("Jagan", 28, "Male"),
                new Person("Sai", 13, "Male"),
                new Person("Gowthami", 24, "Female"),
                new Person("Moni", 22, "Female"),
        };

        System.out.println("The following persons are eligible to vote:");
        for (Person person : persons) {
            if (person.isEligibleToVote()) {
                System.out.println(person.getName());
            }
        }
    }
}


