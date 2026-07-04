package com.daaw;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class TC2 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC1223Iv2 a;
    public final /* synthetic */ TI2 b;
    public final /* synthetic */ EI2 c;
    public final /* synthetic */ AbstractC9212w32 d;
    public final /* synthetic */ UC2 e;

    public TC2(UC2 uc2, InterfaceC1223Iv2 interfaceC1223Iv2, TI2 ti2, EI2 ei2, AbstractC9212w32 abstractC9212w32) {
        this.e = uc2;
        this.a = interfaceC1223Iv2;
        this.b = ti2;
        this.c = ei2;
        this.d = abstractC9212w32;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        TI2 ti2;
        V22 v22 = (V22) obj;
        synchronized (this.e) {
            try {
                this.e.l = null;
                this.e.f.removeAllViews();
                if (v22.i() != null) {
                    ViewParent parent = v22.i().getParent();
                    if (parent instanceof ViewGroup) {
                        AbstractC4274eT1.zzj("Banner view provided from " + (v22.c() != null ? v22.c().zzg() : "") + " already has a parent view. Removing its old parent.");
                        ((ViewGroup) parent).removeView(v22.i());
                    }
                }
                AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.U7;
                if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
                    H92 h92E = v22.e();
                    h92E.a(this.e.d);
                    h92E.c(this.e.e);
                }
                this.e.f.addView(v22.i());
                this.a.a(v22);
                if (((Boolean) zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
                    UC2 uc2 = this.e;
                    Executor executor = uc2.b;
                    final C8611tv2 c8611tv2 = uc2.d;
                    c8611tv2.getClass();
                    executor.execute(new Runnable() { // from class: com.daaw.SC2
                        @Override // java.lang.Runnable
                        public final void run() {
                            c8611tv2.zzr();
                        }
                    });
                }
                this.e.h.B0(v22.h());
                if (!((Boolean) AbstractC7307pF1.c.e()).booleanValue() || (ti2 = this.b) == null) {
                    WI2 wi2 = this.e.i;
                    EI2 ei2 = this.c;
                    ei2.c(v22.g().b);
                    ei2.l(v22.c().zzg());
                    ei2.zzf(true);
                    wi2.b(ei2.zzl());
                } else {
                    ti2.f(v22.g().b);
                    ti2.e(v22.c().zzg());
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
        final zze zzeVarA = this.d.d().a(th);
        synchronized (this.e) {
            try {
                this.e.l = null;
                this.d.e().P(zzeVarA);
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U7)).booleanValue()) {
                    this.e.b.execute(new Runnable() { // from class: com.daaw.RC2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.B.e.d.P(zzeVarA);
                        }
                    });
                }
                UC2 uc2 = this.e;
                uc2.h.B0(uc2.j.a());
                AbstractC4223eG2.b(zzeVarA.zza, th, "BannerAdLoader.onFailure");
                this.a.zza();
                if (!((Boolean) AbstractC7307pF1.c.e()).booleanValue() || (ti2 = this.b) == null) {
                    WI2 wi2 = this.e.i;
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
