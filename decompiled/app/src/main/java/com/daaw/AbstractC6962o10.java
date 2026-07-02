package com.daaw;

import com.daaw.C2756Xj0;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.o10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6962o10 {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final AbstractC7688qe b = C2756Xj0.f;

    /* JADX INFO: renamed from: com.daaw.o10$a */
    public interface a extends C2756Xj0.j {
    }

    public static int a(C2756Xj0 c2756Xj0) {
        return c2756Xj0.h();
    }

    public static C2756Xj0.g b(String str, a aVar) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return C2756Xj0.g.g(str, z, aVar);
    }

    public static C2756Xj0 c(byte[]... bArr) {
        return new C2756Xj0(bArr);
    }

    public static byte[][] d(C2756Xj0 c2756Xj0) {
        return c2756Xj0.q();
    }
}
