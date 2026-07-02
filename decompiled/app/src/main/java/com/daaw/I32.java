package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes3.dex */
public final class I32 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;

    public I32(InterfaceC8394t83 interfaceC8394t83) {
        this.a = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z = true;
        if (((I62) this.a).a().a() == null) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.v5)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
