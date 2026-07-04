package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.ek0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4351ek0 extends S01 {
    public C4351ek0 f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public int h(int i) {
        int iB = b(16);
        if (iB != 0) {
            return this.b.getInt(d(iB) + (i * 4));
        }
        return 0;
    }

    public int i() {
        int iB = b(16);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public boolean j() {
        int iB = b(6);
        return (iB == 0 || this.b.get(iB + this.a) == 0) ? false : true;
    }

    public short k() {
        int iB = b(14);
        if (iB != 0) {
            return this.b.getShort(iB + this.a);
        }
        return (short) 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.b.getInt(iB + this.a);
        }
        return 0;
    }

    public short m() {
        int iB = b(8);
        if (iB != 0) {
            return this.b.getShort(iB + this.a);
        }
        return (short) 0;
    }

    public short n() {
        int iB = b(12);
        if (iB != 0) {
            return this.b.getShort(iB + this.a);
        }
        return (short) 0;
    }
}
