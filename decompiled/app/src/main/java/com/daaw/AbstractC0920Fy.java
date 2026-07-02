package com.daaw;

/* JADX INFO: renamed from: com.daaw.Fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0920Fy extends AbstractC8965vA {
    public final AbstractC0742Ef1 a;

    public AbstractC0920Fy(AbstractC0742Ef1 abstractC0742Ef1) {
        G10.g(abstractC0742Ef1, "delegate");
        this.a = abstractC0742Ef1;
    }

    @Override // com.daaw.AbstractC8965vA
    public AbstractC0742Ef1 b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC8965vA
    public String c() {
        return b().b();
    }

    @Override // com.daaw.AbstractC8965vA
    public AbstractC8965vA f() {
        AbstractC8965vA abstractC8965vAJ = AbstractC8679uA.j(b().d());
        G10.f(abstractC8965vAJ, "toDescriptorVisibility(...)");
        return abstractC8965vAJ;
    }
}
