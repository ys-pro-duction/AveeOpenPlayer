package com.daaw;

/* JADX INFO: renamed from: com.daaw.uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8906uy extends AbstractC2711Wy implements InterfaceC6377lv, InterfaceC9185vy {
    public static final a E = new a(null);
    public final YS0 C;
    public final boolean D;

    /* JADX INFO: renamed from: com.daaw.uy$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public static /* synthetic */ C8906uy c(a aVar, AbstractC5708ja1 abstractC5708ja1, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return aVar.b(abstractC5708ja1, z, z2);
        }

        public final boolean a(AbstractC5708ja1 abstractC5708ja1) {
            abstractC5708ja1.N0();
            return (abstractC5708ja1.N0().c() instanceof Z71) || (abstractC5708ja1 instanceof C1604Mn0);
        }

        public final C8906uy b(AbstractC5708ja1 abstractC5708ja1, boolean z, boolean z2) {
            G10.g(abstractC5708ja1, "type");
            if (abstractC5708ja1 instanceof C8906uy) {
                return (C8906uy) abstractC5708ja1;
            }
            AbstractC2911Yw abstractC2911Yw = null;
            if (!z2 && !d(abstractC5708ja1, z)) {
                return null;
            }
            if (abstractC5708ja1 instanceof UM) {
                UM um = (UM) abstractC5708ja1;
                G10.c(um.V0().N0(), um.W0().N0());
            }
            return new C8906uy(ZM.c(abstractC5708ja1).R0(false), z, abstractC2911Yw);
        }

        public final boolean d(AbstractC5708ja1 abstractC5708ja1, boolean z) {
            if (!a(abstractC5708ja1)) {
                return false;
            }
            InterfaceC10240zl interfaceC10240zlC = abstractC5708ja1.N0().c();
            C3074a81 c3074a81 = interfaceC10240zlC instanceof C3074a81 ? (C3074a81) interfaceC10240zlC : null;
            if (c3074a81 == null || c3074a81.T0()) {
                return (z && (abstractC5708ja1.N0().c() instanceof Z71)) ? D81.l(abstractC5708ja1) : !C2984Zo0.a.a(abstractC5708ja1);
            }
            return true;
        }

        public a() {
        }
    }

    public /* synthetic */ C8906uy(YS0 ys0, boolean z, AbstractC2911Yw abstractC2911Yw) {
        this(ys0, z);
    }

    @Override // com.daaw.AbstractC2711Wy, com.daaw.I80
    public boolean O0() {
        return false;
    }

    @Override // com.daaw.InterfaceC6377lv
    public I80 U(I80 i80) {
        G10.g(i80, "replacement");
        return AbstractC7370pV0.e(i80.Q0(), this.D);
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: U0 */
    public YS0 R0(boolean z) {
        return z ? W0().R0(z) : this;
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: V0 */
    public YS0 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return new C8906uy(W0().T0(c8387t71), this.D);
    }

    @Override // com.daaw.AbstractC2711Wy
    public YS0 W0() {
        return this.C;
    }

    public final YS0 Z0() {
        return this.C;
    }

    @Override // com.daaw.AbstractC2711Wy
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C8906uy Y0(YS0 ys0) {
        G10.g(ys0, "delegate");
        return new C8906uy(ys0, this.D);
    }

    @Override // com.daaw.YS0
    public String toString() {
        return W0() + " & Any";
    }

    @Override // com.daaw.InterfaceC6377lv
    public boolean y0() {
        W0().N0();
        return W0().N0().c() instanceof Z71;
    }

    public C8906uy(YS0 ys0, boolean z) {
        this.C = ys0;
        this.D = z;
    }
}
