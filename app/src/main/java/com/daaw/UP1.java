package com.daaw;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UP1 extends AbstractBinderC6674mz1 implements VP1 {
    public UP1() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else {
            if (i != 2) {
                return false;
            }
            int iZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(iZzb);
        }
        return true;
    }
}
