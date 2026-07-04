package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.rI2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7877rI2 {
    public final InterfaceC5485im a;
    public final Map b = new HashMap();
    public final Map c = new HashMap();

    public C7877rI2(InterfaceC5485im interfaceC5485im) {
        this.a = interfaceC5485im;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    i++;
                    arrayList.add(new C7599qI2(((String) entry.getKey()) + "." + i, (String) it.next()));
                }
            } else {
                arrayList.add(new C7599qI2((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void b(String str) {
        if (!this.c.containsKey(str)) {
            this.c.put(str, Long.valueOf(this.a.b()));
            return;
        }
        long jB = this.a.b() - ((Long) this.c.remove(str)).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(jB);
        d(str, sb.toString());
    }

    public final void c(String str, String str2) {
        if (!this.c.containsKey(str)) {
            this.c.put(str, Long.valueOf(this.a.b()));
            return;
        }
        d(str, str2 + (this.a.b() - ((Long) this.c.remove(str)).longValue()));
    }

    public final void d(String str, String str2) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, new ArrayList());
        }
        ((List) this.b.get(str)).add(str2);
    }
}
