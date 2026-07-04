package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: renamed from: com.daaw.Zh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2956Zh0 {
    public static final b a = new b(null);

    /* JADX INFO: renamed from: com.daaw.Zh0$a */
    public static final class a extends AbstractC2956Zh0 {
        public final AbstractC2852Yh0 b;

        /* JADX INFO: renamed from: com.daaw.Zh0$a$a, reason: collision with other inner class name */
        public static final class C0142a extends SZ0 implements InterfaceC3429bR {
            public int F;

            public C0142a(AbstractC3584bz abstractC3584bz, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return a.this.new C0142a(null, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    AbstractC2852Yh0 abstractC2852Yh0 = a.this.b;
                    this.F = 1;
                    if (abstractC2852Yh0.a(null, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((C0142a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Zh0$a$b */
        public static final class b extends SZ0 implements InterfaceC3429bR {
            public int F;

            public b(InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return a.this.new b(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                    return obj;
                }
                AbstractC4801gJ0.b(obj);
                AbstractC2852Yh0 abstractC2852Yh0 = a.this.b;
                this.F = 1;
                Object objB = abstractC2852Yh0.b(this);
                return objB == objC ? objC : objB;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Zh0$a$c */
        public static final class c extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ Uri H;
            public final /* synthetic */ InputEvent I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = uri;
                this.I = inputEvent;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return a.this.new c(this.H, this.I, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    AbstractC2852Yh0 abstractC2852Yh0 = a.this.b;
                    Uri uri = this.H;
                    InputEvent inputEvent = this.I;
                    this.F = 1;
                    if (abstractC2852Yh0.c(uri, inputEvent, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((c) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Zh0$a$d */
        public static final class d extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ Uri H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Uri uri, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = uri;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return a.this.new d(this.H, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    AbstractC2852Yh0 abstractC2852Yh0 = a.this.b;
                    Uri uri = this.H;
                    this.F = 1;
                    if (abstractC2852Yh0.d(uri, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((d) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Zh0$a$e */
        public static final class e extends SZ0 implements InterfaceC3429bR {
            public int F;

            public e(AbstractC1266Jg1 abstractC1266Jg1, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return a.this.new e(null, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    AbstractC2852Yh0 abstractC2852Yh0 = a.this.b;
                    this.F = 1;
                    if (abstractC2852Yh0.e(null, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((e) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Zh0$a$f */
        public static final class f extends SZ0 implements InterfaceC3429bR {
            public int F;

            public f(AbstractC1370Kg1 abstractC1370Kg1, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return a.this.new f(null, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    AbstractC2852Yh0 abstractC2852Yh0 = a.this.b;
                    this.F = 1;
                    if (abstractC2852Yh0.f(null, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((f) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        public a(AbstractC2852Yh0 abstractC2852Yh0) {
            G10.g(abstractC2852Yh0, "mMeasurementManager");
            this.b = abstractC2852Yh0;
        }

        @Override // com.daaw.AbstractC2956Zh0
        public InterfaceFutureC8236sc0 b() {
            return AbstractC4395et.c(AbstractC9104vh.b(AbstractC7763qt.a(C7850rC.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // com.daaw.AbstractC2956Zh0
        public InterfaceFutureC8236sc0 c(Uri uri, InputEvent inputEvent) {
            G10.g(uri, "attributionSource");
            return AbstractC4395et.c(AbstractC9104vh.b(AbstractC7763qt.a(C7850rC.a()), null, null, new c(uri, inputEvent, null), 3, null), null, 1, null);
        }

        public InterfaceFutureC8236sc0 e(AbstractC3584bz abstractC3584bz) {
            G10.g(abstractC3584bz, "deletionRequest");
            return AbstractC4395et.c(AbstractC9104vh.b(AbstractC7763qt.a(C7850rC.a()), null, null, new C0142a(abstractC3584bz, null), 3, null), null, 1, null);
        }

        public InterfaceFutureC8236sc0 f(Uri uri) {
            G10.g(uri, "trigger");
            return AbstractC4395et.c(AbstractC9104vh.b(AbstractC7763qt.a(C7850rC.a()), null, null, new d(uri, null), 3, null), null, 1, null);
        }

        public InterfaceFutureC8236sc0 g(AbstractC1266Jg1 abstractC1266Jg1) {
            G10.g(abstractC1266Jg1, "request");
            return AbstractC4395et.c(AbstractC9104vh.b(AbstractC7763qt.a(C7850rC.a()), null, null, new e(abstractC1266Jg1, null), 3, null), null, 1, null);
        }

        public InterfaceFutureC8236sc0 h(AbstractC1370Kg1 abstractC1370Kg1) {
            G10.g(abstractC1370Kg1, "request");
            return AbstractC4395et.c(AbstractC9104vh.b(AbstractC7763qt.a(C7850rC.a()), null, null, new f(abstractC1370Kg1, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zh0$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final AbstractC2956Zh0 a(Context context) {
            G10.g(context, "context");
            AbstractC2852Yh0 abstractC2852Yh0A = AbstractC2852Yh0.a.a(context);
            if (abstractC2852Yh0A != null) {
                return new a(abstractC2852Yh0A);
            }
            return null;
        }

        public b() {
        }
    }

    public static final AbstractC2956Zh0 a(Context context) {
        return a.a(context);
    }

    public abstract InterfaceFutureC8236sc0 b();

    public abstract InterfaceFutureC8236sc0 c(Uri uri, InputEvent inputEvent);
}
