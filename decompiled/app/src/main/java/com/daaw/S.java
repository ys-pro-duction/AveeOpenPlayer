package com.daaw;

import com.daaw.InterfaceC2026Qj0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class S implements InterfaceC2026Qj0 {
    public int B = 0;

    public C91 h() {
        return new C91(this);
    }

    public void i(OutputStream outputStream) throws IOException {
        int iC = c();
        C0343Am c0343AmI = C0343Am.I(outputStream, C0343Am.t(C0343Am.u(iC) + iC));
        c0343AmI.n0(iC);
        g(c0343AmI);
        c0343AmI.H();
    }

    public static abstract class a implements InterfaceC2026Qj0.a {
        public static C91 h(InterfaceC2026Qj0 interfaceC2026Qj0) {
            return new C91(interfaceC2026Qj0);
        }

        /* JADX INFO: renamed from: com.daaw.S$a$a, reason: collision with other inner class name */
        public static final class C0116a extends FilterInputStream {
            public int B;

            public C0116a(InputStream inputStream, int i) {
                super(inputStream);
                this.B = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.B);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.B <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.B--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.B));
                if (jSkip >= 0) {
                    this.B = (int) (((long) this.B) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.B;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.B -= i4;
                }
                return i4;
            }
        }
    }
}
