package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.vg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9101vg1 {
    public WeakReference a = new WeakReference(null);

    /* JADX INFO: renamed from: com.daaw.vg1$a */
    public interface a {
        Object invoke();
    }

    public Object a(Object obj) {
        a aVar = (a) this.a.get();
        return aVar != null ? aVar.invoke() : obj;
    }

    public C9101vg1 b(a aVar, List list) {
        list.add(aVar);
        this.a = new WeakReference(aVar);
        return this;
    }
}
