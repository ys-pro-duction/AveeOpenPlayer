package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class Q90 extends AbstractC4714g0 {
    public final InterfaceC4923gl D;
    public final WY E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q90(InterfaceC4923gl interfaceC4923gl) {
        super(InterfaceC3072a8.b.b());
        if (interfaceC4923gl == null) {
            F(0);
        }
        this.D = interfaceC4923gl;
        this.E = new WY(interfaceC4923gl, null);
    }

    private static /* synthetic */ void F(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // com.daaw.InterfaceC8612tw
    public InterfaceC8612tw b() {
        InterfaceC4923gl interfaceC4923gl = this.D;
        if (interfaceC4923gl == null) {
            F(2);
        }
        return interfaceC4923gl;
    }

    @Override // com.daaw.RE0
    public TE0 getValue() {
        WY wy = this.E;
        if (wy == null) {
            F(1);
        }
        return wy;
    }

    @Override // com.daaw.AbstractC8898uw
    public String toString() {
        return "class " + this.D.getName() + "::this";
    }
}
