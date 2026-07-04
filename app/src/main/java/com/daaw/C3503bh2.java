package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.bh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3503bh2 {
    public static final C3503bh2 e = new C3503bh2(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C3503bh2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = AbstractC9004vJ2.f(i3) ? AbstractC9004vJ2.x(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3503bh2)) {
            return false;
        }
        C3503bh2 c3503bh2 = (C3503bh2) obj;
        return this.a == c3503bh2.a && this.b == c3503bh2.b && this.c == c3503bh2.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + "]";
    }
}
