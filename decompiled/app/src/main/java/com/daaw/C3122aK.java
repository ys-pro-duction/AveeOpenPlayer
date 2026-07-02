package com.daaw;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.aK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3122aK {
    public final String a;
    public final Map b;

    /* JADX INFO: renamed from: com.daaw.aK$b */
    public static final class b {
        public final String a;
        public Map b = null;

        public b(String str) {
            this.a = str;
        }

        public C3122aK a() {
            return new C3122aK(this.a, this.b == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap(this.b)));
        }

        public b b(Annotation annotation) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static C3122aK d(String str) {
        return new C3122aK(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3122aK)) {
            return false;
        }
        C3122aK c3122aK = (C3122aK) obj;
        return this.a.equals(c3122aK.a) && this.b.equals(c3122aK.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }

    public C3122aK(String str, Map map) {
        this.a = str;
        this.b = map;
    }
}
