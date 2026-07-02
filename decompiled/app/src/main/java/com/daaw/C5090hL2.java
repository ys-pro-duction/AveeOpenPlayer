package com.daaw;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.daaw.hL2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5090hL2 {
    public final Context a;
    public final Looper b;

    public C5090hL2(Context context, Looper looper) {
        this.a = context;
        this.b = looper;
    }

    public final void a(String str) {
        C9012vL2 c9012vL2M = C9570xL2.M();
        c9012vL2M.n(this.a.getPackageName());
        c9012vL2M.p(2);
        C8168sL2 c8168sL2M = C8447tL2.M();
        c8168sL2M.n(str);
        c8168sL2M.o(2);
        c9012vL2M.o(c8168sL2M);
        new C5369iL2(this.a, this.b, (C9570xL2) c9012vL2M.j()).a();
    }
}
