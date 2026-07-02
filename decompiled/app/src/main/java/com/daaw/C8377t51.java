package com.daaw;

/* JADX INFO: renamed from: com.daaw.t51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C8377t51 extends AbstractC4993h0 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8377t51(I80 i80) {
        this(i80, null);
        if (i80 == null) {
            b(0);
        }
    }

    private static /* synthetic */ void b(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8377t51(I80 i80, TE0 te0) {
        super(i80, te0);
        if (i80 == null) {
            b(1);
        }
    }
}
