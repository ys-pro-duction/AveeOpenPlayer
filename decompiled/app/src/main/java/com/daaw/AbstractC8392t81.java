package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.t81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8392t81 {
    public static final b a = new b(null);
    public static final AbstractC8392t81 b = new a();

    /* JADX INFO: renamed from: com.daaw.t81$a */
    public static final class a extends AbstractC8392t81 {
        @Override // com.daaw.AbstractC8392t81
        public /* bridge */ /* synthetic */ InterfaceC6440m81 e(I80 i80) {
            return (InterfaceC6440m81) i(i80);
        }

        @Override // com.daaw.AbstractC8392t81
        public boolean f() {
            return true;
        }

        public Void i(I80 i80) {
            G10.g(i80, SubscriberAttributeKt.JSON_NAME_KEY);
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* JADX INFO: renamed from: com.daaw.t81$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.t81$c */
    public static final class c extends AbstractC8392t81 {
        public c() {
        }

        @Override // com.daaw.AbstractC8392t81
        public boolean a() {
            return false;
        }

        @Override // com.daaw.AbstractC8392t81
        public boolean b() {
            return false;
        }

        @Override // com.daaw.AbstractC8392t81
        public InterfaceC3072a8 d(InterfaceC3072a8 interfaceC3072a8) {
            G10.g(interfaceC3072a8, "annotations");
            return AbstractC8392t81.this.d(interfaceC3072a8);
        }

        @Override // com.daaw.AbstractC8392t81
        public InterfaceC6440m81 e(I80 i80) {
            G10.g(i80, SubscriberAttributeKt.JSON_NAME_KEY);
            return AbstractC8392t81.this.e(i80);
        }

        @Override // com.daaw.AbstractC8392t81
        public boolean f() {
            return AbstractC8392t81.this.f();
        }

        @Override // com.daaw.AbstractC8392t81
        public I80 g(I80 i80, EnumC1042Hc1 enumC1042Hc1) {
            G10.g(i80, "topLevelType");
            G10.g(enumC1042Hc1, "position");
            return AbstractC8392t81.this.g(i80, enumC1042Hc1);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final C8957v81 c() {
        C8957v81 c8957v81G = C8957v81.g(this);
        G10.f(c8957v81G, "create(...)");
        return c8957v81G;
    }

    public InterfaceC3072a8 d(InterfaceC3072a8 interfaceC3072a8) {
        G10.g(interfaceC3072a8, "annotations");
        return interfaceC3072a8;
    }

    public abstract InterfaceC6440m81 e(I80 i80);

    public boolean f() {
        return false;
    }

    public I80 g(I80 i80, EnumC1042Hc1 enumC1042Hc1) {
        G10.g(i80, "topLevelType");
        G10.g(enumC1042Hc1, "position");
        return i80;
    }

    public final AbstractC8392t81 h() {
        return new c();
    }
}
