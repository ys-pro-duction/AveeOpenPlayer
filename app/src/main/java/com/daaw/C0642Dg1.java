package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Dg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0642Dg1 {
    public Map a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.Dg1$a */
    public interface a {
        void e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);
    }

    public void a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        for (WeakReference weakReference : this.a.keySet()) {
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                obj6 = obj;
                obj7 = obj2;
                obj8 = obj3;
                obj9 = obj4;
                obj10 = obj5;
                aVar.e(obj6, obj7, obj8, obj9, obj10);
            } else {
                obj6 = obj;
                obj7 = obj2;
                obj8 = obj3;
                obj9 = obj4;
                obj10 = obj5;
                this.a.remove(weakReference);
            }
            obj = obj6;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            obj5 = obj10;
        }
    }

    public void b(a aVar, List list) {
        list.add(aVar);
        this.a.put(new WeakReference(aVar), this);
    }
}
