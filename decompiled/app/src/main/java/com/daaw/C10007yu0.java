package com.daaw;

import android.content.res.Configuration;

/* JADX INFO: renamed from: com.daaw.yu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10007yu0 {
    public final boolean a;
    public Configuration b;

    public C10007yu0(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10007yu0(boolean z, Configuration configuration) {
        this(z);
        G10.g(configuration, "newConfig");
        this.b = configuration;
    }
}
