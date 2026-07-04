package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.hz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5270hz2 implements InterfaceC1343Jz2 {
    public final String a;
    public final Bundle b;

    public C5270hz2(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.a);
        if (this.b.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.b);
    }
}
