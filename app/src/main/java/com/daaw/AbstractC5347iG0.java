package com.daaw;

import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: com.daaw.iG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5347iG0 {

    /* JADX INFO: renamed from: com.daaw.iG0$a */
    public static class a extends b implements LQ {
        public final LQ C;
        public volatile SoftReference D;

        public a(Object obj, LQ lq) {
            if (lq == null) {
                h(0);
            }
            this.D = null;
            this.C = lq;
            if (obj != null) {
                this.D = new SoftReference(a(obj));
            }
        }

        public static /* synthetic */ void h(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // com.daaw.AbstractC5347iG0.b, com.daaw.LQ
        public Object invoke() {
            Object obj;
            SoftReference softReference = this.D;
            if (softReference != null && (obj = softReference.get()) != null) {
                return d(obj);
            }
            Object objInvoke = this.C.invoke();
            this.D = new SoftReference(a(objInvoke));
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: com.daaw.iG0$b */
    public static abstract class b {
        public static final Object B = new a();

        /* JADX INFO: renamed from: com.daaw.iG0$b$a */
        public static class a {
        }

        public Object a(Object obj) {
            return obj == null ? B : obj;
        }

        public final Object c(Object obj, Object obj2) {
            return invoke();
        }

        public Object d(Object obj) {
            if (obj == B) {
                return null;
            }
            return obj;
        }

        public abstract Object invoke();
    }

    public static /* synthetic */ void a(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static a b(LQ lq) {
        if (lq == null) {
            a(1);
        }
        return c(null, lq);
    }

    public static a c(Object obj, LQ lq) {
        if (lq == null) {
            a(0);
        }
        return new a(obj, lq);
    }
}
