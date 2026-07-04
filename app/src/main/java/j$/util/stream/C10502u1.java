package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10502u1 extends AbstractC10497t1 {
    public final /* synthetic */ LongBinaryOperator h;
    public final /* synthetic */ long i;

    @Override // j$.util.stream.AbstractC10497t1
    public final O1 Z() {
        return new M1(this.i, this.h);
    }

    public C10502u1(W2 w2, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }
}
