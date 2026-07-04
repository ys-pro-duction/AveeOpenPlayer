package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.jS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5676jS1 {
    public long a = -1;
    public long b = -1;
    public final /* synthetic */ C5955kS1 c;

    public C5676jS1(C5955kS1 c5955kS1) {
        this.c = c5955kS1;
    }

    public final long a() {
        return this.b;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.a);
        bundle.putLong("tclose", this.b);
        return bundle;
    }

    public final void c() {
        this.b = this.c.a.b();
    }

    public final void d() {
        this.a = this.c.a.b();
    }
}
