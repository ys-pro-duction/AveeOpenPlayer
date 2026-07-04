package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class TR1 {
    public final Map a = new HashMap();
    public final List b = new ArrayList();
    public final Context c;
    public final C6239lR1 d;

    public TR1(Context context, C6239lR1 c6239lR1) {
        this.c = context;
        this.d = c6239lR1;
    }

    public final /* synthetic */ void b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.d.e();
        }
    }

    public final synchronized void c(String str) {
        try {
            if (this.a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = (str == "__default__" || (str != null && str.equals("__default__"))) ? PreferenceManager.getDefaultSharedPreferences(this.c) : this.c.getSharedPreferences(str, 0);
            SR1 sr1 = new SR1(this, str);
            this.a.put(str, sr1);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sr1);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(RR1 rr1) {
        this.b.add(rr1);
    }
}
