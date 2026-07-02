package j$.util.stream;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class K3 extends AbstractC10414c2 implements T3 {
    public final /* synthetic */ L3 b;

    @Override // j$.util.stream.T3
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K3(L3 l3, InterfaceC10444i2 interfaceC10444i2, boolean z) {
        super(interfaceC10444i2);
        this.b = l3;
    }

    @Override // j$.util.stream.InterfaceC10434g2, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        this.b.getClass();
        IntPredicate intPredicate = null;
        intPredicate.test(i);
        throw null;
    }
}
