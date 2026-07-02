package com.daaw;

/* JADX INFO: renamed from: com.daaw.sQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8186sQ0 implements InterfaceC7026oF {
    public final int a;
    public final int b;

    public C8186sQ0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8186sQ0)) {
            return false;
        }
        C8186sQ0 c8186sQ0 = (C8186sQ0) obj;
        return this.a == c8186sQ0.a && this.b == c8186sQ0.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.a + ", end=" + this.b + ')';
    }
}
