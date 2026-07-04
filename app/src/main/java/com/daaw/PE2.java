package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class PE2 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC1223Iv2 a;
    public final /* synthetic */ TI2 b;
    public final /* synthetic */ EI2 c;
    public final /* synthetic */ RE2 d;
    public final /* synthetic */ SE2 e;

    public PE2(SE2 se2, InterfaceC1223Iv2 interfaceC1223Iv2, TI2 ti2, EI2 ei2, RE2 re2) {
        this.e = se2;
        this.a = interfaceC1223Iv2;
        this.b = ti2;
        this.c = ei2;
        this.d = re2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        TI2 ti2;
        C10223zh2 c10223zh2 = (C10223zh2) obj;
        synchronized (this.e) {
            try {
                c10223zh2.e().d(this.e.d);
                this.a.a(c10223zh2);
                SE2 se2 = this.e;
                Executor executor = se2.b;
                final FE2 fe2 = se2.d;
                fe2.getClass();
                executor.execute(new Runnable() { // from class: com.daaw.OE2
                    @Override // java.lang.Runnable
                    public final void run() {
                        fe2.zzr();
                    }
                });
                this.e.d.onAdMetadataChanged();
                if (!((Boolean) AbstractC7307pF1.c.e()).booleanValue() || (ti2 = this.b) == null) {
                    WI2 wi2 = this.e.g;
                    EI2 ei2 = this.c;
                    ei2.c(c10223zh2.g().b);
                    ei2.l(c10223zh2.c().zzg());
                    ei2.zzf(true);
                    wi2.b(ei2.zzl());
                } else {
                    ti2.f(c10223zh2.g().b);
                    ti2.e(c10223zh2.c().zzg());
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
        AbstractC1167Ih2 abstractC1167Ih2 = (AbstractC1167Ih2) this.e.e.zzd();
        final zze zzeVarB = abstractC1167Ih2 == null ? AbstractC5908kG2.b(th, null) : abstractC1167Ih2.zzb().a(th);
        synchronized (this.e) {
            try {
                if (abstractC1167Ih2 != null) {
                    abstractC1167Ih2.a().P(zzeVarB);
                    this.e.b.execute(new Runnable() { // from class: com.daaw.KE2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.B.e.d.P(zzeVarB);
                        }
                    });
                } else {
                    this.e.d.P(zzeVarB);
                    this.e.j(this.d).zzh().zzb().c().zzh();
                }
                AbstractC4223eG2.b(zzeVarB.zza, th, "RewardedAdLoader.onFailure");
                this.a.zza();
                if (!((Boolean) AbstractC7307pF1.c.e()).booleanValue() || (ti2 = this.b) == null) {
                    WI2 wi2 = this.e.g;
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
