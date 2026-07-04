package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class PM2 extends AbstractC5936kN2 {
    public final int a;
    public final String b;

    public /* synthetic */ PM2(int i, String str, OM2 om2) {
        this.a = i;
        this.b = str;
    }

    @Override // com.daaw.AbstractC5936kN2
    public final int a() {
        return this.a;
    }

    @Override // com.daaw.AbstractC5936kN2
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5936kN2) {
            AbstractC5936kN2 abstractC5936kN2 = (AbstractC5936kN2) obj;
            if (this.a == abstractC5936kN2.a() && ((str = this.b) != null ? str.equals(abstractC5936kN2.b()) : abstractC5936kN2.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.a + ", sessionToken=" + this.b + "}";
    }
}
