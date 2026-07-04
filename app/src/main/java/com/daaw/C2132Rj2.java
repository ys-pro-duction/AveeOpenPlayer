package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Rj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2132Rj2 {
    public final String e;
    public final C1590Mj2 f;
    public final List b = new ArrayList();
    public boolean c = false;
    public boolean d = false;
    public final zzg a = zzt.zzo().h();

    public C2132Rj2(String str, C1590Mj2 c1590Mj2) {
        this.e = str;
        this.f = c1590Mj2;
    }

    public final synchronized void a(String str) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "aaia");
                mapG.put("aair", "MalformedJson");
                this.b.add(mapG);
            }
        }
    }

    public final synchronized void b(String str, String str2) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "adapter_init_finished");
                mapG.put("ancn", str);
                mapG.put("rqe", str2);
                this.b.add(mapG);
            }
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "adapter_init_started");
                mapG.put("ancn", str);
                this.b.add(mapG);
            }
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "adapter_init_finished");
                mapG.put("ancn", str);
                this.b.add(mapG);
            }
        }
    }

    public final synchronized void e() {
        try {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X1)).booleanValue()) {
                if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue()) {
                    if (this.d) {
                        return;
                    }
                    Map mapG = g();
                    mapG.put("action", "init_finished");
                    this.b.add(mapG);
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        this.f.f((Map) it.next());
                    }
                    this.d = true;
                }
            }
        } finally {
        }
    }

    public final synchronized void f() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X1)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.r8)).booleanValue()) {
                if (this.c) {
                    return;
                }
                Map mapG = g();
                mapG.put("action", "init_started");
                this.b.add(mapG);
                this.c = true;
            }
        }
    }

    public final Map g() {
        Map mapG = this.f.g();
        mapG.put("tms", Long.toString(zzt.zzB().b(), 10));
        mapG.put("tid", this.a.zzQ() ? "" : this.e);
        return mapG;
    }
}
