public class Animal {
    int hungerValue;
    int thirstValue;

    public Animal() {
        this.hungerValue = 50;
        this.thirstValue = 50;
    }

    public void eat() {
        hungerValue -= 1;
    }
    public void drink() {
        thirstValue -= 1;
    }
    public void play() {
        hungerValue++;  thirstValue++;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.eat();
        System.out.println(dog.hungerValue);
        dog.drink();
        System.out.println(dog.thirstValue);
        dog.play();
        System.out.println(dog.hungerValue + " " + dog.thirstValue);
    }
}
/*Create an Animal class
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
when creating a new animal object these values are created with the default 50 value
Every animal can eat() which decreases their hunger by one
Every animal can drink() which decreases their thirst by one
Every animal can play() which increases both by one*/
