package com.daaw;

import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.Sk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2241Sk1 {
    public final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());
    public final Map b = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final void b(C7521q11 c7521q11, boolean z) {
        this.b.put(c7521q11, Boolean.valueOf(z));
        c7521q11.a().b(new C2031Qk1(this, c7521q11));
    }

    public final void c(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        f(true, new Status(20, sb.toString()));
    }

    public final void d() {
        f(false, C10157zT.Q);
    }

    public final boolean e() {
        return (this.a.isEmpty() && this.b.isEmpty()) ? false : true;
    }

    public final void f(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.a) {
            map = new HashMap(this.a);
        }
        synchronized (this.b) {
            map2 = new HashMap(this.b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                AbstractC6314li0.a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C7521q11) entry2.getKey()).d(new E8(status));
            }
        }
    }
}
