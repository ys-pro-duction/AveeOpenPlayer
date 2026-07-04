package com.daaw;

import com.daaw.r;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3351b8 extends r.a {
    public final Map a;
    public final Map b;
    public final Map c;

    public C3351b8(Map map, Map map2, Map map3) {
        G10.g(map, "memberAnnotations");
        G10.g(map2, "propertyConstants");
        G10.g(map3, "annotationParametersDefaultValues");
        this.a = map;
        this.b = map2;
        this.c = map3;
    }

    @Override // com.daaw.r.a
    public Map a() {
        return this.a;
    }

    public final Map b() {
        return this.c;
    }

    public final Map c() {
        return this.b;
    }
}
