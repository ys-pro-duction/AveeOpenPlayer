package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class W3 extends a4 implements DoubleConsumer, j$.util.S {
    public double e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W3(Spliterator spliterator, int i) {
        super(spliterator);
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W3(Spliterator spliterator, a4 a4Var, int i) {
        super(spliterator, a4Var);
        this.f = i;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.a4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.b0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.e = d;
    }

    @Override // j$.util.stream.a4
    public final Spliterator c(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new W3((j$.util.S) spliterator, this, 0);
            default:
                return new W3((j$.util.S) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.a4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.a4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b0 trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.S
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f) {
            case 0:
                boolean z = this.c;
                Spliterator spliterator = this.a;
                if (z) {
                    this.c = false;
                    boolean zTryAdvance = ((j$.util.S) spliterator).tryAdvance((DoubleConsumer) this);
                    if (zTryAdvance && b()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    doubleConsumer.accept(this.e);
                    return zTryAdvance;
                }
                return ((j$.util.S) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.c && b() && ((j$.util.S) this.a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.a4, j$.util.Spliterator
    public j$.util.S trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.S) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.b0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
