package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.mx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6667mx2 implements InterfaceC1343Jz2 {
    public final double a;
    public final boolean b;

    public C6667mx2(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleA = RF2.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = RF2.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.b);
        bundleA2.putDouble("battery_level", this.a);
    }
}
