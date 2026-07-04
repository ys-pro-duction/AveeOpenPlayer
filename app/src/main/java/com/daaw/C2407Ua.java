package com.daaw;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: com.daaw.Ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2407Ua extends BS0 implements Map, j$.util.Map {
    public AbstractC9658xg0 I;

    /* JADX INFO: renamed from: com.daaw.Ua$a */
    public class a extends AbstractC9658xg0 {
        public a() {
        }

        @Override // com.daaw.AbstractC9658xg0
        public void a() {
            C2407Ua.this.clear();
        }

        @Override // com.daaw.AbstractC9658xg0
        public Object b(int i, int i2) {
            return C2407Ua.this.C[(i << 1) + i2];
        }

        @Override // com.daaw.AbstractC9658xg0
        public Map c() {
            return C2407Ua.this;
        }

        @Override // com.daaw.AbstractC9658xg0
        public int d() {
            return C2407Ua.this.D;
        }

        @Override // com.daaw.AbstractC9658xg0
        public int e(Object obj) {
            return C2407Ua.this.g(obj);
        }

        @Override // com.daaw.AbstractC9658xg0
        public int f(Object obj) {
            return C2407Ua.this.i(obj);
        }

        @Override // com.daaw.AbstractC9658xg0
        public void g(Object obj, Object obj2) {
            C2407Ua.this.put(obj, obj2);
        }

        @Override // com.daaw.AbstractC9658xg0
        public void h(int i) {
            C2407Ua.this.l(i);
        }

        @Override // com.daaw.AbstractC9658xg0
        public Object i(int i, Object obj) {
            return C2407Ua.this.m(i, obj);
        }
    }

    public C2407Ua() {
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

    @Override // java.util.Map
    public Set entrySet() {
        return o().l();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public Set keySet() {
        return o().m();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final AbstractC9658xg0 o() {
        if (this.I == null) {
            this.I = new a();
        }
        return this.I;
    }

    public boolean p(Collection collection) {
        return AbstractC9658xg0.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        d(this.D + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public Collection values() {
        return o().n();
    }

    public C2407Ua(int i) {
        super(i);
    }

    public C2407Ua(BS0 bs0) {
        super(bs0);
    }
}
