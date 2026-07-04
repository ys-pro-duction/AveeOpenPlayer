package com.daaw;

import android.content.Context;
import com.daaw.NW;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9991yr implements NW {
    public NW.c a;
    public WeakReference b;
    public WeakReference c;
    public HX d;
    public int e;
    public String f;
    public int g;
    public int h;
    public int i;
    public int j;
    public InterfaceC5694jX k;
    public int l;
    public String m;
    public boolean n;
    public boolean o;
    public static C0529Cg1 p = new C0529Cg1();
    public static C0746Eg1 q = new C0746Eg1();
    public static C0954Gg1 r = new C0954Gg1();
    public static C0954Gg1 s = new C0954Gg1();
    public static C1058Hg1 t = new C1058Hg1();
    public static C0850Fg1 u = new C0850Fg1();
    public static C0321Ag1 v = new C0321Ag1();
    public static C0425Bg1 w = new C0425Bg1();
    public static C0850Fg1 x = new C0850Fg1();
    public static C0954Gg1 y = new C0954Gg1();
    public static C0425Bg1 z = new C0425Bg1();
    public static C10217zg1 A = new C10217zg1();
    public static C0850Fg1 B = new C0850Fg1();

    /* JADX INFO: renamed from: com.daaw.yr$a */
    public static class a implements InterfaceC8771uX, InterfaceC5694jX {
        public String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.daaw.InterfaceC8771uX, com.daaw.InterfaceC5694jX
        public boolean equals(Object obj) {
            return (obj instanceof a) && this.a.compareTo(((a) obj).a) == 0;
        }

        @Override // com.daaw.InterfaceC5694jX
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public AbstractC9991yr(Context context, String str, HX hx, int i, int i2) {
        this(context, str, hx, i, i2, new WeakReference(null));
    }

    public static InterfaceC5694jX K(String str) {
        return new a(str);
    }

    public abstract boolean A();

    public boolean B(String str, boolean z2) {
        if (this.m != null && C(str)) {
            return true;
        }
        if (!z2) {
            return false;
        }
        this.m = str;
        return false;
    }

    public boolean C(String str) {
        String str2 = this.m;
        return (str2 == null || str == null || !AbstractC0405Bb1.h(str2, str)) ? false : true;
    }

    public void D() {
        this.m = null;
    }

    public abstract C1773Od1 E(Context context, int i);

    public C1773Od1 F(Context context) {
        return G(context, -1);
    }

    public C1773Od1 G(Context context, int i) {
        return E(context, i);
    }

    public abstract String H(int i);

    public int I() {
        return this.l;
    }

    public InterfaceC5694jX J() {
        return this.k;
    }

    public void L(boolean z2) {
        this.o = z2;
        NW.a aVar = (NW.a) this.b.get();
        if (aVar != null) {
            aVar.b(a(), 0, this.n, z2);
        }
    }

    public void M(NW.c cVar) {
        this.a = cVar;
    }

    public void N(boolean z2, boolean z3) {
        this.n = z2;
        NW.a aVar = (NW.a) this.b.get();
        if (aVar != null) {
            aVar.b(z3 ? a() : -1, 0, this.n, this.o);
        }
    }

    public void O(String str) {
        NW.a aVar = (NW.a) this.b.get();
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.daaw.NW, com.daaw.C1773Od1.a
    public abstract int a();

    @Override // com.daaw.NW
    public boolean b() {
        return ((Boolean) q.a(Boolean.TRUE)).booleanValue();
    }

    @Override // com.daaw.NW
    public String e() {
        return this.f;
    }

    @Override // com.daaw.NW
    public boolean g(boolean z2) {
        if (z2) {
            D();
        }
        return A();
    }

    @Override // com.daaw.NW
    public int h() {
        return this.e;
    }

    @Override // com.daaw.NW
    public HX k() {
        return this.d;
    }

    @Override // com.daaw.NW
    public boolean m(int i, Context context) {
        NW.b bVar = (NW.b) this.c.get();
        if (bVar == null) {
            return false;
        }
        bVar.a(e(), H(i));
        return false;
    }

    @Override // com.daaw.NW
    public void n(WeakReference weakReference) {
        this.b = weakReference;
        NW.a aVar = (NW.a) weakReference.get();
        if (aVar != null) {
            aVar.b(a(), 0, this.n, this.o);
        }
    }

    @Override // com.daaw.NW
    public String p(String str) {
        NW.b bVar = (NW.b) this.c.get();
        return bVar != null ? bVar.f(e(), str) : e();
    }

    @Override // com.daaw.NW
    public void q(WeakReference weakReference) {
        this.c = weakReference;
    }

    @Override // com.daaw.NW
    public B61 s() {
        return (B61) B.a(this, new B61(56, Boolean.TRUE));
    }

    @Override // com.daaw.NW
    public NW.c u() {
        return this.a;
    }

    @Override // com.daaw.NW
    public NW.b w() {
        return (NW.b) this.c.get();
    }

    @Override // com.daaw.NW
    public void x(Context context, String[] strArr, InterfaceC5694jX[] interfaceC5694jXArr) {
        strArr[0] = null;
        interfaceC5694jXArr[0] = null;
    }

    @Override // com.daaw.NW
    public boolean y(InterfaceC5694jX interfaceC5694jX) {
        return this.k.equals(interfaceC5694jX);
    }

    @Override // com.daaw.NW
    public boolean z() {
        return true;
    }

    public AbstractC9991yr(Context context, String str, HX hx, int i, int i2, WeakReference weakReference) {
        this.b = new WeakReference(null);
        this.m = null;
        this.n = false;
        this.o = false;
        this.l = i2;
        this.d = hx;
        this.e = i;
        this.f = str;
        q(weakReference);
        this.g = AbstractC1765Ob1.m(context.getTheme(), IC0.c);
        this.h = AbstractC1765Ob1.m(context.getTheme(), IC0.d);
        this.i = AbstractC1765Ob1.m(context.getTheme(), IC0.c);
        this.j = AbstractC1765Ob1.m(context.getTheme(), IC0.b);
        this.k = K(str);
    }

    @Override // com.daaw.NW
    public void c(boolean z2) {
    }

    @Override // com.daaw.NW
    public void l(int i) {
    }
}
