package com.daaw;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.dx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4134dx0 {
    public final List a;
    public final C7241p10 b;
    public final int c;
    public final int d;
    public int e;

    public C4134dx0(List list, C7241p10 c7241p10) {
        G10.g(list, "changes");
        this.a = list;
        this.b = c7241p10;
        MotionEvent motionEventD = d();
        this.c = AbstractC3856cx0.a(motionEventD != null ? motionEventD.getButtonState() : 0);
        MotionEvent motionEventD2 = d();
        this.d = AbstractC10019yx0.a(motionEventD2 != null ? motionEventD2.getMetaState() : 0);
        this.e = a();
    }

    public final int a() {
        MotionEvent motionEventD = d();
        if (motionEventD == null) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C7223ox0 c7223ox0 = (C7223ox0) list.get(i);
                if (AbstractC4413ex0.d(c7223ox0)) {
                    return AbstractC5260hx0.a.e();
                }
                if (AbstractC4413ex0.b(c7223ox0)) {
                    return AbstractC5260hx0.a.d();
                }
            }
            return AbstractC5260hx0.a.c();
        }
        int actionMasked = motionEventD.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return AbstractC5260hx0.a.f();
                        case 9:
                            return AbstractC5260hx0.a.a();
                        case 10:
                            return AbstractC5260hx0.a.b();
                        default:
                            return AbstractC5260hx0.a.g();
                    }
                }
                return AbstractC5260hx0.a.c();
            }
            return AbstractC5260hx0.a.e();
        }
        return AbstractC5260hx0.a.d();
    }

    public final int b() {
        return this.c;
    }

    public final List c() {
        return this.a;
    }

    public final MotionEvent d() {
        C7241p10 c7241p10 = this.b;
        if (c7241p10 != null) {
            return c7241p10.b();
        }
        return null;
    }

    public final int e() {
        return this.e;
    }

    public final void f(int i) {
        this.e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4134dx0(List list) {
        this(list, null);
        G10.g(list, "changes");
    }
}
