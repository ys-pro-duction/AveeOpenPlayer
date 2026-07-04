package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10482q0 implements InterfaceC10444i2 {
    public boolean a;
    public boolean b;

    @Override // j$.util.stream.InterfaceC10444i2, j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d) {
        AbstractC10497t1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public /* synthetic */ void accept(int i) {
        AbstractC10497t1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC10444i2
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
    public final /* synthetic */ void l(long j) {
    }

    public AbstractC10482q0(EnumC10486r0 enumC10486r0) {
        this.b = !enumC10486r0.b;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        return this.a;
    }
}
