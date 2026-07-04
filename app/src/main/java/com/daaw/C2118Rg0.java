package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Rg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2118Rg0 {
    public final List a;
    public final List b;
    public final List c;

    public C2118Rg0(List list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(((C2014Qg0) list.get(i)).b().h());
            this.b.add(((C2014Qg0) list.get(i)).c().h());
        }
    }

    public List a() {
        return this.a;
    }

    public List b() {
        return this.c;
    }

    public List c() {
        return this.b;
    }
}
