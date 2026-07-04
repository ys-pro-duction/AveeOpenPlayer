package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends P implements InterfaceC10439h2 {
    public final LongConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC10439h2
    public final /* synthetic */ void j(Long l) {
        AbstractC10497t1.i(this, l);
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

    public N(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC10444i2
    public final void accept(long j) {
        this.b.accept(j);
    }
}
