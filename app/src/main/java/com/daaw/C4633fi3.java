package com.daaw;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.daaw.fi3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4633fi3 extends AbstractC5191hi3 {
    public C4633fi3(Unsafe unsafe) {
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

    /* JADX WARN: Failed to inline method: com.daaw.ji3.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.daaw.ji3.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.daaw.ji3.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.daaw.ji3.o(java.lang.Object, long, boolean):void */
    @Override // com.daaw.AbstractC5191hi3
    public final void c(Object obj, long j, boolean z) {
        if (AbstractC5750ji3.h) {
            AbstractC5750ji3.n(obj, j, z);
        } else {
            AbstractC5750ji3.o(obj, j, z);
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
