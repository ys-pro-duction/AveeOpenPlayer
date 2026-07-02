package com.daaw;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class Y61 implements InterfaceC5866k7 {
    public final int a;
    public final int b;
    public final InterfaceC4216eF c;

    public Y61(int i, int i2, InterfaceC4216eF interfaceC4216eF) {
        G10.g(interfaceC4216eF, "easing");
        this.a = i;
        this.b = i2;
        this.c = interfaceC4216eF;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Y61) {
            Y61 y61 = (Y61) obj;
            if (y61.a == this.a && y61.b == this.b && G10.c(y61.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceC5866k7
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6848nd1 e(InterfaceC3626c71 interfaceC3626c71) {
        G10.g(interfaceC3626c71, "converter");
        return new C6848nd1(this.a, this.b, this.c);
    }

    public int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public /* synthetic */ Y61(int i, int i2, InterfaceC4216eF interfaceC4216eF, int i3, AbstractC2911Yw abstractC2911Yw) {
        this((i3 & 1) != 0 ? RCHTTPStatusCodes.UNSUCCESSFUL : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? AbstractC4495fF.a() : interfaceC4216eF);
    }
}
