package com.daaw;

/* JADX INFO: renamed from: com.daaw.kJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C5917kJ extends AbstractC4993h0 implements TE0 {
    public final InterfaceC1376Ki c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5917kJ(InterfaceC1376Ki interfaceC1376Ki, I80 i80, TE0 te0) {
        super(i80, te0);
        if (interfaceC1376Ki == null) {
            b(0);
        }
        if (i80 == null) {
            b(1);
        }
        this.c = interfaceC1376Ki;
    }

    public static /* synthetic */ void b(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.c + "}";
    }
}
