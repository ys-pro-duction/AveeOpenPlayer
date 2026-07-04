package com.daaw;

import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.dP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3980dP1 extends AbstractBinderC6674mz1 implements InterfaceC4258eP1 {
    public AbstractBinderC3980dP1() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
