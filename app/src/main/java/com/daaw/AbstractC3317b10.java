package com.daaw;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.b10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3317b10 {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");
    public static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final AbstractC9408wm f;

    /* JADX INFO: renamed from: com.daaw.b10$a */
    public interface a {
        int b();
    }

    /* JADX INFO: renamed from: com.daaw.b10$b */
    public interface b {
    }

    /* JADX INFO: renamed from: com.daaw.b10$c */
    public interface c {
        boolean a(int i);
    }

    /* JADX INFO: renamed from: com.daaw.b10$d */
    public interface d extends e {
    }

    /* JADX INFO: renamed from: com.daaw.b10$e */
    public interface e extends List, RandomAccess {
        boolean C();

        void l();

        e n(int i);
    }

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        f = AbstractC9408wm.j(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i, int i2) {
        int iH = h(i2, bArr, i, i2);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return AbstractC3472bb1.s(bArr);
    }

    public static int h(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, b);
    }
}
