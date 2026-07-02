package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.av1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3292av1 extends I73 {
    public ByteBuffer L;

    public C3292av1(String str) {
        super(str);
    }

    @Override // com.daaw.I73
    public final void c(ByteBuffer byteBuffer) {
        this.L = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
