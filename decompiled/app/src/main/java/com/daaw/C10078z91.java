package com.daaw;

/* JADX INFO: renamed from: com.daaw.z91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10078z91 extends ON0 {
    public final ThreadLocal F;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10078z91(InterfaceC4684ft interfaceC4684ft, InterfaceC1416Ks interfaceC1416Ks) {
        B91 b91 = B91.B;
        super(interfaceC4684ft.a(b91) == null ? interfaceC4684ft.U(b91) : interfaceC4684ft, interfaceC1416Ks);
        this.F = new ThreadLocal();
        if (interfaceC1416Ks.getContext().a(InterfaceC1727Ns.e) instanceof AbstractC5801jt) {
            return;
        }
        Object objC = AbstractC5010h31.c(interfaceC4684ft, null);
        AbstractC5010h31.a(interfaceC4684ft, objC);
        W0(interfaceC4684ft, objC);
    }

    @Override // com.daaw.ON0, com.daaw.AbstractC9472x
    public void R0(Object obj) {
        if (this.threadLocalIsSet) {
            C0576Cs0 c0576Cs0 = (C0576Cs0) this.F.get();
            if (c0576Cs0 != null) {
                AbstractC5010h31.a((InterfaceC4684ft) c0576Cs0.a(), c0576Cs0.b());
            }
            this.F.remove();
        }
        Object objA = AbstractC2459Un.a(obj, this.E);
        InterfaceC1416Ks interfaceC1416Ks = this.E;
        InterfaceC4684ft context = interfaceC1416Ks.getContext();
        Object objC = AbstractC5010h31.c(context, null);
        C10078z91 c10078z91G = objC != AbstractC5010h31.a ? AbstractC4963gt.g(interfaceC1416Ks, context, objC) : null;
        try {
            this.E.x(objA);
            G91 g91 = G91.a;
            if (c10078z91G == null || c10078z91G.V0()) {
                AbstractC5010h31.a(context, objC);
            }
        } catch (Throwable th) {
            if (c10078z91G == null || c10078z91G.V0()) {
                AbstractC5010h31.a(context, objC);
            }
            throw th;
        }
    }

    public final boolean V0() {
        boolean z = this.threadLocalIsSet && this.F.get() == null;
        this.F.remove();
        return !z;
    }

    public final void W0(InterfaceC4684ft interfaceC4684ft, Object obj) {
        this.threadLocalIsSet = true;
        this.F.set(D61.a(interfaceC4684ft, obj));
    }
}
