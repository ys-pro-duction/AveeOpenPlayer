package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.AbstractBinderC9282wJ1;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;

/* JADX INFO: renamed from: com.daaw.sr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8312sr1 extends SA1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ SL1 c;
    public final /* synthetic */ OnH5AdsEventListener d;

    public C8312sr1(zzaw zzawVar, Context context, SL1 sl1, OnH5AdsEventListener onH5AdsEventListener) {
        this.b = context;
        this.c = sl1;
        this.d = onH5AdsEventListener;
    }

    @Override // com.daaw.SA1
    public final /* synthetic */ Object a() {
        return new BJ1();
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzk(BinderC7744qp0.Z2(this.b), this.c, 233702000, new BinderC7044oJ1(this.d));
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((InterfaceC9561xJ1) AbstractC5400iT1.b(this.b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new InterfaceC4842gT1() { // from class: com.google.android.gms.ads.internal.client.zzah
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.InterfaceC4842gT1
                public final Object zza(Object obj) {
                    return AbstractBinderC9282wJ1.Z2(obj);
                }
            })).d1(BinderC7744qp0.Z2(this.b), this.c, 233702000, new BinderC7044oJ1(this.d));
        } catch (RemoteException | C5121hT1 | NullPointerException unused) {
            return null;
        }
    }
}
