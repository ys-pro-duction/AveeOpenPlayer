package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC10406b {
    public final D j;
    public final boolean k;

    public J(D d, boolean z, AbstractC10401a abstractC10401a, Spliterator spliterator) {
        super(abstractC10401a, spliterator);
        this.k = z;
        this.j = d;
    }

    public J(J j, Spliterator spliterator) {
        super(j, spliterator);
        this.k = j.k;
        this.j = j.j;
    }

    @Override // j$.util.stream.AbstractC10416d
    public final AbstractC10416d c(Spliterator spliterator) {
        return new J(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC10406b
    public final Object h() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC10416d
    public final Object a() {
        AbstractC10401a abstractC10401a = this.a;
        E3 e3 = (E3) this.j.d.get();
        abstractC10401a.Q(this.b, e3);
        Object obj = e3.get();
        if (this.k) {
            if (obj != null) {
                AbstractC10416d abstractC10416d = this;
                while (abstractC10416d != null) {
                    AbstractC10416d abstractC10416d2 = (AbstractC10416d) abstractC10416d.getCompleter();
                    if (abstractC10416d2 != null && abstractC10416d2.d != abstractC10416d) {
                        g();
                        return obj;
                    }
                    abstractC10416d = abstractC10416d2;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC10416d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            J j = (J) this.d;
            J j2 = null;
            while (true) {
                if (j != j2) {
                    Object objI = j.i();
                    if (objI != null && this.j.c.test(objI)) {
                        d(objI);
                        AbstractC10416d abstractC10416d = this;
                        while (true) {
                            if (abstractC10416d != null) {
                                AbstractC10416d abstractC10416d2 = (AbstractC10416d) abstractC10416d.getCompleter();
                                if (abstractC10416d2 != null && abstractC10416d2.d != abstractC10416d) {
                                    g();
                                    break;
                                }
                                abstractC10416d = abstractC10416d2;
                            } else {
                                AtomicReference atomicReference = this.h;
                                while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        j2 = j;
                        j = (J) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
