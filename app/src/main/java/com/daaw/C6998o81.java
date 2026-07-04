package com.daaw;

/* JADX INFO: renamed from: com.daaw.o81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C6998o81 extends AbstractC6719n81 {
    public final EnumC1042Hc1 a;
    public final I80 b;

    public C6998o81(EnumC1042Hc1 enumC1042Hc1, I80 i80) {
        if (enumC1042Hc1 == null) {
            d(0);
        }
        if (i80 == null) {
            d(1);
        }
        this.a = enumC1042Hc1;
        this.b = i80;
    }

    public static /* synthetic */ void d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // com.daaw.InterfaceC6440m81
    public InterfaceC6440m81 a(Q80 q80) {
        if (q80 == null) {
            d(6);
        }
        return new C6998o81(this.a, q80.a(this.b));
    }

    @Override // com.daaw.InterfaceC6440m81
    public EnumC1042Hc1 b() {
        EnumC1042Hc1 enumC1042Hc1 = this.a;
        if (enumC1042Hc1 == null) {
            d(4);
        }
        return enumC1042Hc1;
    }

    @Override // com.daaw.InterfaceC6440m81
    public boolean c() {
        return false;
    }

    @Override // com.daaw.InterfaceC6440m81
    public I80 getType() {
        I80 i80 = this.b;
        if (i80 == null) {
            d(5);
        }
        return i80;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6998o81(I80 i80) {
        this(EnumC1042Hc1.F, i80);
        if (i80 == null) {
            d(2);
        }
    }
}
