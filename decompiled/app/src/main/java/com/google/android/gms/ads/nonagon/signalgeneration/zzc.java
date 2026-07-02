package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.daaw.AbstractC9322wT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.C0542Cj2;
import com.daaw.C1590Mj2;
import com.daaw.SC1;
import com.google.android.gms.ads.internal.client.zzba;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    public final C1590Mj2 h;
    public Map i;
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    public final int a = ((Integer) zzba.zzc().b(AbstractC9820yE1.U6)).intValue();
    public final long b = ((Long) zzba.zzc().b(AbstractC9820yE1.V6)).longValue();
    public final boolean c = ((Boolean) zzba.zzc().b(AbstractC9820yE1.a7)).booleanValue();
    public final boolean d = ((Boolean) zzba.zzc().b(AbstractC9820yE1.Y6)).booleanValue();
    public final Map e = DesugarCollections.synchronizedMap(new SC1(this));

    public zzc(C1590Mj2 c1590Mj2) {
        this.h = c1590Mj2;
    }

    public static final void g(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final /* synthetic */ void c(C0542Cj2 c0542Cj2, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        e(c0542Cj2, arrayDeque, "to");
        e(c0542Cj2, arrayDeque2, "of");
    }

    public final synchronized void d(final C0542Cj2 c0542Cj2) {
        if (this.c) {
            ArrayDeque arrayDeque = this.g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            AbstractC9322wT1.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.c(c0542Cj2, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    public final void e(C0542Cj2 c0542Cj2, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c0542Cj2.a());
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                g(this.i, "e_type", (String) pair.first);
                g(this.i, "e_agent", (String) pair.second);
            }
            this.h.f(this.i);
        }
    }

    public final synchronized void f() {
        long jA = com.google.android.gms.ads.internal.zzt.zzB().a();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jA - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized String zzb(String str, C0542Cj2 c0542Cj2) {
        Pair pair = (Pair) this.e.get(str);
        c0542Cj2.a().put("rid", str);
        if (pair == null) {
            c0542Cj2.a().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.e.remove(str);
        c0542Cj2.a().put("mhit", "true");
        return str2;
    }

    public final synchronized void zzd(String str, String str2, C0542Cj2 c0542Cj2) {
        this.e.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().a()), str2));
        f();
        d(c0542Cj2);
    }

    public final synchronized void zzf(String str) {
        this.e.remove(str);
    }
}
