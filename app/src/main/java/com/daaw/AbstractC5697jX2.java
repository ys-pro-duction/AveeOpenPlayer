package com.daaw;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.jX2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5697jX2 {
    public final Class a;
    public final Map b;
    public final Class c;

    public AbstractC5697jX2(Class cls, MX2... mx2Arr) {
        this.a = cls;
        HashMap map = new HashMap();
        for (int i = 0; i <= 0; i++) {
            MX2 mx2 = mx2Arr[i];
            if (map.containsKey(mx2.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(mx2.b().getCanonicalName())));
            }
            map.put(mx2.b(), mx2);
        }
        this.c = mx2Arr[0].b();
        this.b = DesugarCollections.unmodifiableMap(map);
    }

    public abstract AbstractC5417iX2 a();

    public abstract EnumC6686n13 b();

    public abstract U43 c(AbstractC9213w33 abstractC9213w33);

    public abstract String d();

    public abstract void e(U43 u43);

    public int f() {
        return 1;
    }

    public final Class g() {
        return this.c;
    }

    public final Class h() {
        return this.a;
    }

    public final Object i(U43 u43, Class cls) {
        MX2 mx2 = (MX2) this.b.get(cls);
        if (mx2 != null) {
            return mx2.a(u43);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set j() {
        return this.b.keySet();
    }
}
