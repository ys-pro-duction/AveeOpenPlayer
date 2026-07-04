package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.Az2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0398Az2 implements InterfaceC1343Jz2 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;

    public C0398Az2(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str2;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzba.zzc().b(AbstractC9820yE1.y3));
        bundle.putInt("target_api", this.e);
        bundle.putInt("dv", this.f);
        bundle.putInt("lv", this.g);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.R5)).booleanValue() && !TextUtils.isEmpty(this.h)) {
            bundle.putString("ev", this.h);
        }
        Bundle bundleA = RF2.a(bundle, "sdk_env");
        bundleA.putBoolean("mf", ((Boolean) BF1.a.e()).booleanValue());
        bundleA.putBoolean("instant_app", this.a);
        bundleA.putBoolean("lite", this.b);
        bundleA.putBoolean("is_privileged_process", this.d);
        bundle.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = RF2.a(bundleA, "build_meta");
        bundleA2.putString("cl", "575948185");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }
}
