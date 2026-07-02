package com.daaw;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class Nb3 {
    public final Map a = new HashMap();

    public final void a(String str, Callable callable) {
        this.a.put(str, callable);
    }
}
