package ex2;

public abstract class Dog {
    eatBehavior eatBehavior;
    barkBehavior barkBehavior;

    public void performEat() {
        eatBehavior.eat();
    }

    public void performBark() {
        barkBehavior.bark();
    }

    public void setEatBehavior(eatBehavior eatBehavior) {
        this.eatBehavior = eatBehavior;
    }

    public void setBarkBehavior(barkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }


}
