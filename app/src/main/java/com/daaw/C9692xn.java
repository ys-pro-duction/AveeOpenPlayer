package com.daaw;

/* JADX INFO: renamed from: com.daaw.xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9692xn implements InterfaceC7026oF {
    public final D7 a;
    public final int b;

    public C9692xn(D7 d7, int i) {
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
        if (!(obj instanceof C9692xn)) {
            return false;
        }
        C9692xn c9692xn = (C9692xn) obj;
        return G10.c(a(), c9692xn.a()) && this.b == c9692xn.b;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + a() + "', newCursorPosition=" + this.b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9692xn(String str, int i) {
        this(new D7(str, null, null, 6, null), i);
        G10.g(str, "text");
    }
}
