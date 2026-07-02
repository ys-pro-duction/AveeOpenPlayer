package com.daaw;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.daaw.xt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9724xt1 implements InterfaceC10003yt1 {
    public final ByteBuffer a;

    public C9724xt1(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // com.daaw.InterfaceC10003yt1
    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer byteBufferSlice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            byteBufferSlice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.daaw.InterfaceC10003yt1
    public final long zza() {
        return this.a.capacity();
    }
}
