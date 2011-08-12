package cga.framework.animation.interpolation;

/**
 * Eine Interpolation, bei der die Schritt zu Beginn groß sind und zum Ende hin
 * kleiner werden.
 * <p/>
 * <p/>
 * <p/>
 * @author Robert Giacinto
 */
public class EaseOutInterpolation extends Interpolation {

    public EaseOutInterpolation(double start, double end, int stepCount, boolean cyclic) {
        super(start, end, stepCount, cyclic);
    }

    @Override
    public double nextValue() {
        if (stepCounter++ < stepCount) {
            double x = (stepCounter / stepCount);
            x = Math.pow(x, 0.333333);
            return min + max * x;
        } else if (cyclic) {
            stepCounter = 0;
        }
        return max;
    }
}
