package com.daaw;

/* JADX INFO: renamed from: com.daaw.wc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9360wc1 implements InterfaceC4905gh1 {
    public final String a;
    public final InterfaceC8007rm0 b;

    public C9360wc1(C4715g00 c4715g00, String str) {
        G10.g(c4715g00, "insets");
        G10.g(str, "name");
        this.a = str;
        this.b = AbstractC9046vU0.d(c4715g00, null, 2, null);
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int a(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        return e().c();
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int b(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return e().a();
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int c(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        return e().b();
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int d(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return e().d();
    }

    public final C4715g00 e() {
        return (C4715g00) this.b.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9360wc1) {
            return G10.c(e(), ((C9360wc1) obj).e());
        }
        return false;
    }

    public final void f(C4715g00 c4715g00) {
        G10.g(c4715g00, "<set-?>");
        this.b.setValue(c4715g00);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
