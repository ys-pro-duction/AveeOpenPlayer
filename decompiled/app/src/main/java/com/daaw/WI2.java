package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class WI2 implements Runnable {
    public static final Object L = new Object();
    public static final Object M = new Object();
    public static final Object N = new Object();
    public static Boolean O;
    public final Context B;
    public final zzcaz C;
    public int F;
    public final C7989ri2 G;
    public final List H;
    public final C2882Yo2 J;
    public final RP1 K;
    public final C3400bJ2 D = C4235eJ2.N();
    public String E = "";
    public boolean I = false;

    public WI2(Context context, zzcaz zzcazVar, C7989ri2 c7989ri2, C2882Yo2 c2882Yo2, RP1 rp1) {
        this.B = context;
        this.C = zzcazVar;
        this.G = c7989ri2;
        this.J = c2882Yo2;
        this.K = rp1;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.B8)).booleanValue()) {
            this.H = zzt.zzd();
        } else {
            this.H = OP2.J();
        }
    }

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (L) {
            try {
                if (O == null) {
                    if (((Boolean) AbstractC7307pF1.b.e()).booleanValue()) {
                        O = Boolean.valueOf(Math.random() < ((Double) AbstractC7307pF1.a.e()).doubleValue());
                    } else {
                        O = Boolean.FALSE;
                    }
                }
                zBooleanValue = O.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void b(final II2 ii2) {
        AbstractC9322wT1.a.Z0(new Runnable() { // from class: com.daaw.VI2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.c(ii2);
            }
        });
    }

    public final /* synthetic */ void c(II2 ii2) {
        synchronized (N) {
            try {
                if (!this.I) {
                    this.I = true;
                    if (a()) {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        this.E = zzt.zzp(this.B);
                        this.F = C9599xT.f().a(this.B);
                        int iIntValue = ((Integer) zzba.zzc().b(AbstractC9820yE1.w8)).intValue();
                        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Oa)).booleanValue()) {
                            long j = iIntValue;
                            AbstractC9322wT1.d.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = iIntValue;
                            AbstractC9322wT1.d.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (a() && ii2 != null) {
            synchronized (M) {
                try {
                    if (this.D.n() >= ((Integer) zzba.zzc().b(AbstractC9820yE1.x8)).intValue()) {
                        return;
                    }
                    YI2 yi2M = ZI2.M();
                    yi2M.K(ii2.l());
                    yi2M.E(ii2.k());
                    yi2M.v(ii2.b());
                    yi2M.M(3);
                    yi2M.B(this.C.B);
                    yi2M.o(this.E);
                    yi2M.z(Build.VERSION.RELEASE);
                    yi2M.G(Build.VERSION.SDK_INT);
                    yi2M.L(ii2.n());
                    yi2M.y(ii2.a());
                    yi2M.t(this.F);
                    yi2M.J(ii2.m());
                    yi2M.p(ii2.d());
                    yi2M.u(ii2.f());
                    yi2M.w(ii2.g());
                    yi2M.x(this.G.c(ii2.g()));
                    yi2M.A(ii2.h());
                    yi2M.r(ii2.e());
                    yi2M.H(ii2.j());
                    yi2M.C(ii2.i());
                    yi2M.D(ii2.c());
                    if (((Boolean) zzba.zzc().b(AbstractC9820yE1.B8)).booleanValue()) {
                        yi2M.n(this.H);
                    }
                    C3400bJ2 c3400bJ2 = this.D;
                    C3678cJ2 c3678cJ2M = C3957dJ2.M();
                    c3678cJ2M.n(yi2M);
                    c3400bJ2.o(c3678cJ2M);
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrH;
        if (a()) {
            Object obj = M;
            synchronized (obj) {
                try {
                    if (this.D.n() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrH = ((C4235eJ2) this.D.j()).h();
                            this.D.p();
                        }
                        new C2778Xo2(this.B, this.C.B, this.K, Binder.getCallingUid()).zza(new C2570Vo2((String) zzba.zzc().b(AbstractC9820yE1.v8), 60000, new HashMap(), bArrH, "application/x-protobuf", false));
                    } catch (Exception e) {
                        if ((e instanceof C2350Tl2) && ((C2350Tl2) e).a() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzo().t(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
