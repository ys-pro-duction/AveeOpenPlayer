package com.daaw;

/* JADX INFO: renamed from: com.daaw.dH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3946dH extends AbstractC2887Yq {
    public final C6607ml b;
    public final C2352Tm0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3946dH(C6607ml c6607ml, C2352Tm0 c2352Tm0) {
        super(D61.a(c6607ml, c2352Tm0));
        G10.g(c6607ml, "enumClassId");
        G10.g(c2352Tm0, "enumEntryName");
        this.b = c6607ml;
        this.c = c2352Tm0;
    }

    @Override // com.daaw.AbstractC2887Yq
    public I80 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        YS0 ys0S;
        G10.g(interfaceC2968Zk0, "module");
        InterfaceC4923gl interfaceC4923glB = AbstractC5366iL.b(interfaceC2968Zk0, this.b);
        if (interfaceC4923glB != null) {
            if (!AbstractC7006oA.A(interfaceC4923glB)) {
                interfaceC4923glB = null;
            }
            if (interfaceC4923glB != null && (ys0S = interfaceC4923glB.s()) != null) {
                return ys0S;
            }
        }
        return BH.d(AH.Z0, this.b.toString(), this.c.toString());
    }

    public final C2352Tm0 c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC2887Yq
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.h());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
