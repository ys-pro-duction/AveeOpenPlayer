package com.daaw;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.pa3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7393pa3 implements InterfaceC3081a93 {
    public static final Map a = new C2407Ua();

    public static AbstractC7393pa3 a(Context context, String str, Runnable runnable) {
        if (AbstractC3076a83.b()) {
            throw null;
        }
        synchronized (AbstractC7393pa3.class) {
            AbstractC6314li0.a(a.get(null));
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } finally {
            }
        }
    }

    public static synchronized void b() {
        Map map = a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
        map.clear();
    }
}
