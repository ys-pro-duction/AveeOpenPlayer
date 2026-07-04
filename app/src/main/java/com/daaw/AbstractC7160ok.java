package com.daaw;

/* JADX INFO: renamed from: com.daaw.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7160ok {
    public static final b a = new b(null);
    public static final c b = new c();

    /* JADX INFO: renamed from: com.daaw.ok$a */
    public static final class a extends c {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && G10.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // com.daaw.AbstractC7160ok.c
        public String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.ok$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final Object a(Throwable th) {
            return AbstractC7160ok.b(new a(th));
        }

        public final Object b() {
            return AbstractC7160ok.b(AbstractC7160ok.b);
        }

        public final Object c(Object obj) {
            return AbstractC7160ok.b(obj);
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.ok$c */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public static final Object d(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static final boolean e(Object obj) {
        return obj instanceof a;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof c);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
