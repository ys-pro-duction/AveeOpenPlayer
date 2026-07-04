package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;

/* JADX INFO: renamed from: com.daaw.ip1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5502ip1 extends AbstractC7451pm1 implements InterfaceC4382eq1 {
    public C5502ip1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.daaw.InterfaceC4382eq1
    public final boolean F1(zzs zzsVar, InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelG = G();
        AbstractC7359pS1.c(parcelG, zzsVar);
        AbstractC7359pS1.d(parcelG, interfaceC7934rX);
        Parcel parcelB = B(5, parcelG);
        boolean zE = AbstractC7359pS1.e(parcelB);
        parcelB.recycle();
        return zE;
    }

    @Override // com.daaw.InterfaceC4382eq1
    public final zzq Z0(zzo zzoVar) {
        Parcel parcelG = G();
        AbstractC7359pS1.c(parcelG, zzoVar);
        Parcel parcelB = B(6, parcelG);
        zzq zzqVar = (zzq) AbstractC7359pS1.a(parcelB, zzq.CREATOR);
        parcelB.recycle();
        return zzqVar;
    }

    @Override // com.daaw.InterfaceC4382eq1
    public final zzq p1(zzo zzoVar) {
        Parcel parcelG = G();
        AbstractC7359pS1.c(parcelG, zzoVar);
        Parcel parcelB = B(8, parcelG);
        zzq zzqVar = (zzq) AbstractC7359pS1.a(parcelB, zzq.CREATOR);
        parcelB.recycle();
        return zzqVar;
    }

    @Override // com.daaw.InterfaceC4382eq1
    public final boolean zzi() {
        Parcel parcelB = B(7, G());
        boolean zE = AbstractC7359pS1.e(parcelB);
        parcelB.recycle();
        return zE;
    }
}
