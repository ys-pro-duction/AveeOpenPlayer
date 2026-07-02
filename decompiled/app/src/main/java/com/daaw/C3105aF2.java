package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.aF2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3105aF2 implements InterfaceC1223Iv2 {
    public final /* synthetic */ BinderC3662cF2 a;

    public C3105aF2(BinderC3662cF2 binderC3662cF2) {
        this.a = binderC3662cF2;
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        synchronized (this.a) {
            try {
                this.a.E = (C10223zh2) obj;
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.n3)).booleanValue()) {
                    ((C10223zh2) obj).j().a = this.a.D;
                }
                this.a.E.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final void zza() {
        synchronized (this.a) {
            this.a.E = null;
        }
    }
}
