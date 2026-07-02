package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class P0 extends G0 {
    @Override // j$.util.stream.E0
    public final Spliterator spliterator() {
        return new C10433g1(this);
    }

    @Override // j$.util.stream.E0
    public final void i(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        E0 e0 = this.a;
        e0.i(objArr, i);
        this.b.i(objArr, i + ((int) e0.count()));
    }

    @Override // j$.util.stream.E0
    public final Object[] o(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.E0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.E0
    public final E0 h(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.h(j - jCount, j2 - jCount, intFunction);
        }
        if (j2 > jCount) {
            return AbstractC10497t1.F(W2.REFERENCE, this.a.h(j, jCount, intFunction), this.b.h(0L, j2 - jCount, intFunction));
        }
        return this.a.h(j, j2, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
