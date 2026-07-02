package j$.util.stream;

import j$.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends I {
    public static final D c;
    public static final D d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }

    static {
        W2 w2 = W2.REFERENCE;
        c = new D(true, w2, Optional.empty(), new C10471o(10), new C10471o(11));
        d = new D(false, w2, Optional.empty(), new C10471o(10), new C10471o(11));
    }
}
