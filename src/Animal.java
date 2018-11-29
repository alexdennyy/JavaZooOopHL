public class Animal {
    static int population = 0;
    String favFood;
    String name;

    public Animal(String name, String favFood){
        Animal.population++;
        this.name = name;
        this.favFood = favFood;
    }

    public void sleep (String name){
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food){
        if(food == favFood){
            System.out.println(name + " eats " + food);
            System.out.println(name + " eats " + food);
        } else {
            System.out.println(name + " eats " + food);
            sleep(name);
        }
    }

    public  int populationCount(){

        return population;
    }
}
