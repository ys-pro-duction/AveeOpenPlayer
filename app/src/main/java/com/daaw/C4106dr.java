package com.daaw;

import com.daaw.IU0;
import com.revenuecat.purchases.common.Constants;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4106dr {
    public final C5510ir b;
    public final b c;
    public C4106dr d;
    public IU0 g;
    public HashSet a = null;
    public int e = 0;
    public int f = -1;

    /* JADX INFO: renamed from: com.daaw.dr$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.dr$b */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C4106dr(C5510ir c5510ir, b bVar) {
        this.b = c5510ir;
        this.c = bVar;
    }

    public boolean a(C4106dr c4106dr, int i) {
        return b(c4106dr, i, -1, false);
    }

    public boolean b(C4106dr c4106dr, int i, int i2, boolean z) {
        if (c4106dr == null) {
            l();
            return true;
        }
        if (!z && !k(c4106dr)) {
            return false;
        }
        this.d = c4106dr;
        if (c4106dr.a == null) {
            c4106dr.a = new HashSet();
        }
        this.d.a.add(this);
        if (i > 0) {
            this.e = i;
        } else {
            this.e = 0;
        }
        this.f = i2;
        return true;
    }

    public int c() {
        C4106dr c4106dr;
        if (this.b.O() == 8) {
            return 0;
        }
        return (this.f <= -1 || (c4106dr = this.d) == null || c4106dr.b.O() != 8) ? this.e : this.f;
    }

    public final C4106dr d() {
        switch (a.a[this.c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.b.D;
            case 3:
                return this.b.B;
            case 4:
                return this.b.E;
            case 5:
                return this.b.C;
            default:
                throw new AssertionError(this.c.name());
        }
    }

    public C5510ir e() {
        return this.b;
    }

    public IU0 f() {
        return this.g;
    }

    public C4106dr g() {
        return this.d;
    }

    public b h() {
        return this.c;
    }

    public boolean i() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C4106dr) it.next()).d().j()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.d != null;
    }

    public boolean k(C4106dr c4106dr) {
        if (c4106dr == null) {
            return false;
        }
        b bVarH = c4106dr.h();
        b bVar = this.c;
        if (bVarH == bVar) {
            return bVar != b.BASELINE || (c4106dr.e().S() && e().S());
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return (bVarH == b.BASELINE || bVarH == b.CENTER_X || bVarH == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = bVarH == b.LEFT || bVarH == b.RIGHT;
                return c4106dr.e() instanceof C7644qU ? z || bVarH == b.CENTER_X : z;
            case 4:
            case 5:
                boolean z2 = bVarH == b.TOP || bVarH == b.BOTTOM;
                return c4106dr.e() instanceof C7644qU ? z2 || bVarH == b.CENTER_Y : z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.c.name());
        }
    }

    public void l() {
        HashSet hashSet;
        C4106dr c4106dr = this.d;
        if (c4106dr != null && (hashSet = c4106dr.a) != null) {
            hashSet.remove(this);
        }
        this.d = null;
        this.e = 0;
        this.f = -1;
    }

    public void m(C6871ni c6871ni) {
        IU0 iu0 = this.g;
        if (iu0 == null) {
            this.g = new IU0(IU0.a.UNRESTRICTED, null);
        } else {
            iu0.d();
        }
    }

    public void n(int i) {
        if (j()) {
            this.f = i;
        }
    }

    public String toString() {
        return this.b.r() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.c.toString();
    }
}
