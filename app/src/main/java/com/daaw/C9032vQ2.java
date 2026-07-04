package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.vQ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9032vQ2 extends JO2 {
    public final transient CO2 G;

    public C9032vQ2(Map map, CO2 co2) {
        super(map);
        this.G = co2;
    }

    @Override // com.daaw.AbstractC4827gP2
    public final Map d() {
        return n();
    }

    @Override // com.daaw.AbstractC4827gP2
    public final Set e() {
        return o();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // com.daaw.AbstractC3981dP2
    public final /* bridge */ /* synthetic */ Collection g() {
        return this.G.zza();
    }
}
