package com.daaw;

/* JADX INFO: renamed from: com.daaw.wo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9419wo0 extends AbstractC0685Dr0 {
    @Override // com.daaw.AbstractC0685Dr0
    public void b(InterfaceC1583Mi interfaceC1583Mi, InterfaceC1583Mi interfaceC1583Mi2) {
        G10.g(interfaceC1583Mi, "first");
        G10.g(interfaceC1583Mi2, "second");
        e(interfaceC1583Mi, interfaceC1583Mi2);
    }

    @Override // com.daaw.AbstractC0685Dr0
    public void c(InterfaceC1583Mi interfaceC1583Mi, InterfaceC1583Mi interfaceC1583Mi2) {
        G10.g(interfaceC1583Mi, "fromSuper");
        G10.g(interfaceC1583Mi2, "fromCurrent");
        e(interfaceC1583Mi, interfaceC1583Mi2);
    }

    public abstract void e(InterfaceC1583Mi interfaceC1583Mi, InterfaceC1583Mi interfaceC1583Mi2);
}
