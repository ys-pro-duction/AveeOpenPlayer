package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10409b2 implements InterfaceC10429f2 {
    public final InterfaceC10444i2 a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC10429f2
    public final /* synthetic */ void p(Double d) {
        AbstractC10497t1.e(this, d);
    }

    public AbstractC10409b2(InterfaceC10444i2 interfaceC10444i2) {
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
