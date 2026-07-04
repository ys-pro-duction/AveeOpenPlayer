package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class M2 extends Q2 implements j$.util.V {
    public final /* synthetic */ N2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.Q2
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.Q2
    public final j$.util.b0 b(Object obj, int i, int i2) {
        int[] iArr = (int[]) obj;
        int i3 = i2 + i;
        Spliterators.a(((int[]) Objects.requireNonNull(iArr)).length, i, i3);
        return new j$.util.n0(iArr, i, i3, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(N2 n2, int i, int i2, int i3, int i4) {
        super(n2, i, i2, i3, i4);
        this.g = n2;
    }

    @Override // j$.util.stream.Q2
    public final j$.util.b0 c(int i, int i2, int i3, int i4) {
        return new M2(this.g, i, i2, i3, i4);
    }
}
