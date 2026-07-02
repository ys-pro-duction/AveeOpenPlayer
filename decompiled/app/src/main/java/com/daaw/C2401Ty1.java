package com.daaw;

import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ty1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2401Ty1 implements InterfaceC1637Mv1 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C2401Ty1;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 m(String str, ES2 es2, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final InterfaceC1637Mv1 zzd() {
        return InterfaceC1637Mv1.t;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final String zzi() {
        return AdError.UNDEFINED_DOMAIN;
    }

    @Override // com.daaw.InterfaceC1637Mv1
    public final Iterator zzl() {
        return null;
    }
}
