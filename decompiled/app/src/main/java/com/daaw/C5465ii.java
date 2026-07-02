package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5465ii {
    public final byte[] a;

    public C5465ii(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public static C5465ii a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static C5465ii b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            return new C5465ii(bArr, i, i2);
        }
        throw new NullPointerException("data must be non-null");
    }

    public byte[] c() {
        byte[] bArr = this.a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5465ii) {
            return Arrays.equals(((C5465ii) obj).a, this.a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return "Bytes(" + QV.a(this.a) + ")";
    }
}
