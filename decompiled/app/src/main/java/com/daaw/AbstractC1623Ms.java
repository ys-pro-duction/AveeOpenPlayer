package com.daaw;

import com.daaw.InterfaceC4684ft;

/* JADX INFO: renamed from: com.daaw.Ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1623Ms extends AbstractC7409pe {
    public final InterfaceC4684ft C;
    public transient InterfaceC1416Ks D;

    public AbstractC1623Ms(InterfaceC1416Ks interfaceC1416Ks, InterfaceC4684ft interfaceC4684ft) {
        super(interfaceC1416Ks);
        this.C = interfaceC4684ft;
    }

    @Override // com.daaw.InterfaceC1416Ks
    public InterfaceC4684ft getContext() {
        InterfaceC4684ft interfaceC4684ft = this.C;
        G10.d(interfaceC4684ft);
        return interfaceC4684ft;
    }

    @Override // com.daaw.AbstractC7409pe
    public void s() {
        InterfaceC1416Ks interfaceC1416Ks = this.D;
        if (interfaceC1416Ks != null && interfaceC1416Ks != this) {
            InterfaceC4684ft.b bVarA = getContext().a(InterfaceC1727Ns.e);
            G10.d(bVarA);
            ((InterfaceC1727Ns) bVarA).x0(interfaceC1416Ks);
        }
        this.D = C1915Pn.B;
    }

    public final InterfaceC1416Ks t() {
        InterfaceC1416Ks interfaceC1416KsQ0 = this.D;
        if (interfaceC1416KsQ0 == null) {
            InterfaceC1727Ns interfaceC1727Ns = (InterfaceC1727Ns) getContext().a(InterfaceC1727Ns.e);
            if (interfaceC1727Ns == null || (interfaceC1416KsQ0 = interfaceC1727Ns.q0(this)) == null) {
                interfaceC1416KsQ0 = this;
            }
            this.D = interfaceC1416KsQ0;
        }
        return interfaceC1416KsQ0;
    }

    public AbstractC1623Ms(InterfaceC1416Ks interfaceC1416Ks) {
        this(interfaceC1416Ks, interfaceC1416Ks != null ? interfaceC1416Ks.getContext() : null);
    }
}
