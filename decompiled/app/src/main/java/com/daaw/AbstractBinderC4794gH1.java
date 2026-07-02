package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbu;

/* JADX INFO: renamed from: com.daaw.gH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4794gH1 extends AbstractBinderC6674mz1 implements InterfaceC5073hH1 {
    public AbstractBinderC4794gH1() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static InterfaceC5073hH1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5073hH1 ? (InterfaceC5073hH1) iInterfaceQueryLocalInterface : new C4505fH1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        zzbu zzbuVarZzac = zzbt.zzac(parcel.readStrongBinder());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
        AbstractC6953nz1.c(parcel);
        L0(zzbuVarZzac, interfaceC7934rXG);
        parcel2.writeNoException();
        return true;
    }
}
