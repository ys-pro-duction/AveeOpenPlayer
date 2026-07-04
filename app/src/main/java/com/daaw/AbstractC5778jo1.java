package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.jo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5778jo1 {
    public static int a(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int b(ByteBuffer byteBuffer) {
        int i;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b = byteBuffer.get(26);
            int i2 = 28;
            int i3 = 28;
            for (int i4 = 0; i4 < b; i4++) {
                i3 += byteBuffer.get(i4 + 27);
            }
            byte b2 = byteBuffer.get(i3 + 26);
            for (int i5 = 0; i5 < b2; i5++) {
                i2 += byteBuffer.get(i3 + 27 + i5);
            }
            i = i3 + i2;
        }
        int i6 = byteBuffer.get(i + 26) + 27 + i;
        return (int) ((f(byteBuffer.get(i6), byteBuffer.limit() - i6 > 1 ? byteBuffer.get(i6 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int c(ByteBuffer byteBuffer) {
        return (int) ((f(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long d(byte[] bArr) {
        return f(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List e(byte[] bArr) {
        long jA = a(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(h(g(jA)));
        arrayList.add(h(g(3840L)));
        return arrayList;
    }

    public static long f(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        int i5 = i4 & 3;
        return ((long) i) * ((long) (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i4 & 1) : i5 == 3 ? 60000 : 10000 << i5));
    }

    public static long g(long j) {
        return (j * 1000000000) / 48000;
    }

    public static byte[] h(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
