package com.daaw;

import com.daaw.C9264wF;

/* JADX INFO: renamed from: com.daaw.cR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3708cR0 implements CX {
    public static final String[] e = {"composition:0"};
    public static String f = "Texture";
    public String b = "u_texture";
    public boolean c = false;
    public int d = 0;
    public final C9264wF a = new C9264wF(new C9264wF.b() { // from class: com.daaw.bR0
        @Override // com.daaw.C9264wF.b
        public final void a() {
            this.a.j();
        }
    }, null, null, null);

    public C3708cR0() {
        s("composition:1");
    }

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        this.b = c2591Vu.x("name", this.b);
        s(c2591Vu.x("TargetImage", "composition:1"));
    }

    public String c() {
        return this.a.j();
    }

    public void j() {
        this.c = false;
        this.d = 0;
        C9264wF c9264wF = this.a;
        if (c9264wF != null) {
            c9264wF.p();
        }
    }

    @Override // com.daaw.CX
    public String n() {
        return this.b;
    }

    @Override // com.daaw.CX
    public Object o() {
        return this.a;
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.k0("name", this.b, "misc");
        c2591Vu.h0("TargetImage", c(), "misc", e);
    }

    public void s(String str) {
        this.a.C(str);
    }
}
