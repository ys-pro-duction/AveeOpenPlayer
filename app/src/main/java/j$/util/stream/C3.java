package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class C3 implements j$.util.V {
    public int a;
    public final int b;
    public int c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17749;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.o(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.q(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    public C3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            intConsumer.accept(i);
            return true;
        }
        if (this.c <= 0) {
            return false;
        }
        this.c = 0;
        intConsumer.accept(i);
        return true;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        this.a = i3;
        this.c = 0;
        while (i < i3) {
            intConsumer.accept(i);
            i++;
        }
        if (i2 > 0) {
            intConsumer.accept(i);
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return (((long) this.b) - ((long) this.a)) + ((long) this.c);
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final j$.util.V trySplit() {
        long jEstimateSize = estimateSize();
        if (jEstimateSize <= 1) {
            return null;
        }
        int i = this.a;
        int i2 = ((int) (jEstimateSize / ((long) (jEstimateSize < 16777216 ? 2 : 8)))) + i;
        this.a = i2;
        return new C3(i, i2, 0);
    }
}
