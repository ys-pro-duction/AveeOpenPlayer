package com.daaw;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: renamed from: com.daaw.oo2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC7183oo2 extends AbstractBinderC8462tP1 {
    public final /* synthetic */ AbstractC7462po2 B;

    public BinderC7183oo2(AbstractC7462po2 abstractC7462po2) {
        this.B = abstractC7462po2;
    }

    @Override // com.daaw.InterfaceC8741uP1
    public final void A(ParcelFileDescriptor parcelFileDescriptor) {
        this.B.a.b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.daaw.InterfaceC8741uP1
    public final void v(zzbb zzbbVar) {
        this.B.a.c(zzbbVar.zza());
    }
}
