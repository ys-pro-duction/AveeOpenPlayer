package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class JM2 extends UM2 {
    public final String a;
    public final String b;

    public /* synthetic */ JM2(String str, String str2, IM2 im2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.UM2
    public final String a() {
        return this.b;
    }

    @Override // com.daaw.UM2
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UM2) {
            UM2 um2 = (UM2) obj;
            String str = this.a;
            if (str != null ? str.equals(um2.b()) : um2.b() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(um2.a()) : um2.a() == null) {
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
        return "OverlayDisplayDismissRequest{sessionToken=" + this.a + ", appId=" + this.b + "}";
    }
}
