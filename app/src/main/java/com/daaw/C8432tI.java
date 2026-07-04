package com.daaw;

/* JADX INFO: renamed from: com.daaw.tI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8432tI implements InterfaceC4905gh1 {
    public final InterfaceC4905gh1 a;
    public final InterfaceC4905gh1 b;

    public C8432tI(InterfaceC4905gh1 interfaceC4905gh1, InterfaceC4905gh1 interfaceC4905gh12) {
        G10.g(interfaceC4905gh1, "included");
        G10.g(interfaceC4905gh12, "excluded");
        this.a = interfaceC4905gh1;
        this.b = interfaceC4905gh12;
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int a(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        return AbstractC8417tE0.d(this.a.a(interfaceC4988gz, enumC7560q90) - this.b.a(interfaceC4988gz, enumC7560q90), 0);
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int b(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return AbstractC8417tE0.d(this.a.b(interfaceC4988gz) - this.b.b(interfaceC4988gz), 0);
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int c(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        return AbstractC8417tE0.d(this.a.c(interfaceC4988gz, enumC7560q90) - this.b.c(interfaceC4988gz, enumC7560q90), 0);
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int d(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return AbstractC8417tE0.d(this.a.d(interfaceC4988gz) - this.b.d(interfaceC4988gz), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8432tI)) {
            return false;
        }
        C8432tI c8432tI = (C8432tI) obj;
        return G10.c(c8432tI.a, this.a) && G10.c(c8432tI.b, this.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return '(' + this.a + " - " + this.b + ')';
    }
}
