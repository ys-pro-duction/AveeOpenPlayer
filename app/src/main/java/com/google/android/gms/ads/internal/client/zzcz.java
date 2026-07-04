package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractC6953nz1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcz extends AbstractBinderC6674mz1 implements zzda {
    public zzcz() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        zze zzeVar = (zze) AbstractC6953nz1.a(parcel, zze.CREATOR);
        AbstractC6953nz1.c(parcel);
        zze(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}
