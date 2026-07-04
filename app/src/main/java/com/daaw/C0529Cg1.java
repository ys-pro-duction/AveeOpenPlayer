package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Cg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0529Cg1 {
    public Map a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.Cg1$a */
    public interface a {
        void b(Object obj, Object obj2, Object obj3, Object obj4);
    }

    public void a(Object obj, Object obj2, Object obj3, Object obj4) {
        for (WeakReference weakReference : this.a.keySet()) {
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                aVar.b(obj, obj2, obj3, obj4);
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
