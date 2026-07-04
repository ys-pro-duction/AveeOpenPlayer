package com.daaw;

import com.daaw.AbstractC3317b10;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Ag0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0320Ag0 extends LinkedHashMap {
    public static final C0320Ag0 C;
    public boolean B;

    static {
        C0320Ag0 c0320Ag0 = new C0320Ag0();
        C = c0320Ag0;
        c0320Ag0.j();
    }

    public C0320Ag0() {
        this.B = true;
    }

    public static int b(Map map) {
        int iC = 0;
        for (Map.Entry entry : map.entrySet()) {
            iC += c(entry.getValue()) ^ c(entry.getKey());
        }
        return iC;
    }

    public static int c(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC3317b10.d((byte[]) obj);
        }
        if (obj instanceof AbstractC3317b10.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static void d(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC3317b10.a(obj);
            AbstractC3317b10.a(map.get(obj));
        }
    }

    public static C0320Ag0 e() {
        return C;
    }

    public static boolean g(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static boolean h(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !g(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && h(this, (Map) obj);
    }

    public final void f() {
        if (!i()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public boolean i() {
        return this.B;
    }

    public void j() {
        this.B = false;
    }

    public void k(C0320Ag0 c0320Ag0) {
        f();
        if (c0320Ag0.isEmpty()) {
            return;
        }
        putAll(c0320Ag0);
    }

    public C0320Ag0 l() {
        return isEmpty() ? new C0320Ag0() : new C0320Ag0(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        f();
        AbstractC3317b10.a(obj);
        AbstractC3317b10.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        f();
        d(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        return super.remove(obj);
    }

    public C0320Ag0(Map map) {
        super(map);
        this.B = true;
    }
}
