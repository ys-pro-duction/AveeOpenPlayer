package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class F91 implements InterfaceC4905gh1 {
    public final InterfaceC4905gh1 a;
    public final InterfaceC4905gh1 b;

    public F91(InterfaceC4905gh1 interfaceC4905gh1, InterfaceC4905gh1 interfaceC4905gh12) {
        G10.g(interfaceC4905gh1, "first");
        G10.g(interfaceC4905gh12, "second");
        this.a = interfaceC4905gh1;
        this.b = interfaceC4905gh12;
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int a(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        return Math.max(this.a.a(interfaceC4988gz, enumC7560q90), this.b.a(interfaceC4988gz, enumC7560q90));
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int b(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return Math.max(this.a.b(interfaceC4988gz), this.b.b(interfaceC4988gz));
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int c(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        return Math.max(this.a.c(interfaceC4988gz, enumC7560q90), this.b.c(interfaceC4988gz, enumC7560q90));
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int d(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return Math.max(this.a.d(interfaceC4988gz), this.b.d(interfaceC4988gz));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F91)) {
            return false;
        }
        F91 f91 = (F91) obj;
        return G10.c(f91.a, this.a) && G10.c(f91.b, this.b);
    }

    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.a + " ∪ " + this.b + ')';
    }
}
