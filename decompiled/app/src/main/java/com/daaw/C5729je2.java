package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.je2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5729je2 implements InterfaceC9191vz1 {
    public final /* synthetic */ String B;
    public final /* synthetic */ C6575me2 C;

    public C5729je2(C6575me2 c6575me2, String str) {
        this.C = c6575me2;
        this.B = str;
    }

    @Override // com.daaw.InterfaceC9191vz1
    public final void b0(C8912uz1 c8912uz1) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.H1)).booleanValue()) {
            if (c8912uz1.j) {
                C6575me2 c6575me2 = this.C;
                c6575me2.D.put(this.B, Boolean.TRUE);
                C6575me2 c6575me22 = this.C;
                c6575me22.d0(c6575me22.t.zzf(), this.C.t.zzl(), this.C.t.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c8912uz1.j) {
                    C6575me2 c6575me23 = this.C;
                    if (c6575me23.t == null) {
                        return;
                    }
                    c6575me23.D.put(this.B, Boolean.TRUE);
                    C6575me2 c6575me24 = this.C;
                    c6575me24.d0(c6575me24.t.zzf(), this.C.t.zzl(), this.C.t.zzm(), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
