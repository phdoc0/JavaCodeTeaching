package BasicCode;

/**
 * Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
 * Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 */
abstract class Animal{
    public abstract void animalSound();
}

interface Animal{
    public void animalSound();
}

class Animal{
    public void animalSound()
    {
        System.out.println("Animal: Noise");
    }
}

class Dog extends Animal{
    public void animalSound()
    {
        System.out.println("Dog: Woof");
    }
}

class Dog implements Animal{
    public void animalSound()
    {
        System.out.println("Dog: Woof");
    }
}

class Bigfoot extends Animal{
    public void animalSound(){
        System.out.println("Bigfoot: Whistle");
    }
}


public class JavaObjectPrograming {



    public static void main(String[] args) {
        
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myBig = new Bigfoot();

        myAnimal.animalSound();
        myDog.animalSound();
        myBig.animalSound();

    }
    
}
