package com.daaw;

/* JADX INFO: renamed from: com.daaw.ev0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4405ev0 {
    public static final a a = a.a;

    /* JADX INFO: renamed from: com.daaw.ev0$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final InterfaceC4405ev0 b = new C0170a();

        /* JADX INFO: renamed from: com.daaw.ev0$a$a, reason: collision with other inner class name */
        public static final class C0170a implements InterfaceC4405ev0 {
            @Override // com.daaw.InterfaceC4405ev0
            public /* synthetic */ int a(int i) {
                return AbstractC4126dv0.b(this, i);
            }

            @Override // com.daaw.InterfaceC4405ev0
            public /* synthetic */ int b(int i) {
                return AbstractC4126dv0.c(this, i);
            }

            @Override // com.daaw.InterfaceC4405ev0
            public /* synthetic */ AbstractC7898rO c(AbstractC7898rO abstractC7898rO) {
                return AbstractC4126dv0.a(this, abstractC7898rO);
            }

            @Override // com.daaw.InterfaceC4405ev0
            public /* synthetic */ SO d(SO so) {
                return AbstractC4126dv0.d(this, so);
            }
        }

        public final InterfaceC4405ev0 a() {
            return b;
        }
    }

    int a(int i);

    int b(int i);

    AbstractC7898rO c(AbstractC7898rO abstractC7898rO);

    SO d(SO so);
}
