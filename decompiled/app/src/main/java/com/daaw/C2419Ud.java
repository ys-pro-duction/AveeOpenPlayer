package com.daaw;

import android.window.BackEvent;

/* JADX INFO: renamed from: com.daaw.Ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2419Ud {
    public static final a e = new a(null);
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    /* JADX INFO: renamed from: com.daaw.Ud$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public C2419Ud(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final float a() {
        return this.c;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2419Ud(BackEvent backEvent) {
        G10.g(backEvent, "backEvent");
        D8 d8 = D8.a;
        this(d8.d(backEvent), d8.e(backEvent), d8.b(backEvent), d8.c(backEvent));
    }
}
