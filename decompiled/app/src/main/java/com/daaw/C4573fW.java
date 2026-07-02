package com.daaw;

import android.net.Uri;
import com.daaw.C3561bt0;
import com.daaw.C4284eW;
import com.daaw.InterfaceC1792Oi0;
import com.daaw.InterfaceC2595Vv;
import com.daaw.InterfaceC5410iW;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.fW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4573fW extends AbstractC0632De implements InterfaceC5410iW.d {
    public final ZV G;
    public final Uri H;
    public final YV I;
    public final InterfaceC0884Fp J;
    public final int K;
    public final boolean L;
    public final InterfaceC5410iW M;
    public final Object N;

    /* JADX INFO: renamed from: com.daaw.fW$b */
    public static final class b {
        public final YV a;
        public ZV b;
        public C3561bt0.a c;
        public InterfaceC5410iW d;
        public InterfaceC0884Fp e;
        public int f;
        public boolean g;
        public boolean h;
        public Object i;

        public b(InterfaceC2595Vv.a aVar) {
            this(new C9739xx(aVar));
        }

        public C4573fW a(Uri uri) {
            this.h = true;
            if (this.d == null) {
                YV yv = this.a;
                int i = this.f;
                C3561bt0.a c5131hW = this.c;
                if (c5131hW == null) {
                    c5131hW = new C5131hW();
                }
                this.d = new C10297zx(yv, i, c5131hW);
            }
            return new C4573fW(uri, this.a, this.b, this.e, this.f, this.d, this.g, this.i);
        }

        public b b(C3561bt0.a aVar) {
            AbstractC7115ob.f(!this.h);
            AbstractC7115ob.g(this.d == null, "A playlist tracker has already been set.");
            this.c = (C3561bt0.a) AbstractC7115ob.e(aVar);
            return this;
        }

        public b(YV yv) {
            this.a = (YV) AbstractC7115ob.e(yv);
            this.b = ZV.a;
            this.f = 3;
            this.e = new C2703Ww();
        }
    }

    static {
        AbstractC3118aJ.a("goog.exo.hls");
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public void a(InterfaceC9110vi0 interfaceC9110vi0) {
        ((C4006dW) interfaceC9110vi0).y();
    }

    @Override // com.daaw.InterfaceC5410iW.d
    public void d(C4284eW c4284eW) {
        C8198sT0 c8198sT0;
        long jB = c4284eW.m ? AbstractC6025ki.b(c4284eW.e) : -9223372036854775807L;
        int i = c4284eW.c;
        long j = (i == 2 || i == 1) ? jB : -9223372036854775807L;
        long j2 = c4284eW.d;
        if (this.M.g()) {
            long jF = c4284eW.e - this.M.f();
            long j3 = c4284eW.l ? c4284eW.p + jF : -9223372036854775807L;
            List list = c4284eW.o;
            if (j2 == -9223372036854775807L) {
                j2 = list.isEmpty() ? 0L : ((C4284eW.a) list.get(Math.max(0, list.size() - 3))).F;
            }
            c8198sT0 = new C8198sT0(j, jB, j3, c4284eW.p, jF, j2, true, !c4284eW.l, this.N);
        } else {
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            long j5 = c4284eW.p;
            c8198sT0 = new C8198sT0(j, jB, j5, j5, 0L, j4, true, false, this.N);
        }
        n(c8198sT0, new C3170aW(this.M.i(), c4284eW));
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public void e() {
        this.M.j();
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public InterfaceC9110vi0 g(InterfaceC1792Oi0.a aVar, O3 o3) {
        AbstractC7115ob.a(aVar.a == 0);
        return new C4006dW(this.G, this.M, this.I, this.K, j(aVar), o3, this.J, this.L);
    }

    @Override // com.daaw.AbstractC0632De
    public void m(WI wi, boolean z) {
        this.M.b(this.H, j(null), this);
    }

    @Override // com.daaw.AbstractC0632De
    public void o() {
        InterfaceC5410iW interfaceC5410iW = this.M;
        if (interfaceC5410iW != null) {
            interfaceC5410iW.a();
        }
    }

    public C4573fW(Uri uri, YV yv, ZV zv, InterfaceC0884Fp interfaceC0884Fp, int i, InterfaceC5410iW interfaceC5410iW, boolean z, Object obj) {
        this.H = uri;
        this.I = yv;
        this.G = zv;
        this.J = interfaceC0884Fp;
        this.K = i;
        this.M = interfaceC5410iW;
        this.L = z;
        this.N = obj;
    }
}
