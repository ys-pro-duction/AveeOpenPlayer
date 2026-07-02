package com.daaw;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.daaw.c00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3590c00 {
    public static final C3590c00 e = new C3590c00(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX INFO: renamed from: com.daaw.c00$a */
    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public C3590c00(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static C3590c00 a(C3590c00 c3590c00, C3590c00 c3590c002) {
        return b(Math.max(c3590c00.a, c3590c002.a), Math.max(c3590c00.b, c3590c002.b), Math.max(c3590c00.c, c3590c002.c), Math.max(c3590c00.d, c3590c002.d));
    }

    public static C3590c00 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new C3590c00(i, i2, i3, i4);
    }

    public static C3590c00 c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C3590c00 d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3590c00.class != obj.getClass()) {
            return false;
        }
        C3590c00 c3590c00 = (C3590c00) obj;
        return this.d == c3590c00.d && this.a == c3590c00.a && this.c == c3590c00.c && this.b == c3590c00.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
