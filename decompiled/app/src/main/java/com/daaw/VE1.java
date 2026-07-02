package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class VE1 {
    public final List a = new LinkedList();
    public final Map b;
    public final Object c;

    public VE1(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final NE1 f() {
        return new NE1(zzt.zzB().b(), null, null);
    }

    public final PE1 a() {
        PE1 pe1;
        boolean zBooleanValue = ((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.c) {
            try {
                for (NE1 ne1 : this.a) {
                    long jA = ne1.a();
                    String strC = ne1.c();
                    NE1 ne1B = ne1.b();
                    if (ne1B != null && jA > 0) {
                        long jA2 = jA - ne1B.a();
                        sb.append(strC);
                        sb.append('.');
                        sb.append(jA2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(ne1B.a()))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(ne1B.a()));
                                sb2.append('+');
                                sb2.append(strC);
                            } else {
                                map.put(Long.valueOf(ne1B.a()), new StringBuilder(strC));
                            }
                        }
                    }
                }
                this.a.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(zzt.zzB().a() + (((Long) entry.getKey()).longValue() - zzt.zzB().b()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                pe1 = new PE1(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pe1;
    }

    public final Map b() {
        Map map;
        synchronized (this.c) {
            zzt.zzo().f();
            map = this.b;
        }
        return map;
    }

    public final void c(VE1 ve1) {
        synchronized (this.c) {
        }
    }

    public final void d(String str, String str2) {
        GE1 ge1F;
        if (TextUtils.isEmpty(str2) || (ge1F = zzt.zzo().f()) == null) {
            return;
        }
        synchronized (this.c) {
            ME1 me1A = ge1F.a(str);
            Map map = this.b;
            map.put(str, me1A.a((String) map.get(str), str2));
        }
    }

    public final boolean e(NE1 ne1, long j, String... strArr) {
        synchronized (this.c) {
            for (int i = 0; i <= 0; i++) {
                try {
                    this.a.add(new NE1(j, strArr[i], ne1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return true;
    }
}
