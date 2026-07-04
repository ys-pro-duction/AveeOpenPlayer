package com.daaw;

/* JADX INFO: renamed from: com.daaw.Sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2287Sw implements InterfaceC2539Vh {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public /* synthetic */ C2287Sw(long j, long j2, long j3, long j4, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2, j3, j4);
    }

    @Override // com.daaw.InterfaceC2539Vh
    public InterfaceC6258lW0 a(boolean z, InterfaceC5781jp interfaceC5781jp, int i) {
        interfaceC5781jp.e(-655254499);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(-655254499, i, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:583)");
        }
        InterfaceC6258lW0 interfaceC6258lW0I = AbstractC7923rU0.i(C2559Vm.i(z ? this.a : this.c), interfaceC5781jp, 0);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return interfaceC6258lW0I;
    }

    @Override // com.daaw.InterfaceC2539Vh
    public InterfaceC6258lW0 b(boolean z, InterfaceC5781jp interfaceC5781jp, int i) {
        interfaceC5781jp.e(-2133647540);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(-2133647540, i, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:588)");
        }
        InterfaceC6258lW0 interfaceC6258lW0I = AbstractC7923rU0.i(C2559Vm.i(z ? this.b : this.d), interfaceC5781jp, 0);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return interfaceC6258lW0I;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !G10.c(AbstractC5624jG0.b(C2287Sw.class), AbstractC5624jG0.b(obj.getClass()))) {
            return false;
        }
        C2287Sw c2287Sw = (C2287Sw) obj;
        return C2559Vm.o(this.a, c2287Sw.a) && C2559Vm.o(this.b, c2287Sw.b) && C2559Vm.o(this.c, c2287Sw.c) && C2559Vm.o(this.d, c2287Sw.d);
    }

    public int hashCode() {
        return (((((C2559Vm.u(this.a) * 31) + C2559Vm.u(this.b)) * 31) + C2559Vm.u(this.c)) * 31) + C2559Vm.u(this.d);
    }

    public C2287Sw(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }
}
