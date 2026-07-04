package com.daaw;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: com.daaw.nk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6882nk0 {
    public final d a;
    public final String b;
    public final String c;
    public final c d;
    public final c e;
    public final Object f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final AtomicReferenceArray j;

    /* JADX INFO: renamed from: com.daaw.nk0$b */
    public static final class b {
        public c a;
        public c b;
        public d c;
        public String d;
        public boolean e;
        public boolean f;
        public Object g;
        public boolean h;

        public C6882nk0 a() {
            return new C6882nk0(this.c, this.d, this.a, this.b, this.g, this.e, this.f, this.h);
        }

        public b b(String str) {
            this.d = str;
            return this;
        }

        public b c(c cVar) {
            this.a = cVar;
            return this;
        }

        public b d(c cVar) {
            this.b = cVar;
            return this;
        }

        public b e(boolean z) {
            this.h = z;
            return this;
        }

        public b f(d dVar) {
            this.c = dVar;
            return this;
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.nk0$c */
    public interface c {
        Object a(InputStream inputStream);

        InputStream b(Object obj);
    }

    /* JADX INFO: renamed from: com.daaw.nk0$d */
    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean a() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    public static String a(String str) {
        int iLastIndexOf = ((String) AbstractC7785qy0.o(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf);
    }

    public static String b(String str, String str2) {
        return ((String) AbstractC7785qy0.o(str, "fullServiceName")) + "/" + ((String) AbstractC7785qy0.o(str2, "methodName"));
    }

    public static b g() {
        return h(null, null);
    }

    public static b h(c cVar, c cVar2) {
        return new b().c(cVar).d(cVar2);
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public d e() {
        return this.a;
    }

    public boolean f() {
        return this.h;
    }

    public Object i(InputStream inputStream) {
        return this.e.a(inputStream);
    }

    public InputStream j(Object obj) {
        return this.d.b(obj);
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("fullMethodName", this.b).d("type", this.a).e("idempotent", this.g).e("safe", this.h).e("sampledToLocalTracing", this.i).d("requestMarshaller", this.d).d("responseMarshaller", this.e).d("schemaDescriptor", this.f).k().toString();
    }

    public C6882nk0(d dVar, String str, c cVar, c cVar2, Object obj, boolean z, boolean z2, boolean z3) {
        this.j = new AtomicReferenceArray(2);
        this.a = (d) AbstractC7785qy0.o(dVar, "type");
        this.b = (String) AbstractC7785qy0.o(str, "fullMethodName");
        this.c = a(str);
        this.d = (c) AbstractC7785qy0.o(cVar, "requestMarshaller");
        this.e = (c) AbstractC7785qy0.o(cVar2, "responseMarshaller");
        this.f = obj;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }
}
