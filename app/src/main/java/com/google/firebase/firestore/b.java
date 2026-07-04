package com.google.firebase.firestore;

import com.daaw.C4515fK;
import com.daaw.C6767nK;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    public static class a extends b {
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.b$b, reason: collision with other inner class name */
    public static class C0269b extends b {
        public final C6767nK a;
        public final C4515fK.b b;
        public final Object c;

        public C0269b(C6767nK c6767nK, C4515fK.b bVar, Object obj) {
            this.a = c6767nK;
            this.b = bVar;
            this.c = obj;
        }

        public C6767nK e() {
            return this.a;
        }

        public C4515fK.b f() {
            return this.b;
        }

        public Object g() {
            return this.c;
        }
    }

    public static b a(C6767nK c6767nK, Object obj) {
        return new C0269b(c6767nK, C4515fK.b.EQUAL, obj);
    }

    public static b b(String str, Object obj) {
        return a(C6767nK.a(str), obj);
    }

    public static b c(C6767nK c6767nK, List list) {
        return new C0269b(c6767nK, C4515fK.b.IN, list);
    }

    public static b d(String str, List list) {
        return c(C6767nK.a(str), list);
    }
}
