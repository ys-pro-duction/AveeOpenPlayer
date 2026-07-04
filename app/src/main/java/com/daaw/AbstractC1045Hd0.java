package com.daaw;

import com.daaw.C3758cd;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Hd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1045Hd0 {

    /* JADX INFO: renamed from: com.daaw.Hd0$a */
    public static abstract class a {
        public abstract AbstractC1045Hd0 a();

        public abstract a b(AbstractC2137Rl abstractC2137Rl);

        public abstract a c(List list);

        public abstract a d(Integer num);

        public abstract a e(String str);

        public abstract a f(EnumC3927dC0 enumC3927dC0);

        public abstract a g(long j);

        public abstract a h(long j);

        public a i(int i) {
            return d(Integer.valueOf(i));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new C3758cd.b();
    }

    public abstract AbstractC2137Rl b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract EnumC3927dC0 f();

    public abstract long g();

    public abstract long h();
}
