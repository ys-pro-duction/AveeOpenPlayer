package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.iu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5525iu0 extends AbstractC6119l0 implements InterfaceC6095ku0 {
    public static final a F = new a(null);
    public static final C5525iu0 G;
    public final Object C;
    public final Object D;
    public final C2066Qt0 E;

    /* JADX INFO: renamed from: com.daaw.iu0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final InterfaceC6095ku0 a() {
            return C5525iu0.G;
        }

        public a() {
        }
    }

    static {
        JG jg = JG.a;
        G = new C5525iu0(jg, jg, C2066Qt0.E.a());
    }

    public C5525iu0(Object obj, Object obj2, C2066Qt0 c2066Qt0) {
        G10.g(c2066Qt0, "hashMap");
        this.C = obj;
        this.D = obj2;
        this.E = c2066Qt0;
    }

    @Override // java.util.Collection, java.util.Set, com.daaw.InterfaceC6095ku0
    public InterfaceC6095ku0 add(Object obj) {
        if (this.E.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C5525iu0(obj, obj, this.E.r(obj, new C4879gc0()));
        }
        Object obj2 = this.D;
        Object obj3 = this.E.get(obj2);
        G10.d(obj3);
        return new C5525iu0(this.C, obj, this.E.r(obj2, ((C4879gc0) obj3).e(obj)).r(obj, new C4879gc0(obj2)));
    }

    @Override // com.daaw.AbstractC9193w, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.E.containsKey(obj);
    }

    @Override // com.daaw.AbstractC9193w
    public int e() {
        return this.E.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C5807ju0(this.C, this.E);
    }

    @Override // java.util.Collection, java.util.Set, com.daaw.InterfaceC6095ku0
    public InterfaceC6095ku0 remove(Object obj) {
        C4879gc0 c4879gc0 = (C4879gc0) this.E.get(obj);
        if (c4879gc0 == null) {
            return this;
        }
        C2066Qt0 c2066Qt0S = this.E.s(obj);
        if (c4879gc0.b()) {
            Object obj2 = c2066Qt0S.get(c4879gc0.d());
            G10.d(obj2);
            c2066Qt0S = c2066Qt0S.r(c4879gc0.d(), ((C4879gc0) obj2).e(c4879gc0.c()));
        }
        if (c4879gc0.a()) {
            Object obj3 = c2066Qt0S.get(c4879gc0.c());
            G10.d(obj3);
            c2066Qt0S = c2066Qt0S.r(c4879gc0.c(), ((C4879gc0) obj3).f(c4879gc0.d()));
        }
        return new C5525iu0(!c4879gc0.b() ? c4879gc0.c() : this.C, !c4879gc0.a() ? c4879gc0.d() : this.D, c2066Qt0S);
    }
}
