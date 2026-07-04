package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.zg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10219zg3 {
    public final long a;
    public final AbstractC8657u52 b;
    public final int c;
    public final Vp3 d;
    public final long e;
    public final AbstractC8657u52 f;
    public final int g;
    public final Vp3 h;
    public final long i;
    public final long j;

    public C10219zg3(long j, AbstractC8657u52 abstractC8657u52, int i, Vp3 vp3, long j2, AbstractC8657u52 abstractC8657u522, int i2, Vp3 vp32, long j3, long j4) {
        this.a = j;
        this.b = abstractC8657u52;
        this.c = i;
        this.d = vp3;
        this.e = j2;
        this.f = abstractC8657u522;
        this.g = i2;
        this.h = vp32;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10219zg3.class == obj.getClass()) {
            C10219zg3 c10219zg3 = (C10219zg3) obj;
            if (this.a == c10219zg3.a && this.c == c10219zg3.c && this.e == c10219zg3.e && this.g == c10219zg3.g && this.i == c10219zg3.i && this.j == c10219zg3.j && AbstractC3977dO2.a(this.b, c10219zg3.b) && AbstractC3977dO2.a(this.d, c10219zg3.d) && AbstractC3977dO2.a(this.f, c10219zg3.f) && AbstractC3977dO2.a(this.h, c10219zg3.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
