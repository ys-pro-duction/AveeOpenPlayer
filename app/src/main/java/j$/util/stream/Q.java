package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends CountedCompleter {
    public final AbstractC10401a a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final P e;
    public final Q f;
    public E0 g;

    public Q(AbstractC10401a abstractC10401a, Spliterator spliterator, P p) {
        super(null);
        this.a = abstractC10401a;
        this.b = spliterator;
        this.c = AbstractC10416d.e(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC10416d.g << 1));
        this.e = p;
        this.f = null;
    }

    public Q(Q q, Spliterator spliterator, Q q2) {
        super(q);
        this.a = q.a;
        this.b = spliterator;
        this.c = q.c;
        this.d = q.d;
        this.e = q.e;
        this.f = q2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        Q q = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            Q q2 = new Q(q, spliteratorTrySplit, q.f);
            Q q3 = new Q(q, spliterator, q2);
            q.addToPendingCount(1);
            q3.addToPendingCount(1);
            q.d.put(q2, q3);
            if (q.f != null) {
                q2.addToPendingCount(1);
                if (q.d.replace(q.f, q, q2)) {
                    q.addToPendingCount(-1);
                } else {
                    q2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                q = q2;
                q2 = q3;
            } else {
                q = q3;
            }
            z = !z;
            q2.fork();
        }
        if (q.getPendingCount() > 0) {
            C10471o c10471o = new C10471o(12);
            AbstractC10401a abstractC10401a = q.a;
            InterfaceC10511w0 interfaceC10511w0I = abstractC10401a.I(abstractC10401a.F(spliterator), c10471o);
            q.a.Q(spliterator, interfaceC10511w0I);
            q.g = interfaceC10511w0I.a();
            q.b = null;
        }
        q.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        E0 e0 = this.g;
        if (e0 != null) {
            e0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.Q(spliterator, this.e);
                this.b = null;
            }
        }
        Q q = (Q) this.d.remove(this);
        if (q != null) {
            q.tryComplete();
        }
    }
}
