package com.daaw;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3490bf {
    public final InterfaceC4484fC0 a;
    public final J50 b;
    public InterfaceC4484fC0 c;
    public final InterfaceC3429bR d;
    public final EnumC4187e80 e;
    public List f;
    public C2021Qi g;

    public C3490bf(InterfaceC4484fC0 interfaceC4484fC0, J50 j50, InterfaceC4484fC0 interfaceC4484fC02, InterfaceC3429bR interfaceC3429bR, EnumC4187e80 enumC4187e80, List list) {
        G10.g(interfaceC4484fC0, "scopeQualifier");
        G10.g(j50, "primaryType");
        G10.g(interfaceC3429bR, "definition");
        G10.g(enumC4187e80, "kind");
        G10.g(list, "secondaryTypes");
        this.a = interfaceC4484fC0;
        this.b = j50;
        this.c = interfaceC4484fC02;
        this.d = interfaceC3429bR;
        this.e = enumC4187e80;
        this.f = list;
        this.g = new C2021Qi(null, 1, null);
    }

    public static final CharSequence h(J50 j50) {
        G10.g(j50, "it");
        return K50.a(j50);
    }

    public final InterfaceC3429bR b() {
        return this.d;
    }

    public final J50 c() {
        return this.b;
    }

    public final InterfaceC4484fC0 d() {
        return this.c;
    }

    public final InterfaceC4484fC0 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        G10.e(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        C3490bf c3490bf = (C3490bf) obj;
        return G10.c(this.b, c3490bf.b) && G10.c(this.c, c3490bf.c) && G10.c(this.a, c3490bf.a);
    }

    public final List f() {
        return this.f;
    }

    public final void g(List list) {
        G10.g(list, "<set-?>");
        this.f = list;
    }

    public int hashCode() {
        InterfaceC4484fC0 interfaceC4484fC0 = this.c;
        return ((((interfaceC4484fC0 != null ? interfaceC4484fC0.hashCode() : 0) * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.e);
        sb.append(": '");
        sb.append(K50.a(this.b));
        sb.append('\'');
        if (this.c != null) {
            sb.append(",qualifier:");
            sb.append(this.c);
        }
        if (!G10.c(this.a, PN0.e.a())) {
            sb.append(",scope:");
            sb.append(this.a);
        }
        if (!this.f.isEmpty()) {
            sb.append(",binds:");
            AbstractC2455Um.k0(this.f, sb, (124 & 2) != 0 ? ", " : ",", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new NQ() { // from class: com.daaw.af
                @Override // com.daaw.NQ
                public final Object invoke(Object obj) {
                    return C3490bf.h((J50) obj);
                }
            });
        }
        sb.append(']');
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }
}
