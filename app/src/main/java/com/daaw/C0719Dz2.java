package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Dz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0719Dz2 implements InterfaceC1447Kz2 {
    public final boolean a;

    public C0719Dz2(TD2 td2) {
        this.a = td2 != null;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 36;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.h(this.a ? new InterfaceC1343Jz2() { // from class: com.daaw.Cz2
            @Override // com.daaw.InterfaceC1343Jz2
            public final void a(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
