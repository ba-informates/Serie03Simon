package safecollector;

@FunctionalInterface
public interface ValidatorFunction {
    boolean apply(int x);
}

