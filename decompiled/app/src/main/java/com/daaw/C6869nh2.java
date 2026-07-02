package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;

/* JADX INFO: renamed from: com.daaw.nh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6869nh2 extends C2330Tg2 implements InterfaceC1974Qb2 {
    public InterfaceC1974Qb2 G;

    public final synchronized void e(zza zzaVar, LH1 lh1, zzo zzoVar, TH1 th1, zzz zzzVar, InterfaceC1974Qb2 interfaceC1974Qb2) throws Throwable {
        try {
            try {
                super.d(zzaVar, lh1, zzoVar, th1, zzzVar);
                this.G = interfaceC1974Qb2;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final synchronized void i0() {
        InterfaceC1974Qb2 interfaceC1974Qb2 = this.G;
        if (interfaceC1974Qb2 != null) {
            interfaceC1974Qb2.i0();
        }
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final synchronized void zzs() {
        InterfaceC1974Qb2 interfaceC1974Qb2 = this.G;
        if (interfaceC1974Qb2 != null) {
            interfaceC1974Qb2.zzs();
        }
    }
}
