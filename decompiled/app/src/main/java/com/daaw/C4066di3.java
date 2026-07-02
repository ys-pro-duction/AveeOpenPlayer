package com.daaw;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.daaw.di3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4066di3 extends AbstractC5191hi3 {
    public C4066di3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.daaw.AbstractC5191hi3
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // com.daaw.AbstractC5191hi3
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // com.daaw.AbstractC5191hi3
    public final void c(Object obj, long j, boolean z) {
        if (AbstractC5750ji3.h) {
            AbstractC5750ji3.d(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            AbstractC5750ji3.e(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.daaw.AbstractC5191hi3
    public final void d(Object obj, long j, byte b) {
        if (AbstractC5750ji3.h) {
            AbstractC5750ji3.d(obj, j, b);
        } else {
            AbstractC5750ji3.e(obj, j, b);
        }
    }

    @Override // com.daaw.AbstractC5191hi3
    public final void e(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.daaw.AbstractC5191hi3
    public final void f(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.daaw.AbstractC5191hi3
    public final boolean g(Object obj, long j) {
        return AbstractC5750ji3.h ? AbstractC5750ji3.y(obj, j) : AbstractC5750ji3.z(obj, j);
    }
}
