package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.l71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6156l71 {
    public static final a e = new a(null);
    public final C6156l71 a;
    public final InterfaceC5586j71 b;
    public final List c;
    public final Map d;

    /* JADX INFO: renamed from: com.daaw.l71$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C6156l71 a(C6156l71 c6156l71, InterfaceC5586j71 interfaceC5586j71, List list) {
            G10.g(interfaceC5586j71, "typeAliasDescriptor");
            G10.g(list, "arguments");
            List parameters = interfaceC5586j71.k().getParameters();
            G10.f(parameters, "getParameters(...)");
            List list2 = parameters;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Z71) it.next()).a());
            }
            return new C6156l71(c6156l71, interfaceC5586j71, list, AbstractC1473Lg0.t(AbstractC2455Um.T0(arrayList, list)), null);
        }

        public a() {
        }
    }

    public /* synthetic */ C6156l71(C6156l71 c6156l71, InterfaceC5586j71 interfaceC5586j71, List list, Map map, AbstractC2911Yw abstractC2911Yw) {
        this(c6156l71, interfaceC5586j71, list, map);
    }

    public final List a() {
        return this.c;
    }

    public final InterfaceC5586j71 b() {
        return this.b;
    }

    public final InterfaceC6440m81 c(C71 c71) {
        G10.g(c71, "constructor");
        InterfaceC10240zl interfaceC10240zlC = c71.c();
        if (interfaceC10240zlC instanceof Z71) {
            return (InterfaceC6440m81) this.d.get(interfaceC10240zlC);
        }
        return null;
    }

    public final boolean d(InterfaceC5586j71 interfaceC5586j71) {
        G10.g(interfaceC5586j71, "descriptor");
        if (G10.c(this.b, interfaceC5586j71)) {
            return true;
        }
        C6156l71 c6156l71 = this.a;
        return c6156l71 != null ? c6156l71.d(interfaceC5586j71) : false;
    }

    public C6156l71(C6156l71 c6156l71, InterfaceC5586j71 interfaceC5586j71, List list, Map map) {
        this.a = c6156l71;
        this.b = interfaceC5586j71;
        this.c = list;
        this.d = map;
    }
}
