package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class PI0 implements InterfaceC6225lO {
    public final int a;
    public final SO b;
    public final int c;
    public final int d;

    public /* synthetic */ PI0(int i, SO so, int i2, int i3, AbstractC2911Yw abstractC2911Yw) {
        this(i, so, i2, i3);
    }

    @Override // com.daaw.InterfaceC6225lO
    public int a() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC6225lO
    public SO b() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC6225lO
    public int c() {
        return this.c;
    }

    public final int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PI0)) {
            return false;
        }
        PI0 pi0 = (PI0) obj;
        return this.a == pi0.a && G10.c(b(), pi0.b()) && PO.f(c(), pi0.c()) && CO.e(a(), pi0.a());
    }

    public int hashCode() {
        return (((((this.a * 31) + b().hashCode()) * 31) + PO.g(c())) * 31) + CO.f(a());
    }

    public String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + b() + ", style=" + ((Object) PO.h(c())) + ", loadingStrategy=" + ((Object) CO.g(a())) + ')';
    }

    public PI0(int i, SO so, int i2, int i3) {
        this.a = i;
        this.b = so;
        this.c = i2;
        this.d = i3;
    }
}
