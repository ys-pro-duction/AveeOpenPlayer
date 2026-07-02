package com.daaw;

/* JADX INFO: renamed from: com.daaw.vd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9086vd1 extends AbstractC10063z61 {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9086vd1(String str) {
        super(null);
        G10.g(str, "verbatim");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9086vd1) && G10.c(this.a, ((C9086vd1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ')';
    }
}
