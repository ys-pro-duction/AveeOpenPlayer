package com.daaw;

/* JADX INFO: renamed from: com.daaw.uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8898uw extends C7 implements InterfaceC8612tw {
    public final C2352Tm0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8898uw(InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0) {
        super(interfaceC3072a8);
        if (interfaceC3072a8 == null) {
            F(0);
        }
        if (c2352Tm0 == null) {
            F(1);
        }
        this.C = c2352Tm0;
    }

    private static /* synthetic */ void F(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String U(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            F(4);
        }
        try {
            String str = AbstractC2923Yz.k.O(interfaceC8612tw) + "[" + interfaceC8612tw.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC8612tw)) + "]";
            if (str == null) {
                F(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = interfaceC8612tw.getClass().getSimpleName() + " " + interfaceC8612tw.getName();
            if (str2 == null) {
                F(6);
            }
            return str2;
        }
    }

    @Override // com.daaw.InterfaceC3809cn0
    public C2352Tm0 getName() {
        C2352Tm0 c2352Tm0 = this.C;
        if (c2352Tm0 == null) {
            F(2);
        }
        return c2352Tm0;
    }

    public String toString() {
        return U(this);
    }

    public InterfaceC8612tw a() {
        return this;
    }
}
