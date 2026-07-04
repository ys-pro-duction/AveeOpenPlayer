package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: renamed from: com.daaw.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4062di {
    public static final OutputStream a = new a();

    /* JADX INFO: renamed from: com.daaw.di$a */
    public class a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            AbstractC7785qy0.n(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            AbstractC7785qy0.n(bArr);
            AbstractC7785qy0.s(i, i2 + i, bArr.length);
        }
    }

    public static byte[] a(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        AbstractC7785qy0.n(inputStream);
        AbstractC7785qy0.n(outputStream);
        byte[] bArrC = c();
        long j = 0;
        while (true) {
            int i = inputStream.read(bArrC);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArrC, 0, i);
            j += (long) i;
        }
    }

    public static byte[] c() {
        return new byte[8192];
    }

    public static byte[] d(InputStream inputStream) {
        AbstractC7785qy0.n(inputStream);
        return e(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] e(InputStream inputStream, Queue queue, int i) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return a(queue, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = B00.e(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
