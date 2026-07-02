package com.daaw;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class UJ implements Serializable {
    public final Map B;
    public final Map C;
    public final Set D;
    public final Integer E;
    public final Integer F;
    public final boolean G;

    public UJ(Map map, Map map2, Set set, int i, int i2, boolean z) {
        this.B = DesugarCollections.unmodifiableMap((Map) AbstractC6948ny0.c(map, "String mapping must not be null"));
        this.C = DesugarCollections.unmodifiableMap((Map) AbstractC6948ny0.c(map2, "Integer mapping must not be null"));
        this.D = DesugarCollections.unmodifiableSet((Set) AbstractC6948ny0.c(set, "Special (non-standard) chars set must not be null"));
        this.E = Integer.valueOf(i);
        this.F = Integer.valueOf(i2);
        this.G = z;
    }

    public int a() {
        return this.F.intValue();
    }

    public Integer b(Integer num) {
        return (Integer) this.C.get(num);
    }

    public Set c() {
        return this.D;
    }

    public int d() {
        return this.E.intValue();
    }

    public Set e() {
        return this.B.keySet();
    }

    public Integer f(String str) {
        return (Integer) this.B.get(str);
    }

    public boolean g(int i) {
        return i >= d() && i <= a();
    }

    public boolean h(int i) {
        return i > 0 && i <= (a() - d()) + 1 && i <= a();
    }

    public boolean i() {
        return this.G;
    }
}
