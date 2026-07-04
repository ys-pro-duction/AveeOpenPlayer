package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class C1 extends AbstractC10497t1 {
    public final /* synthetic */ DoubleBinaryOperator h;
    public final /* synthetic */ double i;

    @Override // j$.util.stream.AbstractC10497t1
    public final O1 Z() {
        return new C10517x1(this.i, this.h);
    }

    public C1(W2 w2, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }
}
