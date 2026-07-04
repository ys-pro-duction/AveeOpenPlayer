package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.cC2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3650cC2 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC1223Iv2 a;
    public final /* synthetic */ TI2 b;
    public final /* synthetic */ EI2 c;
    public final /* synthetic */ C4207eC2 d;
    public final /* synthetic */ AbstractC4486fC2 e;

    public C3650cC2(AbstractC4486fC2 abstractC4486fC2, InterfaceC1223Iv2 interfaceC1223Iv2, TI2 ti2, EI2 ei2, C4207eC2 c4207eC2) {
        this.e = abstractC4486fC2;
        this.a = interfaceC1223Iv2;
        this.b = ti2;
        this.c = ei2;
        this.d = c4207eC2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        TI2 ti2;
        AbstractC4448f42 abstractC4448f42 = (AbstractC4448f42) obj;
        synchronized (this.e) {
            try {
                this.e.j = null;
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.V7)).booleanValue()) {
                    abstractC4448f42.e().b(this.e.d);
                }
                this.a.a(abstractC4448f42);
                if (!((Boolean) AbstractC7307pF1.c.e()).booleanValue() || (ti2 = this.b) == null) {
                    WI2 wi2 = this.e.h;
                    EI2 ei2 = this.c;
                    ei2.c(abstractC4448f42.g().b);
                    ei2.l(abstractC4448f42.c().zzg());
                    ei2.zzf(true);
                    wi2.b(ei2.zzl());
                } else {
                    ti2.f(abstractC4448f42.g().b);
                    ti2.e(abstractC4448f42.c().zzg());
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

    /* JADX WARN: Type inference failed for: r0v8, types: [com.daaw.s62, java.lang.Object] */
    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        TI2 ti2;
        F22 f22 = (F22) this.e.e.zzd();
        final zze zzeVarB = f22 == null ? AbstractC5908kG2.b(th, null) : f22.zzb().a(th);
        synchronized (this.e) {
            try {
                this.e.j = null;
                if (f22 != null) {
                    f22.zzc().P(zzeVarB);
                    if (((Boolean) zzba.zzc().b(AbstractC9820yE1.V7)).booleanValue()) {
                        this.e.b.execute(new Runnable() { // from class: com.daaw.bC2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.B.e.d.P(zzeVarB);
                            }
                        });
                    }
                } else {
                    this.e.d.P(zzeVarB);
                    this.e.l(this.d).zzh().zzb().c().zzh();
                }
                AbstractC4223eG2.b(zzeVarB.zza, th, "AppOpenAdLoader.onFailure");
                this.a.zza();
                if (!((Boolean) AbstractC7307pF1.c.e()).booleanValue() || (ti2 = this.b) == null) {
                    WI2 wi2 = this.e.h;
                    EI2 ei2 = this.c;
                    ei2.d(zzeVarB);
                    ei2.e(th);
                    ei2.zzf(false);
                    wi2.b(ei2.zzl());
                } else {
                    ti2.c(zzeVarB);
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
