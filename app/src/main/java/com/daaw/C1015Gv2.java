package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.Gv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1015Gv2 {
    public final C0522Ce2 a;
    public final C8611tv2 b;
    public final U62 c;

    public C1015Gv2(C0522Ce2 c0522Ce2, InterfaceC6483mI2 interfaceC6483mI2) {
        this.a = c0522Ce2;
        final C8611tv2 c8611tv2 = new C8611tv2(interfaceC6483mI2);
        this.b = c8611tv2;
        final InterfaceC6769nK1 interfaceC6769nK1G = c0522Ce2.g();
        this.c = new U62() { // from class: com.daaw.Fv2
            @Override // com.daaw.U62
            public final void P(zze zzeVar) {
                c8611tv2.P(zzeVar);
                InterfaceC6769nK1 interfaceC6769nK1 = interfaceC6769nK1G;
                if (interfaceC6769nK1 != null) {
                    try {
                        interfaceC6769nK1.zzf(zzeVar);
                    } catch (RemoteException e) {
                        AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (interfaceC6769nK1 != null) {
                    try {
                        interfaceC6769nK1.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        AbstractC4274eT1.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final U62 a() {
        return this.c;
    }

    public final J72 b() {
        return this.b;
    }

    public final C6291ld2 c() {
        return new C6291ld2(this.a, this.b.a());
    }

    public final C8611tv2 d() {
        return this.b;
    }

    public final void e(zzbh zzbhVar) {
        this.b.m(zzbhVar);
    }
}
