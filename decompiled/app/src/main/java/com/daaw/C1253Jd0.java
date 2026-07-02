package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Jd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1253Jd0 {
    public static final C1253Jd0 c = new a().a();
    public final String a;
    public final List b;

    /* JADX INFO: renamed from: com.daaw.Jd0$a */
    public static final class a {
        public String a = "";
        public List b = new ArrayList();

        public C1253Jd0 a() {
            return new C1253Jd0(this.a, DesugarCollections.unmodifiableList(this.b));
        }

        public a b(List list) {
            this.b = list;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    public C1253Jd0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}
