package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.h22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5006h22 implements HI1 {
    public final /* synthetic */ C5285i22 a;

    public C5006h22(C5285i22 c5285i22) {
        this.a = c5285i22;
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        if (C5285i22.g(this.a, map)) {
            this.a.c.execute(new Runnable() { // from class: com.daaw.g22
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.a.d.r();
                }
            });
        }
    }
}
