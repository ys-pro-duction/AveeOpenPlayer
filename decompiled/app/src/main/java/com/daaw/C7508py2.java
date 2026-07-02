package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.py2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7508py2 implements InterfaceC1343Jz2 {
    public final Bundle a;

    public C7508py2(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleA = RF2.a(bundle, "device");
        bundleA.putBundle("android_mem_info", this.a);
        bundle.putBundle("device", bundleA);
    }
}
