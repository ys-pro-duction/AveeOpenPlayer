package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Lx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1542Lx2 implements InterfaceC1343Jz2 {
    public final String a;
    public final String b;
    public final Bundle c;

    public /* synthetic */ C1542Lx2(String str, String str2, Bundle bundle, AbstractC1439Kx2 abstractC1439Kx2) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.a);
        bundle.putString("fc_consent", this.b);
        bundle.putBundle("iab_consent_info", this.c);
    }
}
