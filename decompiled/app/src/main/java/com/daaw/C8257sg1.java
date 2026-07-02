package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8257sg1 {
    public WeakReference a = new WeakReference(null);

    /* JADX INFO: renamed from: com.daaw.sg1$a */
    public interface a {
        void invoke(Object obj);
    }

    public void a(Object obj) {
        a aVar = (a) this.a.get();
        if (aVar != null) {
            aVar.invoke(obj);
        }
    }

    public C8257sg1 b(a aVar, List list) {
        list.add(aVar);
        this.a = new WeakReference(aVar);
        return this;
    }
}
