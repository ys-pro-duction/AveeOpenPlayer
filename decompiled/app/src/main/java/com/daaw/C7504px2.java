package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.px2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7504px2 implements InterfaceC1447Kz2 {
    public final C4779gD2 a;

    public C7504px2(C4779gD2 c4779gD2) {
        this.a = c4779gD2;
    }

    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.a.a());
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 15;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        C4779gD2 c4779gD2 = this.a;
        InterfaceC1343Jz2 interfaceC1343Jz2 = null;
        if (c4779gD2 != null && c4779gD2.a() != null && !c4779gD2.a().isEmpty()) {
            interfaceC1343Jz2 = new InterfaceC1343Jz2() { // from class: com.daaw.ox2
                @Override // com.daaw.InterfaceC1343Jz2
                public final void a(Object obj) {
                    this.a.a((Bundle) obj);
                }
            };
        }
        return AbstractC7360pS2.h(interfaceC1343Jz2);
    }
}
