package com.daaw;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.revenuecat.purchases.common.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class FV1 extends AbstractC9330wV1 implements InterfaceC7367pU1 {
    public AbstractC7646qU1 E;
    public String F;
    public boolean G;
    public boolean H;
    public C7092oV1 I;
    public long J;
    public long K;

    public FV1(FU1 fu1, EU1 eu1) {
        super(fu1);
        C4008dW1 c4008dW1 = new C4008dW1(fu1.getContext(), eu1, (FU1) this.D.get(), null);
        AbstractC4274eT1.zzi("ExoPlayerAdapter initialized.");
        this.E = c4008dW1;
        c4008dW1.C(this);
    }

    public static final String A(String str) {
        return "cache:".concat(String.valueOf(XS1.i(str)));
    }

    public static String B(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + exc.getMessage();
    }

    public final void C(long j) {
        zzt.zza.postDelayed(new Runnable() { // from class: com.daaw.EV1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.z();
            }
        }, j);
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void c(String str, Exception exc) {
        AbstractC4274eT1.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().t(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void d(final boolean z, final long j) {
        final FU1 fu1 = (FU1) this.D.get();
        if (fu1 != null) {
            AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.DV1
                @Override // java.lang.Runnable
                public final void run() {
                    fu1.x0(z, j);
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void e(String str, Exception exc) {
        AbstractC4274eT1.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().t(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.daaw.AbstractC9330wV1
    public final void i() {
        AbstractC7646qU1 abstractC7646qU1 = this.E;
        if (abstractC7646qU1 != null) {
            abstractC7646qU1.C(null);
            this.E.y();
        }
    }

    @Override // com.daaw.AbstractC9330wV1
    public final void k() {
        synchronized (this) {
            this.G = true;
            notify();
            i();
        }
        String str = this.F;
        if (str != null) {
            m(this.F, A(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.daaw.AbstractC9330wV1
    public final void r(int i) {
        this.E.A(i);
    }

    @Override // com.daaw.AbstractC9330wV1
    public final void s(int i) {
        this.E.B(i);
    }

    @Override // com.daaw.AbstractC9330wV1
    public final void t(int i) {
        this.E.D(i);
    }

    @Override // com.daaw.AbstractC9330wV1
    public final void u(int i) {
        this.E.E(i);
    }

    @Override // com.daaw.AbstractC9330wV1
    public final boolean v(String str) {
        return w(str, new String[]{str});
    }

    @Override // com.daaw.AbstractC9330wV1
    public final boolean w(String str, String[] strArr) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z;
        this.F = str;
        String strA = A(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.E.w(uriArr, this.C);
            FU1 fu1 = (FU1) this.D.get();
            if (fu1 != null) {
                fu1.i(strA, this);
            }
            InterfaceC5485im interfaceC5485imZzB = com.google.android.gms.ads.internal.zzt.zzB();
            long jA = interfaceC5485imZzB.a();
            long jLongValue = ((Long) zzba.zzc().b(AbstractC9820yE1.y)).longValue();
            long jLongValue2 = ((Long) zzba.zzc().b(AbstractC9820yE1.x)).longValue() * 1000;
            long jIntValue = ((Integer) zzba.zzc().b(AbstractC9820yE1.w)).intValue();
            boolean zBooleanValue = ((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue();
            long j7 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (interfaceC5485imZzB.a() - jA > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (this.G) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.H) {
                            if (!this.E.M()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jV = this.E.V();
                            if (jV > 0) {
                                long jR = this.E.R();
                                if (jR != j7) {
                                    if (jR > 0) {
                                        j6 = jIntValue;
                                        z = true;
                                    } else {
                                        j6 = jIntValue;
                                        z = false;
                                    }
                                    long j8 = jLongValue;
                                    j5 = jR;
                                    long jR2 = zBooleanValue ? this.E.r() : -1L;
                                    j2 = j6;
                                    j = jLongValue2;
                                    j4 = jV;
                                    j3 = j8;
                                    q(str, strA, j5, j4, z, jR2, zBooleanValue ? this.E.T() : -1L, zBooleanValue ? this.E.s() : -1L, AbstractC7646qU1.O(), AbstractC7646qU1.Q());
                                    j7 = j5;
                                } else {
                                    j3 = jLongValue;
                                    j = jLongValue2;
                                    j2 = jIntValue;
                                    j4 = jV;
                                    j5 = jR;
                                }
                                if (j5 >= j4) {
                                    o(str, strA, j4);
                                } else if (this.E.S() < j2 || j5 <= 0) {
                                    jLongValue = j3;
                                }
                            } else {
                                j = jLongValue2;
                                j2 = jIntValue;
                            }
                            try {
                                wait(jLongValue);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                    } finally {
                    }
                }
                jIntValue = j2;
                jLongValue2 = j;
            }
            return true;
        } catch (Exception e) {
            AbstractC4274eT1.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzt.zzo().t(e, "VideoStreamExoPlayerCache.preload");
            i();
            m(str, strA, "error", B("error", e));
            return false;
        }
    }

    @Override // com.daaw.AbstractC9330wV1
    public final boolean x(String str, String[] strArr, C7092oV1 c7092oV1) {
        this.F = str;
        this.I = c7092oV1;
        String strA = A(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.E.w(uriArr, this.C);
            FU1 fu1 = (FU1) this.D.get();
            if (fu1 != null) {
                fu1.i(strA, this);
            }
            this.J = com.google.android.gms.ads.internal.zzt.zzB().a();
            this.K = -1L;
            C(0L);
            return true;
        } catch (Exception e) {
            AbstractC4274eT1.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzt.zzo().t(e, "VideoStreamExoPlayerCache.preload");
            i();
            m(str, strA, "error", B("error", e));
            return false;
        }
    }

    public final AbstractC7646qU1 y() {
        synchronized (this) {
            this.H = true;
            notify();
        }
        this.E.C(null);
        AbstractC7646qU1 abstractC7646qU1 = this.E;
        this.E = null;
        return abstractC7646qU1;
    }

    public final /* synthetic */ void z() {
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j;
        long j2;
        long j3;
        String strA = A(this.F);
        try {
            jLongValue = ((Long) zzba.zzc().b(AbstractC9820yE1.x)).longValue() * 1000;
            jIntValue = ((Integer) zzba.zzc().b(AbstractC9820yE1.w)).intValue();
            zBooleanValue = ((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue();
        } catch (Exception e) {
            AbstractC4274eT1.zzj("Failed to preload url " + this.F + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzt.zzo().t(e, "VideoStreamExoPlayerCache.preload");
            i();
            m(this.F, strA, "error", B("error", e));
        }
        synchronized (this) {
            try {
                if (com.google.android.gms.ads.internal.zzt.zzB().a() - this.J > jLongValue) {
                    throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                }
                if (this.G) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.H) {
                    if (!this.E.M()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jV = this.E.V();
                    if (jV > 0) {
                        long jR = this.E.R();
                        if (jR != this.K) {
                            j = jIntValue;
                            j2 = jV;
                            j3 = jR;
                            q(this.F, strA, j3, j2, jR > 0, zBooleanValue ? this.E.r() : -1L, zBooleanValue ? this.E.T() : -1L, zBooleanValue ? this.E.s() : -1L, AbstractC7646qU1.O(), AbstractC7646qU1.Q());
                            this.K = j3;
                        } else {
                            j = jIntValue;
                            j2 = jV;
                            j3 = jR;
                        }
                        if (j3 >= j2) {
                            o(this.F, strA, j2);
                        } else if (this.E.S() >= j && j3 > 0) {
                        }
                    }
                    C(((Long) zzba.zzc().b(AbstractC9820yE1.y)).longValue());
                    return;
                }
                com.google.android.gms.ads.internal.zzt.zzy().p(this.I);
            } finally {
            }
        }
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void zzv() {
        AbstractC4274eT1.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void b(int i) {
    }

    @Override // com.daaw.InterfaceC7367pU1
    public final void h(int i, int i2) {
    }
}
