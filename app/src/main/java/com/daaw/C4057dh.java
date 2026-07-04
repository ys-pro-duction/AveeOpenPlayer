package com.daaw;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4057dh implements InterfaceC7424ph, InterfaceC7145oh, Cloneable, ByteChannel, AutoCloseable {
    public static final byte[] D = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public FO0 B;
    public long C;

    /* JADX INFO: renamed from: com.daaw.dh$a */
    public class a extends OutputStream implements AutoCloseable {
        public a() {
        }

        public String toString() {
            return C4057dh.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            C4057dh.this.L((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C4057dh.this.l1(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.dh$b */
    public class b extends InputStream implements AutoCloseable {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C4057dh.this.C, 2147483647L);
        }

        @Override // java.io.InputStream
        public int read() {
            C4057dh c4057dh = C4057dh.this;
            if (c4057dh.C > 0) {
                return c4057dh.j0() & 255;
            }
            return -1;
        }

        public String toString() {
            return C4057dh.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return C4057dh.this.s0(bArr, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // com.daaw.PU0
    public long A0(C4057dh c4057dh, long j) {
        if (c4057dh == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        long j2 = this.C;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c4057dh.O0(this, j);
        return j;
    }

    @Override // com.daaw.InterfaceC7424ph
    public int B() {
        long j = this.C;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.C);
        }
        FO0 fo0 = this.B;
        int i = fo0.b;
        int i2 = fo0.c;
        if (i2 - i < 4) {
            return ((j0() & 255) << 24) | ((j0() & 255) << 16) | ((j0() & 255) << 8) | (j0() & 255);
        }
        byte[] bArr = fo0.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.C = j - 4;
        if (i5 != i2) {
            fo0.b = i5;
            return i6;
        }
        this.B = fo0.b();
        YO0.a(fo0);
        return i6;
    }

    public String B0(long j, Charset charset) {
        AbstractC7675qb1.b(this.C, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        FO0 fo0 = this.B;
        int i = fo0.b;
        if (((long) i) + j > fo0.c) {
            return new String(C0(j), charset);
        }
        String str = new String(fo0.a, i, (int) j, charset);
        int i2 = (int) (((long) fo0.b) + j);
        fo0.b = i2;
        this.C -= j;
        if (i2 == fo0.c) {
            this.B = fo0.b();
            YO0.a(fo0);
        }
        return str;
    }

    @Override // com.daaw.InterfaceC7424ph
    public byte[] C0(long j) throws EOFException {
        AbstractC7675qb1.b(this.C, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            y0(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    public String E0() {
        try {
            return B0(this.C, AbstractC7675qb1.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.daaw.InterfaceC7424ph
    public boolean K() {
        return this.C == 0;
    }

    public String K0(long j) {
        return B0(j, AbstractC7675qb1.a);
    }

    @Override // com.daaw.InterfaceC7424ph
    public short N0() {
        long j = this.C;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.C);
        }
        FO0 fo0 = this.B;
        int i = fo0.b;
        int i2 = fo0.c;
        if (i2 - i < 2) {
            return (short) (((j0() & 255) << 8) | (j0() & 255));
        }
        byte[] bArr = fo0.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.C = j - 2;
        if (i5 == i2) {
            this.B = fo0.b();
            YO0.a(fo0);
        } else {
            fo0.b = i5;
        }
        return (short) i6;
    }

    @Override // com.daaw.InterfaceC9600xT0
    public void O0(C4057dh c4057dh, long j) {
        if (c4057dh == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c4057dh == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC7675qb1.b(c4057dh.C, 0L, j);
        while (j > 0) {
            FO0 fo0 = c4057dh.B;
            if (j < fo0.c - fo0.b) {
                FO0 fo02 = this.B;
                FO0 fo03 = fo02 != null ? fo02.g : null;
                if (fo03 != null && fo03.e) {
                    if ((((long) fo03.c) + j) - ((long) (fo03.d ? 0 : fo03.b)) <= 8192) {
                        fo0.f(fo03, (int) j);
                        c4057dh.C -= j;
                        this.C += j;
                        return;
                    }
                }
                c4057dh.B = fo0.e((int) j);
            }
            FO0 fo04 = c4057dh.B;
            long j2 = fo04.c - fo04.b;
            c4057dh.B = fo04.b();
            FO0 fo05 = this.B;
            if (fo05 == null) {
                this.B = fo04;
                fo04.g = fo04;
                fo04.f = fo04;
            } else {
                fo05.g.c(fo04).a();
            }
            c4057dh.C -= j2;
            this.C += j2;
            j -= j2;
        }
    }

    @Override // com.daaw.InterfaceC7424ph
    public long P0(C4908gi c4908gi) {
        return o0(c4908gi, 0L);
    }

    public String Q0(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (o(j2) == 13) {
                String strK0 = K0(j2);
                skip(2L);
                return strK0;
            }
        }
        String strK02 = K0(j);
        skip(1L);
        return strK02;
    }

    public long W(byte b2, long j, long j2) {
        FO0 fo0;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.C), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.C;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (fo0 = this.B) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                fo0 = fo0.g;
                j4 -= (long) (fo0.c - fo0.b);
            }
        } else {
            while (true) {
                long j6 = ((long) (fo0.c - fo0.b)) + j3;
                if (j6 >= j) {
                    break;
                }
                fo0 = fo0.f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = fo0.a;
            int iMin = (int) Math.min(fo0.c, (((long) fo0.b) + j5) - j4);
            for (int i = (int) ((((long) fo0.b) + j7) - j4); i < iMin; i++) {
                if (bArr[i] == b2) {
                    return ((long) (i - fo0.b)) + j4;
                }
            }
            j4 += (long) (fo0.c - fo0.b);
            fo0 = fo0.f;
            j7 = j4;
        }
        return -1L;
    }

    @Override // com.daaw.InterfaceC7424ph
    public void X0(long j) throws EOFException {
        if (this.C < j) {
            throw new EOFException();
        }
    }

    public long Y(C4908gi c4908gi, long j) {
        C4057dh c4057dh = this;
        if (c4908gi.s() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        FO0 fo0 = c4057dh.B;
        long j3 = -1;
        if (fo0 == null) {
            return -1L;
        }
        long j4 = c4057dh.C;
        if (j4 - j < j) {
            while (j4 > j) {
                fo0 = fo0.g;
                j4 -= (long) (fo0.c - fo0.b);
            }
        } else {
            while (true) {
                long j5 = ((long) (fo0.c - fo0.b)) + j2;
                if (j5 >= j) {
                    break;
                }
                fo0 = fo0.f;
                j2 = j5;
            }
            j4 = j2;
        }
        byte bK = c4908gi.k(0);
        long j6 = j4;
        int iS = c4908gi.s();
        long j7 = (c4057dh.C - ((long) iS)) + 1;
        FO0 fo02 = fo0;
        long j8 = j;
        while (j6 < j7) {
            byte[] bArr = fo02.a;
            long j9 = j3;
            int iMin = (int) Math.min(fo02.c, (((long) fo02.b) + j7) - j6);
            int i = (int) ((((long) fo02.b) + j8) - j6);
            while (i < iMin) {
                if (bArr[i] == bK && c4057dh.q0(fo02, i + 1, c4908gi, 1, iS)) {
                    return ((long) (i - fo02.b)) + j6;
                }
                i++;
                c4057dh = this;
            }
            j6 += (long) (fo02.c - fo02.b);
            fo02 = fo02.f;
            c4057dh = this;
            j8 = j6;
            j3 = j9;
        }
        return j3;
    }

    public String Y0() {
        return b1(Long.MAX_VALUE);
    }

    public String b1(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jW = W((byte) 10, 0L, j2);
        if (jW != -1) {
            return Q0(jW);
        }
        if (j2 < f1() && o(j2 - 1) == 13 && o(j2) == 10) {
            return Q0(j2);
        }
        C4057dh c4057dh = new C4057dh();
        l(c4057dh, 0L, Math.min(32L, f1()));
        throw new EOFException("\\n not found: limit=" + Math.min(f1(), j) + " content=" + c4057dh.x0().l() + (char) 8230);
    }

    public final void c() {
        try {
            skip(this.C);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r19 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c1(com.daaw.C4386er0 r18, boolean r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r17
            com.daaw.FO0 r2 = r1.B
            r3 = -2
            if (r2 != 0) goto L13
            if (r19 == 0) goto Lc
            return r3
        Lc:
            com.daaw.gi r2 = com.daaw.C4908gi.F
            int r0 = r0.indexOf(r2)
            return r0
        L13:
            byte[] r4 = r2.a
            int r5 = r2.b
            int r6 = r2.c
            int[] r0 = r0.C
            r7 = 0
            r8 = -1
            r10 = r2
            r9 = 0
            r11 = -1
        L20:
            int r12 = r9 + 1
            r13 = r0[r9]
            int r9 = r9 + 2
            r12 = r0[r12]
            if (r12 == r8) goto L2b
            r11 = r12
        L2b:
            if (r10 != 0) goto L2e
            goto L55
        L2e:
            r12 = 0
            if (r13 >= 0) goto L71
            int r13 = r13 * (-1)
            int r14 = r9 + r13
        L35:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r15 = r9 + 1
            r9 = r0[r9]
            if (r5 == r9) goto L42
            goto L7b
        L42:
            if (r15 != r14) goto L46
            r5 = 1
            goto L47
        L46:
            r5 = 0
        L47:
            if (r13 != r6) goto L61
            com.daaw.FO0 r4 = r10.f
            int r6 = r4.b
            byte[] r9 = r4.a
            int r10 = r4.c
            if (r4 != r2) goto L5b
            if (r5 != 0) goto L58
        L55:
            if (r19 == 0) goto L7b
            return r3
        L58:
            r4 = r9
            r9 = r12
            goto L64
        L5b:
            r16 = r9
            r9 = r4
            r4 = r16
            goto L64
        L61:
            r9 = r10
            r10 = r6
            r6 = r13
        L64:
            if (r5 == 0) goto L6c
            r5 = r0[r15]
            r3 = r6
            r6 = r10
            r10 = r9
            goto L92
        L6c:
            r5 = r6
            r6 = r10
            r10 = r9
            r9 = r15
            goto L35
        L71:
            int r14 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r15 = r9 + r13
        L79:
            if (r9 != r15) goto L7c
        L7b:
            return r11
        L7c:
            r3 = r0[r9]
            if (r5 != r3) goto L99
            int r9 = r9 + r13
            r5 = r0[r9]
            if (r14 != r6) goto L91
            com.daaw.FO0 r10 = r10.f
            int r3 = r10.b
            byte[] r4 = r10.a
            int r6 = r10.c
            if (r10 != r2) goto L92
            r10 = r12
            goto L92
        L91:
            r3 = r14
        L92:
            if (r5 < 0) goto L95
            return r5
        L95:
            int r9 = -r5
            r5 = r3
            r3 = -2
            goto L20
        L99:
            int r9 = r9 + 1
            r3 = -2
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4057dh.c1(com.daaw.er0, boolean):int");
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C4057dh clone() {
        C4057dh c4057dh = new C4057dh();
        if (this.C == 0) {
            return c4057dh;
        }
        FO0 fo0D = this.B.d();
        c4057dh.B = fo0D;
        fo0D.g = fo0D;
        fo0D.f = fo0D;
        FO0 fo0 = this.B;
        while (true) {
            fo0 = fo0.f;
            if (fo0 == this.B) {
                c4057dh.C = this.C;
                return c4057dh;
            }
            c4057dh.B.g.c(fo0.d());
        }
    }

    @Override // com.daaw.InterfaceC7424ph
    public InputStream e1() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4057dh)) {
            return false;
        }
        C4057dh c4057dh = (C4057dh) obj;
        long j = this.C;
        if (j != c4057dh.C) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        FO0 fo0 = this.B;
        FO0 fo02 = c4057dh.B;
        int i = fo0.b;
        int i2 = fo02.b;
        while (j2 < this.C) {
            long jMin = Math.min(fo0.c - i, fo02.c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (fo0.a[i] != fo02.a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == fo0.c) {
                fo0 = fo0.f;
                i = fo0.b;
            }
            if (i2 == fo02.c) {
                fo02 = fo02.f;
                i2 = fo02.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // com.daaw.InterfaceC7424ph
    public long f0(C4908gi c4908gi) {
        return Y(c4908gi, 0L);
    }

    public final long f1() {
        return this.C;
    }

    public final C4908gi g1() {
        long j = this.C;
        if (j <= 2147483647L) {
            return h1((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.C);
    }

    public final C4908gi h1(int i) {
        return i == 0 ? C4908gi.F : new C4546fP0(this, i);
    }

    public int hashCode() {
        FO0 fo0 = this.B;
        if (fo0 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = fo0.c;
            for (int i3 = fo0.b; i3 < i2; i3++) {
                i = (i * 31) + fo0.a[i3];
            }
            fo0 = fo0.f;
        } while (fo0 != this.B);
        return i;
    }

    public FO0 i1(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        FO0 fo0 = this.B;
        if (fo0 != null) {
            FO0 fo02 = fo0.g;
            return (fo02.c + i > 8192 || !fo02.e) ? fo02.c(YO0.b()) : fo02;
        }
        FO0 fo0B = YO0.b();
        this.B = fo0B;
        fo0B.g = fo0B;
        fo0B.f = fo0B;
        return fo0B;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final long j() {
        long j = this.C;
        if (j == 0) {
            return 0L;
        }
        FO0 fo0 = this.B.g;
        int i = fo0.c;
        return (i >= 8192 || !fo0.e) ? j : j - ((long) (i - fo0.b));
    }

    @Override // com.daaw.InterfaceC7424ph
    public byte j0() {
        long j = this.C;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        FO0 fo0 = this.B;
        int i = fo0.b;
        int i2 = fo0.c;
        int i3 = i + 1;
        byte b2 = fo0.a[i];
        this.C = j - 1;
        if (i3 != i2) {
            fo0.b = i3;
            return b2;
        }
        this.B = fo0.b();
        YO0.a(fo0);
        return b2;
    }

    public C4057dh j1(C4908gi c4908gi) {
        if (c4908gi == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c4908gi.z(this);
        return this;
    }

    @Override // com.daaw.InterfaceC7145oh
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C4057dh J0(byte[] bArr) {
        if (bArr != null) {
            return l1(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public final C4057dh l(C4057dh c4057dh, long j, long j2) {
        if (c4057dh == null) {
            throw new IllegalArgumentException("out == null");
        }
        long j3 = j;
        AbstractC7675qb1.b(this.C, j3, j2);
        if (j2 != 0) {
            c4057dh.C += j2;
            FO0 fo0 = this.B;
            while (true) {
                int i = fo0.c;
                int i2 = fo0.b;
                if (j3 < i - i2) {
                    break;
                }
                j3 -= (long) (i - i2);
                fo0 = fo0.f;
            }
            FO0 fo02 = fo0;
            long j4 = j2;
            while (j4 > 0) {
                FO0 fo0D = fo02.d();
                int i3 = (int) (((long) fo0D.b) + j3);
                fo0D.b = i3;
                fo0D.c = Math.min(i3 + ((int) j4), fo0D.c);
                FO0 fo03 = c4057dh.B;
                if (fo03 == null) {
                    fo0D.g = fo0D;
                    fo0D.f = fo0D;
                    c4057dh.B = fo0D;
                } else {
                    fo03.g.c(fo0D);
                }
                j4 -= (long) (fo0D.c - fo0D.b);
                fo02 = fo02.f;
                j3 = 0;
            }
        }
        return this;
    }

    public C4057dh l1(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        AbstractC7675qb1.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            FO0 fo0I1 = i1(1);
            int iMin = Math.min(i3 - i, 8192 - fo0I1.c);
            System.arraycopy(bArr, i, fo0I1.a, fo0I1.c, iMin);
            i += iMin;
            fo0I1.c += iMin;
        }
        this.C += j;
        return this;
    }

    @Override // com.daaw.InterfaceC7145oh
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C4057dh L(int i) {
        FO0 fo0I1 = i1(1);
        byte[] bArr = fo0I1.a;
        int i2 = fo0I1.c;
        fo0I1.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.C++;
        return this;
    }

    public C4057dh n1(long j) {
        if (j == 0) {
            return L(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        FO0 fo0I1 = i1(iNumberOfTrailingZeros);
        byte[] bArr = fo0I1.a;
        int i = fo0I1.c;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = D[(int) (15 & j)];
            j >>>= 4;
        }
        fo0I1.c += iNumberOfTrailingZeros;
        this.C += (long) iNumberOfTrailingZeros;
        return this;
    }

    public final byte o(long j) {
        int i;
        long j2 = j;
        AbstractC7675qb1.b(this.C, j2, 1L);
        long j3 = this.C;
        if (j3 - j2 <= j2) {
            long j4 = j2 - j3;
            FO0 fo0 = this.B;
            do {
                fo0 = fo0.g;
                int i2 = fo0.c;
                i = fo0.b;
                j4 += (long) (i2 - i);
            } while (j4 < 0);
            return fo0.a[i + ((int) j4)];
        }
        FO0 fo02 = this.B;
        while (true) {
            int i3 = fo02.c;
            int i4 = fo02.b;
            long j5 = i3 - i4;
            if (j2 < j5) {
                return fo02.a[i4 + ((int) j2)];
            }
            j2 -= j5;
            fo02 = fo02.f;
        }
    }

    public long o0(C4908gi c4908gi, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        FO0 fo0 = this.B;
        if (fo0 == null) {
            return -1L;
        }
        long j3 = this.C;
        if (j3 - j < j) {
            while (j3 > j) {
                fo0 = fo0.g;
                j3 -= (long) (fo0.c - fo0.b);
            }
        } else {
            while (true) {
                long j4 = ((long) (fo0.c - fo0.b)) + j2;
                if (j4 >= j) {
                    break;
                }
                fo0 = fo0.f;
                j2 = j4;
            }
            j3 = j2;
        }
        if (c4908gi.s() == 2) {
            byte bK = c4908gi.k(0);
            byte bK2 = c4908gi.k(1);
            while (j3 < this.C) {
                byte[] bArr = fo0.a;
                i = (int) ((((long) fo0.b) + j) - j3);
                int i3 = fo0.c;
                while (i < i3) {
                    byte b2 = bArr[i];
                    if (b2 == bK || b2 == bK2) {
                        i2 = fo0.b;
                        return ((long) (i - i2)) + j3;
                    }
                    i++;
                }
                j3 += (long) (fo0.c - fo0.b);
                fo0 = fo0.f;
                j = j3;
            }
            return -1L;
        }
        byte[] bArrN = c4908gi.n();
        while (j3 < this.C) {
            byte[] bArr2 = fo0.a;
            i = (int) ((((long) fo0.b) + j) - j3);
            int i4 = fo0.c;
            while (i < i4) {
                byte b3 = bArr2[i];
                for (byte b4 : bArrN) {
                    if (b3 == b4) {
                        i2 = fo0.b;
                        return ((long) (i - i2)) + j3;
                    }
                }
                i++;
            }
            j3 += (long) (fo0.c - fo0.b);
            fo0 = fo0.f;
            j = j3;
        }
        return -1L;
    }

    @Override // com.daaw.InterfaceC7145oh
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C4057dh C(int i) {
        FO0 fo0I1 = i1(4);
        byte[] bArr = fo0I1.a;
        int i2 = fo0I1.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        fo0I1.c = i2 + 4;
        this.C += 4;
        return this;
    }

    public OutputStream p0() {
        return new a();
    }

    @Override // com.daaw.InterfaceC7145oh
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public C4057dh y(int i) {
        FO0 fo0I1 = i1(2);
        byte[] bArr = fo0I1.a;
        int i2 = fo0I1.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        fo0I1.c = i2 + 2;
        this.C += 2;
        return this;
    }

    @Override // com.daaw.InterfaceC7424ph
    public InterfaceC7424ph peek() {
        return AbstractC2468Up0.b(new C0901Ft0(this));
    }

    public final boolean q0(FO0 fo0, int i, C4908gi c4908gi, int i2, int i3) {
        int i4 = fo0.c;
        byte[] bArr = fo0.a;
        while (i2 < i3) {
            if (i == i4) {
                fo0 = fo0.f;
                byte[] bArr2 = fo0.a;
                bArr = bArr2;
                i = fo0.b;
                i4 = fo0.c;
            }
            if (bArr[i] != c4908gi.k(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final C4057dh q1(OutputStream outputStream, long j) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        AbstractC7675qb1.b(this.C, 0L, j);
        FO0 fo0 = this.B;
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, fo0.c - fo0.b);
            outputStream.write(fo0.a, fo0.b, iMin);
            int i = fo0.b + iMin;
            fo0.b = i;
            long j3 = iMin;
            this.C -= j3;
            j2 -= j3;
            if (i == fo0.c) {
                FO0 fo0B = fo0.b();
                this.B = fo0B;
                YO0.a(fo0);
                fo0 = fo0B;
            }
        }
        return this;
    }

    @Override // com.daaw.InterfaceC7145oh
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C4057dh d0(String str) {
        return n0(str, 0, str.length());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        FO0 fo0 = this.B;
        if (fo0 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), fo0.c - fo0.b);
        byteBuffer.put(fo0.a, fo0.b, iMin);
        int i = fo0.b + iMin;
        fo0.b = i;
        this.C -= (long) iMin;
        if (i == fo0.c) {
            this.B = fo0.b();
            YO0.a(fo0);
        }
        return iMin;
    }

    public int s0(byte[] bArr, int i, int i2) {
        AbstractC7675qb1.b(bArr.length, i, i2);
        FO0 fo0 = this.B;
        if (fo0 == null) {
            return -1;
        }
        int iMin = Math.min(i2, fo0.c - fo0.b);
        System.arraycopy(fo0.a, fo0.b, bArr, i, iMin);
        int i3 = fo0.b + iMin;
        fo0.b = i3;
        this.C -= (long) iMin;
        if (i3 == fo0.c) {
            this.B = fo0.b();
            YO0.a(fo0);
        }
        return iMin;
    }

    @Override // com.daaw.InterfaceC7145oh
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public C4057dh n0(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                FO0 fo0I1 = i1(1);
                byte[] bArr = fo0I1.a;
                int i3 = fo0I1.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt;
                while (i4 < iMin) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i4 + i3] = (byte) cCharAt2;
                    i4++;
                }
                int i5 = fo0I1.c;
                int i6 = (i3 + i4) - i5;
                fo0I1.c = i5 + i6;
                this.C += (long) i6;
                i = i4;
            } else {
                if (cCharAt < 2048) {
                    L((cCharAt >> 6) | 192);
                    L((cCharAt & '?') | 128);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    L((cCharAt >> '\f') | 224);
                    L(((cCharAt >> 6) & 63) | 128);
                    L((cCharAt & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        L(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        L((i8 >> 18) | 240);
                        L(((i8 >> 12) & 63) | 128);
                        L(((i8 >> 6) & 63) | 128);
                        L((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    @Override // com.daaw.InterfaceC7424ph
    public void skip(long j) throws EOFException {
        while (j > 0) {
            if (this.B == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, r0.c - r0.b);
            long j2 = iMin;
            this.C -= j2;
            j -= j2;
            FO0 fo0 = this.B;
            int i = fo0.b + iMin;
            fo0.b = i;
            if (i == fo0.c) {
                this.B = fo0.b();
                YO0.a(fo0);
            }
        }
    }

    public C4057dh t1(int i) {
        if (i < 128) {
            L(i);
            return this;
        }
        if (i < 2048) {
            L((i >> 6) | 192);
            L((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                L(63);
                return this;
            }
            L((i >> 12) | 224);
            L(((i >> 6) & 63) | 128);
            L((i & 63) | 128);
            return this;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        L((i >> 18) | 240);
        L(((i >> 12) & 63) | 128);
        L(((i >> 6) & 63) | 128);
        L((i & 63) | 128);
        return this;
    }

    public String toString() {
        return g1().toString();
    }

    @Override // com.daaw.InterfaceC7424ph
    public C4908gi u(long j) {
        return new C4908gi(C0(j));
    }

    @Override // com.daaw.InterfaceC7424ph
    public int u0(C4386er0 c4386er0) {
        int iC1 = c1(c4386er0, false);
        if (iC1 == -1) {
            return -1;
        }
        try {
            skip(c4386er0.B[iC1].s());
            return iC1;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.daaw.InterfaceC7424ph
    public boolean v0(long j) {
        return this.C >= j;
    }

    public byte[] w0() {
        try {
            return C0(this.C);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            FO0 fo0I1 = i1(1);
            int iMin = Math.min(i, 8192 - fo0I1.c);
            byteBuffer.get(fo0I1.a, fo0I1.c, iMin);
            i -= iMin;
            fo0I1.c += iMin;
        }
        this.C += (long) iRemaining;
        return iRemaining;
    }

    public C4908gi x0() {
        return new C4908gi(w0());
    }

    public void y0(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iS0 = s0(bArr, i, bArr.length - i);
            if (iS0 == -1) {
                throw new EOFException();
            }
            i += iS0;
        }
    }

    @Override // com.daaw.InterfaceC7424ph
    public C4057dh J() {
        return this;
    }

    @Override // com.daaw.PU0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.daaw.InterfaceC7145oh, com.daaw.InterfaceC9600xT0, java.io.Flushable
    public void flush() {
    }

    @Override // com.daaw.InterfaceC7424ph
    public C4057dh t() {
        return this;
    }
}
