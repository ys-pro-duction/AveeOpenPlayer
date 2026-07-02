package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzas;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Ov1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1845Ov1 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzas f;

    public C1845Ov1(C9327wU2 c9327wU2, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzas zzasVar;
        AbstractC7506py0.f(str2);
        AbstractC7506py0.f(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            c9327wU2.w().t().b("Event created with reverse previous/current timestamps. appId", C6675mz2.z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzasVar = new zzas(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c9327wU2.w().n().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objK = c9327wU2.N().k(next, bundle2.get(next));
                    if (objK == null) {
                        c9327wU2.w().t().b("Param value can't be null", c9327wU2.D().e(next));
                        it.remove();
                    } else {
                        c9327wU2.N().D(bundle2, next, objK);
                    }
                }
            }
            zzasVar = new zzas(bundle2);
        }
        this.f = zzasVar;
    }

    public final C1845Ov1 a(C9327wU2 c9327wU2, long j) {
        return new C1845Ov1(c9327wU2, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        return "Event{appId='" + this.a + "', name='" + this.b + "', params=" + this.f.toString() + "}";
    }

    public C1845Ov1(C9327wU2 c9327wU2, String str, String str2, String str3, long j, long j2, zzas zzasVar) {
        AbstractC7506py0.f(str2);
        AbstractC7506py0.f(str3);
        AbstractC7506py0.l(zzasVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            c9327wU2.w().t().c("Event created with reverse previous/current timestamps. appId, name", C6675mz2.z(str2), C6675mz2.z(str3));
        }
        this.f = zzasVar;
    }
}
