package com.daaw;

import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.rE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7859rE0 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public C7859rE0(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public C7859rE0 a(C7859rE0 c7859rE0, String str) {
        String strC = c(str);
        C7859rE0 c7859rE02 = null;
        if (c7859rE0 != null && strC.equals(c7859rE0.c(str))) {
            long j = this.b;
            if (j != -1) {
                long j2 = this.a;
                if (j2 + j == c7859rE0.a) {
                    long j3 = c7859rE0.b;
                    return new C7859rE0(strC, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = c7859rE0.b;
            if (j4 != -1) {
                long j5 = c7859rE0.a;
                if (j5 + j4 == this.a) {
                    c7859rE02 = new C7859rE0(strC, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return c7859rE02;
    }

    public Uri b(String str) {
        return AbstractC0401Ba1.d(str, this.c);
    }

    public String c(String str) {
        return AbstractC0401Ba1.c(str, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7859rE0.class == obj.getClass()) {
            C7859rE0 c7859rE0 = (C7859rE0) obj;
            if (this.a == c7859rE0.a && this.b == c7859rE0.b && this.c.equals(c7859rE0.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        }
        return this.d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.c + ", start=" + this.a + ", length=" + this.b + ")";
    }
}
