package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class BP0 {
    public final String a;
    public final InterfaceC3429bR b;

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public BP0(String str, InterfaceC3429bR interfaceC3429bR) {
        G10.g(str, "name");
        G10.g(interfaceC3429bR, "mergePolicy");
        this.a = str;
        this.b = interfaceC3429bR;
    }

    public final String a() {
        return this.a;
    }

    public final Object b(Object obj, Object obj2) {
        return this.b.invoke(obj, obj2);
    }

    public final void c(CP0 cp0, W60 w60, Object obj) {
        G10.g(cp0, "thisRef");
        G10.g(w60, "property");
        cp0.e(this, obj);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.a;
    }

    public /* synthetic */ BP0(String str, InterfaceC3429bR interfaceC3429bR, int i, AbstractC2911Yw abstractC2911Yw) {
        this(str, (i & 2) != 0 ? a.B : interfaceC3429bR);
    }
}
