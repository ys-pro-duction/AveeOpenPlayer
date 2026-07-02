package com.daaw;

import com.daaw.C5033h8;

/* JADX INFO: loaded from: classes.dex */
public final class H8 {
    public final int a;
    public final C5033h8 b;
    public final C5033h8.d c;
    public final String d;

    public H8(C5033h8 c5033h8, C5033h8.d dVar, String str) {
        this.b = c5033h8;
        this.c = dVar;
        this.d = str;
        this.a = AbstractC8022rp0.b(c5033h8, dVar, str);
    }

    public static H8 a(C5033h8 c5033h8, C5033h8.d dVar, String str) {
        return new H8(c5033h8, dVar, str);
    }

    public final String b() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H8)) {
            return false;
        }
        H8 h8 = (H8) obj;
        return AbstractC8022rp0.a(this.b, h8.b) && AbstractC8022rp0.a(this.c, h8.c) && AbstractC8022rp0.a(this.d, h8.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
