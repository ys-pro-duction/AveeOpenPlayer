package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10414c2 implements InterfaceC10434g2 {
    public final InterfaceC10444i2 a;

    @Override // j$.util.stream.InterfaceC10444i2, j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC10497t1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void accept(long j) {
        AbstractC10497t1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC10434g2
    public final /* synthetic */ void m(Integer num) {
        AbstractC10497t1.g(this, num);
    }

    public AbstractC10414c2(InterfaceC10444i2 interfaceC10444i2) {
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
