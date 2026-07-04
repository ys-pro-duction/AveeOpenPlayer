package com.daaw;

/* JADX INFO: renamed from: com.daaw.mS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6520mS extends AbstractC6400m01 {
    public final String I;
    public final String J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6520mS(String str, String str2) {
        super(null);
        G10.g(str, "name");
        G10.g(str2, "fontFamilyName");
        this.I = str;
        this.J = str2;
    }

    public final String m() {
        return this.I;
    }

    public String toString() {
        return this.J;
    }
}
