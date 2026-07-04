package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.u00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8630u00 {
    public final C4755g80 a;
    public final Map b;
    public final Map c;

    public C8630u00(C4755g80 c4755g80) {
        G10.g(c4755g80, "_koin");
        this.a = c4755g80;
        C8112s80 c8112s80 = C8112s80.a;
        this.b = c8112s80.d();
        this.c = c8112s80.d();
    }

    public static /* synthetic */ void i(C8630u00 c8630u00, boolean z, String str, AbstractC8072s00 abstractC8072s00, boolean z2, int i, Object obj) throws C9743xy {
        if ((i & 8) != 0) {
            z2 = true;
        }
        c8630u00.h(z, str, abstractC8072s00, z2);
    }

    public final void a(C2030Qk0 c2030Qk0) {
        for (C7641qT0 c7641qT0 : c2030Qk0.a()) {
            this.c.put(Integer.valueOf(c7641qT0.c().hashCode()), c7641qT0);
        }
    }

    public final void b() {
        C7641qT0[] c7641qT0Arr = (C7641qT0[]) this.c.values().toArray(new C7641qT0[0]);
        ArrayList arrayListG = AbstractC1599Mm.g(Arrays.copyOf(c7641qT0Arr, c7641qT0Arr.length));
        this.c.clear();
        c(arrayListG);
    }

    public final void c(Collection collection) {
        EI0 ei0 = new EI0(this.a.d(), this.a.e().b(), AbstractC5624jG0.b(AbstractC3814co0.class), null, null, 24, null);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((C7641qT0) it.next()).b(ei0);
        }
    }

    public final void d(C2030Qk0 c2030Qk0, boolean z) throws C9743xy {
        for (Map.Entry entry : c2030Qk0.c().entrySet()) {
            i(this, z, (String) entry.getKey(), (AbstractC8072s00) entry.getValue(), false, 8, null);
        }
    }

    public final void e(Set set, boolean z) throws C9743xy {
        G10.g(set, "modules");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C2030Qk0 c2030Qk0 = (C2030Qk0) it.next();
            d(c2030Qk0, z);
            a(c2030Qk0);
        }
    }

    public final AbstractC8072s00 f(J50 j50, InterfaceC4484fC0 interfaceC4484fC0, InterfaceC4484fC0 interfaceC4484fC02) {
        String value;
        G10.g(j50, "clazz");
        G10.g(interfaceC4484fC02, "scopeQualifier");
        StringBuilder sb = new StringBuilder();
        sb.append(K50.a(j50));
        sb.append(':');
        if (interfaceC4484fC0 == null || (value = interfaceC4484fC0.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        sb.append(':');
        sb.append(interfaceC4484fC02);
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return (AbstractC8072s00) this.b.get(string);
    }

    public final Object g(InterfaceC4484fC0 interfaceC4484fC0, J50 j50, InterfaceC4484fC0 interfaceC4484fC02, EI0 ei0) {
        G10.g(j50, "clazz");
        G10.g(interfaceC4484fC02, "scopeQualifier");
        G10.g(ei0, "instanceContext");
        AbstractC8072s00 abstractC8072s00F = f(j50, interfaceC4484fC0, interfaceC4484fC02);
        Object objB = abstractC8072s00F != null ? abstractC8072s00F.b(ei0) : null;
        if (objB == null) {
            return null;
        }
        return objB;
    }

    public final void h(boolean z, String str, AbstractC8072s00 abstractC8072s00, boolean z2) throws C9743xy {
        G10.g(str, "mapping");
        G10.g(abstractC8072s00, "factory");
        if (((AbstractC8072s00) this.b.get(str)) != null) {
            if (!z) {
                AbstractC4078dl0.b(abstractC8072s00, str);
            } else if (z2) {
                this.a.d().g("(+) override index '" + str + "' -> '" + abstractC8072s00.c() + '\'');
            }
        }
        this.a.d().a("(+) index '" + str + "' -> '" + abstractC8072s00.c() + '\'');
        this.b.put(str, abstractC8072s00);
    }

    public final int j() {
        return this.b.size();
    }
}
