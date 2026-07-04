package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class J21 {
    public final long a;
    public final long b;

    public /* synthetic */ J21(long j, long j2, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2);
    }

    public final long a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J21)) {
            return false;
        }
        J21 j21 = (J21) obj;
        return C2559Vm.o(this.a, j21.a) && C2559Vm.o(this.b, j21.b);
    }

    public int hashCode() {
        return (C2559Vm.u(this.a) * 31) + C2559Vm.u(this.b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) C2559Vm.v(this.a)) + ", selectionBackgroundColor=" + ((Object) C2559Vm.v(this.b)) + ')';
    }

    public J21(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
