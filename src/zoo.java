public class zoo {


    public void sleep(String name) {
        System.out.print(name + " sleeps for 8 hours");

    }


    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Unicorn rarity = new Unicorn("Rarity");
        Girraffe gemma = new Girraffe("Gemma");
        Bee stinger = new Bee("Stinger");
        Zookeeper zoebot = new Zookeeper("Zoebot");
        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
        zoebot.feedAnimals(animals, "meat");


    }
}
