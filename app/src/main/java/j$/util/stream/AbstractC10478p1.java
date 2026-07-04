package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10478p1 extends CountedCompleter implements InterfaceC10444i2 {
    public final Spliterator a;
    public final AbstractC10401a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public /* synthetic */ void accept(double d) {
        AbstractC10497t1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC10497t1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC10497t1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public abstract AbstractC10478p1 b(Spliterator spliterator, long j, long j2);

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ boolean n() {
        return false;
    }

    public AbstractC10478p1(Spliterator spliterator, AbstractC10401a abstractC10401a, int i) {
        this.a = spliterator;
        this.b = abstractC10401a;
        this.c = AbstractC10416d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public AbstractC10478p1(AbstractC10478p1 abstractC10478p1, Spliterator spliterator, long j, long j2, int i) {
        super(abstractC10478p1);
        this.a = spliterator;
        this.b = abstractC10478p1.b;
        this.c = abstractC10478p1.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        AbstractC10478p1 abstractC10478p1B = this;
        while (spliterator.estimateSize() > abstractC10478p1B.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC10478p1B.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            AbstractC10478p1 abstractC10478p1 = abstractC10478p1B;
            abstractC10478p1.b(spliteratorTrySplit, abstractC10478p1B.d, jEstimateSize).fork();
            abstractC10478p1B = abstractC10478p1.b(spliterator, abstractC10478p1.d + jEstimateSize, abstractC10478p1.e - jEstimateSize);
        }
        AbstractC10478p1 abstractC10478p12 = abstractC10478p1B;
        abstractC10478p12.b.Q(spliterator, abstractC10478p12);
        abstractC10478p12.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }
}
