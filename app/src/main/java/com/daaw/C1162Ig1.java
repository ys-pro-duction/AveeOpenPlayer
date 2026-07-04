package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ig1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1162Ig1 {
    public Map a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.Ig1$a */
    public interface a {
        Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);
    }

    public Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        for (WeakReference weakReference : this.a.keySet()) {
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                obj7 = obj;
                obj8 = obj2;
                obj9 = obj3;
                obj10 = obj4;
                obj11 = obj5;
                obj6 = aVar.e(obj7, obj8, obj9, obj10, obj11);
            } else {
                obj7 = obj;
                obj8 = obj2;
                obj9 = obj3;
                obj10 = obj4;
                obj11 = obj5;
                this.a.remove(weakReference);
            }
            obj = obj7;
            obj2 = obj8;
            obj3 = obj9;
            obj4 = obj10;
            obj5 = obj11;
        }
        return obj6;
    }

    public void b(a aVar, List list) {
        list.add(aVar);
        this.a.put(new WeakReference(aVar), this);
    }
}
