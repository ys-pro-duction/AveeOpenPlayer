package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C10443i1 implements C0 {
    public final long[] a;
    public int b;

    @Override // j$.util.stream.E0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC10497t1.s(this, consumer);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ E0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC10497t1.v(this, j, j2);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC10497t1.m(this, intFunction);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.E0
    public final /* bridge */ /* synthetic */ E0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.D0, j$.util.stream.E0
    public final D0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC10497t1.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.D0
    public final void e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.D0
    public final void r(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    public C10443i1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    public C10443i1(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }

    @Override // j$.util.stream.E0
    public final Spliterator spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i);
        return new j$.util.p0(jArr, 0, i, 1040);
    }

    @Override // j$.util.stream.D0, j$.util.stream.E0
    public final j$.util.b0 spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i);
        return new j$.util.p0(jArr, 0, i, 1040);
    }

    @Override // j$.util.stream.D0
    public final Object d() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.E0
    public final long count() {
        return this.b;
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }
}
