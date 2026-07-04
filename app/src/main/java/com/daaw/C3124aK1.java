package com.daaw;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.aK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3124aK1 implements InitializationStatus {
    public final Map a;

    public C3124aK1(Map map) {
        this.a = map;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        return this.a;
    }
}
