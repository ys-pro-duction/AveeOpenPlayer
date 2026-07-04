package com.daaw;

/* JADX INFO: renamed from: com.daaw.jI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5631jI extends AbstractC3958dK {
    public final AbstractC3958dK B;
    public final M00 C;

    public C5631jI(M00 m00) {
        this(AbstractC3958dK.b(), m00);
    }

    @Override // com.daaw.AbstractC3958dK
    public AbstractC3958dK a(InterfaceC4236eK interfaceC4236eK) {
        return interfaceC4236eK.b(this);
    }

    @Override // com.daaw.AbstractC3958dK
    public String c() {
        String strC = this.B.c();
        return ("*".equals(strC) && this.C.a().intValue() == 1) ? strC : String.format("%s/%s", strC, this.C);
    }

    public AbstractC3958dK e() {
        return this.B;
    }

    public M00 f() {
        return this.C;
    }

    public C5631jI(AbstractC3958dK abstractC3958dK, M00 m00) {
        this.B = (AbstractC3958dK) AbstractC6948ny0.c(abstractC3958dK, "Expression must not be null");
        this.C = m00 == null ? new M00(1) : m00;
    }
}
