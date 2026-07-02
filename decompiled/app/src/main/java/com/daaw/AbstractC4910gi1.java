package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.g;
import com.daaw.SR0;
import com.daaw.U30;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.gi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4910gi1 {
    public static final Map a = new LinkedHashMap();

    /* JADX INFO: renamed from: com.daaw.gi1$a */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View B;
        public final /* synthetic */ WE0 C;

        public a(View view, WE0 we0) {
            this.B = view;
            this.C = we0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            G10.g(view, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            G10.g(view, "v");
            this.B.removeOnAttachStateChangeListener(this);
            this.C.T();
        }
    }

    /* JADX INFO: renamed from: com.daaw.gi1$b */
    public static final class b implements androidx.lifecycle.j {
        public final /* synthetic */ InterfaceC7484pt B;
        public final /* synthetic */ C0580Ct0 C;
        public final /* synthetic */ WE0 D;
        public final /* synthetic */ C6748nF0 E;
        public final /* synthetic */ View F;

        /* JADX INFO: renamed from: com.daaw.gi1$b$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[g.a.values().length];
                iArr[g.a.ON_CREATE.ordinal()] = 1;
                iArr[g.a.ON_START.ordinal()] = 2;
                iArr[g.a.ON_STOP.ordinal()] = 3;
                iArr[g.a.ON_DESTROY.ordinal()] = 4;
                iArr[g.a.ON_PAUSE.ordinal()] = 5;
                iArr[g.a.ON_RESUME.ordinal()] = 6;
                iArr[g.a.ON_ANY.ordinal()] = 7;
                a = iArr;
            }
        }

        /* JADX INFO: renamed from: com.daaw.gi1$b$b, reason: collision with other inner class name */
        public static final class C0179b extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ C6748nF0 H;
            public final /* synthetic */ WE0 I;
            public final /* synthetic */ InterfaceC1764Ob0 J;
            public final /* synthetic */ b K;
            public final /* synthetic */ View L;

            /* JADX INFO: renamed from: com.daaw.gi1$b$b$a */
            public static final class a extends SZ0 implements InterfaceC3429bR {
                public int F;
                public final /* synthetic */ InterfaceC6537mW0 G;
                public final /* synthetic */ C8002rl0 H;

                /* JADX INFO: renamed from: com.daaw.gi1$b$b$a$a, reason: collision with other inner class name */
                public static final class C0180a implements InterfaceC7337pN {
                    public final /* synthetic */ C8002rl0 B;

                    public C0180a(C8002rl0 c8002rl0) {
                        this.B = c8002rl0;
                    }

                    public final Object a(float f, InterfaceC1416Ks interfaceC1416Ks) {
                        this.B.b(f);
                        return G91.a;
                    }

                    @Override // com.daaw.InterfaceC7337pN
                    public /* bridge */ /* synthetic */ Object c(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                        return a(((Number) obj).floatValue(), interfaceC1416Ks);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(InterfaceC6537mW0 interfaceC6537mW0, C8002rl0 c8002rl0, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.G = interfaceC6537mW0;
                    this.H = c8002rl0;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    return new a(this.G, this.H, interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) throws Throwable {
                    Object objC = I10.c();
                    int i = this.F;
                    if (i == 0) {
                        AbstractC4801gJ0.b(obj);
                        InterfaceC6537mW0 interfaceC6537mW0 = this.G;
                        C0180a c0180a = new C0180a(this.H);
                        this.F = 1;
                        if (interfaceC6537mW0.a(c0180a, this) == objC) {
                            return objC;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC4801gJ0.b(obj);
                    }
                    throw new D80();
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0179b(C6748nF0 c6748nF0, WE0 we0, InterfaceC1764Ob0 interfaceC1764Ob0, b bVar, View view, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = c6748nF0;
                this.I = we0;
                this.J = interfaceC1764Ob0;
                this.K = bVar;
                this.L = view;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                C0179b c0179b = new C0179b(this.H, this.I, this.J, this.K, this.L, interfaceC1416Ks);
                c0179b.G = obj;
                return c0179b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v12, types: [com.daaw.U30] */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v2, types: [com.daaw.U30] */
            /* JADX WARN: Type inference failed for: r1v4 */
            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Throwable th;
                ?? r1;
                U30 u30D;
                Object objC = I10.c();
                ?? r12 = this.F;
                try {
                    if (r12 == 0) {
                        AbstractC4801gJ0.b(obj);
                        InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.G;
                        try {
                            C8002rl0 c8002rl0 = (C8002rl0) this.H.B;
                            if (c8002rl0 != null) {
                                Context applicationContext = this.L.getContext().getApplicationContext();
                                G10.f(applicationContext, "context.applicationContext");
                                InterfaceC6537mW0 interfaceC6537mW0E = AbstractC4910gi1.e(applicationContext);
                                c8002rl0.b(((Number) interfaceC6537mW0E.getValue()).floatValue());
                                u30D = AbstractC9104vh.d(interfaceC7484pt, null, null, new a(interfaceC6537mW0E, c8002rl0, null), 3, null);
                            } else {
                                u30D = null;
                            }
                            WE0 we0 = this.I;
                            this.G = u30D;
                            this.F = 1;
                            r12 = u30D;
                            if (we0.k0(this) == objC) {
                                return objC;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r1 = 0;
                            if (r1 != 0) {
                                U30.a.a(r1, null, 1, null);
                            }
                            this.J.w().d(this.K);
                            throw th;
                        }
                    } else {
                        if (r12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        U30 u30 = (U30) this.G;
                        AbstractC4801gJ0.b(obj);
                        r12 = u30;
                    }
                    if (r12 != 0) {
                        U30.a.a(r12, null, 1, null);
                    }
                    this.J.w().d(this.K);
                    return G91.a;
                } catch (Throwable th3) {
                    th = th3;
                    r1 = r12;
                }
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((C0179b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        public b(InterfaceC7484pt interfaceC7484pt, C0580Ct0 c0580Ct0, WE0 we0, C6748nF0 c6748nF0, View view) {
            this.B = interfaceC7484pt;
            this.C = c0580Ct0;
            this.D = we0;
            this.E = c6748nF0;
            this.F = view;
        }

        @Override // androidx.lifecycle.j
        public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
            G10.g(interfaceC1764Ob0, "lifecycleOwner");
            G10.g(aVar, "event");
            int i = a.a[aVar.ordinal()];
            if (i == 1) {
                AbstractC9104vh.d(this.B, null, EnumC8599tt.UNDISPATCHED, new C0179b(this.E, this.D, interfaceC1764Ob0, this, this.F, null), 1, null);
                return;
            }
            if (i == 2) {
                C0580Ct0 c0580Ct0 = this.C;
                if (c0580Ct0 != null) {
                    c0580Ct0.e();
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.D.T();
            } else {
                C0580Ct0 c0580Ct02 = this.C;
                if (c0580Ct02 != null) {
                    c0580Ct02.b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.gi1$c */
    public static final class c extends SZ0 implements InterfaceC3429bR {
        public Object F;
        public int G;
        public /* synthetic */ Object H;
        public final /* synthetic */ ContentResolver I;
        public final /* synthetic */ Uri J;
        public final /* synthetic */ d K;
        public final /* synthetic */ InterfaceC3236ak L;
        public final /* synthetic */ Context M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContentResolver contentResolver, Uri uri, d dVar, InterfaceC3236ak interfaceC3236ak, Context context, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.I = contentResolver;
            this.J = uri;
            this.K = dVar;
            this.L = interfaceC3236ak;
            this.M = context;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            c cVar = new c(this.I, this.J, this.K, this.L, this.M, interfaceC1416Ks);
            cVar.H = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        
            if (r4.c(r9, r8) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r8.G
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.F
                com.daaw.jk r1 = (com.daaw.InterfaceC5756jk) r1
                java.lang.Object r4 = r8.H
                com.daaw.pN r4 = (com.daaw.InterfaceC7337pN) r4
                com.daaw.AbstractC4801gJ0.b(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.F
                com.daaw.jk r1 = (com.daaw.InterfaceC5756jk) r1
                java.lang.Object r4 = r8.H
                com.daaw.pN r4 = (com.daaw.InterfaceC7337pN) r4
                com.daaw.AbstractC4801gJ0.b(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                com.daaw.AbstractC4801gJ0.b(r9)
                java.lang.Object r9 = r8.H
                com.daaw.pN r9 = (com.daaw.InterfaceC7337pN) r9
                android.content.ContentResolver r1 = r8.I
                android.net.Uri r4 = r8.J
                r5 = 0
                com.daaw.gi1$d r6 = r8.K
                r1.registerContentObserver(r4, r5, r6)
                com.daaw.ak r1 = r8.L     // Catch: java.lang.Throwable -> L1b
                com.daaw.jk r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.H = r9     // Catch: java.lang.Throwable -> L1b
                r8.F = r1     // Catch: java.lang.Throwable -> L1b
                r8.G = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                goto L81
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.M     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = com.daaw.AbstractC0527Cg.b(r9)     // Catch: java.lang.Throwable -> L1b
                r8.H = r4     // Catch: java.lang.Throwable -> L1b
                r8.F = r1     // Catch: java.lang.Throwable -> L1b
                r8.G = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.c(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
            L81:
                return r0
            L82:
                android.content.ContentResolver r9 = r8.I
                com.daaw.gi1$d r0 = r8.K
                r9.unregisterContentObserver(r0)
                com.daaw.G91 r9 = com.daaw.G91.a
                return r9
            L8c:
                android.content.ContentResolver r0 = r8.I
                com.daaw.gi1$d r1 = r8.K
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC4910gi1.c.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
            return ((c) a(interfaceC7337pN, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.gi1$d */
    public static final class d extends ContentObserver {
        public final /* synthetic */ InterfaceC3236ak a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC3236ak interfaceC3236ak, Handler handler) {
            super(handler);
            this.a = interfaceC3236ak;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            this.a.k(G91.a);
        }
    }

    public static final WE0 b(View view, InterfaceC4684ft interfaceC4684ft, androidx.lifecycle.g gVar) {
        C0580Ct0 c0580Ct0;
        G10.g(view, "<this>");
        G10.g(interfaceC4684ft, "coroutineContext");
        if (interfaceC4684ft.a(InterfaceC1727Ns.e) == null || interfaceC4684ft.a(InterfaceC5203hl0.n) == null) {
            interfaceC4684ft = C8659u6.N.a().U(interfaceC4684ft);
        }
        InterfaceC5203hl0 interfaceC5203hl0 = (InterfaceC5203hl0) interfaceC4684ft.a(InterfaceC5203hl0.n);
        if (interfaceC5203hl0 != null) {
            C0580Ct0 c0580Ct02 = new C0580Ct0(interfaceC5203hl0);
            c0580Ct02.b();
            c0580Ct0 = c0580Ct02;
        } else {
            c0580Ct0 = null;
        }
        C6748nF0 c6748nF0 = new C6748nF0();
        InterfaceC4684ft c8002rl0 = (InterfaceC7724ql0) interfaceC4684ft.a(InterfaceC7724ql0.o);
        if (c8002rl0 == null) {
            c8002rl0 = new C8002rl0();
            c6748nF0.B = c8002rl0;
        }
        InterfaceC4684ft interfaceC4684ftU = interfaceC4684ft.U(c0580Ct0 != null ? c0580Ct0 : C5905kG.B).U(c8002rl0);
        WE0 we0 = new WE0(interfaceC4684ftU);
        InterfaceC7484pt interfaceC7484ptA = AbstractC7763qt.a(interfaceC4684ftU);
        if (gVar == null) {
            InterfaceC1764Ob0 interfaceC1764Ob0A = AbstractC2217Se1.a(view);
            gVar = interfaceC1764Ob0A != null ? interfaceC1764Ob0A.w() : null;
        }
        if (gVar != null) {
            view.addOnAttachStateChangeListener(new a(view, we0));
            gVar.a(new b(interfaceC7484ptA, c0580Ct0, we0, c6748nF0, view));
            return we0;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ WE0 c(View view, InterfaceC4684ft interfaceC4684ft, androidx.lifecycle.g gVar, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4684ft = C5905kG.B;
        }
        if ((i & 2) != 0) {
            gVar = null;
        }
        return b(view, interfaceC4684ft, gVar);
    }

    public static final AbstractC1300Jp d(View view) {
        G10.g(view, "<this>");
        AbstractC1300Jp abstractC1300JpF = f(view);
        if (abstractC1300JpF != null) {
            return abstractC1300JpF;
        }
        for (ViewParent parent = view.getParent(); abstractC1300JpF == null && (parent instanceof View); parent = parent.getParent()) {
            abstractC1300JpF = f((View) parent);
        }
        return abstractC1300JpF;
    }

    public static final InterfaceC6537mW0 e(Context context) {
        InterfaceC6537mW0 interfaceC6537mW0;
        Map map = a;
        synchronized (map) {
            try {
                Object objM = map.get(context);
                if (objM == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    InterfaceC3236ak interfaceC3236akB = AbstractC6035kk.b(-1, null, null, 6, null);
                    objM = AbstractC7894rN.m(AbstractC7894rN.j(new c(contentResolver, uriFor, new d(interfaceC3236akB, AbstractC9603xU.a(Looper.getMainLooper())), interfaceC3236akB, context, null)), AbstractC7763qt.b(), SR0.a.b(SR0.a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, objM);
                }
                interfaceC6537mW0 = (InterfaceC6537mW0) objM;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC6537mW0;
    }

    public static final AbstractC1300Jp f(View view) {
        G10.g(view, "<this>");
        Object tag = view.getTag(AbstractC6740nD0.G);
        if (tag instanceof AbstractC1300Jp) {
            return (AbstractC1300Jp) tag;
        }
        return null;
    }

    public static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final WE0 h(View view) {
        G10.g(view, "<this>");
        if (!view.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
        }
        View viewG = g(view);
        AbstractC1300Jp abstractC1300JpF = f(viewG);
        if (abstractC1300JpF == null) {
            return C4631fi1.a.a(viewG);
        }
        if (abstractC1300JpF instanceof WE0) {
            return (WE0) abstractC1300JpF;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, AbstractC1300Jp abstractC1300Jp) {
        G10.g(view, "<this>");
        view.setTag(AbstractC6740nD0.G, abstractC1300Jp);
    }
}
