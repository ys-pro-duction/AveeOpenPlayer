package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements D3 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public D(boolean z, W2 w2, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : V2.r) | V2.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.D3
    public final int d() {
        return this.a;
    }

    @Override // j$.util.stream.D3
    public final Object b(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        E3 e3 = (E3) this.d.get();
        abstractC10401a.Q(spliterator, e3);
        Object obj = e3.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.D3
    public final Object c(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        return new J(this, V2.ORDERED.r(abstractC10401a.f), abstractC10401a, spliterator).invoke();
    }
}
