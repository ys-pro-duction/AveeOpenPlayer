package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Cw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0594Cw2 implements InterfaceC1343Jz2 {
    public final Bundle a;

    public C0594Cw2(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.a.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.a);
    }
}
