package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class PY1 {
    public static final PY1 b = new DX1().e();
    public static final String c = Integer.toString(0, 36);
    public static final InterfaceC9666xh3 d = new InterfaceC9666xh3() { // from class: com.daaw.XW1
    };
    public final C1617Mq1 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PY1) {
            return this.a.equals(((PY1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
