package com.daaw;

/* JADX INFO: renamed from: com.daaw.Mv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1638Mv2 {
    public final Object a;
    public C1198Ip1 b = new C1198Ip1();
    public boolean c;
    public boolean d;

    public C1638Mv2(Object obj) {
        this.a = obj;
    }

    public final void a(int i, InterfaceC0803Eu2 interfaceC0803Eu2) {
        if (this.d) {
            return;
        }
        if (i != -1) {
            this.b.a(i);
        }
        this.c = true;
        interfaceC0803Eu2.zza(this.a);
    }

    public final void b(InterfaceC5531iv2 interfaceC5531iv2) {
        if (this.d || !this.c) {
            return;
        }
        C1617Mq1 c1617Mq1B = this.b.b();
        this.b = new C1198Ip1();
        this.c = false;
        interfaceC5531iv2.a(this.a, c1617Mq1B);
    }

    public final void c(InterfaceC5531iv2 interfaceC5531iv2) {
        this.d = true;
        if (this.c) {
            this.c = false;
            interfaceC5531iv2.a(this.a, this.b.b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1638Mv2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C1638Mv2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
