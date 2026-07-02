package com.daaw;

/* JADX INFO: renamed from: com.daaw.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6986o6 implements InterfaceC5819jx0 {
    public final int a;

    public C6986o6(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!G10.c(C6986o6.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.a == ((C6986o6) obj).a;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.a + ')';
    }
}
