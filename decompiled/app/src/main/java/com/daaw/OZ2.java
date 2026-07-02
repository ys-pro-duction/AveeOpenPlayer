package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class OZ2 {
    public final C10160zT2 a;
    public final int b;
    public final String c;
    public final String d;

    public /* synthetic */ OZ2(C10160zT2 c10160zT2, int i, String str, String str2, NZ2 nz2) {
        this.a = c10160zT2;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OZ2)) {
            return false;
        }
        OZ2 oz2 = (OZ2) obj;
        return this.a == oz2.a && this.b == oz2.b && this.c.equals(oz2.c) && this.d.equals(oz2.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.a, Integer.valueOf(this.b), this.c, this.d);
    }
}
