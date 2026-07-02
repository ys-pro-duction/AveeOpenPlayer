package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Rn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2146Rn0 implements InterfaceC0539Cj {
    public final InterfaceC6440m81 a;
    public LQ b;
    public final C2146Rn0 c;
    public final Z71 d;
    public final O90 e;

    public C2146Rn0(InterfaceC6440m81 interfaceC6440m81, LQ lq, C2146Rn0 c2146Rn0, Z71 z71) {
        G10.g(interfaceC6440m81, "projection");
        this.a = interfaceC6440m81;
        this.b = lq;
        this.c = c2146Rn0;
        this.d = z71;
        this.e = AbstractC3192ab0.b(EnumC7395pb0.C, new C1708Nn0(this));
    }

    public static final List f(List list) {
        G10.g(list, "$supertypes");
        return list;
    }

    public static final List g(C2146Rn0 c2146Rn0) {
        G10.g(c2146Rn0, "this$0");
        LQ lq = c2146Rn0.b;
        if (lq != null) {
            return (List) lq.invoke();
        }
        return null;
    }

    public static final List o(List list) {
        G10.g(list, "$supertypes");
        return list;
    }

    public static final List r(C2146Rn0 c2146Rn0, Q80 q80) {
        G10.g(c2146Rn0, "this$0");
        G10.g(q80, "$kotlinTypeRefiner");
        List listB = c2146Rn0.b();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC5708ja1) it.next()).X0(q80));
        }
        return arrayList;
    }

    @Override // com.daaw.C71
    public InterfaceC10240zl c() {
        return null;
    }

    @Override // com.daaw.C71
    public boolean d() {
        return false;
    }

    @Override // com.daaw.InterfaceC0539Cj
    public InterfaceC6440m81 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!G10.c(C2146Rn0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        G10.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C2146Rn0 c2146Rn0 = (C2146Rn0) obj;
        C2146Rn0 c2146Rn02 = this.c;
        if (c2146Rn02 == null) {
            c2146Rn02 = this;
        }
        C2146Rn0 c2146Rn03 = c2146Rn0.c;
        if (c2146Rn03 != null) {
            obj = c2146Rn03;
        }
        return c2146Rn02 == obj;
    }

    @Override // com.daaw.C71
    public List getParameters() {
        return AbstractC1599Mm.k();
    }

    public int hashCode() {
        C2146Rn0 c2146Rn0 = this.c;
        return c2146Rn0 != null ? c2146Rn0.hashCode() : super.hashCode();
    }

    @Override // com.daaw.C71
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List b() {
        List listM = m();
        return listM == null ? AbstractC1599Mm.k() : listM;
    }

    public final List m() {
        return (List) this.e.getValue();
    }

    public final void n(List list) {
        G10.g(list, "supertypes");
        this.b = new C1916Pn0(list);
    }

    @Override // com.daaw.C71
    public AbstractC8670u80 p() {
        I80 type = e().getType();
        G10.f(type, "getType(...)");
        return H81.n(type);
    }

    @Override // com.daaw.C71
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C2146Rn0 a(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        InterfaceC6440m81 interfaceC6440m81A = e().a(q80);
        G10.f(interfaceC6440m81A, "refine(...)");
        C2042Qn0 c2042Qn0 = this.b != null ? new C2042Qn0(this, q80) : null;
        C2146Rn0 c2146Rn0 = this.c;
        if (c2146Rn0 == null) {
            c2146Rn0 = this;
        }
        return new C2146Rn0(interfaceC6440m81A, c2042Qn0, c2146Rn0, this.d);
    }

    public String toString() {
        return "CapturedType(" + e() + ')';
    }

    public /* synthetic */ C2146Rn0(InterfaceC6440m81 interfaceC6440m81, LQ lq, C2146Rn0 c2146Rn0, Z71 z71, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC6440m81, (i & 2) != 0 ? null : lq, (i & 4) != 0 ? null : c2146Rn0, (i & 8) != 0 ? null : z71);
    }

    public /* synthetic */ C2146Rn0(InterfaceC6440m81 interfaceC6440m81, List list, C2146Rn0 c2146Rn0, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC6440m81, list, (i & 4) != 0 ? null : c2146Rn0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2146Rn0(InterfaceC6440m81 interfaceC6440m81, List list, C2146Rn0 c2146Rn0) {
        this(interfaceC6440m81, new C1812On0(list), c2146Rn0, null, 8, null);
        G10.g(interfaceC6440m81, "projection");
        G10.g(list, "supertypes");
    }
}
