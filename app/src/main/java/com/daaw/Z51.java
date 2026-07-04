package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Z51 extends Y51 {
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        AbstractC9971yn.a(g());
        n(f() + 2);
        return new C9937yg0(e()[f() - 2], e()[f() - 1]);
    }
}
