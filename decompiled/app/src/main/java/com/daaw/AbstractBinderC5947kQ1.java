package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.internal.ads.zzbwi;

/* JADX INFO: renamed from: com.daaw.kQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5947kQ1 extends AbstractBinderC6674mz1 implements InterfaceC6235lQ1 {
    public AbstractBinderC5947kQ1() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static InterfaceC6235lQ1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6235lQ1 ? (InterfaceC6235lQ1) iInterfaceQueryLocalInterface : new C5668jQ1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                u1(interfaceC7934rXG);
                break;
            case 2:
                InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                V0(interfaceC7934rXG2, i3);
                break;
            case 3:
                InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzi(interfaceC7934rXG3);
                break;
            case 4:
                InterfaceC7934rX interfaceC7934rXG4 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zzj(interfaceC7934rXG4);
                break;
            case 5:
                InterfaceC7934rX interfaceC7934rXG5 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                W2(interfaceC7934rXG5);
                break;
            case 6:
                InterfaceC7934rX interfaceC7934rXG6 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                E(interfaceC7934rXG6);
                break;
            case 7:
                InterfaceC7934rX interfaceC7934rXG7 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzbwi zzbwiVar = (zzbwi) AbstractC6953nz1.a(parcel, zzbwi.CREATOR);
                AbstractC6953nz1.c(parcel);
                l1(interfaceC7934rXG7, zzbwiVar);
                break;
            case 8:
                InterfaceC7934rX interfaceC7934rXG8 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                zze(interfaceC7934rXG8);
                break;
            case 9:
                InterfaceC7934rX interfaceC7934rXG9 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                zzg(interfaceC7934rXG9, i4);
                break;
            case 10:
                InterfaceC7934rX interfaceC7934rXG10 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                N(interfaceC7934rXG10);
                break;
            case 11:
                InterfaceC7934rX interfaceC7934rXG11 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC6953nz1.c(parcel);
                s2(interfaceC7934rXG11);
                break;
            case 12:
                AbstractC6953nz1.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
