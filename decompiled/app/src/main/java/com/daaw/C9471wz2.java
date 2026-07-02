package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.wz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9471wz2 implements InterfaceC1343Jz2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public C9471wz2(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        RF2.c(bundle, "gmp_app_id", this.a);
        RF2.c(bundle, "fbs_aiid", this.b);
        RF2.c(bundle, "fbs_aeid", this.c);
        RF2.c(bundle, "apm_id_origin", this.d);
        Long l = this.e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
