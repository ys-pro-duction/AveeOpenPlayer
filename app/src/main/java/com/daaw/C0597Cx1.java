package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.daaw.AbstractBinderC9828yG1;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzez;

/* JADX INFO: renamed from: com.daaw.Cx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0597Cx1 extends SA1 {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ zzaw e;

    public C0597Cx1(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.e = zzawVar;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = context;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.d, "native_ad_view_delegate");
        return new zzez();
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzi(BinderC7744qp0.Z2(this.b), BinderC7744qp0.Z2(this.c));
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        AbstractC9820yE1.a(this.d);
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Q9)).booleanValue()) {
            zzaw zzawVar = this.e;
            return zzawVar.d.c(this.d, this.b, this.c);
        }
        try {
            return AbstractBinderC8991vG1.zzbE(((InterfaceC10107zG1) AbstractC5400iT1.b(this.d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new InterfaceC4842gT1() { // from class: com.google.android.gms.ads.internal.client.zzar
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.InterfaceC4842gT1
                public final Object zza(Object obj) {
                    return AbstractBinderC9828yG1.Z2(obj);
                }
            })).a1(BinderC7744qp0.Z2(this.d), BinderC7744qp0.Z2(this.b), BinderC7744qp0.Z2(this.c), 233702000));
        } catch (RemoteException | C5121hT1 | NullPointerException e) {
            this.e.h = RO1.c(this.d);
            this.e.h.a(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
