package com.daaw;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: renamed from: com.daaw.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5861k6 implements InterfaceC8600tt0 {
    public final PathMeasure a;

    public C5861k6(PathMeasure pathMeasure) {
        G10.g(pathMeasure, "internalPathMeasure");
        this.a = pathMeasure;
    }

    @Override // com.daaw.InterfaceC8600tt0
    public void a(InterfaceC6090kt0 interfaceC6090kt0, boolean z) {
        Path pathP;
        PathMeasure pathMeasure = this.a;
        if (interfaceC6090kt0 == null) {
            pathP = null;
        } else {
            if (!(interfaceC6090kt0 instanceof C5579j6)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            pathP = ((C5579j6) interfaceC6090kt0).p();
        }
        pathMeasure.setPath(pathP, z);
    }

    @Override // com.daaw.InterfaceC8600tt0
    public float b() {
        return this.a.getLength();
    }

    @Override // com.daaw.InterfaceC8600tt0
    public boolean c(float f, float f2, InterfaceC6090kt0 interfaceC6090kt0, boolean z) {
        G10.g(interfaceC6090kt0, "destination");
        PathMeasure pathMeasure = this.a;
        if (interfaceC6090kt0 instanceof C5579j6) {
            return pathMeasure.getSegment(f, f2, ((C5579j6) interfaceC6090kt0).p(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
