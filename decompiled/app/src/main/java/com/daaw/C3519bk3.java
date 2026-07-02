package com.daaw;

import android.media.metrics.LogSessionId;

/* JADX INFO: renamed from: com.daaw.bk3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3519bk3 {
    public static final C3519bk3 b;
    public final Zj3 a;

    static {
        b = AbstractC9004vJ2.a < 31 ? new C3519bk3() : new C3519bk3(Zj3.b);
    }

    public C3519bk3(Zj3 zj3) {
        this.a = zj3;
    }

    public final LogSessionId a() {
        Zj3 zj3 = this.a;
        zj3.getClass();
        return zj3.a;
    }

    public C3519bk3() {
        AbstractC6048km2.f(AbstractC9004vJ2.a < 31);
        this.a = null;
    }

    public C3519bk3(LogSessionId logSessionId) {
        this.a = new Zj3(logSessionId);
    }
}
