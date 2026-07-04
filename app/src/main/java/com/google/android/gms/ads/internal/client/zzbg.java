package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractC6953nz1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbg extends AbstractBinderC6674mz1 implements zzbh {
    public zzbg() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zzd();
                break;
            case 2:
                int i3 = parcel.readInt();
                AbstractC6953nz1.c(parcel);
                zze(i3);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case 5:
                zzj();
                break;
            case 6:
                zzc();
                break;
            case 7:
                zzg();
                break;
            case 8:
                zze zzeVar = (zze) AbstractC6953nz1.a(parcel, zze.CREATOR);
                AbstractC6953nz1.c(parcel);
                zzf(zzeVar);
                break;
            case 9:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
