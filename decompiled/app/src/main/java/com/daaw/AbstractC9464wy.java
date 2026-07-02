package com.daaw;

/* JADX INFO: renamed from: com.daaw.wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9464wy {
    public static final C5872k80 a(C5872k80 c5872k80, J50 j50) {
        String value;
        G10.g(c5872k80, "<this>");
        G10.g(j50, "clazz");
        c5872k80.a().c().g(AbstractC2455Um.A0(c5872k80.a().c().f(), j50));
        InterfaceC4484fC0 interfaceC4484fC0D = c5872k80.a().c().d();
        InterfaceC4484fC0 interfaceC4484fC0E = c5872k80.a().c().e();
        StringBuilder sb = new StringBuilder();
        sb.append(K50.a(j50));
        sb.append(':');
        if (interfaceC4484fC0D == null || (value = interfaceC4484fC0D.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        sb.append(':');
        sb.append(interfaceC4484fC0E);
        String string = sb.toString();
        G10.f(string, "toString(...)");
        c5872k80.b().h(string, c5872k80.a());
        return c5872k80;
    }
}
