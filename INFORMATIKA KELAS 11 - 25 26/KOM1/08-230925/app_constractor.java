class Animal {
    String name;
    int age;

    Animal(String paramName, int paramAge) {
        name = paramName;
        age = paramAge;
        System.out.println("tampil juga");
    }

    static void sound(String n) {
        System.out.println(n);
    }

    String getName() {
        return this.name;
    }
}

public class app_constractor {
    public static void main(String[] args) {
        Animal animalObj01 = new Animal("cat", 2);
        System.out.println(animalObj01.name);
        animalObj01.name = "dog";
        System.out.println(animalObj01.name);
        animalObj01.sound("guk guk");
        Animal animalObj02 = new Animal("cat", 12);
        animalObj02.sound("meow..");
        Animal bird01 = new Animal("LoveBird", 2);
        System.out.println(bird01.name);
        bird01.sound("cakcakcak");
        System.out.println(animalObj02.getName());
        System.out.println(bird01.getName());
    }
}
