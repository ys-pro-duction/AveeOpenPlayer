package com.daaw;

/* JADX INFO: renamed from: com.daaw.ww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9456ww extends AbstractC8898uw implements InterfaceC9177vw {
    public final InterfaceC8612tw D;
    public final RU0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9456ww(InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, RU0 ru0) {
        super(interfaceC3072a8, c2352Tm0);
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
        this.D = interfaceC8612tw;
        this.E = ru0;
    }

    private static /* synthetic */ void F(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public InterfaceC8612tw b() {
        InterfaceC8612tw interfaceC8612tw = this.D;
        if (interfaceC8612tw == null) {
            F(5);
        }
        return interfaceC8612tw;
    }

    public RU0 j() {
        RU0 ru0 = this.E;
        if (ru0 == null) {
            F(6);
        }
        return ru0;
    }

    @Override // com.daaw.AbstractC8898uw, com.daaw.InterfaceC8612tw
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10293zw a() {
        InterfaceC10293zw interfaceC10293zw = (InterfaceC10293zw) super.a();
        if (interfaceC10293zw == null) {
            F(4);
        }
        return interfaceC10293zw;
    }
}
