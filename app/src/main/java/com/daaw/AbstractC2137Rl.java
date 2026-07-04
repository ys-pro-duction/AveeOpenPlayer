package com.daaw;

import com.daaw.C7399pc;

/* JADX INFO: renamed from: com.daaw.Rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2137Rl {

    /* JADX INFO: renamed from: com.daaw.Rl$a */
    public static abstract class a {
        public abstract AbstractC2137Rl a();

        public abstract a b(AbstractC4171e5 abstractC4171e5);

        public abstract a c(b bVar);
    }

    /* JADX INFO: renamed from: com.daaw.Rl$b */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        public final int B;

        b(int i) {
            this.B = i;
        }
    }

    public static a a() {
        return new C7399pc.b();
    }

    public abstract AbstractC4171e5 b();

    public abstract b c();
}
