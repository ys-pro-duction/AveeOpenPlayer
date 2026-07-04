package com.daaw;

/* JADX INFO: renamed from: com.daaw.cx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3855cx implements InterfaceC9344wZ {
    public static final C3855cx a = new C3855cx();

    /* JADX INFO: renamed from: com.daaw.cx$a */
    public static final class a implements InterfaceC9623xZ {
        public final InterfaceC6258lW0 a;
        public final InterfaceC6258lW0 b;
        public final InterfaceC6258lW0 c;

        public a(InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, InterfaceC6258lW0 interfaceC6258lW03) {
            G10.g(interfaceC6258lW0, "isPressed");
            G10.g(interfaceC6258lW02, "isHovered");
            G10.g(interfaceC6258lW03, "isFocused");
            this.a = interfaceC6258lW0;
            this.b = interfaceC6258lW02;
            this.c = interfaceC6258lW03;
        }

        @Override // com.daaw.InterfaceC9623xZ
        public void a(InterfaceC2995Zr interfaceC2995Zr) {
            G10.g(interfaceC2995Zr, "<this>");
            interfaceC2995Zr.g0();
            if (((Boolean) this.a.getValue()).booleanValue()) {
                ND.h(interfaceC2995Zr, C2559Vm.m(C2559Vm.b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC2995Zr.a(), 0.0f, null, null, 0, 122, null);
            } else if (((Boolean) this.b.getValue()).booleanValue() || ((Boolean) this.c.getValue()).booleanValue()) {
                ND.h(interfaceC2995Zr, C2559Vm.m(C2559Vm.b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC2995Zr.a(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    @Override // com.daaw.InterfaceC9344wZ
    public InterfaceC9623xZ a(Z00 z00, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(z00, "interactionSource");
        interfaceC5781jp.e(1683566979);
        int i2 = i & 14;
        InterfaceC6258lW0 interfaceC6258lW0A = AbstractC6673mz0.a(z00, interfaceC5781jp, i2);
        InterfaceC6258lW0 interfaceC6258lW0A2 = AbstractC7652qW.a(z00, interfaceC5781jp, i2);
        InterfaceC6258lW0 interfaceC6258lW0A3 = NN.a(z00, interfaceC5781jp, i2);
        interfaceC5781jp.e(1157296644);
        boolean zP = interfaceC5781jp.P(z00);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            objF = new a(interfaceC6258lW0A, interfaceC6258lW0A2, interfaceC6258lW0A3);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        a aVar = (a) objF;
        interfaceC5781jp.L();
        return aVar;
    }
}
