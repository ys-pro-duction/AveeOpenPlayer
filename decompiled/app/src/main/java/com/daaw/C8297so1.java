package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.so1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8297so1 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public C8297so1(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8297so1.class == obj.getClass()) {
            C8297so1 c8297so1 = (C8297so1) obj;
            if (this.a == c8297so1.a && this.c == c8297so1.c && this.d == c8297so1.d && Arrays.equals(this.b, c8297so1.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
