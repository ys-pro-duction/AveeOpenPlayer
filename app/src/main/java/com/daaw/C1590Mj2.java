package com.daaw;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Mj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1590Mj2 extends AbstractC1902Pj2 {
    public final C8714uI2 l;

    public C1590Mj2(Executor executor, C5680jT1 c5680jT1, C8714uI2 c8714uI2, C9279wI2 c9279wI2, Context context) {
        super(executor, c5680jT1, c9279wI2, context);
        this.l = c8714uI2;
        c8714uI2.a(this.b);
    }

    public final Map g() {
        return new HashMap(this.b);
    }
}
