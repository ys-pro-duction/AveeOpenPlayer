package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.tg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8536tg1 {
    public WeakReference a = new WeakReference(null);

    /* JADX INFO: renamed from: com.daaw.tg1$a */
    public interface a {
        void invoke(Object obj, Object obj2, Object obj3);
    }

    public void a(Object obj, Object obj2, Object obj3) {
        a aVar = (a) this.a.get();
        if (aVar != null) {
            aVar.invoke(obj, obj2, obj3);
        }
    }

    public C8536tg1 b(a aVar, List list) {
        list.add(aVar);
        this.a = new WeakReference(aVar);
        return this;
    }
}
