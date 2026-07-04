package com.daaw;

/* JADX INFO: renamed from: com.daaw.rg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7977rg0 implements EN0 {
    public static final InterfaceC1796Oj0 b = new a();
    public final InterfaceC1796Oj0 a;

    /* JADX INFO: renamed from: com.daaw.rg0$a */
    public static class a implements InterfaceC1796Oj0 {
        @Override // com.daaw.InterfaceC1796Oj0
        public InterfaceC1692Nj0 a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.daaw.InterfaceC1796Oj0
        public boolean b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.rg0$b */
    public static class b implements InterfaceC1796Oj0 {
        public InterfaceC1796Oj0[] a;

        public b(InterfaceC1796Oj0... interfaceC1796Oj0Arr) {
            this.a = interfaceC1796Oj0Arr;
        }

        @Override // com.daaw.InterfaceC1796Oj0
        public InterfaceC1692Nj0 a(Class cls) {
            for (InterfaceC1796Oj0 interfaceC1796Oj0 : this.a) {
                if (interfaceC1796Oj0.b(cls)) {
                    return interfaceC1796Oj0.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.daaw.InterfaceC1796Oj0
        public boolean b(Class cls) {
            for (InterfaceC1796Oj0 interfaceC1796Oj0 : this.a) {
                if (interfaceC1796Oj0.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C7977rg0() {
        this(b());
    }

    public static InterfaceC1796Oj0 b() {
        return new b(C5115hS.c(), c());
    }

    public static InterfaceC1796Oj0 c() {
        try {
            return (InterfaceC1796Oj0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return b;
        }
    }

    public static boolean d(InterfaceC1692Nj0 interfaceC1692Nj0) {
        return interfaceC1692Nj0.c() == EnumC3087aB0.PROTO2;
    }

    public static DN0 e(Class cls, InterfaceC1692Nj0 interfaceC1692Nj0) {
        return AbstractC5394iS.class.isAssignableFrom(cls) ? d(interfaceC1692Nj0) ? C2444Uj0.U(cls, interfaceC1692Nj0, AbstractC2564Vn0.b(), AbstractC5996kc0.b(), MN0.L(), AbstractC7600qJ.b(), AbstractC0641Dg0.b()) : C2444Uj0.U(cls, interfaceC1692Nj0, AbstractC2564Vn0.b(), AbstractC5996kc0.b(), MN0.L(), null, AbstractC0641Dg0.b()) : d(interfaceC1692Nj0) ? C2444Uj0.U(cls, interfaceC1692Nj0, AbstractC2564Vn0.a(), AbstractC5996kc0.a(), MN0.G(), AbstractC7600qJ.a(), AbstractC0641Dg0.a()) : C2444Uj0.U(cls, interfaceC1692Nj0, AbstractC2564Vn0.a(), AbstractC5996kc0.a(), MN0.H(), null, AbstractC0641Dg0.a());
    }

    @Override // com.daaw.EN0
    public DN0 a(Class cls) {
        MN0.I(cls);
        InterfaceC1692Nj0 interfaceC1692Nj0A = this.a.a(cls);
        return interfaceC1692Nj0A.a() ? AbstractC5394iS.class.isAssignableFrom(cls) ? C2548Vj0.m(MN0.L(), AbstractC7600qJ.b(), interfaceC1692Nj0A.b()) : C2548Vj0.m(MN0.G(), AbstractC7600qJ.a(), interfaceC1692Nj0A.b()) : e(cls, interfaceC1692Nj0A);
    }

    public C7977rg0(InterfaceC1796Oj0 interfaceC1796Oj0) {
        this.a = (InterfaceC1796Oj0) AbstractC3317b10.b(interfaceC1796Oj0, "messageInfoFactory");
    }
}
