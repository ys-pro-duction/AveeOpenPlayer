package com.daaw;

/* JADX INFO: renamed from: com.daaw.vQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9030vQ0 implements InterfaceC7026oF {
    public final int a;
    public final int b;

    public C9030vQ0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9030vQ0)) {
            return false;
        }
        C9030vQ0 c9030vQ0 = (C9030vQ0) obj;
        return this.a == c9030vQ0.a && this.b == c9030vQ0.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.a + ", end=" + this.b + ')';
    }
}
