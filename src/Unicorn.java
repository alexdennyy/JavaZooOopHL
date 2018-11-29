public class Unicorn extends Animal{

    public Unicorn(String name){
        super(name, "marshmellow");
    }

    public void sleep(){
        System.out.println(this.name + " sleeps in a cloud");
    }
}
