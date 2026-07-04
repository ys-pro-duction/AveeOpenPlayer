package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractC6953nz1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzch extends AbstractBinderC6674mz1 implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zze zzeVar = (zze) AbstractC6953nz1.a(parcel, zze.CREATOR);
            AbstractC6953nz1.c(parcel);
            zzd(zzeVar);
        } else if (i == 2) {
            zzf();
        } else if (i == 3) {
            zzc();
        } else if (i == 4) {
            zze();
        } else {
            if (i != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
