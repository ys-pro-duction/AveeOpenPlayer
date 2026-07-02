package com.daaw;

/* JADX INFO: renamed from: com.daaw.hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5197hk extends AbstractC4918gk {
    public /* synthetic */ C5197hk(InterfaceC7058oN interfaceC7058oN, InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC7058oN, (i2 & 2) != 0 ? C5905kG.B : interfaceC4684ft, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? EnumC5182hh.SUSPEND : enumC5182hh);
    }

    @Override // com.daaw.AbstractC4350ek
    public AbstractC4350ek h(InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        return new C5197hk(this.E, interfaceC4684ft, i, enumC5182hh);
    }

    @Override // com.daaw.AbstractC4350ek
    public InterfaceC7058oN l() {
        return this.E;
    }

    @Override // com.daaw.AbstractC4918gk
    public Object s(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
        Object objA = this.E.a(interfaceC7337pN, interfaceC1416Ks);
        return objA == I10.c() ? objA : G91.a;
    }

    public C5197hk(InterfaceC7058oN interfaceC7058oN, InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        super(interfaceC7058oN, interfaceC4684ft, i, enumC5182hh);
    }
}
