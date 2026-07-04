package com.daaw;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class TY implements Iterator {
    public final ArrayDeque B = new ArrayDeque();
    public final boolean C;

    public TY(X80 x80, Object obj, Comparator comparator, boolean z) {
        this.C = z;
        while (!x80.isEmpty()) {
            int iCompare = obj != null ? z ? comparator.compare(obj, x80.getKey()) : comparator.compare(x80.getKey(), obj) : 1;
            if (iCompare < 0) {
                x80 = z ? x80.a() : x80.d();
            } else if (iCompare == 0) {
                this.B.push((Z80) x80);
                return;
            } else {
                this.B.push((Z80) x80);
                x80 = z ? x80.d() : x80.a();
            }
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        try {
            Z80 z80 = (Z80) this.B.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(z80.getKey(), z80.getValue());
            if (this.C) {
                for (X80 x80A = z80.a(); !x80A.isEmpty(); x80A = x80A.d()) {
                    this.B.push((Z80) x80A);
                }
            } else {
                for (X80 x80D = z80.d(); !x80D.isEmpty(); x80D = x80D.a()) {
                    this.B.push((Z80) x80D);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.B.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
