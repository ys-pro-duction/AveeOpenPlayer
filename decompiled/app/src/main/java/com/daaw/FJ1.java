package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FJ1 extends AbstractBinderC6674mz1 implements GJ1 {
    public FJ1() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC6953nz1.a(parcel, ParcelFileDescriptor.CREATOR);
        AbstractC6953nz1.c(parcel);
        O(parcelFileDescriptor);
        return true;
    }
}
