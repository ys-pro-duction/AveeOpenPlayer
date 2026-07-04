package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class YK2 extends UK2 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ YK2(String str, boolean z, boolean z2, XK2 xk2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // com.daaw.UK2
    public final String b() {
        return this.a;
    }

    @Override // com.daaw.UK2
    public final boolean c() {
        return this.c;
    }

    @Override // com.daaw.UK2
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UK2) {
            UK2 uk2 = (UK2) obj;
            if (this.a.equals(uk2.b()) && this.b == uk2.d() && this.c == uk2.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.a + ", shouldGetAdvertisingId=" + this.b + ", isGooglePlayServicesAvailable=" + this.c + "}";
    }
}
