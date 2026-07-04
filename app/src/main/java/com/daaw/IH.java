package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class IH implements InterfaceC3740cZ0, InterfaceC9528xB0 {
    public final Map a = new HashMap();
    public Queue b = new ArrayDeque();
    public final Executor c;

    public IH(Executor executor) {
        this.c = executor;
    }

    @Override // com.daaw.InterfaceC3740cZ0
    public synchronized void a(Class cls, Executor executor, JH jh) {
        try {
            AbstractC8063ry0.b(cls);
            AbstractC8063ry0.b(jh);
            AbstractC8063ry0.b(executor);
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(cls)).put(jh, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.b;
                if (queue != null) {
                    this.b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                AbstractC6314li0.a(it.next());
                e(null);
            }
        }
    }

    public final synchronized Set d(FH fh) {
        throw null;
    }

    public void e(final FH fh) {
        AbstractC8063ry0.b(fh);
        synchronized (this) {
            try {
                Queue queue = this.b;
                if (queue != null) {
                    queue.add(fh);
                    return;
                }
                for (final Map.Entry entry : d(fh)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, fh) { // from class: com.daaw.HH
                        public final /* synthetic */ Map.Entry B;

                        @Override // java.lang.Runnable
                        public final void run() {
                            ((JH) this.B.getKey()).a(null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
