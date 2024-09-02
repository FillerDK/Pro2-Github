package opg1;

public class Hopper5000 implements Filter {

    @Override
    public boolean accept(Measurable x) {
        return x.getMeasure() < 5000;
    }
}
