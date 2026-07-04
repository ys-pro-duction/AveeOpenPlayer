package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.vW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9054vW0 {
    public final C9883yU0 B;
    public final Iterator C;
    public int D;
    public Map.Entry E;
    public Map.Entry F;

    public AbstractC9054vW0(C9883yU0 c9883yU0, Iterator it) {
        G10.g(c9883yU0, "map");
        G10.g(it, "iterator");
        this.B = c9883yU0;
        this.C = it;
        this.D = c9883yU0.d();
        e();
    }

    public final void e() {
        this.E = this.F;
        this.F = this.C.hasNext() ? (Map.Entry) this.C.next() : null;
    }

    public final Map.Entry f() {
        return this.E;
    }

    public final C9883yU0 g() {
        return this.B;
    }

    public final Map.Entry h() {
        return this.F;
    }

    public final boolean hasNext() {
        return this.F != null;
    }

    public final void remove() {
        if (g().d() != this.D) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.E;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.B.remove(entry.getKey());
        this.E = null;
        G91 g91 = G91.a;
        this.D = g().d();
    }
}
