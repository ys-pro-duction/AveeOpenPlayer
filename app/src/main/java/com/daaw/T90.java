package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class T90 implements Iterator {
    public Iterator B;

    public T90(Iterator it) {
        this.B = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.B.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.B.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.B.remove();
    }
}
