package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10424e2 implements InterfaceC10444i2 {
    public final InterfaceC10444i2 a;

    @Override // j$.util.stream.InterfaceC10444i2, j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC10497t1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void accept(int i) {
        AbstractC10497t1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void accept(long j) {
        AbstractC10497t1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public AbstractC10424e2(InterfaceC10444i2 interfaceC10444i2) {
        this.a = (InterfaceC10444i2) Objects.requireNonNull(interfaceC10444i2);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public void l(long j) {
        this.a.l(j);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public void k() {
        this.a.k();
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public boolean n() {
        return this.a.n();
    }
}
