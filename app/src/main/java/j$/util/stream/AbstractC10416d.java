package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10416d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final AbstractC10401a a;
    public Spliterator b;
    public long c;
    public AbstractC10416d d;
    public AbstractC10416d e;
    public Object f;

    public abstract Object a();

    public abstract AbstractC10416d c(Spliterator spliterator);

    public AbstractC10416d(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        super(null);
        this.a = abstractC10401a;
        this.b = spliterator;
        this.c = 0L;
    }

    public AbstractC10416d(AbstractC10416d abstractC10416d, Spliterator spliterator) {
        super(abstractC10416d);
        this.b = spliterator;
        this.a = abstractC10416d.a;
        this.c = abstractC10416d.c;
    }

    public static long e(long j) {
        long j2 = j / ((long) g);
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f = obj;
    }

    public final boolean b() {
        return ((AbstractC10416d) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.c = jE;
        }
        boolean z = false;
        AbstractC10416d abstractC10416d = this;
        while (jEstimateSize > jE && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC10416d abstractC10416dC = abstractC10416d.c(spliteratorTrySplit);
            abstractC10416d.d = abstractC10416dC;
            AbstractC10416d abstractC10416dC2 = abstractC10416d.c(spliterator);
            abstractC10416d.e = abstractC10416dC2;
            abstractC10416d.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC10416d = abstractC10416dC;
                abstractC10416dC = abstractC10416dC2;
            } else {
                abstractC10416d = abstractC10416dC2;
            }
            z = !z;
            abstractC10416dC.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC10416d.d(abstractC10416d.a());
        abstractC10416d.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }
}
