package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.daaw.IG0;

/* JADX INFO: renamed from: com.daaw.zH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10111zH1 extends IG0 {
    public C10111zH1() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.daaw.IG0
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC10107zG1 ? (InterfaceC10107zG1) iInterfaceQueryLocalInterface : new C9549xG1(iBinder);
    }

    public final InterfaceC9270wG1 c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderA1 = ((InterfaceC10107zG1) b(context)).a1(BinderC7744qp0.Z2(context), BinderC7744qp0.Z2(frameLayout), BinderC7744qp0.Z2(frameLayout2), 233702000);
            if (iBinderA1 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderA1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof InterfaceC9270wG1 ? (InterfaceC9270wG1) iInterfaceQueryLocalInterface : new C8705uG1(iBinderA1);
        } catch (RemoteException e) {
            e = e;
            AbstractC4274eT1.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (IG0.a e2) {
            e = e2;
            AbstractC4274eT1.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
