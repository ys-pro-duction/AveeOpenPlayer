package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class JL2 implements VK2 {
    public final Object a;
    public final KL2 b;
    public final TL2 c;
    public final SK2 d;

    public JL2(Object obj, KL2 kl2, TL2 tl2, SK2 sk2) {
        this.a = obj;
        this.b = kl2;
        this.c = tl2;
        this.d = sk2;
    }

    public static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C6383lw1 c6383lw1M = C6662mw1.M();
        c6383lw1M.p(5);
        c6383lw1M.n(AbstractC9213w33.T(bArr, 0, bArr.length));
        return Base64.encodeToString(((C6662mw1) c6383lw1M.j()).h(), 11);
    }

    @Override // com.daaw.VK2
    public final synchronized String a(Context context, String str) {
        Map mapZzb;
        mapZzb = this.c.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return i(j(null, mapZzb));
    }

    @Override // com.daaw.VK2
    public final synchronized void b(String str, MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.a.getClass().getDeclaredMethod("he", Map.class).invoke(this.a, map);
            this.d.d(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new RL2(2005, e);
        }
    }

    @Override // com.daaw.VK2
    public final synchronized String c(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = this.c.zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put("view", view);
        mapZza.put("act", activity);
        return i(j(null, mapZza));
    }

    @Override // com.daaw.VK2
    public final synchronized String d(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = this.c.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        return i(j(null, mapZzc));
    }

    public final synchronized int e() {
        try {
        } catch (Exception e) {
            throw new RL2(2006, e);
        }
        return ((Integer) this.a.getClass().getDeclaredMethod("lcs", null).invoke(this.a, null)).intValue();
    }

    public final KL2 f() {
        return this.b;
    }

    public final synchronized void g() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.a.getClass().getDeclaredMethod("close", null).invoke(this.a, null);
            this.d.d(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new RL2(2003, e);
        }
    }

    public final synchronized boolean h() {
        try {
        } catch (Exception e) {
            throw new RL2(2001, e);
        }
        return ((Boolean) this.a.getClass().getDeclaredMethod("init", null).invoke(this.a, null)).booleanValue();
    }

    public final synchronized byte[] j(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.d.c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.a, null, map2);
    }
}
