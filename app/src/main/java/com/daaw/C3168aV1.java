package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.aV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3168aV1 implements N73, AutoCloseable {
    public final ByteBuffer B;

    public C3168aV1(ByteBuffer byteBuffer) {
        this.B = byteBuffer.duplicate();
    }

    @Override // com.daaw.N73
    public final int T0(ByteBuffer byteBuffer) {
        if (this.B.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.B.remaining());
        byte[] bArr = new byte[iMin];
        this.B.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.daaw.N73
    public final void e(long j) {
        this.B.position((int) j);
    }

    @Override // com.daaw.N73
    public final ByteBuffer k(long j, long j2) {
        ByteBuffer byteBuffer = this.B;
        int i = (int) j;
        int iPosition = byteBuffer.position();
        byteBuffer.position(i);
        ByteBuffer byteBufferSlice = this.B.slice();
        byteBufferSlice.limit((int) j2);
        this.B.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.daaw.N73
    public final long zzb() {
        return this.B.position();
    }

    @Override // com.daaw.N73
    public final long zzc() {
        return this.B.limit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
