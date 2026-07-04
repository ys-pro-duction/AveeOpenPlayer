package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class SE0 extends AbstractC4714g0 {
    public final InterfaceC8612tw D;
    public TE0 E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SE0(InterfaceC8612tw interfaceC8612tw, TE0 te0, InterfaceC3072a8 interfaceC3072a8) {
        this(interfaceC8612tw, te0, interfaceC3072a8, C7091oV0.i);
        if (interfaceC8612tw == null) {
            F(0);
        }
        if (te0 == null) {
            F(1);
        }
        if (interfaceC3072a8 == null) {
            F(2);
        }
    }

    private static /* synthetic */ void F(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // com.daaw.InterfaceC8612tw
    public InterfaceC8612tw b() {
        InterfaceC8612tw interfaceC8612tw = this.D;
        if (interfaceC8612tw == null) {
            F(8);
        }
        return interfaceC8612tw;
    }

    @Override // com.daaw.RE0
    public TE0 getValue() {
        TE0 te0 = this.E;
        if (te0 == null) {
            F(7);
        }
        return te0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SE0(InterfaceC8612tw interfaceC8612tw, TE0 te0, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0) {
        super(interfaceC3072a8, c2352Tm0);
        if (interfaceC8612tw == null) {
            F(3);
        }
        if (te0 == null) {
            F(4);
        }
        if (interfaceC3072a8 == null) {
            F(5);
        }
        if (c2352Tm0 == null) {
            F(6);
        }
        this.D = interfaceC8612tw;
        this.E = te0;
    }
}
