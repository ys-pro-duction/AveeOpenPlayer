package com.daaw;

import android.os.Parcel;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.daaw.bo2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3538bo2 extends FC1 implements InterfaceC9538xD2 {
    public AbstractBinderC3538bo2() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.daaw.FC1
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        s1((Status) ES1.a(parcel, Status.CREATOR), (zzc) ES1.a(parcel, zzc.CREATOR));
        return true;
    }
}
