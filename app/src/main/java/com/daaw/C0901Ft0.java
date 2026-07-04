package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ft0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0901Ft0 implements PU0, AutoCloseable {
    public final InterfaceC7424ph B;
    public final C4057dh C;
    public FO0 D;
    public int E;
    public boolean F;
    public long G;

    public C0901Ft0(InterfaceC7424ph interfaceC7424ph) {
        this.B = interfaceC7424ph;
        C4057dh c4057dhT = interfaceC7424ph.t();
        this.C = c4057dhT;
        FO0 fo0 = c4057dhT.B;
        this.D = fo0;
        this.E = fo0 != null ? fo0.b : -1;
    }

    @Override // com.daaw.PU0
    public long A0(C4057dh c4057dh, long j) {
        FO0 fo0;
        FO0 fo02;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.F) {
            throw new IllegalStateException("closed");
        }
        FO0 fo03 = this.D;
        if (fo03 != null && (fo03 != (fo02 = this.C.B) || this.E != fo02.b)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.B.v0(this.G + 1)) {
            return -1L;
        }
        if (this.D == null && (fo0 = this.C.B) != null) {
            this.D = fo0;
            this.E = fo0.b;
        }
        long jMin = Math.min(j, this.C.C - this.G);
        this.C.l(c4057dh, this.G, jMin);
        this.G += jMin;
        return jMin;
    }

    @Override // com.daaw.PU0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.F = true;
    }
}
