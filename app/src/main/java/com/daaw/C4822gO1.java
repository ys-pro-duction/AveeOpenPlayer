package com.daaw;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.daaw.IG0;

/* JADX INFO: renamed from: com.daaw.gO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4822gO1 extends IG0 {
    public C4822gO1() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.daaw.IG0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6506mO1 ? (InterfaceC6506mO1) iInterfaceQueryLocalInterface : new C5939kO1(iBinder);
    }

    public final InterfaceC5660jO1 c(Activity activity) {
        try {
            IBinder iBinderZze = ((InterfaceC6506mO1) b(activity)).zze(BinderC7744qp0.Z2(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof InterfaceC5660jO1 ? (InterfaceC5660jO1) iInterfaceQueryLocalInterface : new C5101hO1(iBinderZze);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (IG0.a e2) {
            AbstractC4274eT1.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
