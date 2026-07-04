package com.daaw;

/* JADX INFO: renamed from: com.daaw.hl3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5206hl3 extends Exception {
    public C5206hl3(long j, long j2) {
        super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
    }
}
