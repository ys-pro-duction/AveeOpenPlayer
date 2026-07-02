package com.daaw;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.p10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7241p10 {
    public final Map a;
    public final C8059rx0 b;
    public boolean c;

    public C7241p10(Map map, C8059rx0 c8059rx0) {
        G10.g(map, "changes");
        G10.g(c8059rx0, "pointerInputEvent");
        this.a = map;
        this.b = c8059rx0;
    }

    public final Map a() {
        return this.a;
    }

    public final MotionEvent b() {
        return this.b.a();
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d(long j) {
        Object obj;
        List listB = this.b.b();
        int size = listB.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listB.get(i);
            if (C6944nx0.d(((C8338sx0) obj).c(), j)) {
                break;
            }
            i++;
        }
        C8338sx0 c8338sx0 = (C8338sx0) obj;
        if (c8338sx0 != null) {
            return c8338sx0.d();
        }
        return false;
    }
}
