package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class GS implements InterfaceC6983o51 {
    public final InterfaceC6983o51 a;
    public final InterfaceC6983o51 b;

    public GS(InterfaceC1883Pf interfaceC1883Pf, InterfaceC6983o51 interfaceC6983o51) {
        this(interfaceC6983o51, new LS(interfaceC6983o51, interfaceC1883Pf));
    }

    @Override // com.daaw.InterfaceC6983o51
    public KI0 a(KI0 ki0, int i, int i2) {
        InterfaceC6983o51 interfaceC6983o51;
        InterfaceC6983o51 interfaceC6983o512;
        KI0 ki0A = ((AS) ki0.get()).a();
        KI0 ki0B = ((AS) ki0.get()).b();
        if (ki0A != null && (interfaceC6983o512 = this.a) != null) {
            KI0 ki0A2 = interfaceC6983o512.a(ki0A, i, i2);
            return !ki0A.equals(ki0A2) ? new CS(new AS(ki0A2, ((AS) ki0.get()).b())) : ki0;
        }
        if (ki0B == null || (interfaceC6983o51 = this.b) == null) {
            return ki0;
        }
        KI0 ki0A3 = interfaceC6983o51.a(ki0B, i, i2);
        return !ki0B.equals(ki0A3) ? new CS(new AS(((AS) ki0.get()).a(), ki0A3)) : ki0;
    }

    @Override // com.daaw.InterfaceC6983o51
    public String getId() {
        return this.a.getId();
    }

    public GS(InterfaceC6983o51 interfaceC6983o51, InterfaceC6983o51 interfaceC6983o512) {
        this.a = interfaceC6983o51;
        this.b = interfaceC6983o512;
    }
}
