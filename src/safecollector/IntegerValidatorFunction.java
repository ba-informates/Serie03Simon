package safecollector;

@FunctionalInterface
public interface IntegerValidatorFunction {
    boolean apply(int x);
}
