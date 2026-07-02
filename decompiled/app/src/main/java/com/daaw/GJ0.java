package com.daaw;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GJ0 {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();

    public final C7822r6 a(IJ0 ij0) {
        G10.g(ij0, "rippleHostView");
        return (C7822r6) this.b.get(ij0);
    }

    public final IJ0 b(C7822r6 c7822r6) {
        G10.g(c7822r6, "indicationInstance");
        return (IJ0) this.a.get(c7822r6);
    }

    public final void c(C7822r6 c7822r6) {
        G10.g(c7822r6, "indicationInstance");
        IJ0 ij0 = (IJ0) this.a.get(c7822r6);
        if (ij0 != null) {
        }
        this.a.remove(c7822r6);
    }

    public final void d(C7822r6 c7822r6, IJ0 ij0) {
        G10.g(c7822r6, "indicationInstance");
        G10.g(ij0, "rippleHostView");
        this.a.put(c7822r6, ij0);
        this.b.put(ij0, c7822r6);
    }
}
