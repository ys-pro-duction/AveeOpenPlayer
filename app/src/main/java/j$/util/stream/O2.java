package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class O2 extends Q2 implements j$.util.Y {
    public final /* synthetic */ P2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.stream.Q2
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.Q2
    public final j$.util.b0 b(Object obj, int i, int i2) {
        long[] jArr = (long[]) obj;
        int i3 = i2 + i;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i, i3);
        return new j$.util.p0(jArr, i, i3, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O2(P2 p2, int i, int i2, int i3, int i4) {
        super(p2, i, i2, i3, i4);
        this.g = p2;
    }

    @Override // j$.util.stream.Q2
    public final j$.util.b0 c(int i, int i2, int i3, int i4) {
        return new O2(this.g, i, i2, i3, i4);
    }
}
