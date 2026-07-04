package j$.util.stream;

import j$.util.C10397o;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10455k3 extends X2 implements j$.util.Y {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.stream.X2
    public final X2 e(Spliterator spliterator) {
        return new C10455k3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.X2
    public final void d() {
        P2 p2 = new P2();
        this.h = p2;
        Objects.requireNonNull(p2);
        this.e = this.b.R(new C10450j3(p2, 1));
        this.f = new C10397o(12, this);
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.Y trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.stream.X2, j$.util.Spliterator
    public final j$.util.b0 trySplit() {
        return (j$.util.Y) super.trySplit();
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            P2 p2 = (P2) this.h;
            long j2 = this.g;
            int iU = p2.u(j2);
            if (p2.c == 0 && iU == 0) {
                j = ((long[]) p2.e)[(int) j2];
            } else {
                j = ((long[][]) p2.f)[iU][(int) (j2 - p2.d[iU])];
            }
            longConsumer.accept(j);
        }
        return zA;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            C10450j3 c10450j3 = new C10450j3(longConsumer, 0);
            this.b.Q(this.d, c10450j3);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
