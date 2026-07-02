package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: renamed from: com.daaw.mP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6510mP1 extends AbstractBinderC6674mz1 implements InterfaceC6789nP1 {
    public AbstractBinderC6510mP1() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        DP1 bp1 = null;
        if (i == 1) {
            AbstractC6953nz1.c(parcel);
            parcel2.writeNoException();
            AbstractC6953nz1.e(parcel2, null);
        } else if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof InterfaceC7068oP1) {
                }
            }
            AbstractC6953nz1.c(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbvg zzbvgVar = (zzbvg) AbstractC6953nz1.a(parcel, zzbvg.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                bp1 = iInterfaceQueryLocalInterface2 instanceof DP1 ? (DP1) iInterfaceQueryLocalInterface2 : new BP1(strongBinder2);
            }
            AbstractC6953nz1.c(parcel);
            N1(zzbvgVar, bp1);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbvg zzbvgVar2 = (zzbvg) AbstractC6953nz1.a(parcel, zzbvg.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                bp1 = iInterfaceQueryLocalInterface3 instanceof DP1 ? (DP1) iInterfaceQueryLocalInterface3 : new BP1(strongBinder3);
            }
            AbstractC6953nz1.c(parcel);
            w1(zzbvgVar2, bp1);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbvg zzbvgVar3 = (zzbvg) AbstractC6953nz1.a(parcel, zzbvg.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                bp1 = iInterfaceQueryLocalInterface4 instanceof DP1 ? (DP1) iInterfaceQueryLocalInterface4 : new BP1(strongBinder4);
            }
            AbstractC6953nz1.c(parcel);
            b1(zzbvgVar3, bp1);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                bp1 = iInterfaceQueryLocalInterface5 instanceof DP1 ? (DP1) iInterfaceQueryLocalInterface5 : new BP1(strongBinder5);
            }
            AbstractC6953nz1.c(parcel);
            N2(string, bp1);
            parcel2.writeNoException();
        }
        return true;
    }
}
