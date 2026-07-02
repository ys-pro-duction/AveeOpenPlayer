package com.daaw;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: com.daaw.zF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10102zF0 implements InterfaceC7803r20 {
    public static final a b = new a(null);
    public final C2352Tm0 a;

    /* JADX INFO: renamed from: com.daaw.zF0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final AbstractC10102zF0 a(Object obj, C2352Tm0 c2352Tm0) {
            G10.g(obj, "value");
            return AbstractC9544xF0.l(obj.getClass()) ? new PF0(c2352Tm0, (Enum) obj) : obj instanceof Annotation ? new AF0(c2352Tm0, (Annotation) obj) : obj instanceof Object[] ? new DF0(c2352Tm0, (Object[]) obj) : obj instanceof Class ? new LF0(c2352Tm0, (Class) obj) : new RF0(c2352Tm0, obj);
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC10102zF0(C2352Tm0 c2352Tm0, AbstractC2911Yw abstractC2911Yw) {
        this(c2352Tm0);
    }

    @Override // com.daaw.InterfaceC7803r20
    public C2352Tm0 getName() {
        return this.a;
    }

    public AbstractC10102zF0(C2352Tm0 c2352Tm0) {
        this.a = c2352Tm0;
    }
}
