package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Pd3 extends IOException {
    public Pd3(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public Pd3(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
