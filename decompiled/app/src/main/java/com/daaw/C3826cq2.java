package com.daaw;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzl;

/* JADX INFO: renamed from: com.daaw.cq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3826cq2 extends AbstractC0683Dq2 {
    public final Activity a;
    public final zzl b;
    public final String c;
    public final String d;

    public /* synthetic */ C3826cq2(Activity activity, zzl zzlVar, String str, String str2, AbstractC3548bq2 abstractC3548bq2) {
        this.a = activity;
        this.b = zzlVar;
        this.c = str;
        this.d = str2;
    }

    @Override // com.daaw.AbstractC0683Dq2
    public final Activity a() {
        return this.a;
    }

    @Override // com.daaw.AbstractC0683Dq2
    public final zzl b() {
        return this.b;
    }

    @Override // com.daaw.AbstractC0683Dq2
    public final String c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC0683Dq2
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        zzl zzlVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0683Dq2) {
            AbstractC0683Dq2 abstractC0683Dq2 = (AbstractC0683Dq2) obj;
            if (this.a.equals(abstractC0683Dq2.a()) && ((zzlVar = this.b) != null ? zzlVar.equals(abstractC0683Dq2.b()) : abstractC0683Dq2.b() == null) && ((str = this.c) != null ? str.equals(abstractC0683Dq2.c()) : abstractC0683Dq2.c() == null) && ((str2 = this.d) != null ? str2.equals(abstractC0683Dq2.d()) : abstractC0683Dq2.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        zzl zzlVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzlVar == null ? 0 : zzlVar.hashCode())) * 1000003;
        String str = this.c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        zzl zzlVar = this.b;
        return "OfflineUtilsParams{activity=" + this.a.toString() + ", adOverlay=" + String.valueOf(zzlVar) + ", gwsQueryId=" + this.c + ", uri=" + this.d + "}";
    }
}
