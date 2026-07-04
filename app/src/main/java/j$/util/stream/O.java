package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends P {
    public final Consumer b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    public O(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
    }
}
