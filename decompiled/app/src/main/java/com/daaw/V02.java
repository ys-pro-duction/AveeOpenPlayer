package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class V02 {
    public final Map a;
    public final Map b;

    public V02(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final void a(C9267wF2 c9267wF2) {
        for (C8702uF2 c8702uF2 : c9267wF2.b.c) {
            if (this.a.containsKey(c8702uF2.a)) {
                ((Y02) this.a.get(c8702uF2.a)).b(c8702uF2.b);
            } else if (this.b.containsKey(c8702uF2.a)) {
                X02 x02 = (X02) this.b.get(c8702uF2.a);
                JSONObject jSONObject = c8702uF2.b;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                x02.a(map);
            }
        }
    }
}
