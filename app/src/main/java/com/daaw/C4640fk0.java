package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.daaw.fk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4640fk0 extends S01 {
    public static C4640fk0 h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new C4640fk0());
    }

    public static C4640fk0 i(ByteBuffer byteBuffer, C4640fk0 c4640fk0) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c4640fk0.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public C4640fk0 f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public C4351ek0 j(C4351ek0 c4351ek0, int i) {
        int iB = b(6);
        if (iB != 0) {
            return c4351ek0.f(a(d(iB) + (i * 4)), this.b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.b.getInt(iB + this.a);
        }
        return 0;
    }
}
