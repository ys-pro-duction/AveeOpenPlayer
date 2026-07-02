package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9659xg1 {
    public WeakReference a = new WeakReference(null);

    /* JADX INFO: renamed from: com.daaw.xg1$a */
    public interface a {
        Object invoke(Object obj, Object obj2);
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        a aVar = (a) this.a.get();
        return aVar != null ? aVar.invoke(obj, obj2) : obj3;
    }

    public C9659xg1 b(a aVar, List list) {
        list.add(aVar);
        this.a = new WeakReference(aVar);
        return this;
    }
}
