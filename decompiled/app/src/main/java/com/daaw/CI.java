package com.daaw;

import com.daaw.InterfaceC4684ft;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CI extends AbstractC5801jt implements Closeable, AutoCloseable {
    public static final a D = new a(null);

    public static final class a extends AbstractC10030z {

        /* JADX INFO: renamed from: com.daaw.CI$a$a, reason: collision with other inner class name */
        public static final class C0052a extends AbstractC4192e90 implements NQ {
            public static final C0052a B = new C0052a();

            public C0052a() {
                super(1);
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CI invoke(InterfaceC4684ft.b bVar) {
                if (bVar instanceof CI) {
                    return (CI) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
            super(AbstractC5801jt.C, C0052a.B);
        }
    }
}
