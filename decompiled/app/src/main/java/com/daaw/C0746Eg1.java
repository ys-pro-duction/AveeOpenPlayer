package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Eg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0746Eg1 {
    public Map a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.Eg1$a */
    public interface a {
        Object invoke();
    }

    public Object a(Object obj) {
        for (WeakReference weakReference : this.a.keySet()) {
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                obj = aVar.invoke();
            } else {
                this.a.remove(weakReference);
            }
        }
        return obj;
    }

    public void b(a aVar, List list) {
        list.add(aVar);
        this.a.put(new WeakReference(aVar), this);
    }
}
