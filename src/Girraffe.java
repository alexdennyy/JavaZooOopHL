public class Girraffe extends Animal {
    public Girraffe(String name){
        super(name, "leaves");
    }

    public void eat(String food) {
        if(food.equals(favFood)) {
            System.out.println(this.name+ " eats "+ food+".");
            System.out.println("YUM!!! " + this.name + "  wants more leaves.");
            sleep(this.name);
        }else {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }


}
