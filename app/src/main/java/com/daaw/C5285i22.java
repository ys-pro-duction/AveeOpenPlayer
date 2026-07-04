package com.daaw;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.i22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5285i22 {
    public final String a;
    public final EL1 b;
    public final Executor c;
    public C6690n22 d;
    public final HI1 e = new C4438f22(this);
    public final HI1 f = new C5006h22(this);

    public C5285i22(String str, EL1 el1, Executor executor) {
        this.a = str;
        this.b = el1;
        this.c = executor;
    }

    public static /* bridge */ /* synthetic */ boolean g(C5285i22 c5285i22, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(c5285i22.a);
    }

    public final void c(C6690n22 c6690n22) {
        this.b.b("/updateActiveView", this.e);
        this.b.b("/untrackActiveViewUnit", this.f);
        this.d = c6690n22;
    }

    public final void d(InterfaceC9334wW1 interfaceC9334wW1) {
        interfaceC9334wW1.C("/updateActiveView", this.e);
        interfaceC9334wW1.C("/untrackActiveViewUnit", this.f);
    }

    public final void e() {
        this.b.c("/updateActiveView", this.e);
        this.b.c("/untrackActiveViewUnit", this.f);
    }

    public final void f(InterfaceC9334wW1 interfaceC9334wW1) {
        interfaceC9334wW1.B("/updateActiveView", this.e);
        interfaceC9334wW1.B("/untrackActiveViewUnit", this.f);
    }
}
