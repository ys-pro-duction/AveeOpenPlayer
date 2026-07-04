package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class U1 extends P1 implements O1 {
    public long b;

    public /* synthetic */ void accept(double d) {
        AbstractC10497t1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC10497t1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC10497t1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.b = 0L;
    }
}
