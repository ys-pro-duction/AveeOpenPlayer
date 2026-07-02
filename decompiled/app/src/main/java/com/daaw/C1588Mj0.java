package com.daaw;

import com.daaw.InterfaceC8843um;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Mj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1588Mj0 implements InterfaceC8743uQ {
    public final d a;
    public InterfaceC7157oj1 c;
    public final InterfaceC7436pj1 h;
    public final C5695jX0 i;
    public boolean j;
    public int k;
    public long m;
    public int b = -1;
    public InterfaceC2675Wp d = InterfaceC8843um.b.a;
    public boolean e = true;
    public final c f = new c();
    public final ByteBuffer g = ByteBuffer.allocate(5);
    public int l = -1;

    /* JADX INFO: renamed from: com.daaw.Mj0$d */
    public interface d {
        void o(InterfaceC7157oj1 interfaceC7157oj1, boolean z, boolean z2, int i);
    }

    public C1588Mj0(d dVar, InterfaceC7436pj1 interfaceC7436pj1, C5695jX0 c5695jX0) {
        this.a = (d) AbstractC7785qy0.o(dVar, "sink");
        this.h = (InterfaceC7436pj1) AbstractC7785qy0.o(interfaceC7436pj1, "bufferAllocator");
        this.i = (C5695jX0) AbstractC7785qy0.o(c5695jX0, "statsTraceCtx");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int o(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof CD) {
            return ((CD) inputStream).a(outputStream);
        }
        long jB = AbstractC4062di.b(inputStream, outputStream);
        AbstractC7785qy0.i(jB <= 2147483647L, "Message size overflow: %s", jB);
        return (int) jB;
    }

    @Override // com.daaw.InterfaceC8743uQ
    public void c(InputStream inputStream) {
        j();
        this.k++;
        int i = this.l + 1;
        this.l = i;
        this.m = 0L;
        this.i.i(i);
        boolean z = this.e && this.d != InterfaceC8843um.b.a;
        try {
            int iG = g(inputStream);
            int iP = (iG == 0 || !z) ? p(inputStream, iG) : l(inputStream, iG);
            if (iG != -1 && iP != iG) {
                throw C6262lX0.t.q(String.format("Message length inaccurate %s != %s", Integer.valueOf(iP), Integer.valueOf(iG))).d();
            }
            long j = iP;
            this.i.k(j);
            this.i.l(this.m);
            this.i.j(this.l, this.m, j);
        } catch (IOException e) {
            throw C6262lX0.t.q("Failed to frame message").p(e).d();
        } catch (RuntimeException e2) {
            throw C6262lX0.t.q("Failed to frame message").p(e2).d();
        }
    }

    @Override // com.daaw.InterfaceC8743uQ
    public void close() {
        if (isClosed()) {
            return;
        }
        this.j = true;
        InterfaceC7157oj1 interfaceC7157oj1 = this.c;
        if (interfaceC7157oj1 != null && interfaceC7157oj1.b() == 0) {
            h();
        }
        f(true, true);
    }

    @Override // com.daaw.InterfaceC8743uQ
    public void e(int i) {
        AbstractC7785qy0.u(this.b == -1, "max size already set");
        this.b = i;
    }

    public final void f(boolean z, boolean z2) {
        InterfaceC7157oj1 interfaceC7157oj1 = this.c;
        this.c = null;
        this.a.o(interfaceC7157oj1, z, z2, this.k);
        this.k = 0;
    }

    @Override // com.daaw.InterfaceC8743uQ
    public void flush() {
        InterfaceC7157oj1 interfaceC7157oj1 = this.c;
        if (interfaceC7157oj1 == null || interfaceC7157oj1.b() <= 0) {
            return;
        }
        f(false, true);
    }

    public final int g(InputStream inputStream) {
        if ((inputStream instanceof InterfaceC4466f80) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    public final void h() {
        InterfaceC7157oj1 interfaceC7157oj1 = this.c;
        if (interfaceC7157oj1 != null) {
            interfaceC7157oj1.a();
            this.c = null;
        }
    }

    @Override // com.daaw.InterfaceC8743uQ
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1588Mj0 b(InterfaceC2675Wp interfaceC2675Wp) {
        this.d = (InterfaceC2675Wp) AbstractC7785qy0.o(interfaceC2675Wp, "Can't pass an empty compressor");
        return this;
    }

    @Override // com.daaw.InterfaceC8743uQ
    public boolean isClosed() {
        return this.j;
    }

    public final void j() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    public final void k(b bVar, boolean z) {
        int iB = bVar.b();
        this.g.clear();
        this.g.put(z ? (byte) 1 : (byte) 0).putInt(iB);
        InterfaceC7157oj1 interfaceC7157oj1A = this.h.a(5);
        interfaceC7157oj1A.c(this.g.array(), 0, this.g.position());
        if (iB == 0) {
            this.c = interfaceC7157oj1A;
            return;
        }
        this.a.o(interfaceC7157oj1A, false, false, this.k - 1);
        this.k = 1;
        List list = bVar.B;
        for (int i = 0; i < list.size() - 1; i++) {
            this.a.o((InterfaceC7157oj1) list.get(i), false, false, 0);
        }
        this.c = (InterfaceC7157oj1) list.get(list.size() - 1);
        this.m = iB;
    }

    public final int l(InputStream inputStream, int i) throws IOException {
        b bVar = new b();
        OutputStream outputStreamC = this.d.c(bVar);
        try {
            int iO = o(inputStream, outputStreamC);
            outputStreamC.close();
            int i2 = this.b;
            if (i2 >= 0 && iO > i2) {
                throw C6262lX0.o.q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iO), Integer.valueOf(this.b))).d();
            }
            k(bVar, true);
            return iO;
        } catch (Throwable th) {
            outputStreamC.close();
            throw th;
        }
    }

    public final int m(InputStream inputStream, int i) {
        int i2 = this.b;
        if (i2 >= 0 && i > i2) {
            throw C6262lX0.o.q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.b))).d();
        }
        this.g.clear();
        this.g.put((byte) 0).putInt(i);
        if (this.c == null) {
            this.c = this.h.a(this.g.position() + i);
        }
        n(this.g.array(), 0, this.g.position());
        return o(inputStream, this.f);
    }

    public final void n(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            InterfaceC7157oj1 interfaceC7157oj1 = this.c;
            if (interfaceC7157oj1 != null && interfaceC7157oj1.d() == 0) {
                f(false, false);
            }
            if (this.c == null) {
                this.c = this.h.a(i2);
            }
            int iMin = Math.min(i2, this.c.d());
            this.c.c(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    public final int p(InputStream inputStream, int i) throws IOException {
        if (i != -1) {
            this.m = i;
            return m(inputStream, i);
        }
        b bVar = new b();
        int iO = o(inputStream, bVar);
        int i2 = this.b;
        if (i2 >= 0 && iO > i2) {
            throw C6262lX0.o.q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iO), Integer.valueOf(this.b))).d();
        }
        k(bVar, false);
        return iO;
    }

    /* JADX INFO: renamed from: com.daaw.Mj0$c */
    public class c extends OutputStream {
        public c() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C1588Mj0.this.n(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Mj0$b */
    public final class b extends OutputStream {
        public final List B;
        public InterfaceC7157oj1 C;

        public b() {
            this.B = new ArrayList();
        }

        public final int b() {
            Iterator it = this.B.iterator();
            int iB = 0;
            while (it.hasNext()) {
                iB += ((InterfaceC7157oj1) it.next()).b();
            }
            return iB;
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            InterfaceC7157oj1 interfaceC7157oj1 = this.C;
            if (interfaceC7157oj1 == null || interfaceC7157oj1.d() <= 0) {
                write(new byte[]{(byte) i}, 0, 1);
            } else {
                this.C.e((byte) i);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            if (this.C == null) {
                InterfaceC7157oj1 interfaceC7157oj1A = C1588Mj0.this.h.a(i2);
                this.C = interfaceC7157oj1A;
                this.B.add(interfaceC7157oj1A);
            }
            while (i2 > 0) {
                int iMin = Math.min(i2, this.C.d());
                if (iMin == 0) {
                    InterfaceC7157oj1 interfaceC7157oj1A2 = C1588Mj0.this.h.a(Math.max(i2, this.C.b() * 2));
                    this.C = interfaceC7157oj1A2;
                    this.B.add(interfaceC7157oj1A2);
                } else {
                    this.C.c(bArr, i, iMin);
                    i += iMin;
                    i2 -= iMin;
                }
            }
        }
    }
}
