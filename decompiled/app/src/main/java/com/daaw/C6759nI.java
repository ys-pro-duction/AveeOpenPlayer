package com.daaw;

import com.daaw.C1716Np0;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.nI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6759nI implements InterfaceC8464tQ, AutoCloseable {
    public static final Logger E = Logger.getLogger(C1612Mp0.class.getName());
    public final a B;
    public final InterfaceC8464tQ C;
    public final C1716Np0 D = new C1716Np0(Level.FINE, C1612Mp0.class);

    /* JADX INFO: renamed from: com.daaw.nI$a */
    public interface a {
        void e(Throwable th);
    }

    public C6759nI(a aVar, InterfaceC8464tQ interfaceC8464tQ) {
        this.B = (a) AbstractC7785qy0.o(aVar, "transportExceptionHandler");
        this.C = (InterfaceC8464tQ) AbstractC7785qy0.o(interfaceC8464tQ, "frameWriter");
    }

    public static Level a(Throwable th) {
        return th.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void D0(int i, EnumC7034oH enumC7034oH, byte[] bArr) {
        this.D.c(C1716Np0.a.OUTBOUND, i, enumC7034oH, C4908gi.o(bArr));
        try {
            this.C.D0(i, enumC7034oH, bArr);
            this.C.flush();
        } catch (IOException e) {
            this.B.e(e);
        }
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void M() {
        try {
            this.C.M();
        } catch (IOException e) {
            this.B.e(e);
        }
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void R0(CQ0 cq0) {
        this.D.j(C1716Np0.a.OUTBOUND);
        try {
            this.C.R0(cq0);
        } catch (IOException e) {
            this.B.e(e);
        }
    }

    @Override // com.daaw.InterfaceC8464tQ
    public int V0() {
        return this.C.V0();
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void W0(boolean z, boolean z2, int i, int i2, List list) {
        try {
            this.C.W0(z, z2, i, i2, list);
        } catch (IOException e) {
            this.B.e(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.C.close();
        } catch (IOException e) {
            E.log(a(e), "Failed closing connection", (Throwable) e);
        }
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void f(int i, EnumC7034oH enumC7034oH) {
        this.D.h(C1716Np0.a.OUTBOUND, i, enumC7034oH);
        try {
            this.C.f(i, enumC7034oH);
        } catch (IOException e) {
            this.B.e(e);
        }
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void flush() {
        try {
            this.C.flush();
        } catch (IOException e) {
            this.B.e(e);
        }
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void g(int i, long j) {
        this.D.k(C1716Np0.a.OUTBOUND, i, j);
        try {
            this.C.g(i, j);
        } catch (IOException e) {
            this.B.e(e);
        }
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void h(boolean z, int i, int i2) {
        if (z) {
            this.D.f(C1716Np0.a.OUTBOUND, (4294967295L & ((long) i2)) | (((long) i) << 32));
        } else {
            this.D.e(C1716Np0.a.OUTBOUND, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.C.h(z, i, i2);
        } catch (IOException e) {
            this.B.e(e);
        }
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void k0(CQ0 cq0) {
        this.D.i(C1716Np0.a.OUTBOUND, cq0);
        try {
            this.C.k0(cq0);
        } catch (IOException e) {
            this.B.e(e);
        }
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void x(boolean z, int i, C4057dh c4057dh, int i2) {
        this.D.b(C1716Np0.a.OUTBOUND, i, c4057dh.t(), i2, z);
        try {
            this.C.x(z, i, c4057dh, i2);
        } catch (IOException e) {
            this.B.e(e);
        }
    }
}
