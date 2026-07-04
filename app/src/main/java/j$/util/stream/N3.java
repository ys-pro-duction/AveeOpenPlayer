package j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class N3 extends AbstractC10419d2 implements T3 {
    public final /* synthetic */ O3 b;

    @Override // j$.util.stream.T3
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(O3 o3, InterfaceC10444i2 interfaceC10444i2, boolean z) {
        super(interfaceC10444i2);
        this.b = o3;
    }

    @Override // j$.util.stream.InterfaceC10439h2, j$.util.stream.InterfaceC10444i2
    public final void accept(long j) {
        this.b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }
}
