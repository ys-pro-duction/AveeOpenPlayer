package com.daaw;

/* JADX INFO: renamed from: com.daaw.ed0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4316ed0 {
    public static final a b = new a(null);
    public final InterfaceC3008Zu0 a;

    /* JADX INFO: renamed from: com.daaw.ed0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C4316ed0 a() {
            return new C4316ed0((InterfaceC3008Zu0) AbstractC3570bv0.a().a().get(0));
        }

        public a() {
        }
    }

    public C4316ed0(InterfaceC3008Zu0 interfaceC3008Zu0) {
        G10.g(interfaceC3008Zu0, "platformLocale");
        this.a = interfaceC3008Zu0;
    }

    public final InterfaceC3008Zu0 a() {
        return this.a;
    }

    public final String b() {
        return this.a.a();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4316ed0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return G10.c(b(), ((C4316ed0) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4316ed0(String str) {
        this(AbstractC3570bv0.a().b(str));
        G10.g(str, "languageTag");
    }
}
