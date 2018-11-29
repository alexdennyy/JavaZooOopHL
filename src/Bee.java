public class Bee extends Animal {

    public Bee(String name){
        super(name, "pollen");
    }

    public void eat(String food){
        if(food.equals(favFood)){
            System.out.println("Yum " + this.name + "wants more pollen");
            sleep();
        } else {
            System.out.println("Yuck" + this.name + " wont eat " + food);
        }
    }

    public void sleep() {
        System.out.println(this.name+ " never sleeps.");
    }
}
