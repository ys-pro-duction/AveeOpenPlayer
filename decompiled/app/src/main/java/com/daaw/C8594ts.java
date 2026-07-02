package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.ts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8594ts {
    public static final Logger b = Logger.getLogger(C8594ts.class.getName());
    public static final C8594ts c = new C8594ts();
    public final int a = 0;

    /* JADX INFO: renamed from: com.daaw.ts$a */
    public interface a {
    }

    /* JADX INFO: renamed from: com.daaw.ts$b */
    public static final class b {
        public static final c a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            a = a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                C8594ts.b.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        public static c a(AtomicReference atomicReference) {
            try {
                return (c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(c.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                return new C5566j31();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.ts$c */
    public static abstract class c {
        public abstract C8594ts a();

        public abstract void b(C8594ts c8594ts, C8594ts c8594ts2);

        public abstract C8594ts c(C8594ts c8594ts);
    }

    public C8594ts() {
        k(0);
    }

    public static Object d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static C8594ts e() {
        C8594ts c8594tsA = j().a();
        return c8594tsA == null ? c : c8594tsA;
    }

    public static c j() {
        return b.a;
    }

    public static void k(int i) {
        if (i == 1000) {
            b.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public void a(a aVar, Executor executor) {
        d(aVar, "cancellationListener");
        d(executor, "executor");
    }

    public C8594ts b() {
        C8594ts c8594tsC = j().c(this);
        return c8594tsC == null ? c : c8594tsC;
    }

    public Throwable c() {
        return null;
    }

    public void f(C8594ts c8594ts) {
        d(c8594ts, "toAttach");
        j().b(this, c8594ts);
    }

    public C6381lw g() {
        return null;
    }

    public boolean h() {
        return false;
    }

    public void i(a aVar) {
    }
}
