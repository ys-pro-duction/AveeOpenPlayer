package com.daaw;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class U93 {
    public final Uri a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public U93(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Ba3 ba3) {
        this.a = uri;
        this.b = "";
        this.c = "";
        this.d = z;
        this.e = z3;
    }

    public final U93 a() {
        return new U93(null, this.a, this.b, this.c, this.d, false, true, false, null);
    }

    public final U93 b() {
        if (this.b.isEmpty()) {
            return new U93(null, this.a, this.b, this.c, true, false, this.e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final AbstractC6556ma3 c(String str, double d) {
        return new O93(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final AbstractC6556ma3 d(String str, long j) {
        return new I93(this, str, Long.valueOf(j), true);
    }

    public final AbstractC6556ma3 e(String str, String str2) {
        return new R93(this, str, str2, true);
    }

    public final AbstractC6556ma3 f(String str, boolean z) {
        return new L93(this, str, Boolean.valueOf(z), true);
    }

    public U93(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
