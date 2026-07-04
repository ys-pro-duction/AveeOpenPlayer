package com.daaw;

/* JADX INFO: renamed from: com.daaw.bW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3450bW0 extends AbstractC6719n81 {
    public final Z71 a;
    public final O90 b;

    public C3450bW0(Z71 z71) {
        G10.g(z71, "typeParameter");
        this.a = z71;
        this.b = AbstractC3192ab0.b(EnumC7395pb0.C, new C3171aW0(this));
    }

    public static final I80 d(C3450bW0 c3450bW0) {
        G10.g(c3450bW0, "this$0");
        return AbstractC3728cW0.b(c3450bW0.a);
    }

    @Override // com.daaw.InterfaceC6440m81
    public InterfaceC6440m81 a(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.daaw.InterfaceC6440m81
    public EnumC1042Hc1 b() {
        return EnumC1042Hc1.H;
    }

    @Override // com.daaw.InterfaceC6440m81
    public boolean c() {
        return true;
    }

    public final I80 f() {
        return (I80) this.b.getValue();
    }

    @Override // com.daaw.InterfaceC6440m81
    public I80 getType() {
        return f();
    }
}
