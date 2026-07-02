package com.daaw;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: renamed from: com.daaw.Jm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1291Jm2 extends CP1 {
    public final /* synthetic */ AbstractC1395Km2 B;

    public BinderC1291Jm2(AbstractC1395Km2 abstractC1395Km2) {
        this.B = abstractC1395Km2;
    }

    @Override // com.daaw.DP1
    public final void A(ParcelFileDescriptor parcelFileDescriptor) {
        this.B.a.b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.daaw.DP1
    public final void v(zzbb zzbbVar) {
        this.B.a.c(zzbbVar.zza());
    }
}
