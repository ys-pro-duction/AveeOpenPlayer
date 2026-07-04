package com.daaw;

/* JADX INFO: renamed from: com.daaw.Bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0423Bg implements InterfaceC0319Ag, InterfaceC9657xg {
    public final InterfaceC4988gz a;
    public final long b;
    public final /* synthetic */ C9936yg c;

    public /* synthetic */ C0423Bg(InterfaceC4988gz interfaceC4988gz, long j, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC4988gz, j);
    }

    @Override // com.daaw.InterfaceC0319Ag
    public long a() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC9657xg
    public InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, H3 h3) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(h3, "alignment");
        return this.c.b(interfaceC1073Hk0, h3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0423Bg)) {
            return false;
        }
        C0423Bg c0423Bg = (C0423Bg) obj;
        return G10.c(this.a, c0423Bg.a) && C6079kr.g(a(), c0423Bg.a());
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + C6079kr.q(a());
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) C6079kr.r(a())) + ')';
    }

    public C0423Bg(InterfaceC4988gz interfaceC4988gz, long j) {
        this.a = interfaceC4988gz;
        this.b = j;
        this.c = C9936yg.a;
    }
}
