package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.ju0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5807ju0 implements Iterator, InterfaceC9783y60 {
    public Object B;
    public final Map C;
    public int D;

    public C5807ju0(Object obj, Map map) {
        G10.g(map, "map");
        this.B = obj;
        this.C = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.D < this.C.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        b();
        Object obj = this.B;
        this.D++;
        Object obj2 = this.C.get(obj);
        if (obj2 != null) {
            this.B = ((C4879gc0) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
