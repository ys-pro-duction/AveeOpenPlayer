package com.daaw;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.daaw.lT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6248lT2 {
    public final OutputStream a;

    public C6248lT2(OutputStream outputStream) {
        this.a = outputStream;
    }

    public static C6248lT2 b(OutputStream outputStream) {
        return new C6248lT2(outputStream);
    }

    public final void a(F13 f13) throws IOException {
        try {
            f13.g(this.a);
        } finally {
            this.a.close();
        }
    }
}
