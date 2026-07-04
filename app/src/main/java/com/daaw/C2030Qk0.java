package com.daaw;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Qk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2030Qk0 {
    public final boolean a;
    public final String b = AbstractC8391t80.a(C8112s80.a);
    public LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashSet e = new LinkedHashSet();
    public final List f = new ArrayList();

    public C2030Qk0(boolean z) {
        this.a = z;
    }

    public final LinkedHashSet a() {
        return this.c;
    }

    public final List b() {
        return this.f;
    }

    public final LinkedHashMap c() {
        return this.d;
    }

    public final LinkedHashSet d() {
        return this.e;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2030Qk0) {
            return G10.c(this.b, ((C2030Qk0) obj).b);
        }
        return false;
    }

    public final void f(AbstractC8072s00 abstractC8072s00) {
        String value;
        G10.g(abstractC8072s00, "instanceFactory");
        C3490bf c3490bfC = abstractC8072s00.c();
        J50 j50C = c3490bfC.c();
        InterfaceC4484fC0 interfaceC4484fC0D = c3490bfC.d();
        InterfaceC4484fC0 interfaceC4484fC0E = c3490bfC.e();
        StringBuilder sb = new StringBuilder();
        sb.append(K50.a(j50C));
        sb.append(':');
        if (interfaceC4484fC0D == null || (value = interfaceC4484fC0D.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        sb.append(':');
        sb.append(interfaceC4484fC0E);
        String string = sb.toString();
        G10.f(string, "toString(...)");
        h(string, abstractC8072s00);
    }

    public final void g(C7641qT0 c7641qT0) {
        G10.g(c7641qT0, "instanceFactory");
        this.c.add(c7641qT0);
    }

    public final void h(String str, AbstractC8072s00 abstractC8072s00) {
        G10.g(str, "mapping");
        G10.g(abstractC8072s00, "factory");
        this.d.put(str, abstractC8072s00);
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
