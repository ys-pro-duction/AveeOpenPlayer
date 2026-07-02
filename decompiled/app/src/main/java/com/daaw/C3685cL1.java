package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzcc;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.cL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3685cL1 {
    public final Context b;
    public final String c;
    public final zzcaz d;
    public final WI2 e;
    public final zzbd f;
    public final zzbd g;
    public C3407bL1 h;
    public final Object a = new Object();
    public int i = 1;

    public C3685cL1(Context context, zzcaz zzcazVar, String str, zzbd zzbdVar, zzbd zzbdVar2, WI2 wi2) {
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = zzcazVar;
        this.e = wi2;
        this.f = zzbdVar;
        this.g = zzbdVar2;
    }

    public final WK1 b(C7782qx1 c7782qx1) {
        synchronized (this.a) {
            try {
                synchronized (this.a) {
                    try {
                        C3407bL1 c3407bL1 = this.h;
                        if (c3407bL1 != null && this.i == 0) {
                            c3407bL1.e(new FT1() { // from class: com.daaw.EK1
                                @Override // com.daaw.FT1
                                public final void zza(Object obj) {
                                    this.a.k((InterfaceC8442tK1) obj);
                                }
                            }, new DT1() { // from class: com.daaw.FK1
                                @Override // com.daaw.DT1
                                public final void zza() {
                                }
                            });
                        }
                    } finally {
                    }
                }
                C3407bL1 c3407bL12 = this.h;
                if (c3407bL12 != null && c3407bL12.a() != -1) {
                    int i = this.i;
                    if (i == 0) {
                        return this.h.f();
                    }
                    if (i != 1) {
                        return this.h.f();
                    }
                    this.i = 2;
                    d(null);
                    return this.h.f();
                }
                this.i = 2;
                C3407bL1 c3407bL1D = d(null);
                this.h = c3407bL1D;
                return c3407bL1D.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C3407bL1 d(C7782qx1 c7782qx1) {
        EI2 ei2A = DI2.a(this.b, 6);
        ei2A.zzh();
        final C3407bL1 c3407bL1 = new C3407bL1(this.g);
        final C7782qx1 c7782qx12 = null;
        AbstractC9322wT1.e.execute(new Runnable(c7782qx12, c3407bL1) { // from class: com.daaw.IK1
            public final /* synthetic */ C3407bL1 C;

            {
                this.C = c3407bL1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.B.j(null, this.C);
            }
        });
        c3407bL1.e(new RK1(this, c3407bL1, ei2A), new SK1(this, c3407bL1, ei2A));
        return c3407bL1;
    }

    public final /* synthetic */ void i(C3407bL1 c3407bL1, final InterfaceC8442tK1 interfaceC8442tK1, ArrayList arrayList, long j) {
        synchronized (this.a) {
            try {
                if (c3407bL1.a() != -1 && c3407bL1.a() != 1) {
                    c3407bL1.c();
                    AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.GK1
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC8442tK1.zzc();
                        }
                    });
                    zze.zza("Could not receive /jsLoaded in " + String.valueOf(zzba.zzc().b(AbstractC9820yE1.c)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + c3407bL1.a() + ". Update status(onEngLoadedTimeout) is " + this.i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (zzt.zzB().a() - j) + " ms. Rejecting.");
                }
            } finally {
            }
        }
    }

    public final /* synthetic */ void j(C7782qx1 c7782qx1, C3407bL1 c3407bL1) {
        long jA = zzt.zzB().a();
        ArrayList arrayList = new ArrayList();
        try {
            BK1 bk1 = new BK1(this.b, this.d, null, null);
            bk1.V(new HK1(this, arrayList, jA, c3407bL1, bk1));
            bk1.g0("/jsLoaded", new JK1(this, jA, c3407bL1, bk1));
            zzcc zzccVar = new zzcc();
            KK1 kk1 = new KK1(this, null, bk1, zzccVar);
            zzccVar.zzb(kk1);
            bk1.g0("/requestReload", kk1);
            if (this.c.endsWith(".js")) {
                bk1.zzh(this.c);
            } else if (this.c.startsWith("<html>")) {
                bk1.e(this.c);
            } else {
                bk1.t(this.c);
            }
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new QK1(this, c3407bL1, bk1, arrayList, jA), ((Integer) zzba.zzc().b(AbstractC9820yE1.d)).intValue());
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Error creating webview.", th);
            zzt.zzo().u(th, "SdkJavascriptFactory.loadJavascriptEngine");
            c3407bL1.c();
        }
    }

    public final /* synthetic */ void k(InterfaceC8442tK1 interfaceC8442tK1) {
        if (interfaceC8442tK1.zzi()) {
            this.i = 1;
        }
    }
}
