package com.daaw;

import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.cQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3705cQ1 extends IOException {
    public C3705cQ1(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public C3705cQ1(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
