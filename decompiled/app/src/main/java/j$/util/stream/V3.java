package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class V3 extends AbstractC10406b {
    public final AbstractC10401a j;
    public final IntFunction k;
    public final boolean l;
    public long m;
    public boolean n;
    public volatile boolean o;

    @Override // j$.util.stream.AbstractC10406b
    public final void f() {
        this.i = true;
        if (this.l && this.o) {
            d(AbstractC10497t1.H(this.j.H()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.AbstractC10416d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.d r0 = r8.d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.V3 r0 = (j$.util.stream.V3) r0
            boolean r0 = r0.n
            j$.util.stream.d r1 = r8.e
            j$.util.stream.V3 r1 = (j$.util.stream.V3) r1
            boolean r1 = r1.n
            r0 = r0 | r1
            r8.n = r0
            boolean r0 = r8.l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.i
            if (r0 == 0) goto L2a
            r8.m = r1
            j$.util.stream.a r0 = r8.j
            j$.util.stream.W2 r0 = r0.H()
            j$.util.stream.X0 r0 = j$.util.stream.AbstractC10497t1.H(r0)
            goto L88
        L2a:
            boolean r0 = r8.l
            if (r0 == 0) goto L41
            j$.util.stream.d r0 = r8.d
            j$.util.stream.V3 r0 = (j$.util.stream.V3) r0
            boolean r3 = r0.n
            if (r3 == 0) goto L41
            long r1 = r0.m
            r8.m = r1
            java.lang.Object r0 = r0.i()
            j$.util.stream.E0 r0 = (j$.util.stream.E0) r0
            goto L88
        L41:
            j$.util.stream.d r0 = r8.d
            j$.util.stream.V3 r0 = (j$.util.stream.V3) r0
            long r3 = r0.m
            j$.util.stream.d r5 = r8.e
            j$.util.stream.V3 r5 = (j$.util.stream.V3) r5
            long r6 = r5.m
            long r3 = r3 + r6
            r8.m = r3
            long r3 = r0.m
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L5d
            java.lang.Object r0 = r5.i()
            j$.util.stream.E0 r0 = (j$.util.stream.E0) r0
            goto L88
        L5d:
            long r3 = r5.m
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L6a
            java.lang.Object r0 = r0.i()
            j$.util.stream.E0 r0 = (j$.util.stream.E0) r0
            goto L88
        L6a:
            j$.util.stream.a r0 = r8.j
            j$.util.stream.W2 r0 = r0.H()
            j$.util.stream.d r1 = r8.d
            j$.util.stream.V3 r1 = (j$.util.stream.V3) r1
            java.lang.Object r1 = r1.i()
            j$.util.stream.E0 r1 = (j$.util.stream.E0) r1
            j$.util.stream.d r2 = r8.e
            j$.util.stream.V3 r2 = (j$.util.stream.V3) r2
            java.lang.Object r2 = r2.i()
            j$.util.stream.E0 r2 = (j$.util.stream.E0) r2
            j$.util.stream.G0 r0 = j$.util.stream.AbstractC10497t1.F(r0, r1, r2)
        L88:
            r8.d(r0)
        L8b:
            r0 = 1
            r8.o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.V3.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    public V3(AbstractC10401a abstractC10401a, AbstractC10401a abstractC10401a2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC10401a2, spliterator);
        this.j = abstractC10401a;
        this.k = intFunction;
        this.l = V2.ORDERED.r(abstractC10401a2.f);
    }

    public V3(V3 v3, Spliterator spliterator) {
        super(v3, spliterator);
        this.j = v3.j;
        this.k = v3.k;
        this.l = v3.l;
    }

    @Override // j$.util.stream.AbstractC10416d
    public final AbstractC10416d c(Spliterator spliterator) {
        return new V3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC10406b
    public final Object h() {
        return AbstractC10497t1.H(this.j.H());
    }

    @Override // j$.util.stream.AbstractC10416d
    public final Object a() {
        InterfaceC10511w0 interfaceC10511w0I = this.a.I(-1L, this.k);
        InterfaceC10444i2 interfaceC10444i2M = this.j.M(this.a.f, interfaceC10511w0I);
        AbstractC10401a abstractC10401a = this.a;
        boolean zA = abstractC10401a.A(this.b, abstractC10401a.R(interfaceC10444i2M));
        this.n = zA;
        if (zA) {
            g();
        }
        E0 e0A = interfaceC10511w0I.a();
        this.m = e0A.count();
        return e0A;
    }
}
