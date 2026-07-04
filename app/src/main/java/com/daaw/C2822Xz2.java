package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.daaw.Xz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2822Xz2 implements InterfaceC1343Jz2 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public C2822Xz2(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        RF2.f(bundle, "carrier", this.a, !TextUtils.isEmpty(this.a));
        int i = this.b;
        RF2.e(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.c);
        bundle.putInt("pt", this.d);
        Bundle bundleA = RF2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = RF2.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f);
        bundleA2.putBoolean("active_network_metered", this.e);
    }
}
