package com.daaw;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.c10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3595c10 {
    public static final byte[] a;
    public static final ByteBuffer b;

    /* JADX INFO: renamed from: com.daaw.c10$a */
    public interface a {
        int b();
    }

    /* JADX INFO: renamed from: com.daaw.c10$b */
    public interface b {
        a a(int i);
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return AbstractC3750cb1.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
