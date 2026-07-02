package com.daaw;

/* JADX INFO: renamed from: com.daaw.Nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1743Nw extends O8 {
    public final String a;
    public final JL b;

    public C1743Nw(String str, JL jl) {
        AbstractC7506py0.f(str);
        this.a = str;
        this.b = jl;
    }

    public static C1743Nw c(L8 l8) {
        AbstractC7506py0.l(l8);
        return new C1743Nw(l8.b(), null);
    }

    public static C1743Nw d(JL jl) {
        return new C1743Nw("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", (JL) AbstractC7506py0.l(jl));
    }

    @Override // com.daaw.O8
    public Exception a() {
        return this.b;
    }

    @Override // com.daaw.O8
    public String b() {
        return this.a;
    }
}
