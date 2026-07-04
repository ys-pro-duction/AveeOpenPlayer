package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.j20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5560j20 {

    /* JADX INFO: renamed from: com.daaw.j20$a */
    public class a extends O91 {
        public boolean B;
        public final /* synthetic */ Object C;

        public a(Object obj) {
            this.C = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.B;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.B) {
                throw new NoSuchElementException();
            }
            this.B = true;
            return this.C;
        }
    }

    public static boolean a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC8301sp0.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static O91 b(Object obj) {
        return new a(obj);
    }
}
