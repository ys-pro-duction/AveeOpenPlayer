package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ag1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0321Ag1 {
    public Map a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.Ag1$a */
    public interface a {
        void invoke(Object obj, Object obj2);
    }

    public void a(Object obj, Object obj2) {
        for (WeakReference weakReference : this.a.keySet()) {
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                aVar.invoke(obj, obj2);
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
