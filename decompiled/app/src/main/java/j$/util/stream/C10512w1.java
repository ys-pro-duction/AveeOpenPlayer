package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10512w1 extends AbstractC10497t1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C10512w1(W2 w2, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.AbstractC10497t1
    public final O1 Z() {
        switch (this.h) {
            case 0:
                return new N1((LongBinaryOperator) this.i);
            case 1:
                return new C10527z1((DoubleBinaryOperator) this.i);
            case 2:
                return new E1((BinaryOperator) this.i);
            default:
                return new K1((IntBinaryOperator) this.i);
        }
    }
}
