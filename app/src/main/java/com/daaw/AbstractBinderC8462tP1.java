package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: renamed from: com.daaw.tP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC8462tP1 extends AbstractBinderC6674mz1 implements InterfaceC8741uP1 {
    public AbstractBinderC8462tP1() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC6953nz1.a(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC6953nz1.c(parcel);
            A(parcelFileDescriptor);
        } else {
            if (i != 2) {
                return false;
            }
            zzbb zzbbVar = (zzbb) AbstractC6953nz1.a(parcel, zzbb.CREATOR);
            AbstractC6953nz1.c(parcel);
            v(zzbbVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
