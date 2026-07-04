package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.daaw.Xw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2810Xw2 implements InterfaceC1343Jz2 {
    public final String a;
    public final int b;

    public C2810Xw2(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.a) || this.b == -1) {
            return;
        }
        Bundle bundleA = RF2.a(bundle, "pii");
        bundle.putBundle("pii", bundleA);
        bundleA.putString("pvid", this.a);
        bundleA.putInt("pvid_s", this.b);
    }
}
