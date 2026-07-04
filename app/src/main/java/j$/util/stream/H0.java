package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public class H0 implements E0 {
    public final Object[] a;
    public int b;

    @Override // j$.util.stream.E0
    public final /* synthetic */ E0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC10497t1.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.E0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.E0
    public final E0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    public H0(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    public H0(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }

    @Override // j$.util.stream.E0
    public final Spliterator spliterator() {
        return DesugarArrays.a(this.a, 0, this.b);
    }

    @Override // j$.util.stream.E0
    public final void i(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.E0
    public final Object[] o(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.E0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.E0
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.p(this.a[i]);
        }
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
