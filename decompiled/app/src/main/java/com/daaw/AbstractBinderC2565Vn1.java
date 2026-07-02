package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzk;

/* JADX INFO: renamed from: com.daaw.Vn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2565Vn1 extends GC1 implements InterfaceC5973kX {
    public AbstractBinderC2565Vn1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.daaw.GC1
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC7359pS1.a(parcel, Bundle.CREATOR);
            AbstractC7359pS1.b(parcel);
            k1(i3, strongBinder, bundle);
        } else if (i == 2) {
            int i4 = parcel.readInt();
            Bundle bundle2 = (Bundle) AbstractC7359pS1.a(parcel, Bundle.CREATOR);
            AbstractC7359pS1.b(parcel);
            H0(i4, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) AbstractC7359pS1.a(parcel, zzk.CREATOR);
            AbstractC7359pS1.b(parcel);
            F2(i5, strongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
