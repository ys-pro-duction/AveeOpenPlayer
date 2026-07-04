package com.daaw;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.Tv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2390Tv2 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC1223Iv2 a;
    public final /* synthetic */ TI2 b;
    public final /* synthetic */ EI2 c;
    public final /* synthetic */ AbstractC7686qd2 d;
    public final /* synthetic */ C2494Uv2 e;

    public C2390Tv2(C2494Uv2 c2494Uv2, InterfaceC1223Iv2 interfaceC1223Iv2, TI2 ti2, EI2 ei2, AbstractC7686qd2 abstractC7686qd2) {
        this.e = c2494Uv2;
        this.a = interfaceC1223Iv2;
        this.b = ti2;
        this.c = ei2;
        this.d = abstractC7686qd2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        TI2 ti2;
        AbstractC4448f42 abstractC4448f42 = (AbstractC4448f42) obj;
        synchronized (this.e) {
            try {
                abstractC4448f42.e().a(this.e.d.d());
                this.a.a(abstractC4448f42);
                this.e.b.c().execute(new Runnable() { // from class: com.daaw.Rv2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.B.e.d.b().zzr();
                    }
                });
                if (!((Boolean) AbstractC7307pF1.c.e()).booleanValue() || (ti2 = this.b) == null) {
                    WI2 wi2 = this.e.e;
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

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        TI2 ti2;
        final zze zzeVarA = this.d.a().a(th);
        this.d.b().P(zzeVarA);
        this.e.b.c().execute(new Runnable() { // from class: com.daaw.Sv2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.e.d.a().P(zzeVarA);
            }
        });
        AbstractC4223eG2.b(zzeVarA.zza, th, "NativeAdLoader.onFailure");
        this.a.zza();
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue() && (ti2 = this.b) != null) {
            ti2.c(zzeVarA);
            EI2 ei2 = this.c;
            ei2.e(th);
            ei2.zzf(false);
            ti2.a(ei2);
            ti2.g();
            return;
        }
        C2494Uv2 c2494Uv2 = this.e;
        EI2 ei22 = this.c;
        WI2 wi2 = c2494Uv2.e;
        ei22.d(zzeVarA);
        ei22.e(th);
        ei22.zzf(false);
        wi2.b(ei22.zzl());
    }
}
