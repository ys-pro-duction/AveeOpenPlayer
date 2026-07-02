package com.daaw;

import com.daaw.InterfaceC8843um;
import com.daaw.TX0;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;

/* JADX INFO: renamed from: com.daaw.Kj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1381Kj0 implements Closeable, InterfaceC10022yy, AutoCloseable {
    public b B;
    public int C;
    public final C5695jX0 D;
    public final T51 E;
    public InterfaceC1120Hw F;
    public C8201sU G;
    public byte[] H;
    public int I;
    public boolean L;
    public C0563Cp M;
    public long O;
    public int R;
    public e J = e.HEADER;
    public int K = 5;
    public C0563Cp N = new C0563Cp();
    public boolean P = false;
    public int Q = -1;
    public boolean S = false;
    public volatile boolean T = false;

    /* JADX INFO: renamed from: com.daaw.Kj0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kj0$b */
    public interface b {
        void a(TX0.a aVar);

        void c(boolean z);

        void d(int i);

        void e(Throwable th);
    }

    /* JADX INFO: renamed from: com.daaw.Kj0$c */
    public static class c implements TX0.a {
        public InputStream B;

        public /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // com.daaw.TX0.a
        public InputStream next() {
            InputStream inputStream = this.B;
            this.B = null;
            return inputStream;
        }

        public c(InputStream inputStream) {
            this.B = inputStream;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kj0$e */
    public enum e {
        HEADER,
        BODY
    }

    public C1381Kj0(b bVar, InterfaceC1120Hw interfaceC1120Hw, int i, C5695jX0 c5695jX0, T51 t51) {
        this.B = (b) AbstractC7785qy0.o(bVar, "sink");
        this.F = (InterfaceC1120Hw) AbstractC7785qy0.o(interfaceC1120Hw, "decompressor");
        this.C = i;
        this.D = (C5695jX0) AbstractC7785qy0.o(c5695jX0, "statsTraceCtx");
        this.E = (T51) AbstractC7785qy0.o(t51, "transportTracer");
    }

    public final InputStream F() {
        this.D.f(this.M.b());
        return JE0.c(this.M, true);
    }

    public final boolean I() {
        return isClosed() || this.S;
    }

    public final boolean N() {
        C8201sU c8201sU = this.G;
        return c8201sU != null ? c8201sU.p0() : this.N.b() == 0;
    }

    public final void R() {
        this.D.e(this.Q, this.R, -1L);
        this.R = 0;
        InputStream inputStreamS = this.L ? s() : F();
        this.M = null;
        this.B.a(new c(inputStreamS, null));
        this.J = e.HEADER;
        this.K = 5;
    }

    public final void U() {
        int iG = this.M.G();
        if ((iG & 254) != 0) {
            throw C6262lX0.t.q("gRPC frame header malformed: reserved bits not zero").d();
        }
        this.L = (iG & 1) != 0;
        int iB = this.M.B();
        this.K = iB;
        if (iB < 0 || iB > this.C) {
            throw C6262lX0.o.q(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.C), Integer.valueOf(this.K))).d();
        }
        int i = this.Q + 1;
        this.Q = i;
        this.D.d(i);
        this.E.d();
        this.J = e.BODY;
    }

    public final boolean W() throws Throwable {
        int iR;
        int i = 0;
        try {
            if (this.M == null) {
                this.M = new C0563Cp();
            }
            int iN = 0;
            iR = 0;
            while (true) {
                try {
                    int iB = this.K - this.M.b();
                    if (iB <= 0) {
                        if (iN > 0) {
                            this.B.d(iN);
                            if (this.J == e.BODY) {
                                if (this.G != null) {
                                    this.D.g(iR);
                                    this.R += iR;
                                    return true;
                                }
                                this.D.g(iN);
                                this.R += iN;
                            }
                        }
                        return true;
                    }
                    if (this.G != null) {
                        try {
                            byte[] bArr = this.H;
                            if (bArr == null || this.I == bArr.length) {
                                this.H = new byte[Math.min(iB, 2097152)];
                                this.I = 0;
                            }
                            int iY = this.G.Y(this.H, this.I, Math.min(iB, this.H.length - this.I));
                            iN += this.G.N();
                            iR += this.G.R();
                            if (iY == 0) {
                                if (iN > 0) {
                                    this.B.d(iN);
                                    if (this.J == e.BODY) {
                                        if (this.G != null) {
                                            this.D.g(iR);
                                            this.R += iR;
                                            return false;
                                        }
                                        this.D.g(iN);
                                        this.R += iN;
                                    }
                                }
                                return false;
                            }
                            this.M.c(JE0.f(this.H, this.I, iY));
                            this.I += iY;
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        } catch (DataFormatException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        if (this.N.b() == 0) {
                            if (iN > 0) {
                                this.B.d(iN);
                                if (this.J == e.BODY) {
                                    if (this.G != null) {
                                        this.D.g(iR);
                                        this.R += iR;
                                        return false;
                                    }
                                    this.D.g(iN);
                                    this.R += iN;
                                }
                            }
                            return false;
                        }
                        int iMin = Math.min(iB, this.N.b());
                        iN += iMin;
                        this.M.c(this.N.E(iMin));
                    }
                } catch (Throwable th) {
                    int i2 = iN;
                    th = th;
                    i = i2;
                    if (i > 0) {
                        this.B.d(i);
                        if (this.J == e.BODY) {
                            if (this.G != null) {
                                this.D.g(iR);
                                this.R += iR;
                            } else {
                                this.D.g(i);
                                this.R += i;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            iR = 0;
        }
    }

    public void Y(C8201sU c8201sU) {
        AbstractC7785qy0.u(this.F == InterfaceC8843um.b.a, "per-message decompressor already set");
        AbstractC7785qy0.u(this.G == null, "full stream decompressor already set");
        this.G = (C8201sU) AbstractC7785qy0.o(c8201sU, "Can't pass a null full stream decompressor");
        this.N = null;
    }

    public final void a() {
        if (this.P) {
            return;
        }
        this.P = true;
        while (!this.T && this.O > 0 && W()) {
            try {
                int i = a.a[this.J.ordinal()];
                if (i == 1) {
                    U();
                } else {
                    if (i != 2) {
                        throw new AssertionError("Invalid state: " + this.J);
                    }
                    R();
                    this.O--;
                }
            } catch (Throwable th) {
                this.P = false;
                throw th;
            }
        }
        if (this.T) {
            close();
            this.P = false;
        } else {
            if (this.S && N()) {
                close();
            }
            this.P = false;
        }
    }

    @Override // com.daaw.InterfaceC10022yy
    public void c(int i) {
        AbstractC7785qy0.e(i > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.O += (long) i;
        a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.daaw.InterfaceC10022yy
    public void close() {
        if (isClosed()) {
            return;
        }
        C0563Cp c0563Cp = this.M;
        boolean z = c0563Cp != null && c0563Cp.b() > 0;
        try {
            C8201sU c8201sU = this.G;
            if (c8201sU != null) {
                boolean z2 = z || c8201sU.U();
                this.G.close();
                z = z2;
            }
            C0563Cp c0563Cp2 = this.N;
            if (c0563Cp2 != null) {
                c0563Cp2.close();
            }
            C0563Cp c0563Cp3 = this.M;
            if (c0563Cp3 != null) {
                c0563Cp3.close();
            }
            this.G = null;
            this.N = null;
            this.M = null;
            this.B.c(z);
        } catch (Throwable th) {
            this.G = null;
            this.N = null;
            this.M = null;
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC10022yy
    public void d(int i) {
        this.C = i;
    }

    public boolean isClosed() {
        return this.N == null && this.G == null;
    }

    @Override // com.daaw.InterfaceC10022yy
    public void j() {
        if (isClosed()) {
            return;
        }
        if (N()) {
            close();
        } else {
            this.S = true;
        }
    }

    @Override // com.daaw.InterfaceC10022yy
    public void l(IE0 ie0) throws Throwable {
        AbstractC7785qy0.o(ie0, "data");
        boolean z = true;
        try {
            if (I()) {
                ie0.close();
                return;
            }
            C8201sU c8201sU = this.G;
            if (c8201sU != null) {
                c8201sU.F(ie0);
            } else {
                this.N.c(ie0);
            }
            try {
                a();
            } catch (Throwable th) {
                th = th;
                z = false;
                if (z) {
                    ie0.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.daaw.InterfaceC10022yy
    public void o(InterfaceC1120Hw interfaceC1120Hw) {
        AbstractC7785qy0.u(this.G == null, "Already set full stream decompressor");
        this.F = (InterfaceC1120Hw) AbstractC7785qy0.o(interfaceC1120Hw, "Can't pass an empty decompressor");
    }

    public void o0(b bVar) {
        this.B = bVar;
    }

    public void p0() {
        this.T = true;
    }

    public final InputStream s() {
        InterfaceC1120Hw interfaceC1120Hw = this.F;
        if (interfaceC1120Hw == InterfaceC8843um.b.a) {
            throw C6262lX0.t.q("Can't decode compressed gRPC message as compression not configured").d();
        }
        try {
            return new d(interfaceC1120Hw.b(JE0.c(this.M, true)), this.C, this.D);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kj0$d */
    public static final class d extends FilterInputStream {
        public final int B;
        public final C5695jX0 C;
        public long D;
        public long E;
        public long F;

        public d(InputStream inputStream, int i, C5695jX0 c5695jX0) {
            super(inputStream);
            this.F = -1L;
            this.B = i;
            this.C = c5695jX0;
        }

        public final void a() {
            long j = this.E;
            long j2 = this.D;
            if (j > j2) {
                this.C.f(j - j2);
                this.D = this.E;
            }
        }

        public final void c() {
            if (this.E <= this.B) {
                return;
            }
            throw C6262lX0.o.q("Decompressed gRPC message exceeds maximum size " + this.B).d();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.F = this.E;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = ((FilterInputStream) this).in.read();
            if (i != -1) {
                this.E++;
            }
            c();
            a();
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.F == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.E = this.F;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j);
            this.E += jSkip;
            c();
            a();
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (i3 != -1) {
                this.E += (long) i3;
            }
            c();
            a();
            return i3;
        }
    }
}
