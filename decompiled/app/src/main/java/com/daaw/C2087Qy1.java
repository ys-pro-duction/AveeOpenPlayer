package com.daaw;

import android.os.RemoteException;
import android.view.View;
import com.daaw.IG1;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfa;
import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.Qy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2087Qy1 extends SA1 {
    public final /* synthetic */ View b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ zzaw e;

    public C2087Qy1(zzaw zzawVar, View view, HashMap map, HashMap map2) {
        this.e = zzawVar;
        this.b = view;
        this.c = map;
        this.d = map2;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        HashMap map = this.d;
        return zzceVar.zzj(BinderC7744qp0.Z2(this.b), BinderC7744qp0.Z2(this.c), BinderC7744qp0.Z2(map));
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        AbstractC9820yE1.a(this.b.getContext());
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Q9)).booleanValue()) {
            zzaw zzawVar = this.e;
            return zzawVar.g.c(this.b, this.c, this.d);
        }
        try {
            return BG1.zze(((JG1) AbstractC5400iT1.b(this.b.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new InterfaceC4842gT1() { // from class: com.google.android.gms.ads.internal.client.zzat
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.InterfaceC4842gT1
                public final Object zza(Object obj) {
                    return IG1.Z2(obj);
                }
            })).Y(BinderC7744qp0.Z2(this.b), BinderC7744qp0.Z2(this.c), BinderC7744qp0.Z2(this.d)));
        } catch (RemoteException | C5121hT1 | NullPointerException e) {
            this.e.h = RO1.c(this.b.getContext());
            this.e.h.a(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
