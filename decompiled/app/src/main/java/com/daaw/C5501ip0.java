package com.daaw;

import com.google.firebase.Timestamp;

/* JADX INFO: renamed from: com.daaw.ip0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5501ip0 implements InterfaceC6146l51 {
    public C6564mc1 a;

    public C5501ip0(C6564mc1 c6564mc1) {
        AbstractC6557mb.d(AbstractC0513Cc1.A(c6564mc1), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.a = c6564mc1;
    }

    @Override // com.daaw.InterfaceC6146l51
    public C6564mc1 a(C6564mc1 c6564mc1, Timestamp timestamp) {
        C6564mc1 c6564mc1B = b(c6564mc1);
        if (AbstractC0513Cc1.v(c6564mc1B) && AbstractC0513Cc1.v(this.a)) {
            return (C6564mc1) C6564mc1.x0().D(g(c6564mc1B.r0(), f())).n();
        }
        if (AbstractC0513Cc1.v(c6564mc1B)) {
            return (C6564mc1) C6564mc1.x0().B(c6564mc1B.r0() + e()).n();
        }
        AbstractC6557mb.d(AbstractC0513Cc1.u(c6564mc1B), "Expected NumberValue to be of type DoubleValue, but was ", c6564mc1.getClass().getCanonicalName());
        return (C6564mc1) C6564mc1.x0().B(c6564mc1B.p0() + e()).n();
    }

    @Override // com.daaw.InterfaceC6146l51
    public C6564mc1 b(C6564mc1 c6564mc1) {
        return AbstractC0513Cc1.A(c6564mc1) ? c6564mc1 : (C6564mc1) C6564mc1.x0().D(0L).n();
    }

    public C6564mc1 d() {
        return this.a;
    }

    public final double e() {
        if (AbstractC0513Cc1.u(this.a)) {
            return this.a.p0();
        }
        if (AbstractC0513Cc1.v(this.a)) {
            return this.a.r0();
        }
        throw AbstractC6557mb.a("Expected 'operand' to be of Number type, but was " + this.a.getClass().getCanonicalName(), new Object[0]);
    }

    public final long f() {
        if (AbstractC0513Cc1.u(this.a)) {
            return (long) this.a.p0();
        }
        if (AbstractC0513Cc1.v(this.a)) {
            return this.a.r0();
        }
        throw AbstractC6557mb.a("Expected 'operand' to be of Number type, but was " + this.a.getClass().getCanonicalName(), new Object[0]);
    }

    public final long g(long j, long j2) {
        long j3 = j + j2;
        return ((j ^ j3) & (j2 ^ j3)) >= 0 ? j3 : j3 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    @Override // com.daaw.InterfaceC6146l51
    public C6564mc1 c(C6564mc1 c6564mc1, C6564mc1 c6564mc12) {
        return c6564mc12;
    }
}
