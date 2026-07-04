package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends P implements InterfaceC10429f2 {
    public final DoubleConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC10429f2
    public final /* synthetic */ void p(Double d) {
        AbstractC10497t1.e(this, d);
    }

    @Override // j$.util.stream.D3
    public final Object b(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        abstractC10401a.Q(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.D3
    public final /* bridge */ /* synthetic */ Object c(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        e(abstractC10401a, spliterator);
        return null;
    }

    public L(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC10444i2, j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b.accept(d);
    }
}
