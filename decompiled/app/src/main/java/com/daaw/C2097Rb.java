package com.daaw;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.daaw.Rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2097Rb {
    public static final C2097Rb e = new b().a();
    public final int a;
    public final int b;
    public final int c;
    public AudioAttributes d;

    /* JADX INFO: renamed from: com.daaw.Rb$b */
    public static final class b {
        public int a = 0;
        public int b = 0;
        public int c = 1;

        public C2097Rb a() {
            return new C2097Rb(this.a, this.b, this.c);
        }
    }

    public AudioAttributes a() {
        if (this.d == null) {
            this.d = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c).build();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2097Rb.class == obj.getClass()) {
            C2097Rb c2097Rb = (C2097Rb) obj;
            if (this.a == c2097Rb.a && this.b == c2097Rb.b && this.c == c2097Rb.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }

    public C2097Rb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
