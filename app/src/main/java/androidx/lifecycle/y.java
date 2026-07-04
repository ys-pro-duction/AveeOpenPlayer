package androidx.lifecycle;

import android.app.Application;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC5247hu;
import com.daaw.AbstractC8526te1;
import com.daaw.C0313Ae1;
import com.daaw.C6;
import com.daaw.C8655u50;
import com.daaw.C9370we1;
import com.daaw.C9928ye1;
import com.daaw.G10;
import com.daaw.InterfaceC0417Be1;
import com.daaw.J50;
import com.daaw.X40;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final b b = new b(null);
    public static final AbstractC5247hu.b c = C9928ye1.a.a;
    public final C9370we1 a;

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    public interface c {
        AbstractC8526te1 a(Class cls);

        AbstractC8526te1 b(J50 j50, AbstractC5247hu abstractC5247hu);

        AbstractC8526te1 c(Class cls, AbstractC5247hu abstractC5247hu);
    }

    public static class d implements c {
        public static d b;
        public static final a a = new a(null);
        public static final AbstractC5247hu.b c = C9928ye1.a.a;

        public static final class a {
            public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
                this();
            }

            public final d a() {
                if (d.b == null) {
                    d.b = new d();
                }
                d dVar = d.b;
                G10.d(dVar);
                return dVar;
            }

            public a() {
            }
        }

        @Override // androidx.lifecycle.y.c
        public AbstractC8526te1 a(Class cls) {
            G10.g(cls, "modelClass");
            return C8655u50.a.a(cls);
        }

        @Override // androidx.lifecycle.y.c
        public AbstractC8526te1 b(J50 j50, AbstractC5247hu abstractC5247hu) {
            G10.g(j50, "modelClass");
            G10.g(abstractC5247hu, "extras");
            return c(X40.b(j50), abstractC5247hu);
        }

        @Override // androidx.lifecycle.y.c
        public AbstractC8526te1 c(Class cls, AbstractC5247hu abstractC5247hu) {
            G10.g(cls, "modelClass");
            G10.g(abstractC5247hu, "extras");
            return a(cls);
        }
    }

    public static class e {
        public abstract void d(AbstractC8526te1 abstractC8526te1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(C0313Ae1 c0313Ae1, c cVar) {
        this(c0313Ae1, cVar, null, 4, null);
        G10.g(c0313Ae1, ProductResponseJsonKeys.STORE);
        G10.g(cVar, "factory");
    }

    public final AbstractC8526te1 a(J50 j50) {
        G10.g(j50, "modelClass");
        return C9370we1.b(this.a, j50, null, 2, null);
    }

    public AbstractC8526te1 b(Class cls) {
        G10.g(cls, "modelClass");
        return a(X40.e(cls));
    }

    public AbstractC8526te1 c(String str, Class cls) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(cls, "modelClass");
        return this.a.a(X40.e(cls), str);
    }

    public static class a extends d {
        public static a f;
        public final Application d;
        public static final b e = new b(null);
        public static final AbstractC5247hu.b g = new C0023a();

        /* JADX INFO: renamed from: androidx.lifecycle.y$a$a, reason: collision with other inner class name */
        public static final class C0023a implements AbstractC5247hu.b {
        }

        public static final class b {
            public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
                this();
            }

            public final a a(Application application) {
                G10.g(application, "application");
                if (a.f == null) {
                    a.f = new a(application);
                }
                a aVar = a.f;
                G10.d(aVar);
                return aVar;
            }

            public b() {
            }
        }

        public a(Application application, int i) {
            this.d = application;
        }

        @Override // androidx.lifecycle.y.d, androidx.lifecycle.y.c
        public AbstractC8526te1 a(Class cls) {
            G10.g(cls, "modelClass");
            Application application = this.d;
            if (application != null) {
                return h(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.y.d, androidx.lifecycle.y.c
        public AbstractC8526te1 c(Class cls, AbstractC5247hu abstractC5247hu) {
            G10.g(cls, "modelClass");
            G10.g(abstractC5247hu, "extras");
            if (this.d != null) {
                return a(cls);
            }
            Application application = (Application) abstractC5247hu.a(g);
            if (application != null) {
                return h(cls, application);
            }
            if (C6.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }

        public final AbstractC8526te1 h(Class cls, Application application) {
            if (!C6.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                AbstractC8526te1 abstractC8526te1 = (AbstractC8526te1) cls.getConstructor(Application.class).newInstance(application);
                G10.f(abstractC8526te1, "{\n                try {\n…          }\n            }");
                return abstractC8526te1;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            G10.g(application, "application");
        }
    }

    public y(C9370we1 c9370we1) {
        this.a = c9370we1;
    }

    public /* synthetic */ y(C0313Ae1 c0313Ae1, c cVar, AbstractC5247hu abstractC5247hu, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c0313Ae1, cVar, (i & 4) != 0 ? AbstractC5247hu.a.b : abstractC5247hu);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(C0313Ae1 c0313Ae1, c cVar, AbstractC5247hu abstractC5247hu) {
        this(new C9370we1(c0313Ae1, cVar, abstractC5247hu));
        G10.g(c0313Ae1, ProductResponseJsonKeys.STORE);
        G10.g(cVar, "factory");
        G10.g(abstractC5247hu, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(InterfaceC0417Be1 interfaceC0417Be1) {
        G10.g(interfaceC0417Be1, "owner");
        C0313Ae1 c0313Ae1N = interfaceC0417Be1.n();
        C9928ye1 c9928ye1 = C9928ye1.a;
        this(c0313Ae1N, c9928ye1.b(interfaceC0417Be1), c9928ye1.a(interfaceC0417Be1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(InterfaceC0417Be1 interfaceC0417Be1, c cVar) {
        this(interfaceC0417Be1.n(), cVar, C9928ye1.a.a(interfaceC0417Be1));
        G10.g(interfaceC0417Be1, "owner");
        G10.g(cVar, "factory");
    }
}
