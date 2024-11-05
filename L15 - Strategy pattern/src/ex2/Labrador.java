package ex2;

public class Labrador extends Dog {

    public Labrador() {
        this.eatBehavior = new NormalDiet();
        this.barkBehavior = new PlayfulBark();
    }
}
