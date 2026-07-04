package com.daaw;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.k03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5835k03 {
    public static final /* synthetic */ int j = 0;
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        DM1.b("media3.datasource");
    }

    public final boolean a(int i) {
        return (this.i & i) == i;
    }

    public final String toString() {
        return "DataSpec[GET " + String.valueOf(this.a) + ", " + this.f + ", " + this.g + ", null, " + this.i + "]";
    }

    public C5835k03(Uri uri) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0, null);
    }

    public C5835k03(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i) {
        this(uri, j2 - j3, 1, null, Collections.EMPTY_MAP, j3, j4, null, i, null);
    }

    public C5835k03(Uri uri, long j2, int i, byte[] bArr, Map map, long j3, long j4, String str, int i2, Object obj) {
        long j5 = j2 + j3;
        boolean z = false;
        AbstractC6048km2.d(j5 >= 0);
        AbstractC6048km2.d(j3 >= 0);
        if (j4 > 0) {
            z = true;
        } else if (j4 == -1) {
            j4 = -1;
            z = true;
        }
        AbstractC6048km2.d(z);
        this.a = uri;
        this.b = 1;
        this.c = null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = j3;
        this.e = j5;
        this.g = j4;
        this.h = null;
        this.i = i2;
    }
}
