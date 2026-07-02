package androidx.lifecycle;

import androidx.lifecycle.g;
import com.daaw.G10;
import com.daaw.InterfaceC1764Ob0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j {
    public final DefaultLifecycleObserver B;
    public final j C;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.a.values().length];
            try {
                iArr[g.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public c(DefaultLifecycleObserver defaultLifecycleObserver, j jVar) {
        G10.g(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.B = defaultLifecycleObserver;
        this.C = jVar;
    }

    @Override // androidx.lifecycle.j
    public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(interfaceC1764Ob0, "source");
        G10.g(aVar, "event");
        switch (a.a[aVar.ordinal()]) {
            case 1:
                this.B.onCreate(interfaceC1764Ob0);
                break;
            case 2:
                this.B.onStart(interfaceC1764Ob0);
                break;
            case 3:
                this.B.onResume(interfaceC1764Ob0);
                break;
            case 4:
                this.B.onPause(interfaceC1764Ob0);
                break;
            case 5:
                this.B.onStop(interfaceC1764Ob0);
                break;
            case 6:
                this.B.onDestroy(interfaceC1764Ob0);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        j jVar = this.C;
        if (jVar != null) {
            jVar.c(interfaceC1764Ob0, aVar);
        }
    }
}
