package j$.util.stream;

import j$.util.C10397o;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10445i3 extends X2 implements j$.util.V {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.X2
    public final X2 e(Spliterator spliterator) {
        return new C10445i3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.X2
    public final void d() {
        N2 n2 = new N2();
        this.h = n2;
        Objects.requireNonNull(n2);
        this.e = this.b.R(new C10440h3(n2, 1));
        this.f = new C10397o(11, this);
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.V trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.b0 trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i;
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            N2 n2 = (N2) this.h;
            long j = this.g;
            int iU = n2.u(j);
            if (n2.c == 0 && iU == 0) {
                i = ((int[]) n2.e)[(int) j];
            } else {
                i = ((int[][]) n2.f)[iU][(int) (j - n2.d[iU])];
            }
            intConsumer.accept(i);
        }
        return zA;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            C10440h3 c10440h3 = new C10440h3(intConsumer, 0);
            this.b.Q(this.d, c10440h3);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
