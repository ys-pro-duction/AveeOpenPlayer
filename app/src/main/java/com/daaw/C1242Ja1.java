package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ja1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1242Ja1 {
    public final C1138Ia1 a;
    public final C6488mK b;
    public final boolean c;

    public /* synthetic */ C1242Ja1(C1138Ia1 c1138Ia1, C6488mK c6488mK, boolean z, AbstractC1034Ha1 abstractC1034Ha1) {
        this(c1138Ia1, c6488mK, z);
    }

    public void a(C6488mK c6488mK) {
        this.a.b(c6488mK);
    }

    public void b(C6488mK c6488mK, InterfaceC6146l51 interfaceC6146l51) {
        this.a.c(c6488mK, interfaceC6146l51);
    }

    public C1242Ja1 c(int i) {
        return new C1242Ja1(this.a, null, true);
    }

    public C1242Ja1 d(C6488mK c6488mK) {
        C6488mK c6488mK2 = this.b;
        C1242Ja1 c1242Ja1 = new C1242Ja1(this.a, c6488mK2 == null ? null : (C6488mK) c6488mK2.a(c6488mK), false);
        c1242Ja1.k();
        return c1242Ja1;
    }

    public C1242Ja1 e(String str) {
        C6488mK c6488mK = this.b;
        C1242Ja1 c1242Ja1 = new C1242Ja1(this.a, c6488mK == null ? null : (C6488mK) c6488mK.c(str), false);
        c1242Ja1.l(str);
        return c1242Ja1;
    }

    public RuntimeException f(String str) {
        String str2;
        C6488mK c6488mK = this.b;
        if (c6488mK == null || c6488mK.n()) {
            str2 = "";
        } else {
            str2 = " (found in field " + this.b.toString() + ")";
        }
        return new IllegalArgumentException("Invalid data. " + str + str2);
    }

    public EnumC1450La1 g() {
        return this.a.a;
    }

    public C6488mK h() {
        return this.b;
    }

    public boolean i() {
        return this.c;
    }

    public boolean j() {
        int i = AbstractC1034Ha1.a[this.a.a.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4 || i == 5) {
            return false;
        }
        throw AbstractC6557mb.a("Unexpected case for UserDataSource: %s", this.a.a.name());
    }

    public final void k() {
        if (this.b == null) {
            return;
        }
        for (int i = 0; i < this.b.p(); i++) {
            l(this.b.m(i));
        }
    }

    public final void l(String str) {
        if (str.isEmpty()) {
            throw f("Document fields must not be empty");
        }
        if (j() && str.startsWith("__") && str.endsWith("__")) {
            throw f("Document fields cannot begin and end with \"__\"");
        }
    }

    public C1242Ja1(C1138Ia1 c1138Ia1, C6488mK c6488mK, boolean z) {
        this.a = c1138Ia1;
        this.b = c6488mK;
        this.c = z;
    }
}
