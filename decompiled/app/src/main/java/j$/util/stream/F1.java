package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class F1 extends AbstractC10497t1 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ Collector k;

    @Override // j$.util.stream.AbstractC10497t1
    public final O1 Z() {
        return new G1(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.AbstractC10497t1, j$.util.stream.D3
    public final int d() {
        if (this.k.characteristics().contains(EnumC10436h.UNORDERED)) {
            return V2.r;
        }
        return 0;
    }

    public F1(W2 w2, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }
}
