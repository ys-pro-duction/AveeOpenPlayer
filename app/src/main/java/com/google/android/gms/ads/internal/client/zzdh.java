package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: loaded from: classes.dex */
public final class zzdh extends AbstractC6395lz1 implements zzdj {
    public zzdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX2);
        I(1, parcelB);
    }
}
