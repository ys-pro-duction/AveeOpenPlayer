package com.daaw;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SM1 extends AbstractBinderC6674mz1 implements TM1 {
    public SM1() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            InterfaceC6219lM1 interfaceC6219lM1Z2 = AbstractBinderC5931kM1.Z2(parcel.readStrongBinder());
            AbstractC6953nz1.c(parcel);
            F0(interfaceC6219lM1Z2);
        } else if (i == 2) {
            String string = parcel.readString();
            AbstractC6953nz1.c(parcel);
            a(string);
        } else {
            if (i != 3) {
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
