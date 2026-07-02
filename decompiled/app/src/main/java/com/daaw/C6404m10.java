package com.daaw;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.daaw.m10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6404m10 {
    public static final AtomicLong d = new AtomicLong();
    public final String a;
    public final String b;
    public final long c;

    public C6404m10(String str, String str2, long j) {
        AbstractC7785qy0.o(str, "typeName");
        AbstractC7785qy0.e(!str.isEmpty(), "empty type");
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static C6404m10 a(Class cls, String str) {
        return b(c(cls), str);
    }

    public static C6404m10 b(String str, String str2) {
        return new C6404m10(str, str2, e());
    }

    public static String c(Class cls) {
        String simpleName = ((Class) AbstractC7785qy0.o(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    public static long e() {
        return d.incrementAndGet();
    }

    public long d() {
        return this.c;
    }

    public String f() {
        return this.a + "<" + this.c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        if (this.b != null) {
            sb.append(": (");
            sb.append(this.b);
            sb.append(')');
        }
        return sb.toString();
    }
}
