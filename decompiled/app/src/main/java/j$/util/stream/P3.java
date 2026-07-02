package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class P3 extends AbstractC10409b2 {
    public final boolean b;

    public P3(A2 a2, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC10409b2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (this.b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC10409b2, j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        return !this.b || this.a.n();
    }
}
