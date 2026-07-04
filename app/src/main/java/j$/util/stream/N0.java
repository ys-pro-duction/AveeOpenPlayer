package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 extends O0 implements C0 {
    @Override // j$.util.stream.E0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC10497t1.s(this, consumer);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ E0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC10497t1.v(this, j, j2);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC10497t1.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.D0
    public final Object c(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.E0
    public final Spliterator spliterator() {
        return new C10423e1(this);
    }

    @Override // j$.util.stream.E0
    public final j$.util.b0 spliterator() {
        return new C10423e1(this);
    }
}
