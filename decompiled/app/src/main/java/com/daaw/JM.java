package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class JM implements InterfaceC4905gh1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public JM(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int a(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        return this.c;
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int b(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return this.d;
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int c(InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90) {
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        return this.a;
    }

    @Override // com.daaw.InterfaceC4905gh1
    public int d(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JM)) {
            return false;
        }
        JM jm = (JM) obj;
        return this.a == jm.a && this.b == jm.b && this.c == jm.c && this.d == jm.d;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "Insets(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ')';
    }
}
