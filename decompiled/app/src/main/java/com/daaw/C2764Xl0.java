package com.daaw;

import android.content.res.Configuration;

/* JADX INFO: renamed from: com.daaw.Xl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2764Xl0 {
    public final boolean a;
    public Configuration b;

    public C2764Xl0(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2764Xl0(boolean z, Configuration configuration) {
        this(z);
        G10.g(configuration, "newConfig");
        this.b = configuration;
    }
}
