package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Spliterators {
    public static final m0 a = new m0();
    public static final k0 b = new k0();
    public static final l0 c = new l0();
    public static final j0 d = new j0();

    public static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        return new o0((java.util.Collection) Objects.requireNonNull(collection), i);
    }
}
