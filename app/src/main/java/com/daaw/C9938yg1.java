package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.yg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9938yg1 {
    public Map a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.yg1$a */
    public interface a {
        void invoke();
    }

    public void a() {
        for (WeakReference weakReference : this.a.keySet()) {
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                aVar.invoke();
            } else {
                this.a.remove(weakReference);
            }
        }
    }

    public void b(a aVar, List list) {
        list.add(aVar);
        this.a.put(new WeakReference(aVar), this);
    }
}
