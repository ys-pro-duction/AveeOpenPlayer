package com.daaw;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class SK1 implements DT1 {
    public final /* synthetic */ C3407bL1 a;
    public final /* synthetic */ EI2 b;
    public final /* synthetic */ C3685cL1 c;

    public SK1(C3685cL1 c3685cL1, C3407bL1 c3407bL1, EI2 ei2) {
        this.c = c3685cL1;
        this.a = c3407bL1;
        this.b = ei2;
    }

    @Override // com.daaw.DT1
    public final void zza() {
        synchronized (this.c.a) {
            try {
                this.c.i = 1;
                zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.a.g();
                if (((Boolean) AbstractC7307pF1.d.e()).booleanValue()) {
                    C3685cL1 c3685cL1 = this.c;
                    if (c3685cL1.e != null) {
                        WI2 wi2 = c3685cL1.e;
                        EI2 ei2 = this.b;
                        ei2.o("Failed loading new engine");
                        ei2.zzf(false);
                        wi2.b(ei2.zzl());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
