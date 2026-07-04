package com.daaw;

/* JADX INFO: renamed from: com.daaw.se3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8249se3 {
    public long a;
    public float b;
    public long c;

    public C8249se3() {
        this.a = -9223372036854775807L;
        this.b = -3.4028235E38f;
        this.c = -9223372036854775807L;
    }

    public final C8249se3 d(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        AbstractC6048km2.d(z);
        this.c = j;
        return this;
    }

    public final C8249se3 e(long j) {
        this.a = j;
        return this;
    }

    public final C8249se3 f(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        AbstractC6048km2.d(z);
        this.b = f;
        return this;
    }

    public final C9651xe3 g() {
        return new C9651xe3(this, null);
    }

    public /* synthetic */ C8249se3(C9651xe3 c9651xe3, AbstractC7413pe3 abstractC7413pe3) {
        this.a = c9651xe3.a;
        this.b = c9651xe3.b;
        this.c = c9651xe3.c;
    }
}
