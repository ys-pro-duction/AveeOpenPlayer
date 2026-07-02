package com.daaw;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9089ve {
    public final d c;
    public C8530tf0 e;
    public final List a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    /* JADX INFO: renamed from: com.daaw.ve$b */
    public interface b {
        void a();
    }

    /* JADX INFO: renamed from: com.daaw.ve$c */
    public static final class c implements d {
        public c() {
        }

        @Override // com.daaw.AbstractC9089ve.d
        public boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.daaw.AbstractC9089ve.d
        public Y70 b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.daaw.AbstractC9089ve.d
        public boolean c(float f) {
            return false;
        }

        @Override // com.daaw.AbstractC9089ve.d
        public float d() {
            return 1.0f;
        }

        @Override // com.daaw.AbstractC9089ve.d
        public float e() {
            return 0.0f;
        }

        @Override // com.daaw.AbstractC9089ve.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ve$d */
    public interface d {
        boolean a(float f);

        Y70 b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    /* JADX INFO: renamed from: com.daaw.ve$e */
    public static final class e implements d {
        public final List a;
        public Y70 c = null;
        public float d = -1.0f;
        public Y70 b = f(0.0f);

        public e(List list) {
            this.a = list;
        }

        @Override // com.daaw.AbstractC9089ve.d
        public boolean a(float f) {
            Y70 y70 = this.c;
            Y70 y702 = this.b;
            if (y70 == y702 && this.d == f) {
                return true;
            }
            this.c = y702;
            this.d = f;
            return false;
        }

        @Override // com.daaw.AbstractC9089ve.d
        public Y70 b() {
            return this.b;
        }

        @Override // com.daaw.AbstractC9089ve.d
        public boolean c(float f) {
            if (this.b.a(f)) {
                return !this.b.h();
            }
            this.b = f(f);
            return true;
        }

        @Override // com.daaw.AbstractC9089ve.d
        public float d() {
            return ((Y70) this.a.get(r0.size() - 1)).b();
        }

        @Override // com.daaw.AbstractC9089ve.d
        public float e() {
            return ((Y70) this.a.get(0)).e();
        }

        public final Y70 f(float f) {
            List list = this.a;
            Y70 y70 = (Y70) list.get(list.size() - 1);
            if (f >= y70.e()) {
                return y70;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                Y70 y702 = (Y70) this.a.get(size);
                if (this.b != y702 && y702.a(f)) {
                    return y702;
                }
            }
            return (Y70) this.a.get(0);
        }

        @Override // com.daaw.AbstractC9089ve.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ve$f */
    public static final class f implements d {
        public final Y70 a;
        public float b = -1.0f;

        public f(List list) {
            this.a = (Y70) list.get(0);
        }

        @Override // com.daaw.AbstractC9089ve.d
        public boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // com.daaw.AbstractC9089ve.d
        public Y70 b() {
            return this.a;
        }

        @Override // com.daaw.AbstractC9089ve.d
        public boolean c(float f) {
            return !this.a.h();
        }

        @Override // com.daaw.AbstractC9089ve.d
        public float d() {
            return this.a.b();
        }

        @Override // com.daaw.AbstractC9089ve.d
        public float e() {
            return this.a.e();
        }

        @Override // com.daaw.AbstractC9089ve.d
        public boolean isEmpty() {
            return false;
        }
    }

    public AbstractC9089ve(List list) {
        this.c = o(list);
    }

    public static d o(List list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    public Y70 b() {
        U80.a("BaseKeyframeAnimation#getCurrentKeyframe");
        Y70 y70B = this.c.b();
        U80.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return y70B;
    }

    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.d();
        }
        return this.h;
    }

    public float d() {
        Y70 y70B = b();
        if (y70B == null || y70B.h()) {
            return 0.0f;
        }
        return y70B.d.getInterpolation(e());
    }

    public float e() {
        if (this.b) {
            return 0.0f;
        }
        Y70 y70B = b();
        if (y70B.h()) {
            return 0.0f;
        }
        return (this.d - y70B.e()) / (y70B.b() - y70B.e());
    }

    public float f() {
        return this.d;
    }

    public final float g() {
        if (this.g == -1.0f) {
            this.g = this.c.e();
        }
        return this.g;
    }

    public Object h() {
        float fE = e();
        if (this.e == null && this.c.a(fE)) {
            return this.f;
        }
        Y70 y70B = b();
        Interpolator interpolator = y70B.e;
        Object objI = (interpolator == null || y70B.f == null) ? i(y70B, d()) : j(y70B, fE, interpolator.getInterpolation(fE), y70B.f.getInterpolation(fE));
        this.f = objI;
        return objI;
    }

    public abstract Object i(Y70 y70, float f2);

    public Object j(Y70 y70, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i = 0; i < this.a.size(); i++) {
            ((b) this.a.get(i)).a();
        }
    }

    public void l() {
        this.b = true;
    }

    public void m(float f2) {
        if (this.c.isEmpty()) {
            return;
        }
        if (f2 < g()) {
            f2 = g();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.d) {
            return;
        }
        this.d = f2;
        if (this.c.c(f2)) {
            k();
        }
    }

    public void n(C8530tf0 c8530tf0) {
        C8530tf0 c8530tf02 = this.e;
        if (c8530tf02 != null) {
            c8530tf02.c(null);
        }
        this.e = c8530tf0;
        if (c8530tf0 != null) {
            c8530tf0.c(this);
        }
    }
}
