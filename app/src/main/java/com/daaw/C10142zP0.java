package com.daaw;

/* JADX INFO: renamed from: com.daaw.zP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10142zP0 extends AbstractC4192e90 implements InterfaceC3429bR {
    public static final C10142zP0 B = new C10142zP0();

    public C10142zP0() {
        super(2);
    }

    @Override // com.daaw.InterfaceC3429bR
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4998h1 invoke(C4998h1 c4998h1, C4998h1 c4998h12) {
        String strB;
        InterfaceC5390iR interfaceC5390iRA;
        G10.g(c4998h12, "childValue");
        if (c4998h1 == null || (strB = c4998h1.b()) == null) {
            strB = c4998h12.b();
        }
        if (c4998h1 == null || (interfaceC5390iRA = c4998h1.a()) == null) {
            interfaceC5390iRA = c4998h12.a();
        }
        return new C4998h1(strB, interfaceC5390iRA);
    }
}
