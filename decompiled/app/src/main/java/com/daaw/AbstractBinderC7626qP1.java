package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzbuo;

/* JADX INFO: renamed from: com.daaw.qP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC7626qP1 extends AbstractBinderC6674mz1 implements InterfaceC7904rP1 {
    public AbstractBinderC7626qP1() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC8741uP1 c8183sP1 = null;
        if (i == 1) {
            zzbuk zzbukVar = (zzbuk) AbstractC6953nz1.a(parcel, zzbuk.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                c8183sP1 = iInterfaceQueryLocalInterface instanceof InterfaceC8741uP1 ? (InterfaceC8741uP1) iInterfaceQueryLocalInterface : new C8183sP1(strongBinder);
            }
            AbstractC6953nz1.c(parcel);
            c1(zzbukVar, c8183sP1);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof InterfaceC8741uP1) {
                }
            }
            AbstractC6953nz1.c(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbuo zzbuoVar = (zzbuo) AbstractC6953nz1.a(parcel, zzbuo.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                c8183sP1 = iInterfaceQueryLocalInterface3 instanceof InterfaceC8741uP1 ? (InterfaceC8741uP1) iInterfaceQueryLocalInterface3 : new C8183sP1(strongBinder3);
            }
            AbstractC6953nz1.c(parcel);
            e2(zzbuoVar, c8183sP1);
        }
        parcel2.writeNoException();
        return true;
    }
}
