package safecollector;

@FunctionalInterface
public interface DoubleValidatorFunction {
    boolean apply(double x);
}
