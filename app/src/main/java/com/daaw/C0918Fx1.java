package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.Fx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0918Fx1 implements Iterator {
    public int B = 0;
    public final /* synthetic */ C6391ly1 C;

    public C0918Fx1(C6391ly1 c6391ly1) {
        this.C = c6391ly1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B < this.C.B.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.B;
        C6391ly1 c6391ly1 = this.C;
        if (i >= c6391ly1.B.length()) {
            throw new NoSuchElementException();
        }
        String str = c6391ly1.B;
        this.B = i + 1;
        return new C6391ly1(String.valueOf(str.charAt(i)));
    }
}
