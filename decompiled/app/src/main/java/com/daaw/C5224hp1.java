package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.daaw.AbstractBinderC3713cS1;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;

/* JADX INFO: renamed from: com.daaw.hp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5224hp1 extends SA1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ SL1 c;

    public C5224hp1(zzaw zzawVar, Context context, SL1 sl1) {
        this.b = context;
        this.c = sl1;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzp(BinderC7744qp0.Z2(this.b), this.c, 233702000);
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((InterfaceC3992dS1) AbstractC5400iT1.b(this.b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new InterfaceC4842gT1() { // from class: com.google.android.gms.ads.internal.client.zzad
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.InterfaceC4842gT1
                public final Object zza(Object obj) {
                    return AbstractBinderC3713cS1.Z2(obj);
                }
            })).w(BinderC7744qp0.Z2(this.b), this.c, 233702000);
        } catch (RemoteException | C5121hT1 | NullPointerException unused) {
            return null;
        }
    }
}
