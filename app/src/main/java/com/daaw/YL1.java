package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class YL1 {
    public static final YL1 i = new C2705Ww1().c();
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final InterfaceC9666xh3 p = new InterfaceC9666xh3() { // from class: com.daaw.fv1
    };
    public final String a;
    public final MH1 b;
    public final MH1 c;
    public final C4222eG1 d;
    public final C9027vP1 e;
    public final AbstractC0501Bz1 f;
    public final NA1 g;
    public final LJ1 h;

    public /* synthetic */ YL1(String str, NA1 na1, MH1 mh1, C4222eG1 c4222eG1, C9027vP1 c9027vP1, LJ1 lj1, AbstractC7610qL1 abstractC7610qL1) {
        this.a = str;
        this.b = mh1;
        this.c = mh1;
        this.d = c4222eG1;
        this.e = c9027vP1;
        this.f = na1;
        this.g = na1;
        this.h = lj1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YL1)) {
            return false;
        }
        YL1 yl1 = (YL1) obj;
        return AbstractC9004vJ2.e(this.a, yl1.a) && this.f.equals(yl1.f) && AbstractC9004vJ2.e(this.b, yl1.b) && AbstractC9004vJ2.e(this.d, yl1.d) && AbstractC9004vJ2.e(this.e, yl1.e) && AbstractC9004vJ2.e(this.h, yl1.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        MH1 mh1 = this.b;
        return (((((((iHashCode + (mh1 != null ? mh1.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode()) * 31;
    }
}
