package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.gt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4966gt2 {
    public final String a;
    public final String b;
    public int c;
    public long d;
    public final Integer e;

    public C4966gt2(String str, String str2, int i, long j, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = num;
    }

    public final String toString() {
        String str = this.a + "." + this.c + "." + this.d;
        if (!TextUtils.isEmpty(this.b)) {
            str = str + "." + this.b;
        }
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.A1)).booleanValue() || this.e == null || TextUtils.isEmpty(this.b)) {
            return str;
        }
        return str + "." + this.e;
    }
}
