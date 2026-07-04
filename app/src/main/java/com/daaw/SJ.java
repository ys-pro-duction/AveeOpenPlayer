package com.daaw;

import com.daaw.FM0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SJ extends FM0 {
    public final HashMap F = new HashMap();

    public boolean contains(Object obj) {
        return this.F.containsKey(obj);
    }

    @Override // com.daaw.FM0
    public FM0.c m(Object obj) {
        return (FM0.c) this.F.get(obj);
    }

    @Override // com.daaw.FM0
    public Object v(Object obj, Object obj2) {
        FM0.c cVarM = m(obj);
        if (cVarM != null) {
            return cVarM.C;
        }
        this.F.put(obj, s(obj, obj2));
        return null;
    }

    @Override // com.daaw.FM0
    public Object w(Object obj) {
        Object objW = super.w(obj);
        this.F.remove(obj);
        return objW;
    }

    public Map.Entry y(Object obj) {
        if (contains(obj)) {
            return ((FM0.c) this.F.get(obj)).E;
        }
        return null;
    }
}
