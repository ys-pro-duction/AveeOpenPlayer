package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class E6 implements InterfaceC4905gh1 {
    public final int a;
    public final String b;
    public final InterfaceC8007rm0 c;
    public final InterfaceC8007rm0 d;

    public E6(int i, String str) {
        G10.g(str, "name");
        this.a = i;
        this.b = str;
        this.c = AbstractC9046vU0.d(C3590c00.e, null, 2, null);
        this.d = AbstractC9046vU0.d(Boolean.TRUE, null, 2, null);
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int a(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        return e().c;
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int b(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return e().d;
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int c(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        return e().a;
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int d(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return e().b;
    }

    public final C3590c00 e() {
        return (C3590c00) this.c.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E6) && this.a == ((E6) obj).a;
    }

    public final void f(C3590c00 c3590c00) {
        G10.g(c3590c00, "<set-?>");
        this.c.setValue(c3590c00);
    }

    public final void g(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void h(C8820uh1 c8820uh1, int i) {
        G10.g(c8820uh1, "windowInsetsCompat");
        if (i == 0 || (i & this.a) != 0) {
            f(c8820uh1.f(this.a));
            g(c8820uh1.r(this.a));
        }
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return this.b + '(' + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ')';
    }
}
