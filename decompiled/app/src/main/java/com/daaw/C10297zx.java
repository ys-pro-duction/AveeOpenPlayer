package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.daaw.C0833Fc0;
import com.daaw.C3449bW;
import com.daaw.C3561bt0;
import com.daaw.C4284eW;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.InterfaceC5410iW;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10297zx implements InterfaceC5410iW, C0833Fc0.a {
    public final YV B;
    public final C3561bt0.a C;
    public final int D;
    public InterfaceC1896Pi0.a G;
    public C0833Fc0 H;
    public Handler I;
    public InterfaceC5410iW.d J;
    public C3449bW K;
    public C3449bW.a L;
    public C4284eW M;
    public boolean N;
    public final List F = new ArrayList();
    public final IdentityHashMap E = new IdentityHashMap();
    public long O = -9223372036854775807L;

    /* JADX INFO: renamed from: com.daaw.zx$a */
    public final class a implements C0833Fc0.a, Runnable {
        public final C3449bW.a B;
        public final C0833Fc0 C = new C0833Fc0("DefaultHlsPlaylistTracker:MediaPlaylist");
        public final C3561bt0 D;
        public C4284eW E;
        public long F;
        public long G;
        public long H;
        public long I;
        public boolean J;
        public IOException K;

        public a(C3449bW.a aVar) {
            this.B = aVar;
            this.D = new C3561bt0(C10297zx.this.B.a(4), AbstractC0401Ba1.d(C10297zx.this.K.a, aVar.a), 4, C10297zx.this.C);
        }

        public final boolean d() {
            this.I = SystemClock.elapsedRealtime() + 60000;
            return C10297zx.this.L == this.B && !C10297zx.this.F();
        }

        public C4284eW e() {
            return this.E;
        }

        public boolean f() {
            int i;
            if (this.E == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, AbstractC6025ki.b(this.E.p));
            C4284eW c4284eW = this.E;
            return c4284eW.l || (i = c4284eW.c) == 2 || i == 1 || this.F + jMax > jElapsedRealtime;
        }

        public void g() {
            this.I = 0L;
            if (this.J || this.C.g()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.H) {
                h();
            } else {
                this.J = true;
                C10297zx.this.I.postDelayed(this, this.H - jElapsedRealtime);
            }
        }

        public final void h() {
            long jK = this.C.k(this.D, this, C10297zx.this.D);
            InterfaceC1896Pi0.a aVar = C10297zx.this.G;
            C3561bt0 c3561bt0 = this.D;
            aVar.o(c3561bt0.a, c3561bt0.b, jK);
        }

        public void i() throws IOException {
            this.C.b();
            IOException iOException = this.K;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.daaw.C0833Fc0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void p(C3561bt0 c3561bt0, long j, long j2, boolean z) {
            C10297zx.this.G.f(c3561bt0.a, 4, j, j2, c3561bt0.c());
        }

        @Override // com.daaw.C0833Fc0.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void s(C3561bt0 c3561bt0, long j, long j2) {
            AbstractC4852gW abstractC4852gW = (AbstractC4852gW) c3561bt0.d();
            if (!(abstractC4852gW instanceof C4284eW)) {
                this.K = new C3000Zs0("Loaded playlist has unexpected type.");
            } else {
                n((C4284eW) abstractC4852gW);
                C10297zx.this.G.i(c3561bt0.a, 4, j, j2, c3561bt0.c());
            }
        }

        @Override // com.daaw.C0833Fc0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public int k(C3561bt0 c3561bt0, long j, long j2, IOException iOException) {
            boolean z = iOException instanceof C3000Zs0;
            C10297zx.this.G.l(c3561bt0.a, 4, j, j2, c3561bt0.c(), iOException, z);
            boolean zC = AbstractC2447Uk.c(iOException);
            boolean zD = C10297zx.this.H(this.B, zC) || !zC;
            if (z) {
                return 3;
            }
            if (zC) {
                zD |= d();
            }
            return zD ? 0 : 2;
        }

        public final void n(C4284eW c4284eW) {
            C4284eW c4284eW2 = this.E;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.F = jElapsedRealtime;
            C4284eW c4284eWC = C10297zx.this.C(c4284eW2, c4284eW);
            this.E = c4284eWC;
            if (c4284eWC != c4284eW2) {
                this.K = null;
                this.G = jElapsedRealtime;
                C10297zx.this.L(this.B, c4284eWC);
            } else if (!c4284eWC.l) {
                if (c4284eW.h + ((long) c4284eW.o.size()) < this.E.h) {
                    this.K = new InterfaceC5410iW.b(this.B.a);
                    C10297zx.this.H(this.B, false);
                } else if (jElapsedRealtime - this.G > AbstractC6025ki.b(r10.j) * 3.5d) {
                    this.K = new InterfaceC5410iW.c(this.B.a);
                    C10297zx.this.H(this.B, true);
                    d();
                }
            }
            C4284eW c4284eW3 = this.E;
            long j = c4284eW3.j;
            if (c4284eW3 == c4284eW2) {
                j /= 2;
            }
            this.H = jElapsedRealtime + AbstractC6025ki.b(j);
            if (this.B != C10297zx.this.L || this.E.l) {
                return;
            }
            g();
        }

        public void o() {
            this.C.i();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.J = false;
            h();
        }
    }

    public C10297zx(YV yv, int i, C3561bt0.a aVar) {
        this.B = yv;
        this.D = i;
        this.C = aVar;
    }

    public static C4284eW.a B(C4284eW c4284eW, C4284eW c4284eW2) {
        int i = (int) (c4284eW2.h - c4284eW.h);
        List list = c4284eW.o;
        if (i < list.size()) {
            return (C4284eW.a) list.get(i);
        }
        return null;
    }

    public final void A(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3449bW.a aVar = (C3449bW.a) list.get(i);
            this.E.put(aVar, new a(aVar));
        }
    }

    public final C4284eW C(C4284eW c4284eW, C4284eW c4284eW2) {
        return !c4284eW2.f(c4284eW) ? c4284eW2.l ? c4284eW.d() : c4284eW : c4284eW2.c(E(c4284eW, c4284eW2), D(c4284eW, c4284eW2));
    }

    public final int D(C4284eW c4284eW, C4284eW c4284eW2) {
        C4284eW.a aVarB;
        if (c4284eW2.f) {
            return c4284eW2.g;
        }
        C4284eW c4284eW3 = this.M;
        return (c4284eW == null || (aVarB = B(c4284eW, c4284eW2)) == null) ? c4284eW3 != null ? c4284eW3.g : 0 : (c4284eW.g + aVarB.E) - ((C4284eW.a) c4284eW2.o.get(0)).E;
    }

    public final long E(C4284eW c4284eW, C4284eW c4284eW2) {
        if (c4284eW2.m) {
            return c4284eW2.e;
        }
        C4284eW c4284eW3 = this.M;
        long j = c4284eW3 != null ? c4284eW3.e : 0L;
        if (c4284eW != null) {
            int size = c4284eW.o.size();
            C4284eW.a aVarB = B(c4284eW, c4284eW2);
            if (aVarB != null) {
                return c4284eW.e + aVarB.F;
            }
            if (size == c4284eW2.h - c4284eW.h) {
                return c4284eW.e();
            }
        }
        return j;
    }

    public final boolean F() {
        List list = this.K.c;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.E.get(list.get(i));
            if (jElapsedRealtime > aVar.I) {
                this.L = aVar.B;
                aVar.g();
                return true;
            }
        }
        return false;
    }

    public final void G(C3449bW.a aVar) {
        if (aVar == this.L || !this.K.c.contains(aVar)) {
            return;
        }
        C4284eW c4284eW = this.M;
        if (c4284eW == null || !c4284eW.l) {
            this.L = aVar;
            ((a) this.E.get(aVar)).g();
        }
    }

    public final boolean H(C3449bW.a aVar, boolean z) {
        int size = this.F.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            z2 |= !((InterfaceC5410iW.a) this.F.get(i)).b(aVar, z);
        }
        return z2;
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void p(C3561bt0 c3561bt0, long j, long j2, boolean z) {
        this.G.f(c3561bt0.a, 4, j, j2, c3561bt0.c());
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void s(C3561bt0 c3561bt0, long j, long j2) {
        AbstractC4852gW abstractC4852gW = (AbstractC4852gW) c3561bt0.d();
        boolean z = abstractC4852gW instanceof C4284eW;
        C3449bW c3449bWD = z ? C3449bW.d(abstractC4852gW.a) : (C3449bW) abstractC4852gW;
        this.K = c3449bWD;
        this.L = (C3449bW.a) c3449bWD.c.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c3449bWD.c);
        arrayList.addAll(c3449bWD.d);
        arrayList.addAll(c3449bWD.e);
        A(arrayList);
        a aVar = (a) this.E.get(this.L);
        if (z) {
            aVar.n((C4284eW) abstractC4852gW);
        } else {
            aVar.g();
        }
        this.G.i(c3561bt0.a, 4, j, j2, c3561bt0.c());
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public int k(C3561bt0 c3561bt0, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof C3000Zs0;
        this.G.l(c3561bt0.a, 4, j, j2, c3561bt0.c(), iOException, z);
        return z ? 3 : 0;
    }

    public final void L(C3449bW.a aVar, C4284eW c4284eW) {
        if (aVar == this.L) {
            if (this.M == null) {
                this.N = !c4284eW.l;
                this.O = c4284eW.e;
            }
            this.M = c4284eW;
            this.J.d(c4284eW);
        }
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC5410iW.a) this.F.get(i)).h();
        }
    }

    @Override // com.daaw.InterfaceC5410iW
    public void a() {
        this.L = null;
        this.M = null;
        this.K = null;
        this.O = -9223372036854775807L;
        this.H.i();
        this.H = null;
        Iterator it = this.E.values().iterator();
        while (it.hasNext()) {
            ((a) it.next()).o();
        }
        this.I.removeCallbacksAndMessages(null);
        this.I = null;
        this.E.clear();
    }

    @Override // com.daaw.InterfaceC5410iW
    public void b(Uri uri, InterfaceC1896Pi0.a aVar, InterfaceC5410iW.d dVar) {
        this.I = new Handler();
        this.G = aVar;
        this.J = dVar;
        C3561bt0 c3561bt0 = new C3561bt0(this.B.a(4), uri, 4, this.C);
        AbstractC7115ob.f(this.H == null);
        C0833Fc0 c0833Fc0 = new C0833Fc0("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.H = c0833Fc0;
        aVar.o(c3561bt0.a, c3561bt0.b, c0833Fc0.k(c3561bt0, this, this.D));
    }

    @Override // com.daaw.InterfaceC5410iW
    public void c(InterfaceC5410iW.a aVar) {
        this.F.remove(aVar);
    }

    @Override // com.daaw.InterfaceC5410iW
    public C4284eW d(C3449bW.a aVar) {
        C4284eW c4284eWE = ((a) this.E.get(aVar)).e();
        if (c4284eWE != null) {
            G(aVar);
        }
        return c4284eWE;
    }

    @Override // com.daaw.InterfaceC5410iW
    public void e(C3449bW.a aVar) {
        ((a) this.E.get(aVar)).g();
    }

    @Override // com.daaw.InterfaceC5410iW
    public long f() {
        return this.O;
    }

    @Override // com.daaw.InterfaceC5410iW
    public boolean g() {
        return this.N;
    }

    @Override // com.daaw.InterfaceC5410iW
    public void h(C3449bW.a aVar) throws IOException {
        ((a) this.E.get(aVar)).i();
    }

    @Override // com.daaw.InterfaceC5410iW
    public C3449bW i() {
        return this.K;
    }

    @Override // com.daaw.InterfaceC5410iW
    public void j() throws IOException {
        C0833Fc0 c0833Fc0 = this.H;
        if (c0833Fc0 != null) {
            c0833Fc0.b();
        }
        C3449bW.a aVar = this.L;
        if (aVar != null) {
            h(aVar);
        }
    }

    @Override // com.daaw.InterfaceC5410iW
    public void l(InterfaceC5410iW.a aVar) {
        this.F.add(aVar);
    }

    @Override // com.daaw.InterfaceC5410iW
    public boolean m(C3449bW.a aVar) {
        return ((a) this.E.get(aVar)).f();
    }
}
