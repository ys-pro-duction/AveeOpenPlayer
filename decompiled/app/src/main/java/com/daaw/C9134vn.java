package com.daaw;

import com.daaw.InterfaceC4684ft;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9134vn implements InterfaceC4684ft, Serializable {
    public final InterfaceC4684ft B;
    public final InterfaceC4684ft.b C;

    /* JADX INFO: renamed from: com.daaw.vn$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, InterfaceC4684ft.b bVar) {
            G10.g(str, "acc");
            G10.g(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C9134vn(InterfaceC4684ft interfaceC4684ft, InterfaceC4684ft.b bVar) {
        G10.g(interfaceC4684ft, "left");
        G10.g(bVar, "element");
        this.B = interfaceC4684ft;
        this.C = bVar;
    }

    private final int f() {
        int i = 2;
        C9134vn c9134vn = this;
        while (true) {
            InterfaceC4684ft interfaceC4684ft = c9134vn.B;
            c9134vn = interfaceC4684ft instanceof C9134vn ? (C9134vn) interfaceC4684ft : null;
            if (c9134vn == null) {
                return i;
            }
            i++;
        }
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft Q0(InterfaceC4684ft.c cVar) {
        G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        if (this.C.a(cVar) != null) {
            return this.B;
        }
        InterfaceC4684ft interfaceC4684ftQ0 = this.B.Q0(cVar);
        return interfaceC4684ftQ0 == this.B ? this : interfaceC4684ftQ0 == C5905kG.B ? this.C : new C9134vn(interfaceC4684ftQ0, this.C);
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft U(InterfaceC4684ft interfaceC4684ft) {
        return InterfaceC4684ft.a.a(this, interfaceC4684ft);
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft.b a(InterfaceC4684ft.c cVar) {
        G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        C9134vn c9134vn = this;
        while (true) {
            InterfaceC4684ft.b bVarA = c9134vn.C.a(cVar);
            if (bVarA != null) {
                return bVarA;
            }
            InterfaceC4684ft interfaceC4684ft = c9134vn.B;
            if (!(interfaceC4684ft instanceof C9134vn)) {
                return interfaceC4684ft.a(cVar);
            }
            c9134vn = (C9134vn) interfaceC4684ft;
        }
    }

    public final boolean b(InterfaceC4684ft.b bVar) {
        return G10.c(a(bVar.getKey()), bVar);
    }

    @Override // com.daaw.InterfaceC4684ft
    public Object c1(Object obj, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "operation");
        return interfaceC3429bR.invoke(this.B.c1(obj, interfaceC3429bR), this.C);
    }

    public final boolean e(C9134vn c9134vn) {
        while (b(c9134vn.C)) {
            InterfaceC4684ft interfaceC4684ft = c9134vn.B;
            if (!(interfaceC4684ft instanceof C9134vn)) {
                G10.e(interfaceC4684ft, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((InterfaceC4684ft.b) interfaceC4684ft);
            }
            c9134vn = (C9134vn) interfaceC4684ft;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9134vn)) {
            return false;
        }
        C9134vn c9134vn = (C9134vn) obj;
        return c9134vn.f() == f() && c9134vn.e(this);
    }

    public int hashCode() {
        return this.B.hashCode() + this.C.hashCode();
    }

    public String toString() {
        return '[' + ((String) c1("", a.B)) + ']';
    }
}
