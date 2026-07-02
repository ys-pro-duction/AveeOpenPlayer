package com.daaw;

/* JADX INFO: renamed from: com.daaw.Lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1488Lk implements InterfaceC0729Ec0, Cloneable {
    public final InterfaceC0729Ec0 B;
    public NI0 C;
    public NI0 D;
    public OI0 E;
    public WI0 F;
    public CG G;

    public C1488Lk(InterfaceC0729Ec0 interfaceC0729Ec0) {
        this.B = interfaceC0729Ec0;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public CG b() {
        CG cg = this.G;
        return cg != null ? cg : this.B.b();
    }

    @Override // com.daaw.InterfaceC0729Ec0
    public WI0 c() {
        WI0 wi0 = this.F;
        return wi0 != null ? wi0 : this.B.c();
    }

    @Override // com.daaw.InterfaceC2283Sv
    public OI0 d() {
        OI0 oi0 = this.E;
        return oi0 != null ? oi0 : this.B.d();
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 e() {
        NI0 ni0 = this.D;
        return ni0 != null ? ni0 : this.B.e();
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 f() {
        NI0 ni0 = this.C;
        return ni0 != null ? ni0 : this.B.f();
    }

    @Override // com.daaw.InterfaceC0729Ec0
    public InterfaceC0657Dk0 g() {
        return this.B.g();
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1488Lk clone() {
        try {
            return (C1488Lk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void i(NI0 ni0) {
        this.D = ni0;
    }

    public void j(CG cg) {
        this.G = cg;
    }
}
