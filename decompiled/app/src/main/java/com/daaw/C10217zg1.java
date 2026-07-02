package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.zg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10217zg1 {
    public Map a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.zg1$a */
    public interface a {
        void invoke(Object obj);
    }

    public void a(Object obj) {
        for (WeakReference weakReference : this.a.keySet()) {
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                aVar.invoke(obj);
            } else {
                this.a.remove(weakReference);
            }
        }
    }

    public void b(a aVar, List list) {
        list.add(aVar);
        this.a.put(new WeakReference(aVar), this);
    }

    public void c(List list) {
        for (WeakReference weakReference : this.a.keySet()) {
            a aVar = (a) weakReference.get();
            if (aVar == null || list.remove(aVar)) {
                this.a.remove(weakReference);
            }
        }
    }
}
