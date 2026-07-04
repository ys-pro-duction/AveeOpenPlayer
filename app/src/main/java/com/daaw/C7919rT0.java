package com.daaw;

/* JADX INFO: renamed from: com.daaw.rT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7919rT0 implements InterfaceC2552Vk0 {
    public Q20 a;

    @Override // com.daaw.InterfaceC2552Vk0
    public InterfaceC4923gl a(C20 c20) {
        G10.g(c20, "javaClass");
        return b().b(c20);
    }

    public final Q20 b() {
        Q20 q20 = this.a;
        if (q20 != null) {
            return q20;
        }
        G10.u("resolver");
        return null;
    }

    public final void c(Q20 q20) {
        G10.g(q20, "<set-?>");
        this.a = q20;
    }
}
