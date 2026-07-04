package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class ImageHeaderParser {
    public static final byte[] b;
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    public final b a;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);

        public final boolean B;

        ImageType(boolean z) {
            this.B = z;
        }

        public boolean hasAlpha() {
            return this.B;
        }
    }

    public static class a {
        public final ByteBuffer a;

        public a(byte[] bArr) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.a = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        public short a(int i) {
            return this.a.getShort(i);
        }

        public int b(int i) {
            return this.a.getInt(i);
        }

        public int c() {
            return this.a.array().length;
        }

        public void d(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    public static class b {
        public final InputStream a;

        public b(InputStream inputStream) {
            this.a = inputStream;
        }

        public int a() {
            return this.a.read();
        }

        public int b() {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
        }

        public short c() {
            return (short) (this.a.read() & 255);
        }

        public int d(byte[] bArr) throws IOException {
            int length = bArr.length;
            while (length > 0) {
                int i = this.a.read(bArr, bArr.length - length, length);
                if (i == -1) {
                    break;
                }
                length -= i;
            }
            return bArr.length - length;
        }

        public long e(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.a.skip(j2);
                if (jSkip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    static {
        byte[] bytes = new byte[0];
        try {
            bytes = "Exif\u0000\u0000".getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        b = bytes;
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.a = new b(inputStream);
    }

    public static int a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    public static boolean e(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    public static int g(a aVar) {
        short sA;
        int iB;
        int i;
        int i2;
        short sA2 = aVar.a(6);
        ByteOrder byteOrder = (sA2 != 19789 && sA2 == 18761) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
        aVar.d(byteOrder);
        int iB2 = aVar.b(10) + 6;
        short sA3 = aVar.a(iB2);
        for (int i3 = 0; i3 < sA3; i3++) {
            int iA = a(iB2, i3);
            if (aVar.a(iA) == 274 && (sA = aVar.a(iA + 2)) >= 1 && sA <= 12 && (iB = aVar.b(iA + 4)) >= 0 && (i = iB + c[sA]) <= 4 && (i2 = iA + 8) >= 0 && i2 <= aVar.c() && i >= 0 && i + i2 <= aVar.c()) {
                return aVar.a(i2);
            }
        }
        return -1;
    }

    public final byte[] b() {
        short sC;
        while (this.a.c() == 255 && (sC = this.a.c()) != 218 && sC != 217) {
            int iB = this.a.b() - 2;
            if (sC == 225) {
                byte[] bArr = new byte[iB];
                if (this.a.d(bArr) != iB) {
                    return null;
                }
                return bArr;
            }
            long j = iB;
            if (this.a.e(j) != j) {
                return null;
            }
        }
        return null;
    }

    public int c() {
        if (!e(this.a.b())) {
            return -1;
        }
        byte[] bArrB = b();
        boolean z = false;
        boolean z2 = bArrB != null && bArrB.length > b.length;
        if (z2) {
            int i = 0;
            while (true) {
                byte[] bArr = b;
                if (i >= bArr.length) {
                    break;
                }
                if (bArrB[i] != bArr[i]) {
                    break;
                }
                i++;
            }
            z = z2;
        } else {
            z = z2;
        }
        if (z) {
            return g(new a(bArrB));
        }
        return -1;
    }

    public ImageType d() throws IOException {
        int iB = this.a.b();
        if (iB == 65496) {
            return ImageType.JPEG;
        }
        int iB2 = ((iB << 16) & (-65536)) | (this.a.b() & 65535);
        if (iB2 != -1991225785) {
            return (iB2 >> 8) == 4671814 ? ImageType.GIF : ImageType.UNKNOWN;
        }
        this.a.e(21L);
        return this.a.a() >= 3 ? ImageType.PNG_A : ImageType.PNG;
    }

    public boolean f() {
        return d().hasAlpha();
    }
}
