package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Hg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1058Hg1 {
    public Map a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.Hg1$a */
    public interface a {
        Object invoke(Object obj, Object obj2, Object obj3);
    }

    public Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        for (WeakReference weakReference : this.a.keySet()) {
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                obj4 = aVar.invoke(obj, obj2, obj3);
            } else {
                this.a.remove(weakReference);
            }
        }
        return obj4;
    }

    public void b(a aVar, List list) {
        list.add(aVar);
        this.a.put(new WeakReference(aVar), this);
    }
}
