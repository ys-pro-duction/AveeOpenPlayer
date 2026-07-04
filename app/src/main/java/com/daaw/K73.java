package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K73 extends I73 implements InterfaceC2697Wu1 {
    public int L;

    public K73(String str) {
        super("mvhd");
    }

    public final int f() {
        if (!this.D) {
            e();
        }
        return this.L;
    }

    public final long g(ByteBuffer byteBuffer) {
        this.L = AbstractC2593Vu1.c(byteBuffer.get());
        AbstractC2593Vu1.d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
