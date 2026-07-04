package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.x41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9495x41 extends L41 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C9495x41(Context context) {
        G10.g(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC8937v41.a());
        G10.f(systemService, "context.getSystemService…opicsManager::class.java)");
        super(AbstractC9216w41.a(systemService));
    }
}
