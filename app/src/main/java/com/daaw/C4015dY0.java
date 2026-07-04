package com.daaw;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.dY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4015dY0 implements Closeable, AutoCloseable {
    public final InputStream B;
    public final Charset C;
    public byte[] D;
    public int E;
    public int F;

    /* JADX INFO: renamed from: com.daaw.dY0$a */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, C4015dY0.this.C.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C4015dY0(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public final void c() throws IOException {
        InputStream inputStream = this.B;
        byte[] bArr = this.D;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.E = 0;
        this.F = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.B) {
            try {
                if (this.D != null) {
                    this.D = null;
                    this.B.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d() {
        return this.F == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String j() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.B
            monitor-enter(r0)
            byte[] r1 = r7.D     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.E     // Catch: java.lang.Throwable -> L11
            int r2 = r7.F     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.c()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.E     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.F     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.D     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.E     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.C     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.E = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            com.daaw.dY0$a r1 = new com.daaw.dY0$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.F     // Catch: java.lang.Throwable -> L11
            int r4 = r7.E     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.D     // Catch: java.lang.Throwable -> L11
            int r4 = r7.E     // Catch: java.lang.Throwable -> L11
            int r5 = r7.F     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.F = r2     // Catch: java.lang.Throwable -> L11
            r7.c()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.E     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.F     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.D     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.E     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.E = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4015dY0.j():java.lang.String");
    }

    public C4015dY0(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(AbstractC8232sb1.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.B = inputStream;
        this.C = charset;
        this.D = new byte[i];
    }
}
