package com.daaw;

/* JADX INFO: renamed from: com.daaw.Gc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0938Gc1 extends AbstractC0730Ec1 {
    public final boolean G;
    public InterfaceC4097dp0 H;
    public LQ I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0938Gc1(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, I80 i80, boolean z, RU0 ru0) {
        super(interfaceC8612tw, interfaceC3072a8, c2352Tm0, i80, ru0);
        if (interfaceC8612tw == null) {
            F(0);
        }
        if (interfaceC3072a8 == null) {
            F(1);
        }
        if (c2352Tm0 == null) {
            F(2);
        }
        if (ru0 == null) {
            F(3);
        }
        this.G = z;
    }

    private static /* synthetic */ void F(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void K0(InterfaceC4097dp0 interfaceC4097dp0, LQ lq) {
        if (lq == null) {
            F(5);
        }
        this.I = lq;
        if (interfaceC4097dp0 == null) {
            interfaceC4097dp0 = (InterfaceC4097dp0) lq.invoke();
        }
        this.H = interfaceC4097dp0;
    }

    public void L0(LQ lq) {
        if (lq == null) {
            F(4);
        }
        K0(null, lq);
    }

    @Override // com.daaw.InterfaceC0626Dc1
    public AbstractC2887Yq T() {
        InterfaceC4097dp0 interfaceC4097dp0 = this.H;
        if (interfaceC4097dp0 != null) {
            return (AbstractC2887Yq) interfaceC4097dp0.invoke();
        }
        return null;
    }

    @Override // com.daaw.InterfaceC0626Dc1
    public boolean f0() {
        return this.G;
    }
}
