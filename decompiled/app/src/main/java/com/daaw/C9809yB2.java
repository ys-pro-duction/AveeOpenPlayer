package com.daaw;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzbvg;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9809yB2 {
    public final zzbvg a;
    public final int b;

    public C9809yB2(zzbvg zzbvgVar, int i) {
        this.a = zzbvgVar;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final PackageInfo b() {
        return this.a.G;
    }

    public final String c() {
        return this.a.E;
    }

    public final String d() {
        return BO2.c(this.a.B.getString("ms"));
    }

    public final String e() {
        return this.a.I;
    }

    public final List f() {
        return this.a.F;
    }

    public final boolean g() {
        return this.a.M;
    }

    public final boolean h() {
        return this.a.B.getBoolean("is_gbid");
    }

    public final boolean i() {
        return this.a.L;
    }
}
