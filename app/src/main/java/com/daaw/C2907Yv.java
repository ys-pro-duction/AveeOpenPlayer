package com.daaw;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2907Yv {
    public final Uri a;
    public final byte[] b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public C2907Yv(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public boolean a(int i) {
        return (this.g & i) == i;
    }

    public C2907Yv b(long j) {
        long j2 = this.e;
        return c(j, j2 != -1 ? j2 - j : -1L);
    }

    public C2907Yv c(long j, long j2) {
        return (j == 0 && this.e == j2) ? this : new C2907Yv(this.a, this.b, this.c + j, this.d + j, j2, this.f, this.g);
    }

    public String toString() {
        return "DataSpec[" + this.a + ", " + Arrays.toString(this.b) + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + "]";
    }

    public C2907Yv(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C2907Yv(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C2907Yv(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C2907Yv(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        AbstractC7115ob.a(j >= 0);
        AbstractC7115ob.a(j2 >= 0);
        AbstractC7115ob.a(j3 > 0 || j3 == -1);
        this.a = uri;
        this.b = bArr;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }
}
