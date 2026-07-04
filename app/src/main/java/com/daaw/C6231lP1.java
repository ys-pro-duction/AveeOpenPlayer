package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: renamed from: com.daaw.lP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6231lP1 extends AbstractC6395lz1 implements InterfaceC6789nP1 {
    public C6231lP1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.daaw.InterfaceC6789nP1
    public final void N1(zzbvg zzbvgVar, DP1 dp1) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbvgVar);
        AbstractC6953nz1.f(parcelB, dp1);
        I(4, parcelB);
    }

    @Override // com.daaw.InterfaceC6789nP1
    public final void N2(String str, DP1 dp1) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, dp1);
        I(7, parcelB);
    }

    @Override // com.daaw.InterfaceC6789nP1
    public final void b1(zzbvg zzbvgVar, DP1 dp1) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbvgVar);
        AbstractC6953nz1.f(parcelB, dp1);
        I(6, parcelB);
    }

    @Override // com.daaw.InterfaceC6789nP1
    public final void w1(zzbvg zzbvgVar, DP1 dp1) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbvgVar);
        AbstractC6953nz1.f(parcelB, dp1);
        I(5, parcelB);
    }
}
