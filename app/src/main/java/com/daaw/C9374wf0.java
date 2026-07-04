package com.daaw;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.wf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9374wf0 {
    public int b;
    public final int c;
    public final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);
    public int d = 0;

    public C9374wf0(int i) {
        this.c = i;
        this.b = i;
    }

    public void d() {
        m(0);
    }

    public final void f() {
        m(this.b);
    }

    public Object g(Object obj) {
        return this.a.get(obj);
    }

    public int h() {
        return this.d;
    }

    public int i(Object obj) {
        return 1;
    }

    public Object k(Object obj, Object obj2) {
        if (i(obj2) >= this.b) {
            j(obj, obj2);
            return null;
        }
        Object objPut = this.a.put(obj, obj2);
        if (obj2 != null) {
            this.d += i(obj2);
        }
        if (objPut != null) {
            this.d -= i(objPut);
        }
        f();
        return objPut;
    }

    public Object l(Object obj) {
        Object objRemove = this.a.remove(obj);
        if (objRemove != null) {
            this.d -= i(objRemove);
        }
        return objRemove;
    }

    public void m(int i) {
        while (this.d > i) {
            Map.Entry entry = (Map.Entry) this.a.entrySet().iterator().next();
            Object value = entry.getValue();
            this.d -= i(value);
            Object key = entry.getKey();
            this.a.remove(key);
            j(key, value);
        }
    }

    public void j(Object obj, Object obj2) {
    }
}
