package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.kT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5960kT2 {
    public final InputStream a;

    public C5960kT2(InputStream inputStream) {
        this.a = inputStream;
    }

    public static C5960kT2 b(byte[] bArr) {
        return new C5960kT2(new ByteArrayInputStream(bArr));
    }

    public final F13 a() throws IOException {
        try {
            return F13.R(this.a, U33.a());
        } finally {
            this.a.close();
        }
    }
}
