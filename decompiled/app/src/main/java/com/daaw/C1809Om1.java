package com.daaw;

import android.app.Activity;
import android.os.RemoteException;
import com.daaw.AbstractBinderC6227lO1;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;

/* JADX INFO: renamed from: com.daaw.Om1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1809Om1 extends SA1 {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ zzaw c;

    public C1809Om1(zzaw zzawVar, Activity activity) {
        this.c = zzawVar;
        this.b = activity;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "ad_overlay");
        return null;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzm(BinderC7744qp0.Z2(this.b));
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        AbstractC9820yE1.a(this.b);
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Q9)).booleanValue()) {
            zzaw zzawVar = this.c;
            return zzawVar.f.c(this.b);
        }
        try {
            return AbstractBinderC5380iO1.zzI(((InterfaceC6506mO1) AbstractC5400iT1.b(this.b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new InterfaceC4842gT1() { // from class: com.google.android.gms.ads.internal.client.zzz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.InterfaceC4842gT1
                public final Object zza(Object obj) {
                    return AbstractBinderC6227lO1.Z2(obj);
                }
            })).zze(BinderC7744qp0.Z2(this.b)));
        } catch (RemoteException | C5121hT1 | NullPointerException e) {
            this.c.h = RO1.c(this.b.getApplicationContext());
            this.c.h.a(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
