package com.daaw;

/* JADX INFO: renamed from: com.daaw.s00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8072s00 {
    public static final a b = new a(null);
    public final C3490bf a;

    /* JADX INFO: renamed from: com.daaw.s00$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public AbstractC8072s00(C3490bf c3490bf) {
        G10.g(c3490bf, "beanDefinition");
        this.a = c3490bf;
    }

    public Object a(EI0 ei0) throws C7793r00 {
        G10.g(ei0, "context");
        ei0.c().a("| (+) '" + this.a + '\'');
        try {
            C1936Ps0 c1936Ps0D = ei0.d();
            if (c1936Ps0D == null) {
                c1936Ps0D = AbstractC2062Qs0.a();
            }
            return this.a.b().invoke(ei0.f(), c1936Ps0D);
        } catch (Exception e) {
            String strC = C8112s80.a.c(e);
            ei0.c().c("* Instance creation error : could not create instance for '" + this.a + "': " + strC);
            throw new C7793r00("Could not create instance for '" + this.a + '\'', e);
        }
    }

    public abstract Object b(EI0 ei0);

    public final C3490bf c() {
        return this.a;
    }
}
