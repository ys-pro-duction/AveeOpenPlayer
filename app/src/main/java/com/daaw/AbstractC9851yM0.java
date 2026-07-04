package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9851yM0 {

    /* JADX INFO: renamed from: com.daaw.yM0$a */
    public interface a {
        void a(float f, float f2);

        void b(float f, float f2, float f3, float f4, float f5, float f6);

        void c(float f, float f2);

        void close();

        void d(float f, float f2);

        void e(float f, float f2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0051. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.AbstractC9851yM0.a a(java.lang.String r20, com.daaw.AbstractC9851yM0.a r21) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9851yM0.a(java.lang.String, com.daaw.yM0$a):com.daaw.yM0$a");
    }

    public static List c(String str) {
        b bVar = new b();
        a(str, bVar);
        return bVar.f();
    }

    /* JADX INFO: renamed from: com.daaw.yM0$b */
    public static class b implements a {
        public List a = new ArrayList();
        public List b = new ArrayList();
        public boolean c = false;
        public float d = 0.0f;
        public float e = 0.0f;

        @Override // com.daaw.AbstractC9851yM0.a
        public void a(float f, float f2) {
            this.d = f;
            this.e = f2;
            this.c = true;
        }

        @Override // com.daaw.AbstractC9851yM0.a
        public void c(float f, float f2) {
            if (!this.c) {
                this.d = 0.0f;
                this.e = 0.0f;
                this.c = true;
            }
            this.b.add(new C1769Oc1(this.d, this.e, f, f2));
            this.d = f;
            this.e = f2;
        }

        @Override // com.daaw.AbstractC9851yM0.a
        public void close() {
            if (this.b.size() > 0) {
                this.a.add(new MO0(this.b));
            }
            this.b.clear();
            this.c = false;
        }

        @Override // com.daaw.AbstractC9851yM0.a
        public void d(float f, float f2) {
            this.d += f;
            this.e += f2;
            this.c = true;
        }

        @Override // com.daaw.AbstractC9851yM0.a
        public void e(float f, float f2) {
            if (!this.c) {
                this.d = 0.0f;
                this.e = 0.0f;
                this.c = true;
            }
            List list = this.b;
            float f3 = this.d;
            float f4 = this.e;
            list.add(new C1769Oc1(f3, f4, f3 + f, f4 + f2));
            this.d += f;
            this.e += f2;
        }

        public List f() {
            return this.a;
        }

        @Override // com.daaw.AbstractC9851yM0.a
        public void b(float f, float f2, float f3, float f4, float f5, float f6) {
        }
    }

    public static void b(a aVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
    }
}
