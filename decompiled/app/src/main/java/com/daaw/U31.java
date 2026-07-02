package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class U31 {
    public static final Logger a = Logger.getLogger(U31.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {
        public static final b B;
        public static final b C;
        public static final /* synthetic */ b[] D;

        public enum a extends b {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.daaw.U31.b
            public boolean a() {
                return !U31.c();
            }
        }

        /* JADX INFO: renamed from: com.daaw.U31$b$b, reason: collision with other inner class name */
        public enum C0122b extends b {
            public C0122b(String str, int i) {
                super(str, i);
            }

            @Override // com.daaw.U31.b
            public boolean a() {
                return !U31.c() || U31.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            B = aVar;
            C0122b c0122b = new C0122b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            C = c0122b;
            D = new b[]{aVar, c0122b};
        }

        public b(String str, int i) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) D.clone();
        }

        public abstract boolean a();
    }

    public static Boolean a() {
        try {
            int i = Conscrypt.a;
            return (Boolean) Conscrypt.class.getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return T31.a() || b.get();
    }
}
