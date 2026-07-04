package com.daaw;

import com.daaw.B60;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.uW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8768uW0 extends AbstractC9054vW0 implements Iterator, InterfaceC9783y60 {

    /* JADX INFO: renamed from: com.daaw.uW0$a */
    public static final class a implements Map.Entry, B60.a {
        public final Object B;
        public Object C;

        public a() {
            Map.Entry entryF = C8768uW0.this.f();
            G10.d(entryF);
            this.B = entryF.getKey();
            Map.Entry entryF2 = C8768uW0.this.f();
            G10.d(entryF2);
            this.C = entryF2.getValue();
        }

        public void b(Object obj) {
            this.C = obj;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.B;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.C;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            C8768uW0 c8768uW0 = C8768uW0.this;
            if (c8768uW0.g().d() != c8768uW0.D) {
                throw new ConcurrentModificationException();
            }
            Object value = getValue();
            c8768uW0.g().put(getKey(), obj);
            b(obj);
            return value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8768uW0(C9883yU0 c9883yU0, Iterator it) {
        super(c9883yU0, it);
        G10.g(c9883yU0, "map");
        G10.g(it, "iterator");
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        e();
        if (f() != null) {
            return new a();
        }
        throw new IllegalStateException();
    }
}
