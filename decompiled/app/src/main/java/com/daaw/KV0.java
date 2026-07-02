package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.daaw.C0833Fc0;
import com.daaw.C3561bt0;
import com.daaw.GV0;
import com.daaw.HV0;
import com.daaw.InterfaceC0937Gc0;
import com.daaw.InterfaceC1792Oi0;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.InterfaceC2595Vv;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class KV0 extends AbstractC0632De implements C0833Fc0.a {
    public final boolean G;
    public final Uri H;
    public final InterfaceC2595Vv.a I;
    public final GV0.a J;
    public final InterfaceC0884Fp K;
    public final int L;
    public final long M;
    public final InterfaceC1896Pi0.a N;
    public final C3561bt0.a O;
    public final ArrayList P;
    public final Object Q;
    public InterfaceC2595Vv R;
    public C0833Fc0 S;
    public InterfaceC0937Gc0 T;
    public long U;
    public HV0 V;
    public Handler W;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            KV0.this.x();
        }
    }

    public static final class b {
        public final GV0.a a;
        public final InterfaceC2595Vv.a b;
        public C3561bt0.a c;
        public boolean g;
        public Object h;
        public int e = 3;
        public long f = 30000;
        public InterfaceC0884Fp d = new C2703Ww();

        public b(GV0.a aVar, InterfaceC2595Vv.a aVar2) {
            this.a = (GV0.a) AbstractC7115ob.e(aVar);
            this.b = aVar2;
        }

        public KV0 a(Uri uri) {
            this.g = true;
            if (this.c == null) {
                this.c = new IV0();
            }
            return new KV0(null, (Uri) AbstractC7115ob.e(uri), this.b, this.c, this.a, this.d, this.e, this.f, this.h, null);
        }

        public b b(C3561bt0.a aVar) {
            AbstractC7115ob.f(!this.g);
            this.c = (C3561bt0.a) AbstractC7115ob.e(aVar);
            return this;
        }
    }

    static {
        AbstractC3118aJ.a("goog.exo.smoothstreaming");
    }

    public /* synthetic */ KV0(HV0 hv0, Uri uri, InterfaceC2595Vv.a aVar, C3561bt0.a aVar2, GV0.a aVar3, InterfaceC0884Fp interfaceC0884Fp, int i, long j, Object obj, a aVar4) {
        this(hv0, uri, aVar, aVar2, aVar3, interfaceC0884Fp, i, j, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        C3561bt0 c3561bt0 = new C3561bt0(this.R, this.H, 4, this.O);
        this.N.o(c3561bt0.a, c3561bt0.b, this.S.k(c3561bt0, this, this.L));
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public void a(InterfaceC9110vi0 interfaceC9110vi0) {
        ((JV0) interfaceC9110vi0).v();
        this.P.remove(interfaceC9110vi0);
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public void e() {
        this.T.b();
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public InterfaceC9110vi0 g(InterfaceC1792Oi0.a aVar, O3 o3) {
        AbstractC7115ob.a(aVar.a == 0);
        JV0 jv0 = new JV0(this.V, this.J, this.K, this.L, j(aVar), this.T, o3);
        this.P.add(jv0);
        return jv0;
    }

    @Override // com.daaw.AbstractC0632De
    public void m(WI wi, boolean z) {
        if (this.G) {
            this.T = new InterfaceC0937Gc0.a();
            v();
            return;
        }
        this.R = this.I.a();
        C0833Fc0 c0833Fc0 = new C0833Fc0("Loader:Manifest");
        this.S = c0833Fc0;
        this.T = c0833Fc0;
        this.W = new Handler();
        x();
    }

    @Override // com.daaw.AbstractC0632De
    public void o() {
        this.V = this.G ? this.V : null;
        this.R = null;
        this.U = 0L;
        C0833Fc0 c0833Fc0 = this.S;
        if (c0833Fc0 != null) {
            c0833Fc0.i();
            this.S = null;
        }
        Handler handler = this.W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.W = null;
        }
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void p(C3561bt0 c3561bt0, long j, long j2, boolean z) {
        this.N.f(c3561bt0.a, c3561bt0.b, j, j2, c3561bt0.c());
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void s(C3561bt0 c3561bt0, long j, long j2) {
        this.N.i(c3561bt0.a, c3561bt0.b, j, j2, c3561bt0.c());
        this.V = (HV0) c3561bt0.d();
        this.U = j - j2;
        v();
        w();
    }

    @Override // com.daaw.C0833Fc0.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int k(C3561bt0 c3561bt0, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof C3000Zs0;
        this.N.l(c3561bt0.a, c3561bt0.b, j, j2, c3561bt0.c(), iOException, z);
        return z ? 3 : 0;
    }

    public final void v() {
        C8198sT0 c8198sT0;
        for (int i = 0; i < this.P.size(); i++) {
            ((JV0) this.P.get(i)).x(this.V);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (HV0.b bVar : this.V.f) {
            if (bVar.k > 0) {
                jMax2 = Math.min(jMax2, bVar.d(0));
                jMax = Math.max(jMax, bVar.d(bVar.k - 1) + bVar.b(bVar.k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            c8198sT0 = new C8198sT0(this.V.d ? -9223372036854775807L : 0L, 0L, 0L, 0L, true, this.V.d, this.Q);
        } else {
            HV0 hv0 = this.V;
            if (hv0.d) {
                long j = hv0.h;
                if (j != -9223372036854775807L && j > 0) {
                    jMax2 = Math.max(jMax2, jMax - j);
                }
                long j2 = jMax2;
                long j3 = jMax - j2;
                long jA = j3 - AbstractC6025ki.a(this.M);
                if (jA < 5000000) {
                    jA = Math.min(5000000L, j3 / 2);
                }
                c8198sT0 = new C8198sT0(-9223372036854775807L, j3, j2, jA, true, true, this.Q);
            } else {
                long j4 = hv0.g;
                if (j4 == -9223372036854775807L) {
                    j4 = jMax - jMax2;
                }
                long j5 = j4;
                c8198sT0 = new C8198sT0(jMax2 + j5, j5, jMax2, 0L, true, false, this.Q);
            }
        }
        n(c8198sT0, this.V);
    }

    public final void w() {
        if (this.V.d) {
            this.W.postDelayed(new a(), Math.max(0L, (this.U + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public KV0(HV0 hv0, Uri uri, InterfaceC2595Vv.a aVar, C3561bt0.a aVar2, GV0.a aVar3, InterfaceC0884Fp interfaceC0884Fp, int i, long j, Object obj) {
        AbstractC7115ob.f(hv0 == null || !hv0.d);
        this.V = hv0;
        this.H = uri == null ? null : LV0.a(uri);
        this.I = aVar;
        this.O = aVar2;
        this.J = aVar3;
        this.K = interfaceC0884Fp;
        this.L = i;
        this.M = j;
        this.N = j(null);
        this.Q = obj;
        this.G = hv0 != null;
        this.P = new ArrayList();
    }
}
