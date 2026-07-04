package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10485q3 {
    public final long a;
    public final long b;
    public Spliterator c;
    public long d;
    public long e;

    public abstract Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4);

    public AbstractC10485q3(Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.c = spliterator;
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m119trySplit() {
        long j = this.e;
        if (this.a >= j || this.d >= j) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.d;
            long jMin = Math.min(jEstimateSize, this.b);
            long j2 = this.a;
            if (j2 >= jMin) {
                this.d = jMin;
            } else {
                long j3 = this.b;
                if (jMin >= j3) {
                    this.c = spliteratorTrySplit;
                    this.e = jMin;
                } else {
                    long j4 = this.d;
                    if (j4 >= j2 && jEstimateSize <= j3) {
                        this.d = jMin;
                        return spliteratorTrySplit;
                    }
                    this.d = jMin;
                    return a(spliteratorTrySplit, j2, j3, j4, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            return j - Math.max(j2, this.d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.c.characteristics();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.b0 m122trySplit() {
        return (j$.util.b0) m119trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.V m120trySplit() {
        return (j$.util.V) m119trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Y m121trySplit() {
        return (j$.util.Y) m119trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.S trySplit() {
        return (j$.util.S) m119trySplit();
    }
}
