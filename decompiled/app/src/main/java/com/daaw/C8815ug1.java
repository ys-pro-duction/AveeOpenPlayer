package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ug1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8815ug1 {
    public WeakReference a = new WeakReference(null);

    /* JADX INFO: renamed from: com.daaw.ug1$a */
    public interface a {
        void b(Object obj, Object obj2, Object obj3, Object obj4);
    }

    public void a(Object obj, Object obj2, Object obj3, Object obj4) {
        a aVar = (a) this.a.get();
        if (aVar != null) {
            aVar.b(obj, obj2, obj3, obj4);
        }
    }

    public C8815ug1 b(a aVar, List list) {
        list.add(aVar);
        this.a = new WeakReference(aVar);
        return this;
    }
}
