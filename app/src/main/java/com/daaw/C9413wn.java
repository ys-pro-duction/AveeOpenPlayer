package com.daaw;

import com.daaw.InterfaceC1073Hk0;

/* JADX INFO: renamed from: com.daaw.wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9413wn implements InterfaceC1073Hk0 {
    public final InterfaceC1073Hk0 B;
    public final InterfaceC1073Hk0 C;

    /* JADX INFO: renamed from: com.daaw.wn$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, InterfaceC1073Hk0.b bVar) {
            G10.g(str, "acc");
            G10.g(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C9413wn(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC1073Hk0 interfaceC1073Hk02) {
        G10.g(interfaceC1073Hk0, "outer");
        G10.g(interfaceC1073Hk02, "inner");
        this.B = interfaceC1073Hk0;
        this.C = interfaceC1073Hk02;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public boolean I(NQ nq) {
        G10.g(nq, "predicate");
        return this.B.I(nq) && this.C.I(nq);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9413wn)) {
            return false;
        }
        C9413wn c9413wn = (C9413wn) obj;
        return G10.c(this.B, c9413wn.B) && G10.c(this.C, c9413wn.C);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "operation");
        return this.B.f(this.C.f(obj, interfaceC3429bR), interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    public int hashCode() {
        return this.B.hashCode() + (this.C.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) x("", a.B)) + ']';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "operation");
        return this.C.x(this.B.x(obj, interfaceC3429bR), interfaceC3429bR);
    }
}
