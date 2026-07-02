package com.daaw;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.daaw.dL2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3965dL2 extends EL2 {
    public C3965dL2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.daaw.EL2
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // com.daaw.EL2
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    /* JADX WARN: Failed to inline method: com.daaw.eM2.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.daaw.eM2.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.daaw.eM2.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.daaw.eM2.o(java.lang.Object, long, boolean):void */
    @Override // com.daaw.EL2
    public final void c(Object obj, long j, boolean z) {
        if (AbstractC4247eM2.h) {
            AbstractC4247eM2.n(obj, j, z);
        } else {
            AbstractC4247eM2.o(obj, j, z);
        }
    }

    @Override // com.daaw.EL2
    public final void d(Object obj, long j, byte b) {
        if (AbstractC4247eM2.h) {
            AbstractC4247eM2.d(obj, j, b);
        } else {
            AbstractC4247eM2.e(obj, j, b);
        }
    }

    @Override // com.daaw.EL2
    public final void e(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.daaw.EL2
    public final void f(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.daaw.EL2
    public final boolean g(Object obj, long j) {
        return AbstractC4247eM2.h ? AbstractC4247eM2.y(obj, j) : AbstractC4247eM2.z(obj, j);
    }
}
