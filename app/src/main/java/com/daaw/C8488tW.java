package com.daaw;

import com.daaw.AbstractC8209sW;
import com.daaw.InterfaceC7628qQ;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.tW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8488tW implements InterfaceC1146Ic1 {
    public static final Logger a = Logger.getLogger(b.class.getName());
    public static final C4908gi b = C4908gi.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: com.daaw.tW$b */
    public static final class b {
        public static final String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        public static final String[] b = new String[64];
        public static final String[] c = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i3 = iArr[0];
            strArr2[i3 | 8] = strArr2[i3] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr2[i4];
                int i6 = iArr[0];
                String[] strArr3 = b;
                int i7 = i6 | i5;
                strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
                strArr3[i7 | 8] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = b;
                if (i >= strArr4.length) {
                    return;
                }
                if (strArr4[i] == null) {
                    strArr4[i] = c[i];
                }
                i++;
            }
        }

        public static String a(byte b2, byte b3) {
            if (b3 == 0) {
                return "";
            }
            if (b2 != 2 && b2 != 3) {
                if (b2 == 4 || b2 == 6) {
                    return b3 == 1 ? "ACK" : c[b3];
                }
                if (b2 != 7 && b2 != 8) {
                    String[] strArr = b;
                    String str = b3 < strArr.length ? strArr[b3] : c[b3];
                    return (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return c[b3];
        }

        public static String b(boolean z, int i, int i2, byte b2, byte b3) {
            String[] strArr = a;
            return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), b2 < strArr.length ? strArr[b2] : String.format("0x%02x", Byte.valueOf(b2)), a(b2, b3));
        }
    }

    /* JADX INFO: renamed from: com.daaw.tW$c */
    public static final class c implements InterfaceC7628qQ, AutoCloseable {
        public final InterfaceC7424ph B;
        public final a C;
        public final boolean D;
        public final AbstractC8209sW.a E;

        public c(InterfaceC7424ph interfaceC7424ph, int i, boolean z) {
            this.B = interfaceC7424ph;
            this.D = z;
            a aVar = new a(interfaceC7424ph);
            this.C = aVar;
            this.E = new AbstractC8209sW.a(i, aVar);
        }

        public final void F(InterfaceC7628qQ.a aVar, int i, byte b, int i2) throws IOException {
            if (i2 == 0) {
                throw C8488tW.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short sJ0 = (b & 8) != 0 ? (short) (this.B.j0() & 255) : (short) 0;
            aVar.n(i2, this.B.B() & Integer.MAX_VALUE, d(C8488tW.l(i - 4, b, sJ0), sJ0, b, i2));
        }

        public final void I(InterfaceC7628qQ.a aVar, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw C8488tW.k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            }
            if (i2 == 0) {
                throw C8488tW.k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int iB = this.B.B();
            EnumC7034oH enumC7034oHA = EnumC7034oH.a(iB);
            if (enumC7034oHA == null) {
                throw C8488tW.k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iB));
            }
            aVar.f(i2, enumC7034oHA);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final void N(InterfaceC7628qQ.a aVar, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                throw C8488tW.k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b & 1) != 0) {
                if (i != 0) {
                    throw C8488tW.k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.j();
                return;
            }
            if (i % 6 != 0) {
                throw C8488tW.k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            }
            CQ0 cq0 = new CQ0();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short sN0 = this.B.N0();
                int iB = this.B.B();
                switch (sN0) {
                    case 1:
                    case 6:
                        cq0.e(sN0, 0, iB);
                        break;
                    case 2:
                        if (iB != 0 && iB != 1) {
                            throw C8488tW.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        cq0.e(sN0, 0, iB);
                        break;
                    case 3:
                        sN0 = 4;
                        cq0.e(sN0, 0, iB);
                        break;
                    case 4:
                        if (iB < 0) {
                            throw C8488tW.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        sN0 = 7;
                        cq0.e(sN0, 0, iB);
                        break;
                        break;
                    case 5:
                        if (iB < 16384 || iB > 16777215) {
                            throw C8488tW.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iB));
                        }
                        cq0.e(sN0, 0, iB);
                        break;
                    default:
                        break;
                }
            }
            aVar.i(false, cq0);
            if (cq0.b() >= 0) {
                this.E.g(cq0.b());
            }
        }

        @Override // com.daaw.InterfaceC7628qQ
        public boolean Q(InterfaceC7628qQ.a aVar) throws IOException {
            try {
                this.B.X0(9L);
                int iM = C8488tW.m(this.B);
                if (iM < 0 || iM > 16384) {
                    throw C8488tW.k("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM));
                }
                byte bJ0 = (byte) (this.B.j0() & 255);
                byte bJ02 = (byte) (this.B.j0() & 255);
                int iB = this.B.B() & Integer.MAX_VALUE;
                if (C8488tW.a.isLoggable(Level.FINE)) {
                    C8488tW.a.fine(b.b(true, iB, iM, bJ0, bJ02));
                }
                switch (bJ0) {
                    case 0:
                        a(aVar, iM, bJ02, iB);
                        return true;
                    case 1:
                        j(aVar, iM, bJ02, iB);
                        return true;
                    case 2:
                        s(aVar, iM, bJ02, iB);
                        return true;
                    case 3:
                        I(aVar, iM, bJ02, iB);
                        return true;
                    case 4:
                        N(aVar, iM, bJ02, iB);
                        return true;
                    case 5:
                        F(aVar, iM, bJ02, iB);
                        return true;
                    case 6:
                        l(aVar, iM, bJ02, iB);
                        return true;
                    case 7:
                        c(aVar, iM, bJ02, iB);
                        return true;
                    case 8:
                        R(aVar, iM, bJ02, iB);
                        return true;
                    default:
                        this.B.skip(iM);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        public final void R(InterfaceC7628qQ.a aVar, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw C8488tW.k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            }
            long jB = ((long) this.B.B()) & 2147483647L;
            if (jB == 0) {
                throw C8488tW.k("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.g(i2, jB);
        }

        public final void a(InterfaceC7628qQ.a aVar, int i, byte b, int i2) throws IOException {
            boolean z = (b & 1) != 0;
            if ((b & 32) != 0) {
                throw C8488tW.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short sJ0 = (b & 8) != 0 ? (short) (this.B.j0() & 255) : (short) 0;
            aVar.k(z, i2, this.B, C8488tW.l(i, b, sJ0));
            this.B.skip(sJ0);
        }

        public final void c(InterfaceC7628qQ.a aVar, int i, byte b, int i2) throws IOException {
            if (i < 8) {
                throw C8488tW.k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            }
            if (i2 != 0) {
                throw C8488tW.k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int iB = this.B.B();
            int iB2 = this.B.B();
            int i3 = i - 8;
            EnumC7034oH enumC7034oHA = EnumC7034oH.a(iB2);
            if (enumC7034oHA == null) {
                throw C8488tW.k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iB2));
            }
            C4908gi c4908giU = C4908gi.F;
            if (i3 > 0) {
                c4908giU = this.B.u(i3);
            }
            aVar.o(iB, enumC7034oHA, c4908giU);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.B.close();
        }

        public final List d(int i, short s, byte b, int i2) throws IOException {
            a aVar = this.C;
            aVar.F = i;
            aVar.C = i;
            aVar.G = s;
            aVar.D = b;
            aVar.E = i2;
            this.E.l();
            return this.E.e();
        }

        public final void j(InterfaceC7628qQ.a aVar, int i, byte b, int i2) throws IOException {
            if (i2 == 0) {
                throw C8488tW.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z = (b & 1) != 0;
            short sJ0 = (b & 8) != 0 ? (short) (this.B.j0() & 255) : (short) 0;
            if ((b & 32) != 0) {
                o(aVar, i2);
                i -= 5;
            }
            aVar.l(false, z, i2, -1, d(C8488tW.l(i, b, sJ0), sJ0, b, i2), DV.HTTP_20_HEADERS);
        }

        public final void l(InterfaceC7628qQ.a aVar, int i, byte b, int i2) throws IOException {
            if (i != 8) {
                throw C8488tW.k("TYPE_PING length != 8: %s", Integer.valueOf(i));
            }
            if (i2 != 0) {
                throw C8488tW.k("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.h((b & 1) != 0, this.B.B(), this.B.B());
        }

        public final void o(InterfaceC7628qQ.a aVar, int i) {
            int iB = this.B.B();
            aVar.m(i, iB & Integer.MAX_VALUE, (this.B.j0() & 255) + 1, (Integer.MIN_VALUE & iB) != 0);
        }

        public final void s(InterfaceC7628qQ.a aVar, int i, byte b, int i2) throws IOException {
            if (i != 5) {
                throw C8488tW.k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            }
            if (i2 == 0) {
                throw C8488tW.k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            o(aVar, i2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.tW$d */
    public static final class d implements InterfaceC8464tQ, AutoCloseable {
        public final InterfaceC7145oh B;
        public final boolean C;
        public final C4057dh D;
        public final AbstractC8209sW.b E;
        public int F;
        public boolean G;

        public d(InterfaceC7145oh interfaceC7145oh, boolean z) {
            this.B = interfaceC7145oh;
            this.C = z;
            C4057dh c4057dh = new C4057dh();
            this.D = c4057dh;
            this.E = new AbstractC8209sW.b(c4057dh);
            this.F = 16384;
        }

        @Override // com.daaw.InterfaceC8464tQ
        public synchronized void D0(int i, EnumC7034oH enumC7034oH, byte[] bArr) {
            try {
                if (this.G) {
                    throw new IOException("closed");
                }
                if (enumC7034oH.B == -1) {
                    throw C8488tW.j("errorCode.httpCode == -1", new Object[0]);
                }
                c(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.B.C(i);
                this.B.C(enumC7034oH.B);
                if (bArr.length > 0) {
                    this.B.J0(bArr);
                }
                this.B.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.daaw.InterfaceC8464tQ
        public synchronized void M() {
            try {
                if (this.G) {
                    throw new IOException("closed");
                }
                if (this.C) {
                    if (C8488tW.a.isLoggable(Level.FINE)) {
                        C8488tW.a.fine(String.format(">> CONNECTION %s", C8488tW.b.l()));
                    }
                    this.B.J0(C8488tW.b.x());
                    this.B.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.daaw.InterfaceC8464tQ
        public synchronized void R0(CQ0 cq0) {
            if (this.G) {
                throw new IOException("closed");
            }
            this.F = cq0.c(this.F);
            c(0, 0, (byte) 4, (byte) 1);
            this.B.flush();
        }

        @Override // com.daaw.InterfaceC8464tQ
        public int V0() {
            return this.F;
        }

        @Override // com.daaw.InterfaceC8464tQ
        public synchronized void W0(boolean z, boolean z2, int i, int i2, List list) {
            if (z2) {
                throw new UnsupportedOperationException();
            }
            if (this.G) {
                throw new IOException("closed");
            }
            d(z, i, list);
        }

        public void a(int i, byte b, C4057dh c4057dh, int i2) {
            c(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.B.O0(c4057dh, i2);
            }
        }

        public void c(int i, int i2, byte b, byte b2) {
            if (C8488tW.a.isLoggable(Level.FINE)) {
                C8488tW.a.fine(b.b(false, i, i2, b, b2));
            }
            int i3 = this.F;
            if (i2 > i3) {
                throw C8488tW.j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            if ((Integer.MIN_VALUE & i) != 0) {
                throw C8488tW.j("reserved bit set: %s", Integer.valueOf(i));
            }
            C8488tW.n(this.B, i2);
            this.B.L(b & 255);
            this.B.L(b2 & 255);
            this.B.C(i & Integer.MAX_VALUE);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.G = true;
            this.B.close();
        }

        public void d(boolean z, int i, List list) throws IOException {
            if (this.G) {
                throw new IOException("closed");
            }
            this.E.e(list);
            long jF1 = this.D.f1();
            int iMin = (int) Math.min(this.F, jF1);
            long j = iMin;
            byte b = jF1 == j ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            c(i, iMin, (byte) 1, b);
            this.B.O0(this.D, j);
            if (jF1 > j) {
                j(i, jF1 - j);
            }
        }

        @Override // com.daaw.InterfaceC8464tQ
        public synchronized void f(int i, EnumC7034oH enumC7034oH) {
            if (this.G) {
                throw new IOException("closed");
            }
            if (enumC7034oH.B == -1) {
                throw new IllegalArgumentException();
            }
            c(i, 4, (byte) 3, (byte) 0);
            this.B.C(enumC7034oH.B);
            this.B.flush();
        }

        @Override // com.daaw.InterfaceC8464tQ
        public synchronized void flush() {
            if (this.G) {
                throw new IOException("closed");
            }
            this.B.flush();
        }

        @Override // com.daaw.InterfaceC8464tQ
        public synchronized void g(int i, long j) {
            if (this.G) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw C8488tW.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            }
            c(i, 4, (byte) 8, (byte) 0);
            this.B.C((int) j);
            this.B.flush();
        }

        @Override // com.daaw.InterfaceC8464tQ
        public synchronized void h(boolean z, int i, int i2) {
            if (this.G) {
                throw new IOException("closed");
            }
            c(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.B.C(i);
            this.B.C(i2);
            this.B.flush();
        }

        public final void j(int i, long j) {
            while (j > 0) {
                int iMin = (int) Math.min(this.F, j);
                long j2 = iMin;
                j -= j2;
                c(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
                this.B.O0(this.D, j2);
            }
        }

        @Override // com.daaw.InterfaceC8464tQ
        public synchronized void k0(CQ0 cq0) {
            try {
                if (this.G) {
                    throw new IOException("closed");
                }
                int i = 0;
                c(0, cq0.f() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (cq0.d(i)) {
                        this.B.y(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.B.C(cq0.a(i));
                    }
                    i++;
                }
                this.B.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.daaw.InterfaceC8464tQ
        public synchronized void x(boolean z, int i, C4057dh c4057dh, int i2) {
            if (this.G) {
                throw new IOException("closed");
            }
            a(i, z ? (byte) 1 : (byte) 0, c4057dh, i2);
        }
    }

    public static IllegalArgumentException j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static IOException k(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    public static int l(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public static int m(InterfaceC7424ph interfaceC7424ph) {
        return (interfaceC7424ph.j0() & 255) | ((interfaceC7424ph.j0() & 255) << 16) | ((interfaceC7424ph.j0() & 255) << 8);
    }

    public static void n(InterfaceC7145oh interfaceC7145oh, int i) {
        interfaceC7145oh.L((i >>> 16) & 255);
        interfaceC7145oh.L((i >>> 8) & 255);
        interfaceC7145oh.L(i & 255);
    }

    @Override // com.daaw.InterfaceC1146Ic1
    public InterfaceC7628qQ a(InterfaceC7424ph interfaceC7424ph, boolean z) {
        return new c(interfaceC7424ph, 4096, z);
    }

    @Override // com.daaw.InterfaceC1146Ic1
    public InterfaceC8464tQ b(InterfaceC7145oh interfaceC7145oh, boolean z) {
        return new d(interfaceC7145oh, z);
    }

    /* JADX INFO: renamed from: com.daaw.tW$a */
    public static final class a implements PU0, AutoCloseable {
        public final InterfaceC7424ph B;
        public int C;
        public byte D;
        public int E;
        public int F;
        public short G;

        public a(InterfaceC7424ph interfaceC7424ph) {
            this.B = interfaceC7424ph;
        }

        @Override // com.daaw.PU0
        public long A0(C4057dh c4057dh, long j) throws IOException {
            while (true) {
                int i = this.F;
                if (i != 0) {
                    long jA0 = this.B.A0(c4057dh, Math.min(j, i));
                    if (jA0 == -1) {
                        return -1L;
                    }
                    this.F -= (int) jA0;
                    return jA0;
                }
                this.B.skip(this.G);
                this.G = (short) 0;
                if ((this.D & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }

        public final void a() throws IOException {
            int i = this.E;
            int iM = C8488tW.m(this.B);
            this.F = iM;
            this.C = iM;
            byte bJ0 = (byte) (this.B.j0() & 255);
            this.D = (byte) (this.B.j0() & 255);
            if (C8488tW.a.isLoggable(Level.FINE)) {
                C8488tW.a.fine(b.b(true, this.E, this.C, bJ0, this.D));
            }
            int iB = this.B.B() & Integer.MAX_VALUE;
            this.E = iB;
            if (bJ0 != 9) {
                throw C8488tW.k("%s != TYPE_CONTINUATION", Byte.valueOf(bJ0));
            }
            if (iB != i) {
                throw C8488tW.k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // com.daaw.PU0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
