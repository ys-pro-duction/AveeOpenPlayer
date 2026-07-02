package com.daaw;

import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.kt3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6093kt3 extends IOException {
    public C6093kt3(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
