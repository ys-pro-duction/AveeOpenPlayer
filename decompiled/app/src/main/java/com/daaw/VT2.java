package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class VT2 implements Comparable {
    public final byte[] B;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        VT2 vt2 = (VT2) obj;
        int length = this.B.length;
        int length2 = vt2.B.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.B;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = vt2.B[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof VT2) {
            return Arrays.equals(this.B, ((VT2) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.B);
    }

    public final String toString() {
        return P23.a(this.B);
    }
}
