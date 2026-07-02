package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: com.daaw.br2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3553br2 {
    public final String c;
    public C5622jF2 d = null;
    public C4498fF2 e = null;
    public zzu f = null;
    public final Map b = DesugarCollections.synchronizedMap(new HashMap());
    public final List a = DesugarCollections.synchronizedList(new ArrayList());

    public C3553br2(String str) {
        this.c = str;
    }

    public static String j(C4498fF2 c4498fF2) {
        return ((Boolean) zzba.zzc().b(AbstractC9820yE1.p3)).booleanValue() ? c4498fF2.r0 : c4498fF2.y;
    }

    public final zzu a() {
        return this.f;
    }

    public final K62 b() {
        return new K62(this.e, "", this, this.d, this.c);
    }

    public final List c() {
        return this.a;
    }

    public final void d(C4498fF2 c4498fF2) {
        k(c4498fF2, this.a.size());
    }

    public final void e(C4498fF2 c4498fF2) {
        int iIndexOf = this.a.indexOf(this.b.get(j(c4498fF2)));
        if (iIndexOf < 0 || iIndexOf >= this.b.size()) {
            iIndexOf = this.a.indexOf(this.f);
        }
        if (iIndexOf < 0 || iIndexOf >= this.b.size()) {
            return;
        }
        this.f = (zzu) this.a.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.a.size()) {
                return;
            }
            zzu zzuVar = (zzu) this.a.get(iIndexOf);
            zzuVar.zzb = 0L;
            zzuVar.zzc = null;
        }
    }

    public final void f(C4498fF2 c4498fF2, long j, zze zzeVar) {
        l(c4498fF2, j, zzeVar, false);
    }

    public final void g(C4498fF2 c4498fF2, long j, zze zzeVar) {
        l(c4498fF2, j, null, true);
    }

    public final synchronized void h(String str, List list) {
        if (this.b.containsKey(str)) {
            int iIndexOf = this.a.indexOf((zzu) this.b.get(str));
            try {
                this.a.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e) {
                zzt.zzo().u(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((C4498fF2) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void i(C5622jF2 c5622jF2) {
        this.d = c5622jF2;
    }

    public final synchronized void k(C4498fF2 c4498fF2, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.b;
        String strJ = j(c4498fF2);
        if (map.containsKey(strJ)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = c4498fF2.x.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, c4498fF2.x.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.K6)).booleanValue()) {
            str = c4498fF2.H;
            str2 = c4498fF2.I;
            str3 = c4498fF2.J;
            str4 = c4498fF2.K;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        zzu zzuVar = new zzu(c4498fF2.G, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.a.add(i, zzuVar);
        } catch (IndexOutOfBoundsException e) {
            zzt.zzo().u(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.b.put(strJ, zzuVar);
    }

    public final void l(C4498fF2 c4498fF2, long j, zze zzeVar, boolean z) {
        Map map = this.b;
        String strJ = j(c4498fF2);
        if (map.containsKey(strJ)) {
            if (this.e == null) {
                this.e = c4498fF2;
            }
            zzu zzuVar = (zzu) this.b.get(strJ);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.L6)).booleanValue() && z) {
                this.f = zzuVar;
            }
        }
    }
}
