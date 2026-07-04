package com.daaw;

/* JADX INFO: renamed from: com.daaw.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4325ef extends AbstractC3958dK {
    public final AbstractC9005vK B;
    public final AbstractC9005vK C;

    public C4325ef(AbstractC9005vK abstractC9005vK, AbstractC9005vK abstractC9005vK2) {
        this.B = abstractC9005vK;
        this.C = abstractC9005vK2;
    }

    @Override // com.daaw.AbstractC3958dK
    public AbstractC3958dK a(InterfaceC4236eK interfaceC4236eK) {
        return interfaceC4236eK.a(this);
    }

    @Override // com.daaw.AbstractC3958dK
    public String c() {
        return String.format("%s-%s", this.B, this.C);
    }

    public AbstractC9005vK e() {
        return this.B;
    }

    public AbstractC9005vK f() {
        return this.C;
    }
}
