package com.daaw;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Vp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2571Vp {
    public final List a = new ArrayList();

    public void a(C4178e61 c4178e61) {
        this.a.add(c4178e61);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            AbstractC0301Ab1.b(path, (C4178e61) this.a.get(size));
        }
    }
}
