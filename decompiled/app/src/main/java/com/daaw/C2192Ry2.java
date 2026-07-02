package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Ry2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2192Ry2 implements InterfaceC1343Jz2 {
    public final Bundle a;

    public C2192Ry2(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
