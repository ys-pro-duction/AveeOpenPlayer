package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.wa2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9351wa2 {
    public final Map B = new HashMap();

    public AbstractC9351wa2(Set set) {
        y0(set);
    }

    public final synchronized void A0(final InterfaceC9072va2 interfaceC9072va2) {
        for (Map.Entry entry : this.B.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.daaw.ua2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        interfaceC9072va2.zza(key);
                    } catch (Throwable th) {
                        zzt.zzo().t(th, "EventEmitter.notify");
                        zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    public final synchronized void w0(C0623Db2 c0623Db2) {
        x0(c0623Db2.a, c0623Db2.b);
    }

    public final synchronized void x0(Object obj, Executor executor) {
        this.B.put(obj, executor);
    }

    public final synchronized void y0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w0((C0623Db2) it.next());
        }
    }
}
