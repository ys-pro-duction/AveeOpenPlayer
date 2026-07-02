package com.daaw;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class Lo3 {
    public final C9327wU2 a;

    public Lo3(C9327wU2 c9327wU2) {
        this.a = c9327wU2;
    }

    public final void a(String str, Bundle bundle) {
        String string;
        this.a.x().d();
        if (this.a.k()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.a.F().v.b(string);
        this.a.F().w.b(this.a.p().a());
    }

    public final void b() {
        this.a.x().d();
        if (d()) {
            if (e()) {
                this.a.F().v.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.a.I().r("auto", "_cmpx", bundle);
            } else {
                String strA = this.a.F().v.a();
                if (TextUtils.isEmpty(strA)) {
                    this.a.w().q().a("Cache still valid but referrer not found");
                } else {
                    long jA = this.a.F().w.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    this.a.I().r(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.a.F().v.b(null);
            }
            this.a.F().w.b(0L);
        }
    }

    public final void c() {
        if (d() && e()) {
            this.a.F().v.b(null);
        }
    }

    public final boolean d() {
        return this.a.F().w.a() > 0;
    }

    public final boolean e() {
        return d() && this.a.p().a() - this.a.F().w.a() > this.a.z().n(null, AbstractC1311Jr2.U);
    }
}
