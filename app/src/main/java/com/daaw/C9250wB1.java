package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.daaw.wB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9250wB1 {
    public InterfaceC7790qz1 a;
    public boolean b;
    public final ExecutorService c;

    public C9250wB1() {
        this.c = TS1.b;
    }

    public C9250wB1(final Context context) {
        ExecutorService executorService = TS1.b;
        this.c = executorService;
        executorService.execute(new Runnable() { // from class: com.daaw.nB1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) zzba.zzc().b(AbstractC9820yE1.M4)).booleanValue();
                C9250wB1 c9250wB1 = this.B;
                Context context2 = context;
                if (zBooleanValue) {
                    try {
                        c9250wB1.a = (InterfaceC7790qz1) AbstractC5400iT1.b(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new InterfaceC4842gT1() { // from class: com.daaw.oB1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.daaw.InterfaceC4842gT1
                            public final Object zza(Object obj) {
                                return AbstractBinderC7511pz1.Z2(obj);
                            }
                        });
                        c9250wB1.a.S(BinderC7744qp0.Z2(context2), "GMA_SDK");
                        c9250wB1.b = true;
                    } catch (RemoteException | C5121hT1 | NullPointerException unused) {
                        AbstractC4274eT1.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
