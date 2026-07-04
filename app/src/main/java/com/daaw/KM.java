package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class KM implements InterfaceC0729Ec0 {
    public final InterfaceC0657Dk0 B;
    public final WI0 C;
    public final InterfaceC2283Sv D;

    public KM(InterfaceC0657Dk0 interfaceC0657Dk0, WI0 wi0, InterfaceC2283Sv interfaceC2283Sv) {
        if (interfaceC0657Dk0 == null) {
            throw new NullPointerException("ModelLoader must not be null");
        }
        this.B = interfaceC0657Dk0;
        if (wi0 == null) {
            throw new NullPointerException("Transcoder must not be null");
        }
        this.C = wi0;
        if (interfaceC2283Sv == null) {
            throw new NullPointerException("DataLoadProvider must not be null");
        }
        this.D = interfaceC2283Sv;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public CG b() {
        return this.D.b();
    }

    @Override // com.daaw.InterfaceC0729Ec0
    public WI0 c() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public OI0 d() {
        return this.D.d();
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 e() {
        return this.D.e();
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 f() {
        return this.D.f();
    }

    @Override // com.daaw.InterfaceC0729Ec0
    public InterfaceC0657Dk0 g() {
        return this.B;
    }
}
