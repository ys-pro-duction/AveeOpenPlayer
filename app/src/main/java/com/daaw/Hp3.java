package com.daaw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Hp3 {
    public final InterfaceC1813On1 a;
    public final Map b = new HashMap();
    public final Set c = new HashSet();
    public final Map d = new HashMap();
    public NW2 e;

    public Hp3(InterfaceC1813On1 interfaceC1813On1) {
        this.a = interfaceC1813On1;
    }

    public final void a(NW2 nw2) {
        if (nw2 != this.e) {
            this.e = nw2;
            this.b.clear();
            this.d.clear();
        }
    }
}
