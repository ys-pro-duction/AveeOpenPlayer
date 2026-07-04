package j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class M3 extends AbstractC10419d2 {
    public final boolean b;

    public M3(C2 c2, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC10419d2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC10439h2, j$.util.stream.InterfaceC10444i2
    public final void accept(long j) {
        if (this.b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC10419d2, j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        return !this.b || this.a.n();
    }
}
