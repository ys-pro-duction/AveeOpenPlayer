package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends I implements InterfaceC10434g2 {
    public static final D c;
    public static final D d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        p(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new OptionalInt(((Integer) this.b).intValue());
        }
        return null;
    }

    static {
        W2 w2 = W2.INT_VALUE;
        OptionalInt optionalInt = OptionalInt.c;
        c = new D(true, w2, optionalInt, new C10471o(6), new C10471o(7));
        d = new D(false, w2, optionalInt, new C10471o(6), new C10471o(7));
    }
}
