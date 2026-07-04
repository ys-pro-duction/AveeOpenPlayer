package com.daaw;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.daaw.C1877Pd1;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public class UD implements YS {
    public final C1981Qd1 a;
    public final int b;
    public VD c;
    public VD d;

    public static class a implements C1877Pd1.a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.daaw.C1877Pd1.a
        public Animation a() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.a);
            return alphaAnimation;
        }
    }

    public UD() {
        this(RCHTTPStatusCodes.UNSUCCESSFUL);
    }

    @Override // com.daaw.YS
    public XS a(boolean z, boolean z2) {
        return z ? C3536bo0.c() : z2 ? b() : c();
    }

    public final XS b() {
        if (this.c == null) {
            this.c = new VD(this.a.a(false, true), this.b);
        }
        return this.c;
    }

    public final XS c() {
        if (this.d == null) {
            this.d = new VD(this.a.a(false, false), this.b);
        }
        return this.d;
    }

    public UD(int i) {
        this(new C1981Qd1(new a(i)), i);
    }

    public UD(C1981Qd1 c1981Qd1, int i) {
        this.a = c1981Qd1;
        this.b = i;
    }
}
