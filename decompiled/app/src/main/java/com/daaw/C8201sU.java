package com.daaw;

import com.google.android.gms.ads.AdRequest;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: com.daaw.sU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8201sU implements Closeable, AutoCloseable {
    public int F;
    public int G;
    public Inflater H;
    public int K;
    public int L;
    public long M;
    public final C0563Cp B = new C0563Cp();
    public final CRC32 C = new CRC32();
    public final b D = new b(this, null);
    public final byte[] E = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
    public c I = c.HEADER;
    public boolean J = false;
    public int N = 0;
    public int O = 0;
    public boolean P = true;

    /* JADX INFO: renamed from: com.daaw.sU$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.sU$b */
    public class b {
        public b() {
        }

        public final boolean g() {
            while (k() > 0) {
                if (h() == 0) {
                    return true;
                }
            }
            return false;
        }

        public final int h() {
            int iG;
            if (C8201sU.this.G - C8201sU.this.F > 0) {
                iG = C8201sU.this.E[C8201sU.this.F] & 255;
                C8201sU.d(C8201sU.this, 1);
            } else {
                iG = C8201sU.this.B.G();
            }
            C8201sU.this.C.update(iG);
            C8201sU.s(C8201sU.this, 1);
            return iG;
        }

        public final long i() {
            return ((long) j()) | (((long) j()) << 16);
        }

        public final int j() {
            return h() | (h() << 8);
        }

        public final int k() {
            return (C8201sU.this.G - C8201sU.this.F) + C8201sU.this.B.b();
        }

        public final void l(int i) {
            int i2;
            int i3 = C8201sU.this.G - C8201sU.this.F;
            if (i3 > 0) {
                int iMin = Math.min(i3, i);
                C8201sU.this.C.update(C8201sU.this.E, C8201sU.this.F, iMin);
                C8201sU.d(C8201sU.this, iMin);
                i2 = i - iMin;
            } else {
                i2 = i;
            }
            if (i2 > 0) {
                byte[] bArr = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
                int i4 = 0;
                while (i4 < i2) {
                    int iMin2 = Math.min(i2 - i4, AdRequest.MAX_CONTENT_URL_LENGTH);
                    C8201sU.this.B.i0(bArr, 0, iMin2);
                    C8201sU.this.C.update(bArr, 0, iMin2);
                    i4 += iMin2;
                }
            }
            C8201sU.s(C8201sU.this, i);
        }

        public /* synthetic */ b(C8201sU c8201sU, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.sU$c */
    public enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    public static /* synthetic */ int d(C8201sU c8201sU, int i) {
        int i2 = c8201sU.F + i;
        c8201sU.F = i2;
        return i2;
    }

    public static /* synthetic */ int s(C8201sU c8201sU, int i) {
        int i2 = c8201sU.N + i;
        c8201sU.N = i2;
        return i2;
    }

    public final boolean B0() {
        if ((this.K & 8) != 8) {
            this.I = c.HEADER_COMMENT;
            return true;
        }
        if (!this.D.g()) {
            return false;
        }
        this.I = c.HEADER_COMMENT;
        return true;
    }

    public final boolean E0() throws ZipException {
        if (this.H != null && this.D.k() <= 18) {
            this.H.end();
            this.H = null;
        }
        if (this.D.k() < 8) {
            return false;
        }
        if (this.C.getValue() != this.D.i() || this.M != this.D.i()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.C.reset();
        this.I = c.HEADER;
        return true;
    }

    public void F(IE0 ie0) {
        AbstractC7785qy0.u(!this.J, "GzipInflatingBuffer is closed");
        this.B.c(ie0);
        this.P = false;
    }

    public final boolean I() {
        AbstractC7785qy0.u(this.H != null, "inflater is null");
        AbstractC7785qy0.u(this.F == this.G, "inflaterInput has unconsumed bytes");
        int iMin = Math.min(this.B.b(), AdRequest.MAX_CONTENT_URL_LENGTH);
        if (iMin == 0) {
            return false;
        }
        this.F = 0;
        this.G = iMin;
        this.B.i0(this.E, 0, iMin);
        this.H.setInput(this.E, this.F, iMin);
        this.I = c.INFLATING;
        return true;
    }

    public int N() {
        int i = this.N;
        this.N = 0;
        return i;
    }

    public int R() {
        int i = this.O;
        this.O = 0;
        return i;
    }

    public boolean U() {
        AbstractC7785qy0.u(!this.J, "GzipInflatingBuffer is closed");
        return (this.D.k() == 0 && this.I == c.HEADER) ? false : true;
    }

    public final int W(byte[] bArr, int i, int i2) throws DataFormatException {
        AbstractC7785qy0.u(this.H != null, "inflater is null");
        try {
            int totalIn = this.H.getTotalIn();
            int iInflate = this.H.inflate(bArr, i, i2);
            int totalIn2 = this.H.getTotalIn() - totalIn;
            this.N += totalIn2;
            this.O += totalIn2;
            this.F += totalIn2;
            this.C.update(bArr, i, iInflate);
            if (this.H.finished()) {
                this.M = this.H.getBytesWritten() & 4294967295L;
                this.I = c.TRAILER;
                return iInflate;
            }
            if (this.H.needsInput()) {
                this.I = c.INFLATER_NEEDS_INPUT;
            }
            return iInflate;
        } catch (DataFormatException e) {
            throw new DataFormatException("Inflater data format exception: " + e.getMessage());
        }
    }

    public int Y(byte[] bArr, int i, int i2) throws ZipException {
        boolean z = true;
        AbstractC7785qy0.u(!this.J, "GzipInflatingBuffer is closed");
        boolean zE0 = true;
        int iW = 0;
        while (zE0) {
            int i3 = i2 - iW;
            if (i3 <= 0) {
                if (zE0 && (this.I != c.HEADER || this.D.k() >= 10)) {
                    z = false;
                }
                this.P = z;
                return iW;
            }
            switch (a.a[this.I.ordinal()]) {
                case 1:
                    zE0 = q0();
                    break;
                case 2:
                    zE0 = y0();
                    break;
                case 3:
                    zE0 = x0();
                    break;
                case 4:
                    zE0 = B0();
                    break;
                case 5:
                    zE0 = s0();
                    break;
                case 6:
                    zE0 = w0();
                    break;
                case 7:
                    zE0 = o0();
                    break;
                case 8:
                    iW += W(bArr, i + iW, i3);
                    zE0 = this.I != c.TRAILER ? true : E0();
                    break;
                case 9:
                    zE0 = I();
                    break;
                case 10:
                    zE0 = E0();
                    break;
                default:
                    throw new AssertionError("Invalid state: " + this.I);
            }
        }
        if (zE0) {
            z = false;
        }
        this.P = z;
        return iW;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.J) {
            return;
        }
        this.J = true;
        this.B.close();
        Inflater inflater = this.H;
        if (inflater != null) {
            inflater.end();
            this.H = null;
        }
    }

    public final boolean o0() {
        Inflater inflater = this.H;
        if (inflater == null) {
            this.H = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.C.reset();
        int i = this.G;
        int i2 = this.F;
        int i3 = i - i2;
        if (i3 > 0) {
            this.H.setInput(this.E, i2, i3);
            this.I = c.INFLATING;
        } else {
            this.I = c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    public boolean p0() {
        AbstractC7785qy0.u(!this.J, "GzipInflatingBuffer is closed");
        return this.P;
    }

    public final boolean q0() throws ZipException {
        if (this.D.k() < 10) {
            return false;
        }
        if (this.D.j() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.D.h() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.K = this.D.h();
        this.D.l(6);
        this.I = c.HEADER_EXTRA_LEN;
        return true;
    }

    public final boolean s0() {
        if ((this.K & 16) != 16) {
            this.I = c.HEADER_CRC;
            return true;
        }
        if (!this.D.g()) {
            return false;
        }
        this.I = c.HEADER_CRC;
        return true;
    }

    public final boolean w0() throws ZipException {
        if ((this.K & 2) != 2) {
            this.I = c.INITIALIZE_INFLATER;
            return true;
        }
        if (this.D.k() < 2) {
            return false;
        }
        if ((65535 & ((int) this.C.getValue())) != this.D.j()) {
            throw new ZipException("Corrupt GZIP header");
        }
        this.I = c.INITIALIZE_INFLATER;
        return true;
    }

    public final boolean x0() {
        int iK = this.D.k();
        int i = this.L;
        if (iK < i) {
            return false;
        }
        this.D.l(i);
        this.I = c.HEADER_NAME;
        return true;
    }

    public final boolean y0() {
        if ((this.K & 4) != 4) {
            this.I = c.HEADER_NAME;
            return true;
        }
        if (this.D.k() < 2) {
            return false;
        }
        this.L = this.D.j();
        this.I = c.HEADER_EXTRA;
        return true;
    }
}
