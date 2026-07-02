package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class M33 extends IOException {
    public M33(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public M33(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
