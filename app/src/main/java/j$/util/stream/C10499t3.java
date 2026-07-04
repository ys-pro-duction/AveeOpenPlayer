package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10499t3 extends AbstractC10504u3 implements j$.util.Y, LongConsumer {
    public long f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.stream.AbstractC10519x3
    public final Spliterator c(Spliterator spliterator) {
        return new C10499t3((j$.util.Y) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC10504u3
    public final void e(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f = j;
    }

    @Override // j$.util.stream.AbstractC10504u3
    public final AbstractC10410b3 h(int i) {
        return new C10405a3(i);
    }
}
