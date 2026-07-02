package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.uQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC8745uQ1 extends AbstractBinderC6674mz1 implements InterfaceC9031vQ1 {
    public AbstractBinderC8745uQ1() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC7351pQ1 c6793nQ1;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c6793nQ1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c6793nQ1 = iInterfaceQueryLocalInterface instanceof InterfaceC7351pQ1 ? (InterfaceC7351pQ1) iInterfaceQueryLocalInterface : new C6793nQ1(strongBinder);
                }
                AbstractC6953nz1.c(parcel);
                e1(c6793nQ1);
                break;
            case 4:
                int i3 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                g(i3);
                break;
            case 5:
                zze zzeVar = (zze) AbstractC6953nz1.a(parcel, zze.CREATOR);
                AbstractC6953nz1.c(parcel);
                o2(zzeVar);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
