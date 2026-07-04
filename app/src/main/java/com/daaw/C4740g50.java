package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.g50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4740g50 extends AbstractC1156If {
    public static final a h = new a(null);
    public static final C4740g50 i;
    public static final C4740g50 j;
    public static final C4740g50 k;
    public final boolean g;

    /* JADX INFO: renamed from: com.daaw.g50$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        C4740g50 c4740g50 = new C4740g50(2, 0, 0);
        i = c4740g50;
        j = c4740g50.m();
        k = new C4740g50(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4740g50(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        G10.g(iArr, "versionArray");
        this.g = z;
    }

    public final boolean h(C4740g50 c4740g50) {
        G10.g(c4740g50, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            C4740g50 c4740g502 = i;
            if (c4740g502.a() == 1 && c4740g502.b() == 8) {
                return true;
            }
        }
        return i(c4740g50.k(this.g));
    }

    public final boolean i(C4740g50 c4740g50) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(c4740g50);
    }

    public final boolean j() {
        return this.g;
    }

    public final C4740g50 k(boolean z) {
        C4740g50 c4740g50 = z ? i : j;
        return c4740g50.l(this) ? c4740g50 : this;
    }

    public final boolean l(C4740g50 c4740g50) {
        if (a() > c4740g50.a()) {
            return true;
        }
        return a() >= c4740g50.a() && b() > c4740g50.b();
    }

    public final C4740g50 m() {
        return (a() == 1 && b() == 9) ? new C4740g50(2, 0, 0) : new C4740g50(a(), b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4740g50(int... iArr) {
        this(iArr, false);
        G10.g(iArr, "numbers");
    }
}
