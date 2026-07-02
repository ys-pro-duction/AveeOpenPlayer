package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class Q3 extends AbstractC10409b2 implements T3 {
    public final /* synthetic */ R3 b;

    @Override // j$.util.stream.T3
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3(R3 r3, InterfaceC10444i2 interfaceC10444i2, boolean z) {
        super(interfaceC10444i2);
        this.b = r3;
    }

    @Override // j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }
}
