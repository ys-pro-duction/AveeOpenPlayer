package com.daaw;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class H53 extends J53 {
    public H53(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.daaw.J53
    public final byte a(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // com.daaw.J53
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // com.daaw.J53
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // com.daaw.J53
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // com.daaw.J53
    public final void e(Object obj, long j, boolean z) {
        if (K53.i) {
            K53.g(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            K53.h(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.daaw.J53
    public final void f(Object obj, long j, byte b) {
        if (K53.i) {
            K53.g(obj, j, b);
        } else {
            K53.h(obj, j, b);
        }
    }

    @Override // com.daaw.J53
    public final void g(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.daaw.J53
    public final void h(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.daaw.J53
    public final boolean i(Object obj, long j) {
        return K53.i ? K53.E(obj, j) : K53.F(obj, j);
    }
}
