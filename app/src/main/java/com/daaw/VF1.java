package com.daaw;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class VF1 {
    public final Context a;

    public VF1(Context context) {
        this.a = context;
    }

    public final void a(InterfaceC4258eP1 interfaceC4258eP1) {
        try {
            ((WF1) AbstractC5400iT1.b(this.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new InterfaceC4842gT1() { // from class: com.daaw.UF1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.InterfaceC4842gT1
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof WF1 ? (WF1) iInterfaceQueryLocalInterface : new WF1(obj);
                }
            })).a3(interfaceC4258eP1);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (C5121hT1 e2) {
            AbstractC4274eT1.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}
