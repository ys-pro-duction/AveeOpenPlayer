package java.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface Predicate<T> {
    Predicate<T> negate();

    boolean test(T t);
}
