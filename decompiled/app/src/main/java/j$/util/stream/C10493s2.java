package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10493s2 extends AbstractC10406b {
    public final AbstractC10401a j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    @Override // j$.util.stream.AbstractC10406b
    public final void f() {
        this.i = true;
        if (this.o) {
            d(AbstractC10497t1.H(this.j.H()));
        }
    }

    @Override // j$.util.stream.AbstractC10416d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C10493s2 c10493s2;
        E0 e0H;
        AbstractC10416d abstractC10416d = this.d;
        if (!(abstractC10416d == null)) {
            this.n = ((C10493s2) abstractC10416d).n + ((C10493s2) this.e).n;
            if (this.i) {
                this.n = 0L;
                e0H = AbstractC10497t1.H(this.j.H());
            } else {
                e0H = this.n == 0 ? AbstractC10497t1.H(this.j.H()) : ((C10493s2) this.d).n == 0 ? (E0) ((C10493s2) this.e).i() : AbstractC10497t1.F(this.j.H(), (E0) ((C10493s2) this.d).i(), (E0) ((C10493s2) this.e).i());
            }
            E0 e0H2 = e0H;
            if (b()) {
                e0H2 = e0H2.h(this.l, this.m >= 0 ? Math.min(e0H2.count(), this.l + this.m) : this.n, this.k);
            }
            d(e0H2);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j = this.l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 >= j) {
                g();
            } else {
                C10493s2 c10493s22 = (C10493s2) ((AbstractC10416d) getCompleter());
                Object obj = this;
                while (true) {
                    if (c10493s22 == null) {
                        if (j2 >= j) {
                            break;
                        }
                    } else {
                        if (obj == c10493s22.e && (c10493s2 = (C10493s2) c10493s22.d) != null) {
                            long j3 = c10493s2.j(j) + j2;
                            if (j3 >= j) {
                                break;
                            } else {
                                j2 = j3;
                            }
                        }
                        obj = c10493s22;
                        c10493s22 = (C10493s2) ((AbstractC10416d) c10493s22.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C10493s2(AbstractC10401a abstractC10401a, AbstractC10401a abstractC10401a2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(abstractC10401a2, spliterator);
        this.j = abstractC10401a;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    public C10493s2(C10493s2 c10493s2, Spliterator spliterator) {
        super(c10493s2, spliterator);
        this.j = c10493s2.j;
        this.k = c10493s2.k;
        this.l = c10493s2.l;
        this.m = c10493s2.m;
    }

    @Override // j$.util.stream.AbstractC10416d
    public final AbstractC10416d c(Spliterator spliterator) {
        return new C10493s2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC10406b
    public final Object h() {
        return AbstractC10497t1.H(this.j.H());
    }

    @Override // j$.util.stream.AbstractC10416d
    public final Object a() {
        if (b()) {
            V2 v2 = V2.SIZED;
            AbstractC10401a abstractC10401a = this.j;
            int i = abstractC10401a.c;
            int i2 = v2.e;
            InterfaceC10511w0 interfaceC10511w0I = this.j.I((i & i2) == i2 ? abstractC10401a.F(this.b) : -1L, this.k);
            InterfaceC10444i2 interfaceC10444i2M = this.j.M(this.a.f, interfaceC10511w0I);
            AbstractC10401a abstractC10401a2 = this.a;
            abstractC10401a2.A(this.b, abstractC10401a2.R(interfaceC10444i2M));
            return interfaceC10511w0I.a();
        }
        InterfaceC10511w0 interfaceC10511w0I2 = this.j.I(-1L, this.k);
        if (this.l == 0) {
            InterfaceC10444i2 interfaceC10444i2M2 = this.j.M(this.a.f, interfaceC10511w0I2);
            AbstractC10401a abstractC10401a3 = this.a;
            abstractC10401a3.A(this.b, abstractC10401a3.R(interfaceC10444i2M2));
        } else {
            this.a.Q(this.b, interfaceC10511w0I2);
        }
        E0 e0A = interfaceC10511w0I2.a();
        this.n = e0A.count();
        this.o = true;
        this.b = null;
        return e0A;
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        C10493s2 c10493s2 = (C10493s2) this.d;
        C10493s2 c10493s22 = (C10493s2) this.e;
        if (c10493s2 == null || c10493s22 == null) {
            return this.n;
        }
        long j2 = c10493s2.j(j);
        return j2 >= j ? j2 : c10493s22.j(j) + j2;
    }
}
