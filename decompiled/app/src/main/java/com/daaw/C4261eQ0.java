package com.daaw;

import android.content.Context;
import com.daaw.PN0;

/* JADX INFO: renamed from: com.daaw.eQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4261eQ0 {
    public static final C4261eQ0 a = new C4261eQ0();

    /* JADX INFO: renamed from: com.daaw.eQ0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Context B;

        /* JADX INFO: renamed from: com.daaw.eQ0$a$a, reason: collision with other inner class name */
        public static final class C0168a extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ Context B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0168a(Context context) {
                super(2);
                this.B = context;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MR0 invoke(NN0 nn0, C1936Ps0 c1936Ps0) {
                G10.g(nn0, "$this$single");
                G10.g(c1936Ps0, "it");
                return new MR0(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.eQ0$a$b */
        public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final b B = new b();

            public b() {
                super(2);
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4812gM invoke(NN0 nn0, C1936Ps0 c1936Ps0) {
                G10.g(nn0, "$this$single");
                G10.g(c1936Ps0, "it");
                return new C4812gM((MR0) nn0.c(AbstractC5624jG0.b(MR0.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.daaw.eQ0$a$c */
        public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final c B = new c();

            public c() {
                super(2);
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WB0 invoke(NN0 nn0, C1936Ps0 c1936Ps0) {
                G10.g(nn0, "$this$single");
                G10.g(c1936Ps0, "it");
                return new WB0();
            }
        }

        /* JADX INFO: renamed from: com.daaw.eQ0$a$d */
        public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final d B = new d();

            public d() {
                super(2);
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C7250p3 invoke(NN0 nn0, C1936Ps0 c1936Ps0) {
                G10.g(nn0, "$this$single");
                G10.g(c1936Ps0, "it");
                return new C7250p3();
            }
        }

        /* JADX INFO: renamed from: com.daaw.eQ0$a$e */
        public static final class e extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ Context B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Context context) {
                super(2);
                this.B = context;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1928Pq0 invoke(NN0 nn0, C1936Ps0 c1936Ps0) {
                G10.g(nn0, "$this$single");
                G10.g(c1936Ps0, "it");
                return new C1928Pq0(this.B, (C4812gM) nn0.c(AbstractC5624jG0.b(C4812gM.class), null, null), (WB0) nn0.c(AbstractC5624jG0.b(WB0.class), null, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(1);
            this.B = context;
        }

        public final void a(C2030Qk0 c2030Qk0) {
            G10.g(c2030Qk0, "$this$module");
            C0168a c0168a = new C0168a(this.B);
            PN0.a aVar = PN0.e;
            C5140hY0 c5140hY0A = aVar.a();
            EnumC4187e80 enumC4187e80 = EnumC4187e80.B;
            C7641qT0 c7641qT0 = new C7641qT0(new C3490bf(c5140hY0A, AbstractC5624jG0.b(MR0.class), null, c0168a, enumC4187e80, AbstractC1599Mm.k()));
            c2030Qk0.f(c7641qT0);
            if (c2030Qk0.e()) {
                c2030Qk0.g(c7641qT0);
            }
            new C5872k80(c2030Qk0, c7641qT0);
            b bVar = b.B;
            C7641qT0 c7641qT02 = new C7641qT0(new C3490bf(aVar.a(), AbstractC5624jG0.b(C4812gM.class), null, bVar, enumC4187e80, AbstractC1599Mm.k()));
            c2030Qk0.f(c7641qT02);
            if (c2030Qk0.e()) {
                c2030Qk0.g(c7641qT02);
            }
            new C5872k80(c2030Qk0, c7641qT02);
            c cVar = c.B;
            C7641qT0 c7641qT03 = new C7641qT0(new C3490bf(aVar.a(), AbstractC5624jG0.b(WB0.class), null, cVar, enumC4187e80, AbstractC1599Mm.k()));
            c2030Qk0.f(c7641qT03);
            c2030Qk0.g(c7641qT03);
            new C5872k80(c2030Qk0, c7641qT03);
            d dVar = d.B;
            C7641qT0 c7641qT04 = new C7641qT0(new C3490bf(aVar.a(), AbstractC5624jG0.b(C7250p3.class), null, dVar, enumC4187e80, AbstractC1599Mm.k()));
            c2030Qk0.f(c7641qT04);
            if (c2030Qk0.e()) {
                c2030Qk0.g(c7641qT04);
            }
            new C5872k80(c2030Qk0, c7641qT04);
            e eVar = new e(this.B);
            C7641qT0 c7641qT05 = new C7641qT0(new C3490bf(aVar.a(), AbstractC5624jG0.b(C1928Pq0.class), null, eVar, enumC4187e80, AbstractC1599Mm.k()));
            c2030Qk0.f(c7641qT05);
            if (c2030Qk0.e()) {
                c2030Qk0.g(c7641qT05);
            }
            new C5872k80(c2030Qk0, c7641qT05);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2030Qk0) obj);
            return G91.a;
        }
    }

    public final C2030Qk0 a(Context context) {
        G10.g(context, "context");
        return AbstractC2656Wk0.b(false, new a(context), 1, null);
    }
}
