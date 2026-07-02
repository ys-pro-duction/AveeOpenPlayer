package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class I extends X0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, EnumC1042Hc1 enumC1042Hc1, boolean z, int i, RU0 ru0, InterfaceC9624xZ0 interfaceC9624xZ0) {
        super(interfaceC10174zX0, interfaceC8612tw, interfaceC3072a8, c2352Tm0, enumC1042Hc1, z, i, ru0, interfaceC9624xZ0);
        if (interfaceC10174zX0 == null) {
            F(0);
        }
        if (interfaceC8612tw == null) {
            F(1);
        }
        if (interfaceC3072a8 == null) {
            F(2);
        }
        if (c2352Tm0 == null) {
            F(3);
        }
        if (enumC1042Hc1 == null) {
            F(4);
        }
        if (ru0 == null) {
            F(5);
        }
        if (interfaceC9624xZ0 == null) {
            F(6);
        }
    }

    public static /* synthetic */ void F(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // com.daaw.AbstractC8898uw
    public String toString() {
        String str = "";
        String str2 = D() ? "reified " : "";
        if (o() != EnumC1042Hc1.F) {
            str = o() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
