package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C7 implements A7 {
    public final InterfaceC3072a8 B;

    public C7(InterfaceC3072a8 interfaceC3072a8) {
        if (interfaceC3072a8 == null) {
            F(0);
        }
        this.B = interfaceC3072a8;
    }

    private static /* synthetic */ void F(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        InterfaceC3072a8 interfaceC3072a8 = this.B;
        if (interfaceC3072a8 == null) {
            F(1);
        }
        return interfaceC3072a8;
    }
}
