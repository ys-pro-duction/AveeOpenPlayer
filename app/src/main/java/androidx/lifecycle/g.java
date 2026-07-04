package androidx.lifecycle;

import com.daaw.AbstractC2911Yw;
import com.daaw.G10;
import com.daaw.InterfaceC1660Nb0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public AtomicReference a = new AtomicReference(null);

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0021a Companion = new C0021a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.g$a$a, reason: collision with other inner class name */
        public static final class C0021a {

            /* JADX INFO: renamed from: androidx.lifecycle.g$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0022a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    a = iArr;
                }
            }

            public /* synthetic */ C0021a(AbstractC2911Yw abstractC2911Yw) {
                this();
            }

            public final a a(b bVar) {
                G10.g(bVar, "state");
                int i = C0022a.a[bVar.ordinal()];
                if (i == 1) {
                    return a.ON_DESTROY;
                }
                if (i == 2) {
                    return a.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                G10.g(bVar, "state");
                int i = C0022a.a[bVar.ordinal()];
                if (i == 1) {
                    return a.ON_START;
                }
                if (i == 2) {
                    return a.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public C0021a() {
            }
        }

        public /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                a = iArr;
            }
        }

        public final b c() {
            switch (b.a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean c(b bVar) {
            G10.g(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(InterfaceC1660Nb0 interfaceC1660Nb0);

    public abstract b b();

    public final AtomicReference c() {
        return this.a;
    }

    public abstract void d(InterfaceC1660Nb0 interfaceC1660Nb0);
}
