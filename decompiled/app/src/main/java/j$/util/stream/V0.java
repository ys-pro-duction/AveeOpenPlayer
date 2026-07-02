package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class V0 extends X0 implements C0 {
    @Override // j$.util.stream.E0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC10497t1.s(this, consumer);
    }

    @Override // j$.util.stream.X0, j$.util.stream.E0
    public final /* synthetic */ E0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC10497t1.v(this, j, j2);
    }

    @Override // j$.util.stream.X0, j$.util.stream.E0
    public final /* bridge */ /* synthetic */ E0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.X0, j$.util.stream.E0
    public final D0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC10497t1.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.D0
    public final /* bridge */ /* synthetic */ Object d() {
        return AbstractC10497t1.f;
    }

    @Override // j$.util.stream.E0
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.c;
    }

    @Override // j$.util.stream.E0
    public final /* bridge */ /* synthetic */ j$.util.b0 spliterator() {
        return Spliterators.c;
    }
}
