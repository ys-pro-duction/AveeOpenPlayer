package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.g;
import com.daaw.C4828gQ;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public final e a;
    public final ClassLoader b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList s;
    public ArrayList c = new ArrayList();
    public boolean j = true;
    public boolean r = false;

    public static final class a {
        public int a;
        public c b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public g.b h;
        public g.b i;

        public a() {
        }

        public a(int i, c cVar) {
            this.a = i;
            this.b = cVar;
            this.c = false;
            g.b bVar = g.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        public a(int i, c cVar, boolean z) {
            this.a = i;
            this.b = cVar;
            this.c = z;
            g.b bVar = g.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }
    }

    public g(e eVar, ClassLoader classLoader) {
        this.a = eVar;
        this.b = classLoader;
    }

    public g b(int i, c cVar, String str) {
        k(i, cVar, str, 1);
        return this;
    }

    public final g c(ViewGroup viewGroup, c cVar, String str) {
        cVar.k0 = viewGroup;
        cVar.S = true;
        return b(viewGroup.getId(), cVar, str);
    }

    public g d(c cVar, String str) {
        k(0, cVar, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.c.add(aVar);
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public g j() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    public void k(int i, c cVar, String str, int i2) {
        String str2 = cVar.u0;
        if (str2 != null) {
            C4828gQ.f(cVar, str2);
        }
        Class<?> cls = cVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = cVar.c0;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + cVar + ": was " + cVar.c0 + " now " + str);
            }
            cVar.c0 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + cVar + " with tag " + str + " to container view with no id");
            }
            int i3 = cVar.a0;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + cVar + ": was " + cVar.a0 + " now " + i);
            }
            cVar.a0 = i;
            cVar.b0 = i;
        }
        e(new a(i2, cVar));
    }

    public g l(c cVar) {
        e(new a(3, cVar));
        return this;
    }

    public g m(int i, c cVar) {
        return n(i, cVar, null);
    }

    public g n(int i, c cVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        k(i, cVar, str, 2);
        return this;
    }

    public g o(boolean z, Runnable runnable) {
        if (!z) {
            j();
        }
        if (this.s == null) {
            this.s = new ArrayList();
        }
        this.s.add(runnable);
        return this;
    }

    public g p(boolean z) {
        this.r = z;
        return this;
    }
}
