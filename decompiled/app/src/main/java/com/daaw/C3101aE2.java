package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.aE2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3101aE2 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC1223Iv2 a;
    public final /* synthetic */ TI2 b;
    public final /* synthetic */ EI2 c;
    public final /* synthetic */ AbstractC1978Qc2 d;
    public final /* synthetic */ C3380bE2 e;

    public C3101aE2(C3380bE2 c3380bE2, InterfaceC1223Iv2 interfaceC1223Iv2, TI2 ti2, EI2 ei2, AbstractC1978Qc2 abstractC1978Qc2) {
        this.e = c3380bE2;
        this.a = interfaceC1223Iv2;
        this.b = ti2;
        this.c = ei2;
        this.d = abstractC1978Qc2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        TI2 ti2;
        C5719jc2 c5719jc2 = (C5719jc2) obj;
        synchronized (this.e) {
            try {
                this.e.i = null;
                AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.W7;
                if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
                    H92 h92E = c5719jc2.e();
                    h92E.a(this.e.d);
                    h92E.d(this.e.e);
                }
                this.a.a(c5719jc2);
                if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
                    this.e.b.execute(new Runnable() { // from class: com.daaw.YD2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.B.e.d.zzr();
                        }
                    });
                    this.e.b.execute(new Runnable() { // from class: com.daaw.ZD2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.B.e.e.zzr();
                        }
                    });
                }
                if (!((Boolean) AbstractC7307pF1.c.e()).booleanValue() || (ti2 = this.b) == null) {
                    WI2 wi2 = this.e.g;
                    EI2 ei2 = this.c;
                    ei2.c(c5719jc2.g().b);
                    ei2.l(c5719jc2.c().zzg());
                    ei2.zzf(true);
                    wi2.b(ei2.zzl());
                } else {
                    ti2.f(c5719jc2.g().b);
                    ti2.e(c5719jc2.c().zzg());
                    EI2 ei22 = this.c;
                    ei22.zzf(true);
                    ti2.a(ei22);
                    ti2.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        TI2 ti2;
        final zze zzeVarA = this.d.a().a(th);
        synchronized (this.e) {
            try {
                this.e.i = null;
                this.d.b().P(zzeVarA);
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.W7)).booleanValue()) {
                    this.e.b.execute(new Runnable() { // from class: com.daaw.WD2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.B.e.d.P(zzeVarA);
                        }
                    });
                    this.e.b.execute(new Runnable() { // from class: com.daaw.XD2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.B.e.e.P(zzeVarA);
                        }
                    });
                }
                AbstractC4223eG2.b(zzeVarA.zza, th, "InterstitialAdLoader.onFailure");
                this.a.zza();
                if (!((Boolean) AbstractC7307pF1.c.e()).booleanValue() || (ti2 = this.b) == null) {
                    WI2 wi2 = this.e.g;
                    EI2 ei2 = this.c;
                    ei2.d(zzeVarA);
                    ei2.e(th);
                    ei2.zzf(false);
                    wi2.b(ei2.zzl());
                } else {
                    ti2.c(zzeVarA);
                    EI2 ei22 = this.c;
                    ei22.e(th);
                    ei22.zzf(false);
                    ti2.a(ei22);
                    ti2.g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
