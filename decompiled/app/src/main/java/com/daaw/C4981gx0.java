package com.daaw;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.gx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4981gx0 extends CancellationException {
    public C4981gx0(long j) {
        super("Timed out waiting for " + j + " ms");
    }
}
