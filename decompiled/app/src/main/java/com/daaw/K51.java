package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K51 {
    public static final Logger a = Logger.getLogger(K51.class.getName());
    public static final byte[] b = "-bin".getBytes(AbstractC0439Bk.a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(byte[] bArr) {
        for (byte b2 : bArr) {
            if (b2 < 32 || b2 > 126) {
                return false;
            }
        }
        return true;
    }

    public static byte[][] c(byte[][] bArr, int i) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(bArr[i2]);
        }
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            if (a(bArr2, b)) {
                int i3 = 0;
                for (int i4 = 0; i4 <= bArr3.length; i4++) {
                    if (i4 == bArr3.length || bArr3[i4] == 44) {
                        byte[] bArrB = AbstractC7688qe.a().b(new String(bArr3, i3, i4 - i3, AbstractC0439Bk.a));
                        arrayList.add(bArr2);
                        arrayList.add(bArrB);
                        i3 = i4 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            i += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    public static byte[][] d(C2756Xj0 c2756Xj0) {
        byte[][] bArrD = AbstractC6962o10.d(c2756Xj0);
        if (bArrD == null) {
            return new byte[0][];
        }
        int i = 0;
        for (int i2 = 0; i2 < bArrD.length; i2 += 2) {
            byte[] bArr = bArrD[i2];
            byte[] bArr2 = bArrD[i2 + 1];
            if (a(bArr, b)) {
                bArrD[i] = bArr;
                bArrD[i + 1] = AbstractC6962o10.b.e(bArr2).getBytes(AbstractC0439Bk.a);
            } else if (b(bArr2)) {
                bArrD[i] = bArr;
                bArrD[i + 1] = bArr2;
            } else {
                String str = new String(bArr, AbstractC0439Bk.a);
                a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i += 2;
        }
        return i == bArrD.length ? bArrD : (byte[][]) Arrays.copyOfRange(bArrD, 0, i);
    }

    public static byte[][] e(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (a(bArr2, b)) {
                for (byte b2 : bArr3) {
                    if (b2 == 44) {
                        return c(bArr, i);
                    }
                }
                bArr[i2] = AbstractC7688qe.a().b(new String(bArr3, AbstractC0439Bk.a));
            }
        }
        return bArr;
    }
}
