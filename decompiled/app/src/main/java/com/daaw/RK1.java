package com.daaw;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class RK1 implements FT1 {
    public final /* synthetic */ C3407bL1 a;
    public final /* synthetic */ EI2 b;
    public final /* synthetic */ C3685cL1 c;

    public RK1(C3685cL1 c3685cL1, C3407bL1 c3407bL1, EI2 ei2) {
        this.c = c3685cL1;
        this.a = c3407bL1;
        this.b = ei2;
    }

    @Override // com.daaw.FT1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        synchronized (this.c.a) {
            try {
                this.c.i = 0;
                C3685cL1 c3685cL1 = this.c;
                if (c3685cL1.h != null && this.a != c3685cL1.h) {
                    zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    this.c.h.g();
                }
                this.c.h = this.a;
                if (((Boolean) AbstractC7307pF1.d.e()).booleanValue()) {
                    C3685cL1 c3685cL12 = this.c;
                    if (c3685cL12.e != null) {
                        WI2 wi2 = c3685cL12.e;
                        EI2 ei2 = this.b;
                        ei2.zzf(true);
                        wi2.b(ei2.zzl());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
