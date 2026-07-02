package j$.util.stream;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class J3 extends AbstractC10414c2 {
    public final boolean b;

    public J3(B2 b2, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC10414c2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC10434g2, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        if (this.b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC10414c2, j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        return !this.b || this.a.n();
    }
}
