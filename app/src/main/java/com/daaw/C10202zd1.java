package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.zd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10202zd1 {
    public static final a b = new a(null);
    public static final C10202zd1 c = new C10202zd1(AbstractC1599Mm.k());
    public final List a;

    /* JADX INFO: renamed from: com.daaw.zd1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C10202zd1 a(QA0 qa0) {
            G10.g(qa0, "table");
            if (qa0.y() == 0) {
                return b();
            }
            List listZ = qa0.z();
            G10.f(listZ, "getRequirementList(...)");
            return new C10202zd1(listZ, null);
        }

        public final C10202zd1 b() {
            return C10202zd1.c;
        }

        public a() {
        }
    }

    public /* synthetic */ C10202zd1(List list, AbstractC2911Yw abstractC2911Yw) {
        this(list);
    }

    public C10202zd1(List list) {
        this.a = list;
    }
}
