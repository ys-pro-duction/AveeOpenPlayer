package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10406b extends AbstractC10416d {
    public final AtomicReference h;
    public volatile boolean i;

    public abstract Object h();

    public AbstractC10406b(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        super(abstractC10401a, spliterator);
        this.h = new AtomicReference(null);
    }

    public AbstractC10406b(AbstractC10406b abstractC10406b, Spliterator spliterator) {
        super(abstractC10406b, spliterator);
        this.h = abstractC10406b.h;
    }

    @Override // j$.util.stream.AbstractC10416d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = AbstractC10416d.e(jEstimateSize);
            this.c = jE;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC10406b abstractC10406b = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z2 = abstractC10406b.i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC10406b.getCompleter();
                while (true) {
                    AbstractC10406b abstractC10406b2 = (AbstractC10406b) ((AbstractC10416d) completer);
                    if (z2 || abstractC10406b2 == null) {
                        break;
                    }
                    z2 = abstractC10406b2.i;
                    completer = abstractC10406b2.getCompleter();
                }
            }
            if (z2) {
                objH = abstractC10406b.h();
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC10406b abstractC10406b3 = (AbstractC10406b) abstractC10406b.c(spliteratorTrySplit);
            abstractC10406b.d = abstractC10406b3;
            AbstractC10406b abstractC10406b4 = (AbstractC10406b) abstractC10406b.c(spliterator);
            abstractC10406b.e = abstractC10406b4;
            abstractC10406b.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC10406b = abstractC10406b3;
                abstractC10406b3 = abstractC10406b4;
            } else {
                abstractC10406b = abstractC10406b4;
            }
            z = !z;
            abstractC10406b3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objH = abstractC10406b.a();
        abstractC10406b.d(objH);
        abstractC10406b.tryComplete();
    }

    @Override // j$.util.stream.AbstractC10416d
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC10416d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.h.get();
            return obj == null ? h() : obj;
        }
        return this.f;
    }

    public void f() {
        this.i = true;
    }

    public final void g() {
        AbstractC10406b abstractC10406b = this;
        for (AbstractC10406b abstractC10406b2 = (AbstractC10406b) ((AbstractC10416d) getCompleter()); abstractC10406b2 != null; abstractC10406b2 = (AbstractC10406b) ((AbstractC10416d) abstractC10406b2.getCompleter())) {
            if (abstractC10406b2.d == abstractC10406b) {
                AbstractC10406b abstractC10406b3 = (AbstractC10406b) abstractC10406b2.e;
                if (!abstractC10406b3.i) {
                    abstractC10406b3.f();
                }
            }
            abstractC10406b = abstractC10406b2;
        }
    }
}
