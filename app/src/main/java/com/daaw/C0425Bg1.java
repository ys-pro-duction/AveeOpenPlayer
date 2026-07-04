package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Bg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0425Bg1 {
    public Map a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.Bg1$a */
    public interface a {
        void invoke(Object obj, Object obj2, Object obj3);
    }

    public void a(Object obj, Object obj2, Object obj3) {
        for (WeakReference weakReference : this.a.keySet()) {
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                aVar.invoke(obj, obj2, obj3);
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
