package com.daaw;

import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
public final class MM2 extends AbstractC5377iN2 {
    public final IBinder a;
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    public final String f;

    public /* synthetic */ MM2(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, String str4, String str5, LM2 lm2) {
        this.a = iBinder;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = i3;
        this.f = str4;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final float a() {
        return this.d;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final int b() {
        return 0;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final int c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final int d() {
        return this.e;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final IBinder e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5377iN2) {
            AbstractC5377iN2 abstractC5377iN2 = (AbstractC5377iN2) obj;
            if (this.a.equals(abstractC5377iN2.e())) {
                abstractC5377iN2.k();
                String str = this.b;
                if (str != null ? str.equals(abstractC5377iN2.g()) : abstractC5377iN2.g() == null) {
                    if (this.c == abstractC5377iN2.c() && Float.floatToIntBits(this.d) == Float.floatToIntBits(abstractC5377iN2.a())) {
                        abstractC5377iN2.b();
                        abstractC5377iN2.i();
                        if (this.e == abstractC5377iN2.d()) {
                            abstractC5377iN2.h();
                            String str2 = this.f;
                            if (str2 != null ? str2.equals(abstractC5377iN2.f()) : abstractC5377iN2.f() == null) {
                                abstractC5377iN2.j();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final String f() {
        return this.f;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final String g() {
        return this.b;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final String h() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = (((((((iHashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d);
        int i = this.e;
        String str2 = this.f;
        return ((((iHashCode2 * 583896283) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final String i() {
        return null;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final String j() {
        return null;
    }

    @Override // com.daaw.AbstractC5377iN2
    public final boolean k() {
        return false;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.a.toString() + ", stableSessionToken=false, appId=" + this.b + ", layoutGravity=" + this.c + ", layoutVerticalMargin=" + this.d + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.e + ", deeplinkUrl=null, adFieldEnifd=" + this.f + ", thirdPartyAuthCallerId=null}";
    }
}
