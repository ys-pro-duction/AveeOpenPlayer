package com.daaw;

/* JADX INFO: renamed from: com.daaw.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5202hl extends AbstractC8349t {
    public final InterfaceC8612tw G;
    public final RU0 H;
    public final boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5202hl(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC8612tw interfaceC8612tw, C2352Tm0 c2352Tm0, RU0 ru0, boolean z) {
        super(interfaceC10174zX0, c2352Tm0);
        if (interfaceC10174zX0 == null) {
            y0(0);
        }
        if (interfaceC8612tw == null) {
            y0(1);
        }
        if (c2352Tm0 == null) {
            y0(2);
        }
        if (ru0 == null) {
            y0(3);
        }
        this.G = interfaceC8612tw;
        this.H = ru0;
        this.I = z;
    }

    private static /* synthetic */ void y0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC9177vw, com.daaw.InterfaceC8612tw
    public InterfaceC8612tw b() {
        InterfaceC8612tw interfaceC8612tw = this.G;
        if (interfaceC8612tw == null) {
            y0(4);
        }
        return interfaceC8612tw;
    }

    public boolean isExternal() {
        return this.I;
    }

    @Override // com.daaw.InterfaceC10293zw
    public RU0 j() {
        RU0 ru0 = this.H;
        if (ru0 == null) {
            y0(5);
        }
        return ru0;
    }
}
