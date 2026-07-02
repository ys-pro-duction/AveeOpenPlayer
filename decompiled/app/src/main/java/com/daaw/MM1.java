package com.daaw;

import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MM1 extends AbstractBinderC6674mz1 implements NM1 {
    public MM1() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            AbstractC6953nz1.c(parcel);
            H(interfaceC7934rXG);
        } else if (i == 2) {
            String string = parcel.readString();
            AbstractC6953nz1.c(parcel);
            a(string);
        } else if (i == 3) {
            zze zzeVar = (zze) AbstractC6953nz1.a(parcel, zze.CREATOR);
            AbstractC6953nz1.c(parcel);
            zzf(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            InterfaceC4525fM1 interfaceC4525fM1Z2 = AbstractBinderC4246eM1.Z2(parcel.readStrongBinder());
            AbstractC6953nz1.c(parcel);
            O2(interfaceC4525fM1Z2);
        }
        parcel2.writeNoException();
        return true;
    }
}
