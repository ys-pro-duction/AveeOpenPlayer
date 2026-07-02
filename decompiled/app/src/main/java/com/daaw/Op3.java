package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Op3 extends Jp3 {
    public static final Object i = new Object();
    public final Object g;
    public final Object h;

    public Op3(AbstractC8657u52 abstractC8657u52, Object obj, Object obj2) {
        super(abstractC8657u52);
        this.g = obj;
        this.h = obj2;
    }

    public static Op3 q(YL1 yl1) {
        return new Op3(new Pp3(yl1), Q42.p, i);
    }

    public static Op3 r(AbstractC8657u52 abstractC8657u52, Object obj, Object obj2) {
        return new Op3(abstractC8657u52, obj, obj2);
    }

    @Override // com.daaw.Jp3, com.daaw.AbstractC8657u52
    public final int a(Object obj) {
        Object obj2;
        if (i.equals(obj) && (obj2 = this.h) != null) {
            obj = obj2;
        }
        return this.f.a(obj);
    }

    @Override // com.daaw.Jp3, com.daaw.AbstractC8657u52
    public final H32 d(int i2, H32 h32, boolean z) {
        this.f.d(i2, h32, z);
        if (AbstractC9004vJ2.e(h32.b, this.h) && z) {
            h32.b = i;
        }
        return h32;
    }

    @Override // com.daaw.Jp3, com.daaw.AbstractC8657u52
    public final Q42 e(int i2, Q42 q42, long j) {
        this.f.e(i2, q42, j);
        if (AbstractC9004vJ2.e(q42.a, this.g)) {
            q42.a = Q42.p;
        }
        return q42;
    }

    @Override // com.daaw.Jp3, com.daaw.AbstractC8657u52
    public final Object f(int i2) {
        Object objF = this.f.f(i2);
        return AbstractC9004vJ2.e(objF, this.h) ? i : objF;
    }

    public final Op3 p(AbstractC8657u52 abstractC8657u52) {
        return new Op3(abstractC8657u52, this.g, this.h);
    }
}
