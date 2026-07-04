package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes3.dex */
public final class VE2 implements InterfaceC1223Iv2 {
    public final /* synthetic */ WE2 a;

    public VE2(WE2 we2) {
        this.a = we2;
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        synchronized (this.a) {
            try {
                this.a.J = (C10223zh2) obj;
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.n3)).booleanValue()) {
                    ((C10223zh2) obj).j().a = this.a.E;
                }
                this.a.J.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final void zza() {
        synchronized (this.a) {
            this.a.J = null;
        }
    }
}
