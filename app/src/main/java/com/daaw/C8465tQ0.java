package com.daaw;

/* JADX INFO: renamed from: com.daaw.tQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8465tQ0 implements InterfaceC7026oF {
    public final D7 a;
    public final int b;

    public C8465tQ0(D7 d7, int i) {
        G10.g(d7, "annotatedString");
        this.a = d7;
        this.b = i;
    }

    public final String a() {
        return this.a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8465tQ0)) {
            return false;
        }
        C8465tQ0 c8465tQ0 = (C8465tQ0) obj;
        return G10.c(a(), c8465tQ0.a()) && this.b == c8465tQ0.b;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + a() + "', newCursorPosition=" + this.b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8465tQ0(String str, int i) {
        this(new D7(str, null, null, 6, null), i);
        G10.g(str, "text");
    }
}
