package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.daaw.C1324Jv;
import com.daaw.C2307Tb;
import com.daaw.C3015Zw;
import com.daaw.C4416ey;
import com.daaw.C4573fW;
import com.daaw.C8257sg1;
import com.daaw.C9559xJ;
import com.daaw.C9938yg1;
import com.daaw.HS0;
import com.daaw.InterfaceC2595Vv;
import com.daaw.InterfaceC9611xW;
import com.daaw.InterfaceC9736xw0;
import com.daaw.KV0;
import com.daaw.avee.comp.playback.a;
import com.daaw.avee.comp.playback.b;
import com.daaw.avee.comp.playback.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.a;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TI implements com.daaw.avee.comp.playback.e, b.d, SurfaceHolder.Callback {
    public Context C;
    public InterfaceC7377pX G;
    public e.b N;
    public C2307Tb O;
    public C2201Sb P;
    public String S;
    public final Object B = new Object();
    public d[] D = new d[2];
    public int E = 0;
    public int F = 1;
    public float H = 1.0f;
    public boolean I = false;
    public WeakReference J = new WeakReference(null);
    public long K = 0;
    public volatile C3397bJ L = null;
    public List M = new LinkedList();
    public SI Q = new SI(this);
    public Handler R = new Handler();
    public UI T = new UI();
    public IX U = new a();
    public long V = 0;

    public class a implements IX {
        public boolean a = false;

        public a() {
        }

        @Override // com.daaw.IX
        public void a(int i) {
            if (TI.this.Q != null) {
                TI.this.Q.h(i);
            }
        }

        @Override // com.daaw.IX
        public void b() {
            TI.this.N.b();
            C3397bJ c3397bJ = TI.this.L;
            if (c3397bJ != null) {
                c3397bJ.c();
            }
        }

        @Override // com.daaw.IX
        public void c(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4, long j2) {
            if (this.a) {
                TI.this.T.a = this.a;
                TI.this.T.b = byteBuffer;
                TI.this.T.c = j;
                TI.this.T.d = i;
                TI.this.T.e = i2;
                TI.this.T.f = i3;
                TI.this.T.g = i4;
                TI.this.T.h = j2;
                TI.this.N.k(TI.this.T);
                TI.this.T.b = null;
            }
        }

        @Override // com.daaw.IX
        public boolean d(int i) {
            d dVarO = TI.this.O();
            return dVarO != null && dVarO.M == i;
        }

        @Override // com.daaw.IX
        public void e(boolean z) {
            this.a = z;
        }
    }

    public class b implements C2307Tb.c {
        public b() {
        }

        @Override // com.daaw.C2307Tb.c
        public void a(C2201Sb c2201Sb) {
            if (c2201Sb.equals(TI.this.P)) {
                return;
            }
            TI.this.P = c2201Sb;
            TI.this.P();
        }
    }

    public class c implements C9938yg1.a {
        public c() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            TI.this.J();
        }
    }

    public TI(Context context, String str, e.b bVar) {
        int i = 0;
        this.C = context;
        this.N = bVar;
        this.S = AbstractC6280lb1.C(context, "ExoPlayerDemo");
        while (true) {
            d[] dVarArr = this.D;
            if (i >= dVarArr.length) {
                this.O = new C2307Tb(context, new b());
                AbstractC4507fI.b.b(new c(), this.M);
                return;
            } else {
                dVarArr[i] = new d(context, i);
                i++;
            }
        }
    }

    public void J() {
        synchronized (this.B) {
            try {
                C3397bJ c3397bJ = this.L;
                if (c3397bJ != null && SystemClock.elapsedRealtime() - this.K > 8000) {
                    c3397bJ.e();
                    this.L = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void K() {
        int i = this.E;
        this.E = this.F;
        this.F = i;
    }

    public void L(int i) {
        if (i == 0) {
            AbstractC0441Bk1.c("trying to destroy currentPlayer");
            return;
        }
        int i2 = this.E;
        int i3 = this.F;
        if (i2 == i3) {
            return;
        }
        this.D[i3].B();
    }

    public d M() {
        return this.D[this.F];
    }

    public final HS0 N() {
        return O().K;
    }

    public d O() {
        return this.D[this.E];
    }

    public final void P() {
        for (d dVar : this.D) {
            long jO = dVar.K != null ? dVar.K.o() : 0L;
            InterfaceC7377pX interfaceC7377pX = dVar.E;
            dVar.B();
            dVar.y(interfaceC7377pX, 1.0f, jO);
        }
    }

    public void Q(boolean z, float f) {
        this.H = f;
        this.I = z;
        int i = 0;
        if (z) {
            d[] dVarArr = this.D;
            int length = dVarArr.length;
            while (i < length) {
                d dVar = dVarArr[i];
                if (dVar != null) {
                    dVar.I(0.0f);
                }
                i++;
            }
            return;
        }
        d[] dVarArr2 = this.D;
        int length2 = dVarArr2.length;
        while (i < length2) {
            d dVar2 = dVarArr2[i];
            if (dVar2 != null) {
                dVar2.I(f);
            }
            i++;
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void a() {
        SI si = this.Q;
        if (si != null) {
            si.j();
            this.Q = null;
        }
        m(null);
        for (d dVar : this.D) {
            dVar.B();
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void b() {
        if (N() == null) {
            return;
        }
        O().w();
        this.N.a(false, null);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public void c(b.C0153b c0153b) {
        this.N.c(c0153b);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public b.c d(String str) {
        return this.N.d(str);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void e(boolean z) {
        Q(z, this.H);
        this.N.f(z);
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean f() {
        return this.I;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void g(long j) {
        this.V = j;
        O().D(1.0f);
        O().C((int) j);
    }

    @Override // com.daaw.avee.comp.playback.e
    public C0705Dw0 h() {
        if (N() == null) {
            return null;
        }
        return new C0705Dw0(O().q(), N() != null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public com.daaw.avee.comp.playback.a i(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
        if (aVar == null) {
            return null;
        }
        long j = gVar.g;
        if (j < 0) {
            aVar.f(k() * 1000);
            return aVar;
        }
        aVar.f(j);
        return aVar;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void j(boolean z, boolean z2, float f, long j) {
        if (z) {
            if (this.E != this.F) {
                M().B();
            }
        } else if (s()) {
            K();
        }
        InterfaceC7377pX interfaceC7377pX = this.G;
        if (interfaceC7377pX == null || interfaceC7377pX.a() == null || this.G.a().equals(Uri.EMPTY)) {
            AbstractC0441Bk1.c("nextDataSource is null");
            if (z2) {
                start();
                return;
            } else {
                b();
                return;
            }
        }
        O().y(this.G, f, j);
        if (z2) {
            start();
        } else {
            O().w();
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public long k() {
        if (N() == null) {
            return 0L;
        }
        return N().o();
    }

    @Override // com.daaw.avee.comp.playback.e
    public long l() {
        return O().q();
    }

    @Override // com.daaw.avee.comp.playback.e
    public void m(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.J = new WeakReference(surfaceHolder);
            surfaceHolder.removeCallback(this);
            surfaceHolder.addCallback(this);
            surfaceCreated(surfaceHolder);
            return;
        }
        SurfaceHolder surfaceHolder2 = (SurfaceHolder) this.J.get();
        if (surfaceHolder2 != null) {
            surfaceHolder2.removeCallback(this);
            this.J = new WeakReference(null);
        }
        surfaceDestroyed(null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void n(b.c cVar) {
        SI si = this.Q;
        if (si != null) {
            si.m(cVar);
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public b.C0153b p() {
        SI si = this.Q;
        if (si != null) {
            return si.d();
        }
        return null;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void q(e.b bVar) {
        this.N = bVar;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void r(InterfaceC7377pX interfaceC7377pX) {
        this.G = interfaceC7377pX;
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean s() {
        if (N() != null) {
            return N().k() == 2 || N().k() == 3;
        }
        return false;
    }

    @Override // com.daaw.avee.comp.playback.e
    public void start() {
        d dVarO = O();
        if (dVarO.K == null) {
            return;
        }
        if (this.N.h()) {
            dVarO.z();
            surfaceCreated(this.N.n());
            O().K();
        }
        this.N.a(false, null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void stop() {
        if (N() == null) {
            return;
        }
        N().h(false);
        this.N.a(false, null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            M().H(null);
            O().H(surfaceHolder.getSurface());
        } else {
            M().H(null);
            O().H(null);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.E != this.F) {
            M().H(null);
        }
        O().H(null);
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean t(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.E;
        } else {
            i2 = this.F;
            if (this.E == i2) {
                return true;
            }
        }
        d dVar = this.D[i2];
        return dVar == null || dVar.E(f);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void u(int i) {
        O().G(i);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void v() {
        if (this.E == this.F) {
            return;
        }
        L(1);
    }

    @Override // com.daaw.avee.comp.playback.b.d
    public boolean w(String str) {
        return this.N.e(str);
    }

    @Override // com.daaw.avee.comp.playback.e
    public void x(float f) {
        for (d dVar : this.D) {
            if (dVar != null) {
                dVar.J(f);
            }
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public boolean y() {
        return (N() == null || N().k() == 4 || !N().c()) ? false : true;
    }

    public class d implements InterfaceC9736xw0.a, InterfaceC5198hk0, HS0.c, B21 {
        public com.google.android.exoplayer2.trackselection.b C;
        public InterfaceC7377pX E;
        public InterfaceC1792Oi0 F;
        public HS0 K;
        public int M;
        public Context N;
        public final C1951Pw B = new C1951Pw();
        public int G = 0;
        public float H = 1.0f;
        public float I = 0.0f;
        public float J = 0.0f;
        public float L = 0.0f;
        public InterfaceC2595Vv.a D = l(true);

        public d(Context context, int i) {
            this.N = context;
            this.M = i;
        }

        @Override // com.daaw.InterfaceC9736xw0.a
        public void A(VI vi) {
            String message = vi.getMessage();
            if (message == null) {
                message = "";
            }
            String strReplace = message.replace("java.io.IOException:", "").replace("java.lang.IllegalStateException", "");
            if (strReplace.length() < 5) {
                strReplace = "Error " + strReplace;
            }
            TI.this.N.a(false, strReplace);
        }

        public final void B() {
            HS0 hs0 = this.K;
            if (hs0 != null) {
                hs0.a();
                this.K = null;
            }
            this.C = null;
        }

        public void C(long j) {
            HS0 hs0 = this.K;
            if (hs0 != null) {
                hs0.f(j);
            }
        }

        public void D(float f) {
            this.I = f;
            L();
        }

        public boolean E(float f) {
            boolean z;
            float f2 = this.I + f;
            this.I = f2;
            boolean z2 = true;
            if (f2 <= 0.0f) {
                this.I = 0.0f;
                z = true;
            } else {
                z = false;
            }
            if (this.I >= 1.0f) {
                this.I = 1.0f;
            } else {
                z2 = z;
            }
            L();
            return z2;
        }

        public void F(float f) {
            this.L = f;
        }

        public boolean H(Surface surface) {
            if (this.K == null) {
                return false;
            }
            if (surface == null || !surface.isValid()) {
                this.K.I(null);
                this.K.J(null);
                return false;
            }
            this.K.I(this);
            this.K.J(surface);
            return true;
        }

        public void I(float f) {
            this.H = f;
            L();
        }

        public void J(float f) {
            this.J = f;
            L();
        }

        public void K() {
            HS0 hs0 = this.K;
            if (hs0 != null) {
                hs0.h(true);
            }
        }

        public void L() {
            Math.min(1.0f - this.J, 1.0f);
            float fMin = Math.min(this.J + 1.0f, 1.0f);
            HS0 hs0 = this.K;
            if (hs0 != null) {
                hs0.L(fMin * this.I * this.H);
            }
        }

        @Override // com.daaw.InterfaceC1254Jd1
        public void b(int i, int i2, int i3, float f) {
            AbstractC0441Bk1.c("width: " + i + " height: " + i2);
            float f2 = (float) i;
            float f3 = (float) i2;
            if (i < i2) {
                f3 = f2;
                f2 = f3;
            }
            TI.this.N.i(i, i2, (f3 > 0.0f) & ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) > 0) ? (f2 * f) / f3 : 1.0f);
        }

        public InterfaceC2595Vv.a k(InterfaceC5299i51 interfaceC5299i51) {
            return new C3577bx(this.N, interfaceC5299i51, n(interfaceC5299i51));
        }

        public final InterfaceC2595Vv.a l(boolean z) {
            return k(z ? this.B : null);
        }

        public InterfaceC9611xW.b n(InterfaceC5299i51 interfaceC5299i51) {
            return new C0491Bx(TI.this.S, interfaceC5299i51);
        }

        public final InterfaceC1792Oi0 o(Uri uri, int i, String str) {
            int iF = AbstractC6280lb1.F(uri, str);
            if (iF == 0) {
                return new C1324Jv.e(new C3015Zw.a(this.D), l(false)).b(new C4519fL(new C1012Gv(), t(uri))).a(uri);
            }
            if (iF == 1) {
                return new KV0.b(new C4416ey.a(this.D), l(false)).b(new C4519fL(new IV0(), t(uri))).a(uri);
            }
            if (iF == 2) {
                return new C4573fW.b(this.D).b(new C4519fL(new C5131hW(), t(uri))).a(uri);
            }
            if (iF == 3) {
                return new C9559xJ.b(this.D).a(uri);
            }
            throw new IllegalStateException("Unsupported type: " + iF);
        }

        public long q() {
            HS0 hs0 = this.K;
            if (hs0 == null) {
                return 0L;
            }
            long duration = hs0.getDuration();
            if (duration >= 0 && duration != -9223372036854775807L) {
                return duration;
            }
            return 0L;
        }

        public final InterfaceC1792Oi0 r(InterfaceC7377pX interfaceC7377pX) {
            return new InterfaceC1792Oi0[]{o(new Uri[]{interfaceC7377pX.a()}[0], new int[]{interfaceC7377pX.b()}[0], new String[]{""}[0])}[0];
        }

        @Override // com.daaw.InterfaceC9736xw0.a
        public void s(boolean z, int i) {
            int i2 = this.G;
            if (i2 == i) {
                return;
            }
            this.G = i;
            if (TI.this.Q != null) {
                TI.this.Q.i();
            }
            if (i2 != 3) {
                D(this.L);
                TI.this.N.a(true, null);
            }
            if ((i2 == 2 || i2 == 3) && i == 4) {
                u(this.K);
            }
        }

        public List t(Uri uri) {
            return Collections.EMPTY_LIST;
        }

        public void u(HS0 hs0) {
            if (hs0 != null && TI.this.N() == hs0) {
                TI.this.N.o();
            }
        }

        public void w() {
            HS0 hs0 = this.K;
            if (hs0 != null) {
                hs0.h(false);
            }
        }

        public void x(InterfaceC1792Oi0 interfaceC1792Oi0) {
            if (this.K == null || interfaceC1792Oi0 == null) {
                return;
            }
            TI.this.U.b();
            this.K.G(interfaceC1792Oi0);
        }

        public void y(InterfaceC7377pX interfaceC7377pX, float f, long j) {
            this.C = new DefaultTrackSelector(new a.C0261a(this.B));
            this.E = interfaceC7377pX;
            this.F = r(interfaceC7377pX);
            if (this.K == null) {
                HS0 hs0A = XI.a(new C1393Km0(TI.this.N, TI.this.U, this.M, this.N, 0), this.C, null);
                this.K = hs0A;
                hs0A.b(this);
                this.K.C(new MH(this.C));
                this.K.f(j);
            }
            D(f);
            F(f);
            TI ti = TI.this;
            ti.m(ti.N.n());
            this.K.f(j);
            if (this.E != null) {
                x(this.F);
            }
            D(f);
        }

        public void z() {
            InterfaceC1792Oi0 interfaceC1792Oi0;
            HS0 hs0 = this.K;
            if (hs0 == null || hs0.k() != 1 || (interfaceC1792Oi0 = this.F) == null) {
                return;
            }
            this.K.G(interfaceC1792Oi0);
        }

        @Override // com.daaw.InterfaceC1254Jd1
        public void f() {
        }

        @Override // com.daaw.InterfaceC9736xw0.a
        public void g() {
        }

        public void G(int i) {
        }

        @Override // com.daaw.InterfaceC9736xw0.a
        public void c(C9457ww0 c9457ww0) {
        }

        @Override // com.daaw.InterfaceC9736xw0.a
        public void d(boolean z) {
        }

        @Override // com.daaw.InterfaceC9736xw0.a
        public void e(int i) {
        }

        @Override // com.daaw.B21
        public void h(List list) {
        }

        @Override // com.daaw.InterfaceC5198hk0
        public void p(Metadata metadata) {
        }

        @Override // com.daaw.InterfaceC9736xw0.a
        public void m(TrackGroupArray trackGroupArray, C3338b51 c3338b51) {
        }

        @Override // com.daaw.InterfaceC9736xw0.a
        public void v(L31 l31, Object obj, int i) {
        }
    }

    @Override // com.daaw.avee.comp.playback.e
    public void o() {
    }

    public static class e {
        public static List a = new LinkedList();
        public static C8257sg1 b = new C8257sg1().b(new a(), a);

        public class a implements C8257sg1.a {
            @Override // com.daaw.C8257sg1.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void invoke(CharSequence charSequence) {
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
