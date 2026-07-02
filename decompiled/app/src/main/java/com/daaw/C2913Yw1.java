package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.Yw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2913Yw1 implements Iterator {
    public int B = 0;
    public final /* synthetic */ C6391ly1 C;

    public C2913Yw1(C6391ly1 c6391ly1) {
        this.C = c6391ly1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B < this.C.B.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.B;
        if (i >= this.C.B.length()) {
            throw new NoSuchElementException();
        }
        this.B = i + 1;
        return new C6391ly1(String.valueOf(i));
    }
}
