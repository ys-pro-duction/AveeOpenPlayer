package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends I implements InterfaceC10439h2 {
    public static final D c;
    public static final D d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC10444i2
    public final void accept(long j) {
        p(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.A(((Long) this.b).longValue());
        }
        return null;
    }

    static {
        W2 w2 = W2.LONG_VALUE;
        j$.util.A a = j$.util.A.c;
        c = new D(true, w2, a, new C10471o(8), new C10471o(9));
        d = new D(false, w2, a, new C10471o(8), new C10471o(9));
    }
}
