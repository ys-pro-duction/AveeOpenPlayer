package com.daaw;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4908gi implements Serializable, Comparable {
    public static final char[] E = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C4908gi F = o(new byte[0]);
    public final byte[] B;
    public transient int C;
    public transient String D;

    public C4908gi(byte[] bArr) {
        this.B = bArr;
    }

    public static int c(String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i2++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }

    public static C4908gi h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C4908gi c4908gi = new C4908gi(str.getBytes(AbstractC7675qb1.a));
        c4908gi.D = str;
        return c4908gi;
    }

    public static C4908gi o(byte... bArr) {
        if (bArr != null) {
            return new C4908gi((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        return AbstractC6005ke.a(this.B);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4908gi) {
            C4908gi c4908gi = (C4908gi) obj;
            int iS = c4908gi.s();
            byte[] bArr = this.B;
            if (iS == bArr.length && c4908gi.r(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4908gi c4908gi) {
        int iS = s();
        int iS2 = c4908gi.s();
        int iMin = Math.min(iS, iS2);
        for (int i = 0; i < iMin; i++) {
            int iK = k(i) & 255;
            int iK2 = c4908gi.k(i) & 255;
            if (iK != iK2) {
                return iK < iK2 ? -1 : 1;
            }
        }
        if (iS == iS2) {
            return 0;
        }
        return iS < iS2 ? -1 : 1;
    }

    public int hashCode() {
        int i = this.C;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.B);
        this.C = iHashCode;
        return iHashCode;
    }

    public byte k(int i) {
        return this.B[i];
    }

    public String l() {
        byte[] bArr = this.B;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = E;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte[] n() {
        return this.B;
    }

    public boolean q(int i, C4908gi c4908gi, int i2, int i3) {
        return c4908gi.r(i2, this.B, i, i3);
    }

    public boolean r(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.B;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && AbstractC7675qb1.a(bArr2, i, bArr, i2, i3);
    }

    public int s() {
        return this.B.length;
    }

    public final boolean t(C4908gi c4908gi) {
        return q(0, c4908gi, 0, c4908gi.s());
    }

    public String toString() {
        if (this.B.length == 0) {
            return "[size=0]";
        }
        String strY = y();
        int iC = c(strY, 64);
        if (iC == -1) {
            if (this.B.length <= 64) {
                return "[hex=" + l() + "]";
            }
            return "[size=" + this.B.length + " hex=" + u(0, 64).l() + "…]";
        }
        String strReplace = strY.substring(0, iC).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (iC >= strY.length()) {
            return "[text=" + strReplace + "]";
        }
        return "[size=" + this.B.length + " text=" + strReplace + "…]";
    }

    public C4908gi u(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.B;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.B.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new C4908gi(bArr2);
    }

    public C4908gi w() {
        int i = 0;
        while (true) {
            byte[] bArr = this.B;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C4908gi(bArr2);
            }
            i++;
        }
    }

    public byte[] x() {
        return (byte[]) this.B.clone();
    }

    public String y() {
        String str = this.D;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.B, AbstractC7675qb1.a);
        this.D = str2;
        return str2;
    }

    public void z(C4057dh c4057dh) {
        byte[] bArr = this.B;
        c4057dh.l1(bArr, 0, bArr.length);
    }
}
