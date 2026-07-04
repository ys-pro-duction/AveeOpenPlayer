package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10458l1 extends AbstractC10478p1 implements InterfaceC10429f2 {
    public final double[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC10429f2
    public final /* synthetic */ void p(Double d) {
        AbstractC10497t1.e(this, d);
    }

    public C10458l1(Spliterator spliterator, AbstractC10401a abstractC10401a, double[] dArr) {
        super(spliterator, abstractC10401a, dArr.length);
        this.h = dArr;
    }

    public C10458l1(C10458l1 c10458l1, Spliterator spliterator, long j, long j2) {
        super(c10458l1, spliterator, j, j2, c10458l1.h.length);
        this.h = c10458l1.h;
    }

    @Override // j$.util.stream.AbstractC10478p1
    public final AbstractC10478p1 b(Spliterator spliterator, long j, long j2) {
        return new C10458l1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.AbstractC10478p1, j$.util.stream.InterfaceC10444i2, j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }
}
