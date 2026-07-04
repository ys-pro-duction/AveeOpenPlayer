package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class ZQ0 implements CX {
    public static String c = "Value";
    public String a = "u_value";
    public C1469Lf0 b = C1469Lf0.a(1.0f);

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        this.a = c2591Vu.x("name", this.a);
        this.b = c2591Vu.t("value", this.b);
    }

    @Override // com.daaw.CX
    public String n() {
        return this.a;
    }

    @Override // com.daaw.CX
    public Object o() {
        return this.b;
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.k0("name", this.a, "misc");
        c2591Vu.b0("value", this.b, "misc", 0.0f, 2.0f);
    }
}
