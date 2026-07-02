package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class L5 implements InterfaceC4405ev0 {
    public final int b;

    public L5(int i) {
        this.b = i;
    }

    @Override // com.daaw.InterfaceC4405ev0
    public /* synthetic */ int a(int i) {
        return AbstractC4126dv0.b(this, i);
    }

    @Override // com.daaw.InterfaceC4405ev0
    public /* synthetic */ int b(int i) {
        return AbstractC4126dv0.c(this, i);
    }

    @Override // com.daaw.InterfaceC4405ev0
    public /* synthetic */ AbstractC7898rO c(AbstractC7898rO abstractC7898rO) {
        return AbstractC4126dv0.a(this, abstractC7898rO);
    }

    @Override // com.daaw.InterfaceC4405ev0
    public SO d(SO so) {
        G10.g(so, "fontWeight");
        int i = this.b;
        return (i == 0 || i == Integer.MAX_VALUE) ? so : new SO(AbstractC8417tE0.l(so.o() + this.b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L5) && this.b == ((L5) obj).b;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.b + ')';
    }
}
