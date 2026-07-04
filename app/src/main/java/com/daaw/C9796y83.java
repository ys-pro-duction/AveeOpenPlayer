package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.y83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9796y83 extends X93 {
    public final Context a;
    public final Ta3 b;

    public C9796y83(Context context, Ta3 ta3) {
        this.a = context;
        this.b = ta3;
    }

    @Override // com.daaw.X93
    public final Context a() {
        return this.a;
    }

    @Override // com.daaw.X93
    public final Ta3 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Ta3 ta3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof X93) {
            X93 x93 = (X93) obj;
            if (this.a.equals(x93.a()) && ((ta3 = this.b) != null ? ta3.equals(x93.b()) : x93.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Ta3 ta3 = this.b;
        return (iHashCode * 1000003) ^ (ta3 == null ? 0 : ta3.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.b) + "}";
    }
}
