package j$.util.stream;

import j$.util.C10536z;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends I implements InterfaceC10429f2 {
    public static final D c;
    public static final D d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC10444i2, j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        p(Double.valueOf(d2));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C10536z(((Double) this.b).doubleValue());
        }
        return null;
    }

    static {
        W2 w2 = W2.DOUBLE_VALUE;
        C10536z c10536z = C10536z.c;
        c = new D(true, w2, c10536z, new C10471o(4), new C10471o(5));
        d = new D(false, w2, c10536z, new C10471o(4), new C10471o(5));
    }
}
