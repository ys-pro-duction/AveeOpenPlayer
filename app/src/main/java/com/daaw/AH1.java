package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.daaw.IG0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class AH1 extends IG0 {
    public AH1() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.daaw.IG0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof JG1 ? (JG1) iInterfaceQueryLocalInterface : new DG1(iBinder);
    }

    public final CG1 c(View view, HashMap map, HashMap map2) {
        try {
            IBinder iBinderY = ((JG1) b(view.getContext())).Y(BinderC7744qp0.Z2(view), BinderC7744qp0.Z2(map), BinderC7744qp0.Z2(map2));
            if (iBinderY == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderY.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof CG1 ? (CG1) iInterfaceQueryLocalInterface : new AG1(iBinderY);
        } catch (RemoteException e) {
            e = e;
            AbstractC4274eT1.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (IG0.a e2) {
            e = e2;
            AbstractC4274eT1.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
