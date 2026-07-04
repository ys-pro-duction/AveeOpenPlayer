package com.daaw;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.daaw.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4619fg {
    public final int a;
    public final AbstractC4340ei b;
    public final int c;
    public final MessageDigest d;

    /* JADX INFO: renamed from: com.daaw.fg$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public C4619fg(AbstractC4340ei abstractC4340ei, int i, int i2) {
        if (i < 0 || i >= 8) {
            throw new IllegalArgumentException("Invalid padding: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i2);
        }
        if (abstractC4340ei.size() > 0 && i2 == 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i2);
        }
        if (abstractC4340ei.size() == 0 && i != 0) {
            throw new IllegalArgumentException("Expected padding of 0 when bitmap length is 0, but got " + i);
        }
        this.b = abstractC4340ei;
        this.c = i2;
        this.a = (abstractC4340ei.size() * 8) - i;
        this.d = b();
    }

    public static C4619fg a(AbstractC4340ei abstractC4340ei, int i, int i2) throws a {
        if (i < 0 || i >= 8) {
            throw new a("Invalid padding: " + i);
        }
        if (i2 < 0) {
            throw new a("Invalid hash count: " + i2);
        }
        if (abstractC4340ei.size() > 0 && i2 == 0) {
            throw new a("Invalid hash count: " + i2);
        }
        if (abstractC4340ei.size() != 0 || i == 0) {
            return new C4619fg(abstractC4340ei, i, i2);
        }
        throw new a("Expected padding of 0 when bitmap length is 0, but got " + i);
    }

    public static MessageDigest b() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e);
        }
    }

    public static long e(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            j |= (((long) bArr[i + i2]) & 255) << (i2 * 8);
        }
        return j;
    }

    public static long i(long j, long j2) {
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (j3 < j2) {
            j2 = 0;
        }
        return j3 - j2;
    }

    public int c() {
        return this.a;
    }

    public final int d(long j, long j2, int i) {
        return (int) i(j + (j2 * ((long) i)), this.a);
    }

    public final boolean f(int i) {
        return ((1 << (i % 8)) & this.b.w(i / 8)) != 0;
    }

    public final byte[] g(String str) {
        return this.d.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    public boolean h(String str) {
        if (this.a == 0) {
            return false;
        }
        byte[] bArrG = g(str);
        if (bArrG.length != 16) {
            throw new RuntimeException("Invalid md5 hash array length: " + bArrG.length + " (expected 16)");
        }
        long jE = e(bArrG, 0);
        long jE2 = e(bArrG, 8);
        for (int i = 0; i < this.c; i++) {
            if (!f(d(jE, jE2, i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BloomFilter{hashCount=" + this.c + ", size=" + this.a + ", bitmap=\"" + Base64.encodeToString(this.b.W(), 2) + "\"}";
    }
}
