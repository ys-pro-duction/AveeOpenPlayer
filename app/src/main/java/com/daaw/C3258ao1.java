package com.daaw;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzdk;

/* JADX INFO: renamed from: com.daaw.ao1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3258ao1 extends SA1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ SL1 c;

    public C3258ao1(zzaw zzawVar, Context context, SL1 sl1) {
        this.b = context;
        this.c = sl1;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "out_of_context_tester");
        return null;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        Context context = this.b;
        InterfaceC7934rX interfaceC7934rXZ2 = BinderC7744qp0.Z2(context);
        AbstractC9820yE1.a(context);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.e9)).booleanValue()) {
            return zzceVar.zzh(interfaceC7934rXZ2, this.c, 233702000);
        }
        return null;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        Context context = this.b;
        InterfaceC7934rX interfaceC7934rXZ2 = BinderC7744qp0.Z2(context);
        AbstractC9820yE1.a(context);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.e9)).booleanValue()) {
            try {
                return ((zzdk) AbstractC5400iT1.b(this.b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new InterfaceC4842gT1() { // from class: com.google.android.gms.ads.internal.client.zzab
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.daaw.InterfaceC4842gT1
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return iInterfaceQueryLocalInterface instanceof zzdk ? (zzdk) iInterfaceQueryLocalInterface : new zzdk(obj);
                    }
                })).zze(interfaceC7934rXZ2, this.c, 233702000);
            } catch (RemoteException | C5121hT1 | NullPointerException e) {
                RO1.c(this.b).a(e, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }
}
