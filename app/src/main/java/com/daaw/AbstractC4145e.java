package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4145e implements InterfaceC6896nn {
    public C6617mn a;
    public List b = new ArrayList();

    @Override // com.daaw.InterfaceC6896nn
    public C6617mn b() {
        if (this.a == null) {
            this.a = new C6617mn();
        }
        return this.a;
    }

    @Override // com.daaw.InterfaceC6896nn
    public void c(C6617mn c6617mn) {
        this.a = c6617mn;
        this.b.clear();
    }

    @Override // com.daaw.InterfaceC6896nn
    public List d() {
        return this.b;
    }

    public int e(float f, float f2) {
        return Math.max(1, (int) ((3.063052912151454d / Math.asin(f2 / f)) + 0.5d));
    }

    public int f() {
        return Math.round(this.a.e * 255.0f);
    }
}
