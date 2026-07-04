package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ue1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8805ue1 {
    public final C4427f01 a = new C4427f01();
    public final Map b = new LinkedHashMap();
    public final Set c = new LinkedHashSet();
    public volatile boolean d;

    public final void d(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(autoCloseable, "closeable");
        if (this.d) {
            f(autoCloseable);
            return;
        }
        synchronized (this.a) {
            autoCloseable2 = (AutoCloseable) this.b.put(str, autoCloseable);
        }
        f(autoCloseable2);
    }

    public final void e() {
        if (this.d) {
            return;
        }
        this.d = true;
        synchronized (this.a) {
            try {
                Iterator it = this.b.values().iterator();
                while (it.hasNext()) {
                    f((AutoCloseable) it.next());
                }
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    f((AutoCloseable) it2.next());
                }
                this.c.clear();
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                IO.a(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final AutoCloseable g(String str) {
        AutoCloseable autoCloseable;
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        synchronized (this.a) {
            autoCloseable = (AutoCloseable) this.b.get(str);
        }
        return autoCloseable;
    }
}
