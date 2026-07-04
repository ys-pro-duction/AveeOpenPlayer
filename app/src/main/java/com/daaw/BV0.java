package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class BV0 implements InterfaceC5866k7 {
    public final float a;
    public final float b;
    public final Object c;

    public BV0(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BV0) {
            BV0 bv0 = (BV0) obj;
            if (bv0.a == this.a && bv0.b == this.b && G10.c(bv0.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceC5866k7
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6569md1 e(InterfaceC3626c71 interfaceC3626c71) {
        G10.g(interfaceC3626c71, "converter");
        return new C6569md1(this.a, this.b, AbstractC6154l7.b(interfaceC3626c71, this.c));
    }

    public int hashCode() {
        Object obj = this.c;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b);
    }

    public /* synthetic */ BV0(float f, float f2, Object obj, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
