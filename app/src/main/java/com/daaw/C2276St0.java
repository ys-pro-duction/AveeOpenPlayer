package com.daaw;

import com.daaw.InterfaceC5248hu0;
import j$.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: com.daaw.St0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2276St0 extends W implements InterfaceC5248hu0.a, Map {
    public C2066Qt0 B;
    public C2972Zl0 C;
    public X51 D;
    public Object E;
    public int F;
    public int G;

    public C2276St0(C2066Qt0 c2066Qt0) {
        G10.g(c2066Qt0, "map");
        this.B = c2066Qt0;
        this.C = new C2972Zl0();
        this.D = this.B.o();
        this.G = this.B.size();
    }

    @Override // com.daaw.W
    public Set b() {
        return new C2484Ut0(this);
    }

    @Override // com.daaw.W
    public Set c() {
        return new C2692Wt0(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.D = X51.e.a();
        m(0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.D.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // com.daaw.W
    public int d() {
        return this.G;
    }

    @Override // com.daaw.W
    public Collection e() {
        return new C2900Yt0(this);
    }

    @Override // com.daaw.InterfaceC5248hu0.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C2066Qt0 a() {
        C2066Qt0 c2066Qt0;
        if (this.D == this.B.o()) {
            c2066Qt0 = this.B;
        } else {
            this.C = new C2972Zl0();
            c2066Qt0 = new C2066Qt0(this.D, size());
        }
        this.B = c2066Qt0;
        return c2066Qt0;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final int g() {
        return this.F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.D.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final X51 h() {
        return this.D;
    }

    public final C2972Zl0 j() {
        return this.C;
    }

    public final void k(int i) {
        this.F = i;
    }

    public final void l(Object obj) {
        this.E = obj;
    }

    public void m(int i) {
        this.G = i;
        this.F++;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.E = null;
        this.D = this.D.D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.E;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map map) {
        G10.g(map, "from");
        C2066Qt0 c2066Qt0A = map instanceof C2066Qt0 ? (C2066Qt0) map : null;
        if (c2066Qt0A == null) {
            C2276St0 c2276St0 = map instanceof C2276St0 ? (C2276St0) map : null;
            c2066Qt0A = c2276St0 != null ? c2276St0.a() : null;
        }
        if (c2066Qt0A == null) {
            super.putAll(map);
            return;
        }
        C4420ez c4420ez = new C4420ez(0, 1, null);
        int size = size();
        this.D = this.D.E(c2066Qt0A.o(), 0, c4420ez, this);
        int size2 = (c2066Qt0A.size() + size) - c4420ez.a();
        if (size != size2) {
            m(size2);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.E = null;
        X51 x51G = this.D.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (x51G == null) {
            x51G = X51.e.a();
        }
        this.D = x51G;
        return this.E;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        X51 x51H = this.D.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (x51H == null) {
            x51H = X51.e.a();
        }
        this.D = x51H;
        return size != size();
    }
}
