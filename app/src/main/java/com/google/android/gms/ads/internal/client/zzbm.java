package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractC6953nz1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbm extends AbstractBinderC6674mz1 implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzl zzlVar = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
            AbstractC6953nz1.c(parcel);
            zzg(zzlVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            ClassLoader classLoader = AbstractC6953nz1.a;
            parcel2.writeInt(zZzi ? 1 : 0);
        } else if (i == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i != 5) {
                return false;
            }
            zzl zzlVar2 = (zzl) AbstractC6953nz1.a(parcel, zzl.CREATOR);
            int i3 = parcel.readInt();
            AbstractC6953nz1.c(parcel);
            zzh(zzlVar2, i3);
            parcel2.writeNoException();
        }
        return true;
    }
}
