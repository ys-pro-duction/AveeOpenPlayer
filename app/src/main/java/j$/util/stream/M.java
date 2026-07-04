package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends P implements InterfaceC10434g2 {
    public final IntConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC10434g2
    public final /* synthetic */ void m(Integer num) {
        AbstractC10497t1.g(this, num);
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

    public M(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        this.b.accept(i);
    }
}
