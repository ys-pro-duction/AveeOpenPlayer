package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class UQ0 implements CX {
    public static String c = "Checkbox";
    public boolean a = true;
    public String b = "u_value";

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        this.b = c2591Vu.x("name", this.b);
        this.a = c2591Vu.o("value", this.a);
    }

    @Override // com.daaw.CX
    public String n() {
        return this.b;
    }

    @Override // com.daaw.CX
    public Object o() {
        return Boolean.valueOf(this.a);
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.k0("name", this.b, "misc");
        c2591Vu.N("value", this.a, "misc");
    }
}
