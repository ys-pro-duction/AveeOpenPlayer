package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class S extends CountedCompleter {
    public Spliterator a;
    public final InterfaceC10444i2 b;
    public final AbstractC10401a c;
    public long d;

    public S(AbstractC10401a abstractC10401a, Spliterator spliterator, InterfaceC10444i2 interfaceC10444i2) {
        super(null);
        this.b = interfaceC10444i2;
        this.c = abstractC10401a;
        this.a = spliterator;
        this.d = 0L;
    }

    public S(S s, Spliterator spliterator) {
        super(s);
        this.a = spliterator;
        this.b = s.b;
        this.d = s.d;
        this.c = s.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.d;
        if (jE == 0) {
            jE = AbstractC10416d.e(jEstimateSize);
            this.d = jE;
        }
        boolean zR = V2.SHORT_CIRCUIT.r(this.c.f);
        InterfaceC10444i2 interfaceC10444i2 = this.b;
        boolean z = false;
        S s = this;
        while (true) {
            if (zR && interfaceC10444i2.n()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            S s2 = new S(s, spliteratorTrySplit);
            s.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                S s3 = s;
                s = s2;
                s2 = s3;
            }
            z = !z;
            s.fork();
            s = s2;
            jEstimateSize = spliterator.estimateSize();
        }
        s.c.z(spliterator, interfaceC10444i2);
        s.a = null;
        s.propagateCompletion();
    }
}
