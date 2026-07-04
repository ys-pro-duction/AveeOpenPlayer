package com.daaw;

import android.media.Spatializer;

/* JADX INFO: renamed from: com.daaw.fs3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4683fs3 implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ C8877us3 a;

    public C4683fs3(C6925ns3 c6925ns3, C8877us3 c8877us3) {
        this.a = c8877us3;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.u();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.u();
    }
}
