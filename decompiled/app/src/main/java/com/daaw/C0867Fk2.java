package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: renamed from: com.daaw.Fk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0867Fk2 implements InterfaceC6326lk2 {
    public final long a;
    public final C7721qk2 b;
    public final WE2 c;

    public C0867Fk2(long j, Context context, C7721qk2 c7721qk2, AbstractC10175zX1 abstractC10175zX1, String str) {
        this.a = j;
        this.b = c7721qk2;
        YE2 ye2Z = abstractC10175zX1.z();
        ye2Z.a(context);
        ye2Z.zza(str);
        this.c = ye2Z.zzc().zza();
    }

    @Override // com.daaw.InterfaceC6326lk2
    public final void a(zzl zzlVar) {
        try {
            this.c.zzf(zzlVar, new BinderC0659Dk2(this));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.InterfaceC6326lk2
    public final void zzc() {
        try {
            this.c.zzk(new BinderC0763Ek2(this));
            this.c.zzm(BinderC7744qp0.Z2(null));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.InterfaceC6326lk2
    public final void zza() {
    }
}
