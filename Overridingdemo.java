

class Animal {
    public void sound(){
        System.out.println("Animal is making a sound");
    }

}

class Dog extends Animal {
    @Override //
    public void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat is meowing");
    }
}

public class Overridingdemo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        animal1.sound();
        dog1.sound();
        cat1.sound();
    }
}
