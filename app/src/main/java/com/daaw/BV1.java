package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BV1 {
    public final ArrayList a = new ArrayList();
    public long b;

    public final long a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((L43) it.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.b = Math.max(this.b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.b;
    }

    public final void b(L43 l43) {
        this.a.add(l43);
    }
}
