package com.daaw;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.bN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3415bN1 extends AbstractBinderC6674mz1 implements InterfaceC3693cN1 {
    public AbstractBinderC3415bN1() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String string = parcel.readString();
            AbstractC6953nz1.c(parcel);
            a(string);
        } else if (i == 2) {
            String string2 = parcel.readString();
            AbstractC6953nz1.c(parcel);
            e(string2);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) AbstractC6953nz1.a(parcel, zze.CREATOR);
            AbstractC6953nz1.c(parcel);
            T(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
