package com.daaw;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.v62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8948v62 {
    public final Context a;
    public final FF2 b;
    public final Bundle c;
    public final C9546xF2 d;
    public final C6710n62 e;
    public final C3553br2 f;

    public /* synthetic */ C8948v62(C8383t62 c8383t62, AbstractC8662u62 abstractC8662u62) {
        this.a = c8383t62.a;
        this.b = c8383t62.b;
        this.c = c8383t62.c;
        this.d = c8383t62.d;
        this.e = c8383t62.e;
        this.f = c8383t62.f;
    }

    public final Context a(Context context) {
        return this.a;
    }

    public final Bundle b() {
        return this.c;
    }

    public final C6710n62 c() {
        return this.e;
    }

    public final C8383t62 d() {
        C8383t62 c8383t62 = new C8383t62();
        c8383t62.e(this.a);
        c8383t62.i(this.b);
        c8383t62.f(this.c);
        c8383t62.g(this.e);
        c8383t62.d(this.f);
        return c8383t62;
    }

    public final C3553br2 e(String str) {
        C3553br2 c3553br2 = this.f;
        return c3553br2 != null ? c3553br2 : new C3553br2(str);
    }

    public final C9546xF2 f() {
        return this.d;
    }

    public final FF2 g() {
        return this.b;
    }
}
