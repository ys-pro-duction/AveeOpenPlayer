package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10494s3 extends AbstractC10504u3 implements j$.util.V, IntConsumer {
    public int f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.AbstractC10519x3
    public final Spliterator c(Spliterator spliterator) {
        return new C10494s3((j$.util.V) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC10504u3
    public final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f = i;
    }

    @Override // j$.util.stream.AbstractC10504u3
    public final AbstractC10410b3 h(int i) {
        return new Z2(i);
    }
}
