package com.daaw;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: com.daaw.pt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7485pt0 {

    /* JADX INFO: renamed from: com.daaw.pt0$a */
    public static class a {
        public static Interpolator a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        public static Interpolator b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        public static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f, float f2, float f3, float f4) {
        return a.b(f, f2, f3, f4);
    }

    public static Interpolator b(Path path) {
        return a.c(path);
    }
}
