public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal[] animais = {dog, cat};

        for (int i = 0; i < animais.length; i++) {
            animais[i].makeSound();
            animais[i].estado();


        }



    }
}
