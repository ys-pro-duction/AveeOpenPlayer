package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.daaw.C0488Bw0;
import com.daaw.InterfaceC1792Oi0;
import com.daaw.InterfaceC9736xw0;
import com.daaw.L31;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class YI implements WI {
    public final VH0[] a;
    public final AbstractC3895d51 b;
    public final C4173e51 c;
    public final Handler d;
    public final ZI e;
    public final Handler f;
    public final CopyOnWriteArraySet g;
    public final L31.c h;
    public final L31.b i;
    public final ArrayDeque j;
    public boolean k;
    public int l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public C9457ww0 q;
    public VI r;
    public C9178vw0 s;
    public int t;
    public int u;
    public long v;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            YI.this.r(message);
        }
    }

    public static final class b {
        public final C9178vw0 a;
        public final Set b;
        public final AbstractC3895d51 c;
        public final boolean d;
        public final int e;
        public final int f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        public b(C9178vw0 c9178vw0, C9178vw0 c9178vw02, Set set, AbstractC3895d51 abstractC3895d51, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.a = c9178vw0;
            this.b = set;
            this.c = abstractC3895d51;
            this.d = z;
            this.e = i;
            this.f = i2;
            this.g = z2;
            this.h = z3;
            this.i = z4 || c9178vw02.f != c9178vw0.f;
            this.j = (c9178vw02.a == c9178vw0.a && c9178vw02.b == c9178vw0.b) ? false : true;
            this.k = c9178vw02.g != c9178vw0.g;
            this.l = c9178vw02.i != c9178vw0.i;
        }

        public void a() {
            if (this.j || this.f == 0) {
                for (InterfaceC9736xw0.a aVar : this.b) {
                    C9178vw0 c9178vw0 = this.a;
                    aVar.v(c9178vw0.a, c9178vw0.b, this.f);
                }
            }
            if (this.d) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9736xw0.a) it.next()).e(this.e);
                }
            }
            if (this.l) {
                this.c.b(this.a.i.d);
                for (InterfaceC9736xw0.a aVar2 : this.b) {
                    C9178vw0 c9178vw02 = this.a;
                    aVar2.m(c9178vw02.h, c9178vw02.i.c);
                }
            }
            if (this.k) {
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC9736xw0.a) it2.next()).d(this.a.g);
                }
            }
            if (this.i) {
                Iterator it3 = this.b.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC9736xw0.a) it3.next()).s(this.h, this.a.f);
                }
            }
            if (this.g) {
                Iterator it4 = this.b.iterator();
                while (it4.hasNext()) {
                    ((InterfaceC9736xw0.a) it4.next()).g();
                }
            }
        }
    }

    public YI(VH0[] vh0Arr, AbstractC3895d51 abstractC3895d51, InterfaceC0625Dc0 interfaceC0625Dc0, InterfaceC5207hm interfaceC5207hm) {
        Integer.toHexString(System.identityHashCode(this));
        int i = AbstractC6280lb1.a;
        AbstractC7115ob.f(vh0Arr.length > 0);
        this.a = (VH0[]) AbstractC7115ob.e(vh0Arr);
        this.b = (AbstractC3895d51) AbstractC7115ob.e(abstractC3895d51);
        this.k = false;
        this.l = 0;
        this.m = false;
        this.g = new CopyOnWriteArraySet();
        C4173e51 c4173e51 = new C4173e51(new XH0[vh0Arr.length], new com.google.android.exoplayer2.trackselection.c[vh0Arr.length], null);
        this.c = c4173e51;
        this.h = new L31.c();
        this.i = new L31.b();
        this.q = C9457ww0.e;
        a aVar = new a(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.d = aVar;
        this.s = new C9178vw0(L31.a, 0L, TrackGroupArray.E, c4173e51);
        this.j = new ArrayDeque();
        ZI zi = new ZI(vh0Arr, abstractC3895d51, c4173e51, interfaceC0625Dc0, this.k, this.l, this.m, aVar, this, interfaceC5207hm);
        this.e = zi;
        this.f = new Handler(zi.r());
    }

    @Override // com.daaw.InterfaceC9736xw0
    public void a() {
        Integer.toHexString(System.identityHashCode(this));
        int i = AbstractC6280lb1.a;
        AbstractC3118aJ.b();
        this.e.F();
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public void b(InterfaceC9736xw0.a aVar) {
        this.g.add(aVar);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public boolean c() {
        return this.k;
    }

    @Override // com.daaw.WI
    public C0488Bw0 d(C0488Bw0.b bVar) {
        return new C0488Bw0(this.e, bVar, this.s.a, g(), this.f);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public int e() {
        if (t()) {
            return this.s.c.c;
        }
        return -1;
    }

    @Override // com.daaw.InterfaceC9736xw0
    public void f(long j) {
        v(g(), j);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public int g() {
        if (w()) {
            return this.t;
        }
        C9178vw0 c9178vw0 = this.s;
        return c9178vw0.a.f(c9178vw0.c.a, this.i).c;
    }

    @Override // com.daaw.InterfaceC9736xw0
    public long getDuration() {
        L31 l31 = this.s.a;
        if (l31.o()) {
            return -9223372036854775807L;
        }
        if (!t()) {
            return l31.k(g(), this.h).c();
        }
        InterfaceC1792Oi0.a aVar = this.s.c;
        l31.f(aVar.a, this.i);
        return AbstractC6025ki.b(this.i.b(aVar.b, aVar.c));
    }

    @Override // com.daaw.InterfaceC9736xw0
    public void h(boolean z) {
        if (this.k != z) {
            this.k = z;
            this.e.Z(z);
            x(this.s, false, 4, 1, false, true);
        }
    }

    @Override // com.daaw.InterfaceC9736xw0
    public long i() {
        if (!t()) {
            return o();
        }
        C9178vw0 c9178vw0 = this.s;
        c9178vw0.a.f(c9178vw0.c.a, this.i);
        return this.i.l() + AbstractC6025ki.b(this.s.e);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public long j() {
        return w() ? this.v : u(this.s.k);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public int k() {
        return this.s.f;
    }

    @Override // com.daaw.WI
    public void l(InterfaceC1792Oi0 interfaceC1792Oi0, boolean z, boolean z2) {
        this.r = null;
        C9178vw0 c9178vw0Q = q(z, z2, 2);
        this.o = true;
        this.n++;
        this.e.D(interfaceC1792Oi0, z, z2);
        x(c9178vw0Q, false, 4, 1, false, false);
    }

    @Override // com.daaw.InterfaceC9736xw0
    public int m() {
        if (t()) {
            return this.s.c.b;
        }
        return -1;
    }

    @Override // com.daaw.InterfaceC9736xw0
    public L31 n() {
        return this.s.a;
    }

    @Override // com.daaw.InterfaceC9736xw0
    public long o() {
        return w() ? this.v : u(this.s.j);
    }

    public int p() {
        return w() ? this.u : this.s.c.a;
    }

    public final C9178vw0 q(boolean z, boolean z2, int i) {
        if (z) {
            this.t = 0;
            this.u = 0;
            this.v = 0L;
        } else {
            this.t = g();
            this.u = p();
            this.v = o();
        }
        L31 l31 = z2 ? L31.a : this.s.a;
        Object obj = z2 ? null : this.s.b;
        C9178vw0 c9178vw0 = this.s;
        return new C9178vw0(l31, obj, c9178vw0.c, c9178vw0.d, c9178vw0.e, i, false, z2 ? TrackGroupArray.E : c9178vw0.h, z2 ? this.c : c9178vw0.i);
    }

    public void r(Message message) {
        int i = message.what;
        if (i == 0) {
            C9178vw0 c9178vw0 = (C9178vw0) message.obj;
            int i2 = message.arg1;
            int i3 = message.arg2;
            s(c9178vw0, i2, i3 != -1, i3);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException();
            }
            VI vi = (VI) message.obj;
            this.r = vi;
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((InterfaceC9736xw0.a) it.next()).A(vi);
            }
            return;
        }
        C9457ww0 c9457ww0 = (C9457ww0) message.obj;
        if (this.q.equals(c9457ww0)) {
            return;
        }
        this.q = c9457ww0;
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            ((InterfaceC9736xw0.a) it2.next()).c(c9457ww0);
        }
    }

    public final void s(C9178vw0 c9178vw0, int i, boolean z, int i2) {
        int i3 = this.n - i;
        this.n = i3;
        if (i3 == 0) {
            C9178vw0 c9178vw0G = c9178vw0.d == -9223372036854775807L ? c9178vw0.g(c9178vw0.c, 0L, c9178vw0.e) : c9178vw0;
            if ((!this.s.a.o() || this.o) && c9178vw0G.a.o()) {
                this.u = 0;
                this.t = 0;
                this.v = 0L;
            }
            int i4 = this.o ? 0 : 2;
            boolean z2 = this.p;
            this.o = false;
            this.p = false;
            x(c9178vw0G, z, i2, i4, z2, false);
        }
    }

    public boolean t() {
        return !w() && this.s.c.b();
    }

    public final long u(long j) {
        long jB = AbstractC6025ki.b(j);
        if (this.s.c.b()) {
            return jB;
        }
        C9178vw0 c9178vw0 = this.s;
        c9178vw0.a.f(c9178vw0.c.a, this.i);
        return jB + this.i.l();
    }

    public void v(int i, long j) {
        int i2;
        L31 l31 = this.s.a;
        if (i < 0 || (!l31.o() && i >= l31.n())) {
            throw new C4014dY(l31, i, j);
        }
        this.p = true;
        this.n++;
        if (t()) {
            this.d.obtainMessage(0, 1, -1, this.s).sendToTarget();
            return;
        }
        this.t = i;
        if (l31.o()) {
            this.v = j == -9223372036854775807L ? 0L : j;
            this.u = 0;
            i2 = i;
        } else {
            long jB = j == -9223372036854775807L ? l31.k(i, this.h).b() : AbstractC6025ki.a(j);
            i2 = i;
            Pair pairI = l31.i(this.h, this.i, i2, jB);
            this.v = AbstractC6025ki.b(jB);
            this.u = ((Integer) pairI.first).intValue();
        }
        this.e.Q(l31, i2, AbstractC6025ki.a(j));
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((InterfaceC9736xw0.a) it.next()).e(1);
        }
    }

    public final boolean w() {
        return this.s.a.o() || this.n > 0;
    }

    public final void x(C9178vw0 c9178vw0, boolean z, int i, int i2, boolean z2, boolean z3) {
        boolean zIsEmpty = this.j.isEmpty();
        this.j.addLast(new b(c9178vw0, this.s, this.g, this.b, z, i, i2, z2, this.k, z3));
        this.s = c9178vw0;
        if (zIsEmpty) {
            while (!this.j.isEmpty()) {
                ((b) this.j.peekFirst()).a();
                this.j.removeFirst();
            }
        }
    }
}
