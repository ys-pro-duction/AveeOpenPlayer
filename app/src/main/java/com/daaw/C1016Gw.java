package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.Gw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1016Gw extends AbstractC4335eh {
    public final C0904Fu C = new C0904Fu();
    public ByteBuffer D;
    public long E;
    public final int F;

    public C1016Gw(int i) {
        this.F = i;
    }

    public static C1016Gw x() {
        return new C1016Gw(0);
    }

    @Override // com.daaw.AbstractC4335eh
    public void l() {
        super.l();
        ByteBuffer byteBuffer = this.D;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final ByteBuffer s(int i) {
        int i2 = this.F;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.D;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    public void t(int i) {
        ByteBuffer byteBuffer = this.D;
        if (byteBuffer == null) {
            this.D = s(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.D.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            return;
        }
        ByteBuffer byteBufferS = s(i2);
        if (iPosition > 0) {
            this.D.position(0);
            this.D.limit(iPosition);
            byteBufferS.put(this.D);
        }
        this.D = byteBufferS;
    }

    public final void u() {
        this.D.flip();
    }

    public final boolean v() {
        return n(1073741824);
    }

    public final boolean w() {
        return this.D == null && this.F == 0;
    }
}
