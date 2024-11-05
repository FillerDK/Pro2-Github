package ex2;

public class Test {
    public static void main(String[] args) {
        Dog labrador = new Labrador();

        labrador.performEat();
        labrador.performBark();

        System.out.println();

        labrador.setEatBehavior(new ProteinDiet());
        labrador.setBarkBehavior(new Growl());

        labrador.performEat();
        labrador.performBark();
    }
}
