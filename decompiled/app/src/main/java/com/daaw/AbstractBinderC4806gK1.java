package com.daaw;

import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.gK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4806gK1 extends AbstractBinderC6674mz1 implements InterfaceC5085hK1 {
    public AbstractBinderC4806gK1() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            AbstractC6953nz1.c(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
