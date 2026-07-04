package com.daaw;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VM1 extends AbstractBinderC6674mz1 implements WM1 {
    public VM1() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            String string = parcel.readString();
            AbstractC6953nz1.c(parcel);
            a(string);
        } else {
            if (i != 4) {
                return false;
            }
            zze zzeVar = (zze) AbstractC6953nz1.a(parcel, zze.CREATOR);
            AbstractC6953nz1.c(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
