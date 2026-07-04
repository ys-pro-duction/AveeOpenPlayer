package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.wg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9380wg1 {
    public WeakReference a = new WeakReference(null);

    /* JADX INFO: renamed from: com.daaw.wg1$a */
    public interface a {
        Object invoke(Object obj);
    }

    public Object a(Object obj, Object obj2) {
        a aVar = (a) this.a.get();
        return aVar != null ? aVar.invoke(obj) : obj2;
    }

    public C9380wg1 b(a aVar, List list) {
        list.add(aVar);
        this.a = new WeakReference(aVar);
        return this;
    }
}
