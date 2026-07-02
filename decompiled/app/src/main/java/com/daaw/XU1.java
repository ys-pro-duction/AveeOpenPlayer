package com.daaw;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.revenuecat.purchases.common.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class XU1 extends AbstractC4567fU1 implements TextureView.SurfaceTextureListener, InterfaceC7367pU1 {
    public final FU1 D;
    public final GU1 E;
    public final EU1 F;
    public InterfaceC4278eU1 G;
    public Surface H;
    public AbstractC7646qU1 I;
    public String J;
    public String[] K;
    public boolean L;
    public int M;
    public DU1 N;
    public final boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public float T;

    public XU1(Context context, GU1 gu1, FU1 fu1, boolean z, boolean z2, EU1 eu1) {
        super(context);
        this.M = 1;
        this.D = fu1;
        this.E = gu1;
        this.O = z;
        this.F = eu1;
        setSurfaceTextureListener(this);
        gu1.a(this);
    }

    public static String R(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + exc.getMessage();
    }

    private final void S() {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            abstractC7646qU1.H(true);
        }
    }

    private final boolean b0() {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        return (abstractC7646qU1 == null || !abstractC7646qU1.M() || this.L) ? false : true;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void A(int i) {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            abstractC7646qU1.B(i);
        }
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void B(int i) {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            abstractC7646qU1.D(i);
        }
    }

    public final AbstractC7646qU1 C(Integer num) {
        EU1 eu1 = this.F;
        FU1 fu1 = this.D;
        C4008dW1 c4008dW1 = new C4008dW1(fu1.getContext(), eu1, fu1, num);
        AbstractC4274eT1.zzi("ExoPlayerAdapter initialized.");
        return c4008dW1;
    }

    public final String D() {
        FU1 fu1 = this.D;
        return zzt.zzp().zzc(fu1.getContext(), fu1.zzn().B);
    }

    public final /* synthetic */ void E(String str) {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.a("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void F() {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.zza();
        }
    }

    public final /* synthetic */ void G() {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.zzf();
        }
    }

    public final /* synthetic */ void H(boolean z, long j) {
        this.D.x0(z, j);
    }

    public final /* synthetic */ void I(String str) {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void J() {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.zzg();
        }
    }

    public final /* synthetic */ void K() {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.zzh();
        }
    }

    public final /* synthetic */ void L() {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.zzi();
        }
    }

    public final /* synthetic */ void M(int i, int i2) {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.b(i, i2);
        }
    }

    public final /* synthetic */ void N() {
        float fA = this.C.a();
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 == null) {
            AbstractC4274eT1.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            abstractC7646qU1.K(fA, false);
        } catch (IOException e) {
            AbstractC4274eT1.zzk("", e);
        }
    }

    public final /* synthetic */ void O(int i) {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.onWindowVisibilityChanged(i);
        }
    }

    public final /* synthetic */ void P() {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.zzd();
        }
    }

    public final /* synthetic */ void Q() {
        InterfaceC4278eU1 interfaceC4278eU1 = this.G;
        if (interfaceC4278eU1 != null) {
            interfaceC4278eU1.zze();
        }
    }

    public final void T() {
        if (this.P) {
            return;
        }
        this.P = true;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.WU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.G();
            }
        });
        zzn();
        this.E.b();
        if (this.Q) {
            s();
        }
    }

    public final void U(boolean z, Integer num) {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null && !z) {
            abstractC7646qU1.G(num);
            return;
        }
        if (this.J == null || this.H == null) {
            return;
        }
        if (z) {
            if (!b0()) {
                AbstractC4274eT1.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                abstractC7646qU1.L();
                W();
            }
        }
        if (this.J.startsWith("cache:")) {
            AbstractC9330wV1 abstractC9330wV1M = this.D.m(this.J);
            if (abstractC9330wV1M instanceof FV1) {
                AbstractC7646qU1 abstractC7646qU1Y = ((FV1) abstractC9330wV1M).y();
                this.I = abstractC7646qU1Y;
                abstractC7646qU1Y.G(num);
                if (!this.I.M()) {
                    AbstractC4274eT1.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(abstractC9330wV1M instanceof CV1)) {
                    AbstractC4274eT1.zzj("Stream cache miss: ".concat(String.valueOf(this.J)));
                    return;
                }
                CV1 cv1 = (CV1) abstractC9330wV1M;
                String strD = D();
                ByteBuffer byteBufferZ = cv1.z();
                boolean zA = cv1.A();
                String strY = cv1.y();
                if (strY == null) {
                    AbstractC4274eT1.zzj("Stream cache URL is null.");
                    return;
                } else {
                    AbstractC7646qU1 abstractC7646qU1C = C(num);
                    this.I = abstractC7646qU1C;
                    abstractC7646qU1C.x(new Uri[]{Uri.parse(strY)}, strD, byteBufferZ, zA);
                }
            }
        } else {
            this.I = C(num);
            String strD2 = D();
            Uri[] uriArr = new Uri[this.K.length];
            int i = 0;
            while (true) {
                String[] strArr = this.K;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.I.w(uriArr, strD2);
        }
        this.I.C(this);
        X(this.H, false);
        if (this.I.M()) {
            int iP = this.I.P();
            this.M = iP;
            if (iP == 3) {
                T();
            }
        }
    }

    public final void V() {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            abstractC7646qU1.H(false);
        }
    }

    public final void W() {
        if (this.I != null) {
            X(null, true);
            AbstractC7646qU1 abstractC7646qU1 = this.I;
            if (abstractC7646qU1 != null) {
                abstractC7646qU1.C(null);
                this.I.y();
                this.I = null;
            }
            this.M = 1;
            this.L = false;
            this.P = false;
            this.Q = false;
        }
    }

    public final void X(Surface surface, boolean z) {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 == null) {
            AbstractC4274eT1.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            abstractC7646qU1.J(surface, z);
        } catch (IOException e) {
            AbstractC4274eT1.zzk("", e);
        }
    }

    public final void Y() {
        Z(this.R, this.S);
    }

    public final void Z(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.T != f) {
            this.T = f;
            requestLayout();
        }
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void a(int i) {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            abstractC7646qU1.E(i);
        }
    }

    public final boolean a0() {
        return b0() && this.M != 1;
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void b(int i) {
        if (this.M != i) {
            this.M = i;
            if (i == 3) {
                T();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.F.a) {
                V();
            }
            this.E.e();
            this.C.c();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.VU1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.F();
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void c(String str, Exception exc) {
        final String strR = R("onLoadException", exc);
        AbstractC4274eT1.zzj("ExoPlayerAdapter exception: ".concat(strR));
        zzt.zzo().t(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.RU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.I(strR);
            }
        });
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void d(final boolean z, final long j) {
        if (this.D != null) {
            AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.QU1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.H(z, j);
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void e(String str, Exception exc) {
        final String strR = R(str, exc);
        AbstractC4274eT1.zzj("ExoPlayerAdapter error: ".concat(strR));
        this.L = true;
        if (this.F.a) {
            V();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.UU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.E(strR);
            }
        });
        zzt.zzo().t(exc, "AdExoPlayerView.onError");
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void f(int i) {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            abstractC7646qU1.I(i);
        }
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void g(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.K = new String[]{str};
        } else {
            this.K = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.J;
        boolean z = false;
        if (this.F.l && str2 != null && !str.equals(str2) && this.M == 4) {
            z = true;
        }
        this.J = str;
        U(z, num);
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void h(int i, int i2) {
        this.R = i;
        this.S = i2;
        Y();
    }

    @Override // com.daaw.AbstractC4567fU1
    public final int i() {
        if (a0()) {
            return (int) this.I.U();
        }
        return 0;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final int j() {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            return abstractC7646qU1.N();
        }
        return -1;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final int k() {
        if (a0()) {
            return (int) this.I.V();
        }
        return 0;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final int l() {
        return this.S;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final int m() {
        return this.R;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final long n() {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            return abstractC7646qU1.T();
        }
        return -1L;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final long o() {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            return abstractC7646qU1.r();
        }
        return -1L;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.T;
        if (f != 0.0f && this.N == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        DU1 du1 = this.N;
        if (du1 != null) {
            du1.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.O) {
            DU1 du1 = new DU1(getContext());
            this.N = du1;
            du1.c(surfaceTexture, i, i2);
            this.N.start();
            SurfaceTexture surfaceTextureA = this.N.a();
            if (surfaceTextureA != null) {
                surfaceTexture = surfaceTextureA;
            } else {
                this.N.d();
                this.N = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.H = surface;
        if (this.I == null) {
            U(false, null);
        } else {
            X(surface, true);
            if (!this.F.a) {
                S();
            }
        }
        if (this.R == 0 || this.S == 0) {
            Z(i, i2);
        } else {
            Y();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.TU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.K();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        r();
        DU1 du1 = this.N;
        if (du1 != null) {
            du1.d();
            this.N = null;
        }
        if (this.I != null) {
            V();
            Surface surface = this.H;
            if (surface != null) {
                surface.release();
            }
            this.H = null;
            X(null, true);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.PU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.L();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        DU1 du1 = this.N;
        if (du1 != null) {
            du1.b(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.OU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.M(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.E.f(this);
        this.B.a(surfaceTexture, this.G);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.NU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.O(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.daaw.AbstractC4567fU1
    public final long p() {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            return abstractC7646qU1.s();
        }
        return -1L;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final String q() {
        return "ExoPlayer/2".concat(true != this.O ? "" : " spherical");
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void r() {
        if (a0()) {
            if (this.F.a) {
                V();
            }
            this.I.F(false);
            this.E.e();
            this.C.c();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.SU1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.P();
                }
            });
        }
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void s() {
        if (!a0()) {
            this.Q = true;
            return;
        }
        if (this.F.a) {
            S();
        }
        this.I.F(true);
        this.E.c();
        this.C.b();
        this.B.b();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.LU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.Q();
            }
        });
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void t(int i) {
        if (a0()) {
            this.I.z(i);
        }
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void u(InterfaceC4278eU1 interfaceC4278eU1) {
        this.G = interfaceC4278eU1;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void v(String str) {
        if (str != null) {
            g(str, null, null);
        }
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void w() {
        if (b0()) {
            this.I.L();
            W();
        }
        this.E.e();
        this.C.c();
        this.E.d();
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void x(float f, float f2) {
        DU1 du1 = this.N;
        if (du1 != null) {
            du1.e(f, f2);
        }
    }

    @Override // com.daaw.AbstractC4567fU1
    public final Integer y() {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            return abstractC7646qU1.t();
        }
        return null;
    }

    @Override // com.daaw.AbstractC4567fU1
    public final void z(int i) {
        AbstractC7646qU1 abstractC7646qU1 = this.I;
        if (abstractC7646qU1 != null) {
            abstractC7646qU1.A(i);
        }
    }

    @Override // com.daaw.AbstractC4567fU1, com.daaw.IU1
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.MU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.N();
            }
        });
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.daaw.KU1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.J();
            }
        });
    }
}
