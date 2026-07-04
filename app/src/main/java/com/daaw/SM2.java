package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class SM2 extends AbstractC6782nN2 {
    public final String a;
    public final String b;

    public /* synthetic */ SM2(String str, String str2, RM2 rm2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.AbstractC6782nN2
    public final String a() {
        return this.b;
    }

    @Override // com.daaw.AbstractC6782nN2
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6782nN2) {
            AbstractC6782nN2 abstractC6782nN2 = (AbstractC6782nN2) obj;
            String str = this.a;
            if (str != null ? str.equals(abstractC6782nN2.b()) : abstractC6782nN2.b() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(abstractC6782nN2.a()) : abstractC6782nN2.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.a + ", appId=" + this.b + "}";
    }
}
